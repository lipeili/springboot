package com.lagou.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_article")
public class Article {

    @Id //表明映射主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //文章id
    private String title; //文章标题
    private String content; //文章内容
    private String created; //文章内容


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created='" + created + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
