package com.example.viewpager.Model;



public class Whtsapp_List_Data {

   private String Name;

private  String message;

   private String time;

   public Whtsapp_List_Data(String Name,String message ,String time) {
      this.Name=Name;

      this.time=time;
   }
  public  String getName(){
      return Name;
  }

  public  String getTime(){
       return time;
  }
  public String getMessage(){
       return message;
  }

}
