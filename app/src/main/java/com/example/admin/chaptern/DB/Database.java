package com.example.admin.chaptern.DB;

import android.arch.persistence.room.RoomDatabase;

import com.example.admin.chaptern.Article;
import com.example.admin.chaptern.DAO.ArticleDAO;
import com.example.admin.chaptern.Notion;


@android.arch.persistence.room.Database(entities = {Article.class,Notion.class}, version = 1)
    public abstract class Database extends RoomDatabase {
        public abstract ArticleDAO articleDAO();
    }

