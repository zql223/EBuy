package com.example.service.product;

import com.example.entity.Product;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductService {

    public List<Product> getProductList(@RequestParam(value = "name") String name)throws Exception;


}
