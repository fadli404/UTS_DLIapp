package com.apps.fadli_app;
/*
Nama : Wisuda Nur Fadli
NIM : 10117179
Kelas : IF5
Tanggal pengerjaan : 06-05-2020
 */

public class Screenitem {
    String Title,Description;
    int ScreenImg;
    public Screenitem(String title, String description, int screenImg){
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }
    public void setTitle(String title){
        Title = title;
    }
    public void setDescription(String description){
        Description = description;
    }
    public void setScreenImg(int screenImg){
        ScreenImg = screenImg;
    }
    public String getTitle(){
        return Title;
    }
    public String getDescription(){
        return Description;
    }
    public int getScreenImg(){
        return ScreenImg;
    }
}
