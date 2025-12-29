package com.supermarket;

import com.supermarket.model.Product;
import com.supermarket.service.ExcelService;
import java.util.*;

public class Main1testexcel {
    public static void main(String[] args) {
        // Example usage
        List<Product> products = createProductData();
        ExcelService.writeToExcelSheet(products, "products.xls");
    }

    private static List<Product> createProductData() {
        // Create sample product data
        List<Product> products = new ArrayList<>();
        // Product(int id, String name, int quantity, double price, String category)
        products.add(new Product(1, "apple", 120, 25.5, "fruits"));
        products.add(new Product(2, "orange juice", 450, 44.0, "Drinks"));
        return products;
    }
}
