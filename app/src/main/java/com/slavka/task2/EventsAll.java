package com.slavka.task2;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventsAll extends AppCompatActivity  {

    private TextView mTextMessage;
    private ListView list;
    ArrayList<Event> event_array = new ArrayList<Event>();
    CustomAdapter adapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_all);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);



        event_array.add(new Event(R.drawable.im1,"Philadelphia Dinner", "6:00pm – 7:30pm, March 14-15, 2016", "San Jose Conference Center\n" +
                "Santa Monica Hotel", "San Jose, California"));
        event_array.add(new Event(R.drawable.im2,"CES 2016", "11:00pm – 4:20pm, March 14-15, 2016", "Washington Conference Center\n" +
                "Santa Monica Hotel","1101 New York Ave, Washington, DC"));

        adapter = new CustomAdapter(this,R.layout.event_item,event_array);
        ListView list_events =(ListView) findViewById(R.id.list );
        list_events.setAdapter(adapter);


        //list = (ListView) findViewById(R.id.list);




       // BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
