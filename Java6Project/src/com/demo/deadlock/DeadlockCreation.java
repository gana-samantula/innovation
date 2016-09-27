package com.demo.deadlock;

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class DeadlockCreation {
 
    public static void main(String[] args) {
           Thread thread1 = new Thread(new A(), "Thread-1");
           Thread thread2 = new Thread(new B(), "Thread-2");
           thread1.start();
           thread2.start();
    }
 
}
 