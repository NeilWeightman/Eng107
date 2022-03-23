package com.sparta.threads;

import java.util.ArrayList;
import java.util.List;

public class MyDemo implements Runnable {
    private String name = null;
    private List<String> list;

    public MyDemo(List<String> theList, String name) {
        this.list = theList;
        this.name = name;
    }

    public void sayHello(){
       for (int i = 0; i < 1000; i++) {
           synchronized (list) {
               list.add("Hello, " + name);
           }
        }
        System.out.println("Hello, " + name);
    }

    @Override
    public void run() {
        sayHello();
    }
}
