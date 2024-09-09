package com.ttdk6.cht.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductManager {
    //Exercise 11
    //With Stream
    public static String fiterProductById(List<Product> listProduct, int idProduct) {
        return listProduct.stream()
                .filter(product -> product.getId() == idProduct)
                .map(Product::getName)
                .findAny()
                .orElse("Product not found");
    }

    //Without Stream
    public static String fiterProductByItWithoutStream(List<Product> listProduct, int idProduct) {
        for (Product product : listProduct) {
            if (product.getId() == idProduct) {
                return product.getName();
            }
        }
        return "Khong thay san pham";
    }

    //Exercise 12
    //WithStream
    public static List<Product> fiterProductByQulity(List<Product> listProduct) {
        return listProduct.stream()
                .filter(product -> product.getQuility() > 0 && !product.getDelete())
                .collect(Collectors.toList());
    }

    //Without Stream
    public static List<Product> fiterProductByQulityWithoutStream(List<Product> listProduct) {
        List<Product> fiteredProduct = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getQuility() > 0 && !product.getDelete()) {
                fiteredProduct.add(product);
            }
        }
        return fiteredProduct;
    }

    //Exercise 13
    //With Stream
    public static List<Product> fiterProductBySaleDate(List<Product> listProduct) {
        LocalDate today = LocalDate.now();

        return listProduct.stream()
                .filter(product -> product.getSaleDate().isAfter(today) && !product.getDelete())
                .collect(Collectors.toList());
    }

    //Without Stream
    public static List<Product> fiterProductBySaleDateWithoutStream(List<Product> listProduct) {
        List<Product> fiteredProduct = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Product product : listProduct) {
            if (product.getSaleDate().isAfter(today) && !product.getDelete()) {
                fiteredProduct.add(product);
            }
        }
        return fiteredProduct;
    }

    //Exercise 14
    //With Stream
    public static int totalProduct (List<Product> productList) {
        return productList.stream()
                .filter(product -> !product.getDelete())
                .mapToInt(Product::getQuility)
                .sum();
    }

    //Without Stream
    public static int totalProductWithoutStream(List<Product> productList) {
        int totalQulity = 0;
        for (Product product : productList) {
            if (!product.getDelete()) {
                totalQulity += product.getQuility();
            }
        }
        return totalQulity;
    }

    //Exercise 15
    //With Stream
    public static boolean isHaveProductInCategory(List<Product> productList, int categoryId) {
        return productList.stream()
                .anyMatch(product -> product.getCategoryId() == categoryId);
    }

    //Without Stream
    public static boolean isHaveProductInCategoryWithoutStream(List<Product> productList, int categoryId) {
        for (Product product : productList) {
            if (product.getCategoryId() == categoryId) {
                return true;
            }
        }
        return false;
    }

    //Exercise 16
    //With Stream
    public static List<Product> fiterProductBySaleDate(List<Product> listProduct) {
        LocalDate today = LocalDate.now();
        return listProduct.stream()
                .filter(product -> product.getSaleDate().isAfter(today) && product.getQuility() > 0)
                .map(product -> product.getName() + product.getQuility())
                .collect(Collectors.toList());
    }

    //WithoutStream
    public static List<String[]> filterProductBySaleDate(List<Product> listProduct) {
        LocalDate today = LocalDate.now();
        List<String[]> fiteredProduct = new ArrayList<>();

        for (Product product : listProduct) {
            if (product.getSaleDate().isAfter(today) && product.getQuality() > 0) {
                fiteredProduct.add(new String[]{String.valueOf(product.getId()), product.getName()});
            }
        }

        return fiteredProduct;
    }
}
