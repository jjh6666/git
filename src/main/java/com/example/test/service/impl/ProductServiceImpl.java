package com.example.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.entity.Product;
import com.example.test.mapper.ProductMapper;
import com.example.test.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl
        extends ServiceImpl<ProductMapper, Product>
        implements ProductService {
}
