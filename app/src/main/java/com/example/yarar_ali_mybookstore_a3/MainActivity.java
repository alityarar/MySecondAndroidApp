package com.example.yarar_ali_mybookstore_a3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView autobiography,fictional,comics,selfhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autobiography=findViewById(R.id.AutobiographyImage);
        fictional=findViewById(R.id.FictionImage);
        comics=findViewById(R.id.ComicsImage);
        selfhelp=findViewById(R.id.SelfHelpImage);

        autobiography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra(Constant.CATEGORY,Constant.AUTOBIOGRAPHY);
                startActivity(intent);
            }
        });
        fictional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra(Constant.CATEGORY,Constant.FICTIONAL);
                startActivity(intent);
            }
        });
        comics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra(Constant.CATEGORY,Constant.COMICS);
                startActivity(intent);
            }
        });
        selfhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra(Constant.CATEGORY,Constant.SELFHELP);
                startActivity(intent);
            }
        });
    }
}