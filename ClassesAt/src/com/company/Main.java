package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "HP", 5000,
                3, "siyah");
        product.set_name("Laptop");
        product.setId(1);
        product.set_description("Hp Laptop");
        product.set_price(5000);
        product.set_stock(3);
        //System.out.println(product.name);
        productManager pManager = new productManager();
        pManager.Add(product);
        System.out.println(product.get_kod());
    }
}
