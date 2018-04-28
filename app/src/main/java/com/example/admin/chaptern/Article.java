package com.example.admin.chaptern;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.AsyncTask;

import com.example.admin.chaptern.DAO.ArticleDAO;

import java.util.ArrayList;
import java.util.List;

import static com.example.admin.chaptern.FirstMenu.db;

@Entity (tableName = "articles")
public class Article extends Chapter {


    public static List <Article> list = new ArrayList<>();

    public static String result;

    public Article(String articleTitle, String articleText) {

        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }

    @PrimaryKey (autoGenerate = true)
    public int id;
    @ColumnInfo (name = "articleTitle")
    public String articleTitle;

    @ColumnInfo(name = "articleText")
    public String articleText;

    @Override
    public <T> T getTitle(T item) {

        return item;
    }

    @Override
    public <T> T getInfo() {
        return null;
    }


    public static void setTitle(final String title, final String info) {

        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {

                ArticleDAO articleDAO = db.articleDAO();
                articleDAO.insert(new Article(title, info));

                list = articleDAO.getAll();


            }
        });

    }

}

