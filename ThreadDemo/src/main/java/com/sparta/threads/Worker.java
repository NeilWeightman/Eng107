package com.sparta.threads;

public class Worker extends Thread {
    private Worker otherWorker = null;
    public Worker() {
    }

    public Worker getOtherWorker() {
        return otherWorker;
    }

    public void setOtherWorker(Worker otherWorker) {
        this.otherWorker = otherWorker;
    }

    @Override
    public void run() {
        doSomething();
    }

    public synchronized void doSomething(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        otherWorker.anotherAction();
        System.out.println("Hello from the method");
    }

    public synchronized void anotherAction(){
        System.out.println("In anotherAction()");
    }
}
