package com.example.controller;

import com.example.entity.Product;
import com.example.service.product.ProductService;
import com.example.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pc")
public class ProductController {

    @Autowired
    ProductService productService;

    @ResponseBody
    @RequestMapping(value = "list")
    public RespBean list(@RequestParam(value = "name") String name)throws Exception{
        List<Product> list=productService.getProductList(name);
        return RespBean.success("搜素成功",list);
    }
}
