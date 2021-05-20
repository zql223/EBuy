package com.example.mapper;

import com.example.entity.News;

import java.util.List;

public interface NewsMapper {
    List<News> findAll();
}
