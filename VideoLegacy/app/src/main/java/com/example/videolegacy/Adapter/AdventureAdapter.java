package com.example.videolegacy.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdventureAdapter extends BaseAdapter {

    private final Context mContext;
    private final String[] books;

    public AdventureAdapter(Context context, String[] books) {
        this.mContext = context;
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final String  serie = books[position];
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setTextColor(Color.WHITE);
        dummyTextView.setText(serie);
        dummyTextView.setTextSize(20);
        return dummyTextView;
    }

}

