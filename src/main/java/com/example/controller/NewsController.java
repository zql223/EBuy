package com.example.controller;

import com.example.entity.News;
import com.example.service.news.NewsService;
import com.example.utils.RespBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "findAll")
    public RespBean findAll(Map map,
                @RequestParam(value = "pageNum",defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,4);
        List<News> list=newsService.findAll();
        PageInfo<News> pageInfo=new PageInfo<>(list);
        map.put("list",pageInfo);
        return RespBean.success("success",pageInfo);

    }
}
