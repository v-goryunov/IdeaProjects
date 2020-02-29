package com.alpha.task3;

import com.alpha.DaysOfWeek;

public class Main {
    public static void main(String[] args) {
        TrainSchedule schedule = new TrainSchedule(10);
        schedule.addTrain(createTrain());
        schedule.printTrains();

    }

//    metod sozdaet ekzempljar "train"
    public  static Train createTrain () {
        Train train = new Train();
        train.setStationDispatch("Kyiv");
        train.setStationArrival("Lviv");
        train.setTimeDispatch("12:00");
        train.setTimeArrival("18:00");
        train.setDays(new DaysOfWeek[] {DaysOfWeek.MONDAY,
            DaysOfWeek.WEDNESDAY, DaysOfWeek.FRIDAY});
        return train;
    }
}
