package com.example.yarar_ali_mybookstore_a3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Book> getAutoBiography(){
        ArrayList<Book> autobiography=new ArrayList<>();
        autobiography.add(new Book("Steve Jobs","Steve Jobs","His life","20",R.drawable.stevjobx));
        autobiography.add(new Book("Elon Must","Elon Must","His life","25",R.drawable.melonmusk));
        autobiography.add(new Book("Edison","Edison","His life","20",R.drawable.edison));
        autobiography.add(new Book("Mandela","Mandela","His life","25",R.drawable.mandela));
        return autobiography;
    }

    public static ArrayList<Book> getFiction(){
        ArrayList<Book> fiction=new ArrayList<>();
        fiction.add(new Book("fiction book 1","Writer 1","His life","20",R.drawable.fict));
        fiction.add(new Book("fiction book 2","Writer 2","His life","20",R.drawable.fict));
        fiction.add(new Book("fiction book 3","Writer 3","His life","20",R.drawable.fict));
        fiction.add(new Book("fiction book 4","Writer 4","His life","20",R.drawable.fict));
        return fiction;
    }

    public static ArrayList<Book> getComics(){
        ArrayList<Book> comics=new ArrayList<>();
        comics.add(new Book("Comic book 1","Comic Book Writer 1","His life","20",R.drawable.comic));
        comics.add(new Book("Comic book 2","Comic Book Writer 2","His life","20",R.drawable.comic));
        comics.add(new Book("Comic book 3","Comic Book Writer 3","His life","20",R.drawable.comic));
        comics.add(new Book("Comic book 4","Comic Book Writer 4","His life","20",R.drawable.comic));

        return comics;
    }

    public static ArrayList<Book> getSelfHelp(){
        ArrayList<Book> selfhelp=new ArrayList<>();
        selfhelp.add(new Book("Self Help 1","Self Writer 1","His life","20",R.drawable.self));
        selfhelp.add(new Book("Self Help 2","Self Writer 2","His life","20",R.drawable.self));
        selfhelp.add(new Book("Self Help 3","Self Writer 3","His life","20",R.drawable.self));
        selfhelp.add(new Book("Self Help 4","Self Writer 4","His life","20",R.drawable.self));

        return selfhelp;
    }
}
