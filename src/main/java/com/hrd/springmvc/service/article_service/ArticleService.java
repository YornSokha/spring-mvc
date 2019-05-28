package com.hrd.springmvc.service.article_service;

import com.hrd.springmvc.repository.model.Article;

import java.util.List;

public interface ArticleService {
    void add(Article article);
    List<Article> findAll();
}
