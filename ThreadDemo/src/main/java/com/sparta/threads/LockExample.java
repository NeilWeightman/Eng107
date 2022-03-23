package com.sparta.threads;

public class LockExample {

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        w1.setOtherWorker(w2);
        w2.setOtherWorker(w1);

        w1.start();
        w2.start();
    }
}
