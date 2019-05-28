package com.hrd.springmvc.controllers;

import com.hrd.springmvc.repository.model.Article;
import com.hrd.springmvc.service.article_service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/")
    public String index(){
        System.out.println(articleService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(){
        articleService.add(new Article(30, "Sokha"));
        return "redirect:/";
    }
}
