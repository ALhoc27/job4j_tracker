package ru.job4j.oop;

public class Cat {

        public String sound() {
            String voice = "may-may";
            return voice;
        }

    public static void main(String[] args) {
        Cat peppy = new Cat(); /* Здесь мы создаем переменную типа Cat с именем peppy. Далее мы записываем в эту переменную ссылку на объект типа Cat.*/
        /*Важный момент. Оператор new резервирует кусок памяти и записывает в нее данные объекта класса Cat.*/
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
