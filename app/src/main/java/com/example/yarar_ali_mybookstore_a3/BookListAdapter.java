package com.example.yarar_ali_mybookstore_a3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookListAdapter extends BaseAdapter {

    Context mcontext;
    ArrayList<Book> books;
    public BookListAdapter(Context context,ArrayList<Book> bookList){
        this.mcontext=context;
        this.books=bookList;
    }


    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= View.inflate(mcontext,R.layout.book_list_item,null);

        TextView bookName=view.findViewById(R.id.stevetext);
        ImageView coverImage=view.findViewById(R.id.steveimage);

        bookName.setText(books.get(position).name);
        coverImage.setImageResource(books.get(position).image);

        return view;
    }
}
