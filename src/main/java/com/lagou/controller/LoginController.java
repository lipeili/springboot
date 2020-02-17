package com.lagou.controller;

import com.lagou.pojo.Article;
import com.lagou.pojo.Person;
import com.lagou.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private ArticleRepository articleRepository;

    @RequestMapping("/index")
    public String index(Model model){

        Iterable<Article> articles = articleRepository.findAll();

        model.addAttribute("articles", articles);

        return "client/index";
    }


}
