package com.smartosc.day2.entity;

import java.util.Calendar;

public class Time {
    private Calendar calendar;

    public Time(int hours, int minute) {
        this.calendar = Calendar.getInstance();
        this.calendar.set(Calendar.HOUR, hours);
        this.calendar.set(Calendar.MINUTE, minute);
    }

    public boolean checkBefore(Time other) {
        return this.calendar.before(other.calendar);
    }

    public int getTotalMin() {
        int h = this.getHours();
        int m = this.getMinute();
        int total = h * 60 + m;
        if (h == 23 && m == 59) {
            total -= 1;
        }
        return total;
    }

    public int getHours() {
        return this.calendar.get(Calendar.HOUR);
    }

    public int getMinute() {
        return this.calendar.get(Calendar.MINUTE);
    }

}
