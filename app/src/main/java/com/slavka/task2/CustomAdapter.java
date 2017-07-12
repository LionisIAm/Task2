package com.slavka.task2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Slavka on 12.07.2017.
 */

public class CustomAdapter extends BaseAdapter {

    private ArrayList<Event> _data;
    Context _c;

    CustomAdapter (ArrayList<Event> data, Context c){
        _data = data;
        _c = c;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
