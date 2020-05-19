package com.example.videolegacy.Adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.videolegacy.Fragments.Adventure;
import com.example.videolegacy.Fragments.Horror;

public class SeriesAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public SeriesAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Adventure adventureFragment = new Adventure();
                return adventureFragment;
            case 1:
                Horror horrorFragment = new Horror();
                return horrorFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
