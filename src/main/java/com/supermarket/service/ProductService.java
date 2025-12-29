package com.supermarket.service;

import com.supermarket.dao.ProductDAO;
import com.supermarket.model.Product;
import java.util.List;

public class ProductService {

    private ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO();
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        productDAO.updateProductQuantity(productId, newQuantity);
    }
}
