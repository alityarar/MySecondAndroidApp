package com.example.yarar_ali_mybookstore_a3;

public class Book {
    public String name,description,author,price;
    public int image;
    public Book(String name, String author,String description, String price, int image){
        this.name=name;
        this.description=description;
        this.author=author;
        this.price=price;
        this.image=image;
    }
}
