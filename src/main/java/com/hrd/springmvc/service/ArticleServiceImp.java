package com.hrd.springmvc.service;

import com.hrd.springmvc.repository.article_repository.ArticleRepository;
import com.hrd.springmvc.repository.model.Article;
import com.hrd.springmvc.service.article_service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImp implements ArticleService {

    @Autowired
    ArticleRepository articles;

    @Override
    public void add(Article article) {
        articles.add(article);
    }

    @Override
    public List<Article> findAll() {
        return articles.findAll();
    }
}
