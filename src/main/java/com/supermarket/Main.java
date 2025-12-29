package com.supermarket;

import com.supermarket.model.*;
import com.supermarket.service.Supermarket;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        Product product1 = new Product(101, "Apple", 323, 50.0, "fruits");
        Product product2 = new Product(102, "Banana", 324, 33.0, "fruits");
        Product product3 = new Product(103, "Orange", 34, 34.0, "fruits");

        supermarket.addproduct(product1);
        supermarket.addproduct(product2);
        supermarket.addproduct(product3);

        Client client = new Client(11, "Mohamed", 34, 238494, "Alex,22st", LocalDate.of(2008, 3, 4), 324.0, "Orange",
                LocalDate.of(1988, 2, 8));

        Staffmember staffmember = new Staffmember(233, "Ali", 33, 2332, "Tanta,43st", 2333.0);

        PointOfSale pointOfSale = new PointOfSale("POS-001", "Main Entrance");

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        List<Integer> quantities = new ArrayList<>();
        quantities.add(2);
        quantities.add(3);
        quantities.add(1);

        int totalSoldQuantity = supermarket.sellProduct(products, quantities, client, staffmember, pointOfSale);
        System.out.println("Total products sold: " + totalSoldQuantity);
    }
}
