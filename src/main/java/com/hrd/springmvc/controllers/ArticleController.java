package com.hrd.springmvc.controllers;

import com.hrd.springmvc.repository.model.Article;
import com.hrd.springmvc.service.article_service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/")
    public String index(){
        System.out.println(articleService.findAll());
        return "index";
    }

    @GetMapping("/request")
    public String request(@RequestParam String name){
        System.out.println("Name : " + name);
        return "redirect:/";
    }

    @GetMapping("/path/{name}/{id}")
    public String path(@PathVariable String name, @PathVariable int id){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        return "redirect:/";
    }

    @GetMapping("/add")
    public String add(){
        articleService.add(new Article(30, "Sokha"));
        return "redirect:/";
    }
}
