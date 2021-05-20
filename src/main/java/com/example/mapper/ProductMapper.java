package com.example.mapper;

import com.example.entity.Product;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductMapper {
    public List<Product> getProductList(@RequestParam(value = "name") String name)throws Exception;
}
