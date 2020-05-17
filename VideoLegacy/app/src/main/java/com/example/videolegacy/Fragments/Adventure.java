package com.example.videolegacy.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.videolegacy.Activity.SeriesActivity;
import com.example.videolegacy.Adapter.AdventureAdapter;
import com.example.videolegacy.R;

import java.util.ArrayList;


public class Adventure extends Fragment {
    String[] adventures = {"The Witcher","Lost","Rick and Morty","Arrow",
            "The Flash","Titans", "Batlefish", "Archer", "Final Space", "Supergirl", "Marco Polo","Sherlock",
     "Shooter", "Merlin", "Star Trek", "Castlevania", "Black Sails", "Hitman"};

    public Adventure() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_adventure, container, false);
        GridView gridView =view.findViewById(R.id.gridAdventure);
        AdventureAdapter adventureAdapter = new AdventureAdapter(getActivity(), adventures);
        gridView.setAdapter(adventureAdapter);
        return view;
    }
}
