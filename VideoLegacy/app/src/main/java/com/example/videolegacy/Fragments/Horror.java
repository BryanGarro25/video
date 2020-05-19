package com.example.videolegacy.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

import com.example.videolegacy.Adapter.HorrorAdapter;
import com.example.videolegacy.Data.Data;
import com.example.videolegacy.R;


public class Horror extends Fragment implements HorrorAdapter.ItemClickListener{
    String[] horrorFilms ;
    HorrorAdapter adapter;
    Data db;
    public Horror() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //RecyclerView recyclerView = findViewById(R.id.rvNumbers);
        View view =  inflater.inflate(R.layout.fragment_horror, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvNumbers);
        db = new Data();
        horrorFilms = db.horrorSeriesToArray();
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));
        adapter = new HorrorAdapter(getActivity(), horrorFilms);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.i("TAG", "You clicked number " + adapter.getItem(position) + ", which is at cell position " + position);

    }




}
