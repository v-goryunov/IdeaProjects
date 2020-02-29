package com.alpha;

public enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

    public DaysOfWeek nextDay () {
        DaysOfWeek[] days = DaysOfWeek.values();
        int index = this.ordinal() + 1;
//        return index == days.length ? days[0] : days[index];
        return days [(this.ordinal() + 1) % days.length];
    }
}
