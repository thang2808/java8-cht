package com.ttdk6.cht.exercise10;
import com.ttdk6.cht.exercise9.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateListProduct {
    public static List<Product> createProductList() {
        List<Product> listProduct = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Product product = new Product(
                    i,
                    "Product " + i,
                    i % 3,
                    new Date(),
                    50 + i,
                    false
            );
            listProduct.add(product);
        }
        return listProduct;
    }
}
