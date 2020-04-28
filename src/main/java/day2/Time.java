package main.java.day2;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean before(int hours, int minutes) {
        int curentSecond = 0;
        curentSecond += this.hours * 3600 + this.minutes * 60;
        int checkSecond = 0;
        checkSecond += hours * 3600 + minutes * 60;
        if (checkSecond < curentSecond) {
            return false;
        } else {
            return true;
        }

    }
}
