package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal other = null;
        Cat kitty = new Cat();
        System.out.print("Animal cat = new Cat();        cat.staticInvoke();      ");
        cat.staticInvoke();
        System.out.print("Animal other = null;           other.staticInvoke();    ");
        other.staticInvoke();
        System.out.print("Animal animal = new Animal();  animal.instanceInvoke(); ");
        animal.instanceInvoke();
        System.out.print("Animal cat = new Cat();        cat.instanceInvoke();    ");
        cat.instanceInvoke();
        System.out.print("Animal - Класс родитель        Animal.staticInvoke();   ");
        Animal.staticInvoke();
        System.out.print("Cat - Класс наследник Animal   Cat.staticInvoke();      ");
        Cat.staticInvoke();
        System.out.print("Cat kitty = new Cat();         kitty.staticInvoke();    ");
        kitty.staticInvoke();
    }
}
