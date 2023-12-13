package com.example.viewpager.Model;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    public  static List<Whtsapp_List_Data> getData(){
        List<Whtsapp_List_Data> mylist=new ArrayList<>();
        Whtsapp_List_Data flightData1=new Whtsapp_List_Data("ROhit","hello bro","10:20am");
        Whtsapp_List_Data flightData2=new Whtsapp_List_Data("Rfh","hello bro","10:20am");
       Whtsapp_List_Data flightData3=new Whtsapp_List_Data("Gfg","hello bro","10:20am");
        Whtsapp_List_Data flightData4=new Whtsapp_List_Data("Vhd","hello bro","10:20am");
        Whtsapp_List_Data flightData5=new Whtsapp_List_Data("Sjd","hello bro","10:20am");
        mylist.add(flightData1);
        mylist.add(flightData2);
        mylist.add(flightData3);
        mylist.add(flightData4);
        mylist.add(flightData5);
        return mylist;
    }

}
