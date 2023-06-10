package com.example.yarar_ali_mybookstore_a3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    String[] weekdays= {"Monday","Tuesday","Wednesday","another day"};

    ArrayList<Book> bookArrayList=new ArrayList<>();
    ListView bookListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);


        String category=getIntent().getStringExtra(Constant.CATEGORY);
        switch (category){
            case Constant.AUTOBIOGRAPHY:
                bookArrayList= DataSource.getAutoBiography();
                break;

            case Constant.FICTIONAL:
                bookArrayList=DataSource.getFiction();
                break;
            case Constant.COMICS:
                bookArrayList= DataSource.getComics();
                break;

            case Constant.SELFHELP:
                bookArrayList=DataSource.getSelfHelp();
                break;
        }

        bookListView=findViewById(R.id.book_list);

        BookListAdapter bookListAdapter=new BookListAdapter(this,bookArrayList);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, weekdays);

        bookListView.setAdapter(bookListAdapter);

        bookListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(BookListActivity.this,BookListActivity.class);
                intent.putExtra(Constant.BOOK_NAME,bookArrayList.get(position).name);
                intent.putExtra(Constant.BOOK_DESC,bookArrayList.get(position).description);
                intent.putExtra(Constant.BOOK_IMG,bookArrayList.get(position).image);


                startActivity(intent);

                Toast.makeText(BookListActivity.this,bookArrayList.get(position).name,Toast.LENGTH_SHORT).show();

            }
        });

    }
}