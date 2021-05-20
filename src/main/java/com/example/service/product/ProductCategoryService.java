package com.example.service.product;

import com.example.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategory> yiji(int type);

    List<ProductCategory> erji(Integer parentId);

    List<ProductCategory> sanji(int parentId);
}
