package com.example.service.news;

import com.example.entity.News;
import com.example.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    NewsMapper newsMapper;

    @Override
    public List<News> findAll() {
        return newsMapper.findAll();
    }
}
