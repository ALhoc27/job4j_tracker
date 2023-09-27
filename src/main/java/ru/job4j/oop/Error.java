package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

   /* public Error(String message) {
        this.message = message;
    }*/

    @Override
    public String toString() {
        return "Error{" + "active=" + active + ", status=" + status + ", message='" + message + '\'' + '}';
    }

    public Error() { }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Error errorWithoutArguments = new Error();
        Error errorWithArguments = new Error(true, 12, "String");

        System.out.println(errorWithArguments);
        errorWithArguments.setMessage("falseee");
        System.out.println(errorWithArguments);

        System.out.println(errorWithoutArguments);
        errorWithoutArguments.setMessage("Кукушка");
        errorWithoutArguments.setStatus(4);
        errorWithoutArguments.setActive(true);
        System.out.println(errorWithoutArguments);
    }
}
