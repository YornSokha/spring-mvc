package com.hrd.springmvc.repository;

import com.hrd.springmvc.repository.article_repository.ArticleRepository;
import com.hrd.springmvc.repository.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepositoryImp implements ArticleRepository {
    private List<Article> articles = new ArrayList<>();

    @Override
    public void add(Article article) {
        articles.add(article);
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }
}
