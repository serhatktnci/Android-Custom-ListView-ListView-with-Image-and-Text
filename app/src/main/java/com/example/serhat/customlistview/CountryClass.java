package com.example.serhat.customlistview;

/**
 * Created by Serhat on 8/6/17.
 */

public class CountryClass {

    String name,capital;
    int flag;

    public CountryClass(String name, String capital, int flag) {
        this.name = name;
        this.capital = capital;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
