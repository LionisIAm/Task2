package com.slavka.task2;

/**
 * Created by Slavka on 12.07.2017.
 */

public class Event {
    int event_img;
    String event_name;
    String event_datetime;
    String event_where;
    String event_geo;
    String event_tag;
    String event_text;
    public Event(int img, String name, String datetime, String where, String geo)
    {
        super();
        this.event_img = img;
        this.event_name = name;
        this.event_datetime = datetime;
        this.event_where = where;
        this.event_geo = geo;
    }
    public Event(int img,String name)
    {
        super();
        this.event_img = img;
        this.event_name = name;
    }
    public int getImg(){
        return event_img;
    }
    public String getName(){
        return event_name;
    }
}
