package com.slavka.task2;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Slavka on 12.07.2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layoutResourceId;
    RelativeLayout linearMain;
    ArrayList<Event> data = new ArrayList<Event>();

    public CustomAdapter(Context context, int layoutResourceId,
                              ArrayList<Event> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            Event event = data.get(position);

            ImageView img = (ImageView) row.findViewById(R.id.img);
            img.setImageResource(event.event_img);


            TextView name = (TextView) row.findViewById(R.id.name);
            name.setText(event.event_name);

            TextView datetime = (TextView) row.findViewById(R.id.datetime);
            datetime.setText(event.event_datetime);

            TextView where = (TextView) row.findViewById(R.id.where);
            where.setText(event.event_where);

            TextView geo = (TextView) row.findViewById(R.id.geo);
            geo.setText(event.event_geo);

        }

        return row;

    }



}
