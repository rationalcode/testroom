package com.example.admin.chaptern;

public interface Document {

    String title = null;

    <T> T getTitle(T item);

    <T> T getInfo ();


}
