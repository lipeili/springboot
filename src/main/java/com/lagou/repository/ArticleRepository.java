package com.lagou.repository;

import com.lagou.pojo.Article;
import com.lagou.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
