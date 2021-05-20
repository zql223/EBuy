package com.example.service.product;

import com.example.entity.Product;
import com.example.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> getProductList(String name) throws Exception {
        return productMapper.getProductList(name);
    }

}
