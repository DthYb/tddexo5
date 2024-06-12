package com.example.Product;

import java.util.List;

public class Shop {
private List<Product> products;

    public Shop(List<Product> products){
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
    
    public void update(Product product) {
        if (product.getSellIn() <= 0) {
            product.lowerQuality(2);
            System.out.println("valid");
            }
            else {
                product.lowerQuality(1);
                System.out.println("not valid");
            }
            System.out.println(">:(");
    }
}
