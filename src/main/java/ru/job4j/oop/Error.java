package ru.job4j.oop;

public class Error {
    private final boolean active;
    private final int status;
    private final String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Ошибка: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(false, 0, "Success");
        error.printError();
        Error error2 = new Error(true, 1, "Fatal");
        error2.printError();
    }
}
