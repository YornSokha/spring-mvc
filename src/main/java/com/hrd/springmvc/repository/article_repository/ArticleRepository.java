package com.hrd.springmvc.repository.article_repository;

import com.hrd.springmvc.repository.model.Article;

import java.util.List;

public interface ArticleRepository {

    void add(Article article);
    List<Article> findAll();
}
