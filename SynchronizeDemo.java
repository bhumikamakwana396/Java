package com.thread;

class CallBack {
    public synchronized void call(String msg) 
    {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Caller implements Runnable 
{
    String msg;
    CallBack c;
    Thread t;

    public Caller(String msg, CallBack c) 
    {
        this.msg = msg;
        this.c = c;
        t = new Thread(this); // create thread
        t.start(); // start thread
    }

    public void run() 
    {
        c.call(msg);
    }
}

public class SynchronizeDemo {
    public static void main(String[] args) {
        CallBack cb = new CallBack();

        Caller c1 = new Caller("Hello", cb);
        Caller c2 = new Caller("Java", cb);
        Caller c3 = new Caller("World", cb);

        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
