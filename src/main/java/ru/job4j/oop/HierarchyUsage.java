package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Cars cars = new Cars();
        /* делаем приведение к типу родителя Transport. */
        Transport transport = cars;
        /* делаем приведение к типу родителя Object. */
        Object object = cars;
        /* Приведение типа при создании объекта. */
        Object objectCar = new Cars();
        /* Приведение типа за счет понижения по иерархии. */
        Cars carFromObject = (Cars) objectCar;
    }
}
