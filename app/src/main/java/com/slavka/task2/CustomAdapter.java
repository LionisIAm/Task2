package com.slavka.task2;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
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

            if (event.event_help!=null){
                TextView help = (TextView) row.findViewById(R.id.help);
                help.setText(event.event_help);
            }
            else
                ((ViewManager)row.findViewById(R.id.pink_layout).getParent()).removeView(row.findViewById(R.id.pink_layout));

            ImageView add_img = (ImageView) row.findViewById(R.id.add_img);
            if (event.event_add_img!=0)
                add_img.setImageResource(event.event_add_img);
            else
                ((ViewManager)add_img.getParent()).removeView(add_img);

            TextView topic = (TextView) row.findViewById(R.id.topic);
            if (event.event_topic!=null)
                topic.setText(event.event_topic);
            else
                ((ViewManager)topic.getParent()).removeView(topic);




        }

        return row;

    }



}
