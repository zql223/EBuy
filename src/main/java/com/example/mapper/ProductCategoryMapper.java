package com.example.mapper;

import com.example.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper {

    List<ProductCategory> yiji( int type);

    List<ProductCategory> erji(Integer parentId);

    List<ProductCategory> sanji(int parentId);
}
