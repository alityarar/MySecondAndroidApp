package com.example.yarar_ali_mybookstore_a3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetailsActivity extends AppCompatActivity {


    TextView bookNameTv,bookDescTv;
    ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        bookNameTv=findViewById(R.id.book_name);
        bookDescTv=findViewById(R.id.book_desp);
        bookImage=findViewById(R.id.book_image);

        Intent intent=getIntent();

        String name=intent.getStringExtra(Constant.BOOK_NAME);
        String desc=intent.getStringExtra(Constant.BOOK_DESC);
        int img=intent.getIntExtra(Constant.BOOK_IMG,0);

        bookNameTv.setText(name);
        bookDescTv.setText(desc);
        bookImage.setImageResource(img);

    }
}