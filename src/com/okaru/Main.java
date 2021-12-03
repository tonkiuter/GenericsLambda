package com.okaru;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//      Drawer okaru = new Drawer("Okaru");
        Map<String, String> map = new HashMap<>();
        List<String>list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        List<String> lista = new LinkedList<>();


        Drawer<Integer> arr = new Drawer<>(1);
        Drawer<Integer> arr1 = new Drawer<>(728);
        Drawer<Integer> arr2 = new Drawer<>(53);
        Drawer<Integer> arr3 = new Drawer<>(382);
        Drawer<Integer> arr4 = new Drawer<>(84);


        Drawer<Integer> [] nani = new Drawer[]{ arr, arr1, arr2,arr3, arr4 };
//
//        nani[0] = arr;
//        nani[1] = arr1;
//        nani[2] = arr2;
//        nani[3] = arr3;
//        nani[4] = arr4;

//        nani[0].setName("Okaru");
//        nani[1].setName("Nanji");
//        nani[2].setName("Kimiko");
//        nani[3].setName("Alvaro");
//        nani[4].setName("Tonkiuter");

        arr.add(nani);
        arr.showArray();
        arr.delete(2);

        System.out.println("=====After Delete=====");

        arr.showArray();

        arr.find(1);


    }
}
