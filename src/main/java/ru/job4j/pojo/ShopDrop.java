package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete1(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

/*    public static Product[] delete2(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            Product temp = products[i + 1];
            products[i + 1] = products[i];
            products[i] = temp;
        }
        return products;
    }*/
}
