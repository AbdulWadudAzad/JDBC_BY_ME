package com.coderBD.Test;

import com.coderBD.Category.ProductService;
import com.coderBD.Domain.Category;
import com.coderBD.Domain.Product;
import java.util.Date;

public class ProductTest {

    public static void main(String[] args) {
//        ProductService.createTable();
        Product p = new Product();
        p.setName("HP 500");
        p.setQty(50000);
        p.setUnitPrice(10000);
        p.setTotalPrice(60000);
        p.setPurchaseDate(new Date());
        Category c = new Category();
        c.setId(1);
        p.setCategory(c);
        ProductService.inserty(p);
        
    }
    
}
