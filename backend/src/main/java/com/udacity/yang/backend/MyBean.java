package com.udacity.yang.backend;

import com.example.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String getGCEJoke() {
        return Joker.getJoke();
    }
}



