package org.example;

public class DigitalClock implements Observer{
    private final ClockTimer timer;
    public DigitalClock (ClockTimer ct){
        timer = ct;
        timer.attach(this);
    }
    public void update(Subject s){
        if(s == timer){
            draw();
        }
    }
    public void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
}
