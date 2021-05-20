package com.example.service.product;

import com.example.entity.ProductCategory;
import com.example.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> yiji(int type) {
        return productCategoryMapper.yiji(type);
    }

    @Override
    public List<ProductCategory> erji(Integer parentId) {
        return productCategoryMapper.erji(parentId);
    }

    @Override
    public List<ProductCategory> sanji(int parentId) {
        return productCategoryMapper.sanji(parentId);
    }
}
