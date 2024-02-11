package org.example.Threads;

public class Threads {
    public static void run(){
        MyJob job1=new MyJob(1);
        MyJob job2=new MyJob(2);
        MyJob job3=new MyJob(3);
        new Thread(job1).start();
        new Thread(job2).start();
        new Thread(job3).start();
    }
}
