package com.example.admin.chaptern.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.admin.chaptern.Article;

import java.util.List;

@Dao
public interface ArticleDAO {

    @Query("SELECT * FROM articles")
    List<Article> getAll();


    @Insert
    void insertAll(Article... articles);

    @Insert
    void insert(Article article);

}
