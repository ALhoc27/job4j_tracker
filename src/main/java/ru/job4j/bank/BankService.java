package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        boolean isAccount = false;
        if (user != null) { // значит паспорт найден
            List<Account> list = users.get(user); // список акаунтов
            if (list.isEmpty()) {
                users.get(user).add(account);
                isAccount = true;
                return;
            } else {
                for (Account existingAccount : list) {
                    if (existingAccount.equals(account)) {
                        isAccount = true;
                        break;
                    }
                }
            }
            if (!isAccount) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User userReturn = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                userReturn = user;
            }
        }
        return userReturn;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account accountReturn = null;
        if (user != null) {
            for (Account account : getAccounts(user)) {
                if (account.getRequisite() != null && account.getRequisite().equals(requisite)) {
                    accountReturn = account;
                }
            }
        }
        return accountReturn;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account accountSource = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDes = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSource != null && accountDes != null && accountSource.getBalance() >= amount) {
            accountSource.setBalance(accountSource.getBalance() - amount);
            accountDes.setBalance(accountDes.getBalance() + amount);
            result = true;
        }

        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
