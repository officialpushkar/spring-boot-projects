package com.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Product;
import com.spring.jpa.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/hi")
    public String hi() {
        String str = null;
        System.out.println(str.toUpperCase());
        return "Hi";
    }

    @Transactional
    @GetMapping("/transaction")
    public String saveProduct() throws Exception {

    	System.out.println("Method Started.");
    	
        for (int i = 1; i <= 10; i++) {
            Product product = new Product();
            product.setName("Product " + i);
            productRepository.save(product);
            System.out.println("Product Saved");
//            if (i == 7) {
//                throw new RuntimeException("Some error occured");
//            }
        }
        System.out.println("Method Completed.");
        return "product saved";
    }

}
