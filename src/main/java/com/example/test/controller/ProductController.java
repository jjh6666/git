package com.example.test.controller;

import com.example.test.entity.Product;
import com.example.test.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public boolean add(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> list() {
        return productService.list();
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.updateById(product);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return productService.removeById(id);
    }
}
