package org.example.Threads;

import java.util.logging.Logger;

public class MyJob implements Runnable{
    public static Logger logger=Logger.getLogger(org.example.Threads.MyJob.class.getName());
    private int id;

    public MyJob(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        logger.info("["+id+"] The run method has ran: " + hashCode());
    }
}
