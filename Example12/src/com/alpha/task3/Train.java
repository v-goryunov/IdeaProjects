package com.alpha.task3;

import com.alpha.DaysOfWeek;

import java.util.Arrays;

public class Train {
    private static int nextNumber = 0;

    private int number;
    private  String stationDispatch;
    private  String stationArrival;
    private  String timeDispatch;
    private  String timeArrival;
    private DaysOfWeek[] days;

    {
        nextNumber ++;
    }

    public Train() {
        this.number = nextNumber;
    }

//    public static int getNextNumber() {
//        return nextNumber;
//    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getStationDispatch() {
        return stationDispatch;
    }
    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }
    public String getStationArrival() {
        return stationArrival;
    }
    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }
    public String getTimeDispatch() {
        return timeDispatch;
    }
    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }
    public String getTimeArrival() {
        return timeArrival;
    }
    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }
    public DaysOfWeek[] getDays() {
        return days;
    }
    public void setDays(DaysOfWeek[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Train: " +
                "number=" + number +
                ", stationDispatch=" + stationDispatch + '\'' +
                ", stationArriva=" + stationArrival + '\'' +
                ", timeDispatch=" + timeDispatch + '\'' +
                ", timeArrival=" + timeArrival + '\'' +
                ", days=" + Arrays.toString(days);
    }
}
