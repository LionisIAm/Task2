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
    String event_help;
    int event_add_img;
    String event_topic;
    String event_text;

    public Event(int img, String name, String datetime, String where, String geo,
                 String help, String topic, int add_img,  String text )
    {
        super();
        this.event_img = img;
        this.event_name = name;
        this.event_datetime = datetime;
        this.event_where = where;
        this.event_geo = geo;
        if (help!=null)
            this.event_help = help;
        if (add_img!=0)
            this.event_add_img = add_img;
        if (topic!=null)
            this.event_topic = topic;
        if (text!=null)
            this.event_text = text;
    }
    public Event(int img,String name)
    {
        super();
        this.event_img = img;
        this.event_name = name;
    }
    /*public int getImg(){
        return event_img;
    }
    public String getName(){
        return event_name;
    }*/
}
