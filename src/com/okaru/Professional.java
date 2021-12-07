package com.okaru;

import java.util.ArrayList;

public class Professional <T extends Person>{
    private String name;
    private int age;
    private boolean isMarried;

    private ArrayList<T> persons = new ArrayList<>();
    public Professional(String name) {
        this.name = name;
    }

    public void insert(T Person){

    }

    public String getName() {
        return name;
    }
}
