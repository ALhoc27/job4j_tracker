package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("nikname = '" + name + "'");
        System.out.println(name + " was eating a " + this.food + "\n");
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void giveNick(String nick) {
        name = nick;
    }

    public static void main(
            String[] args) {
        Cat peppy = new Cat(); /* Здесь мы создаем переменную типа Cat с именем peppy. Далее мы записываем в эту переменную ссылку на объект типа Cat.*/
        /*Важный момент. Оператор new резервирует кусок памяти и записывает в нее данные объекта класса Cat.*/
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);

        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();
    }
}
