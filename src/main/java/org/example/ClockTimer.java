package org.example;

public class ClockTimer extends Subject{
    private int hour;
    private int minute;
    private int second;

    public ClockTimer(){
        Thread clockThread = new Thread(new ClockThread(this));
        clockThread.start();
    }
    public void tick(){
        second++;
        if (second == 60){
           minute++;
           second = 0;
        }
        if (minute == 60){
            hour++;
            minute = 0;
        }
        if (hour == 24){
            hour = 0;
        }
        notifyObservers();
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
}
