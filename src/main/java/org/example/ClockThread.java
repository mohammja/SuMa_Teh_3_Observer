package org.example;

public class ClockThread implements Runnable{
    private final ClockTimer ct;

    ClockThread(ClockTimer ct){
        this.ct = ct;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
                ct.tick();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
