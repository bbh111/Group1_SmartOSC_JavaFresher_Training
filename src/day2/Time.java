package day2;

public class Time {
    private final int hour;
    private final int minutes;

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean before(Time otherTime) {
        if (this.getHour() > otherTime.getHour()) {
            return true;
        } else if (this.getHour() == otherTime.getHour()) {
            return this.getMinutes() > otherTime.getMinutes();
        }
        return false;
    }

    public int countMinutes() {
        if (this.getHour() != 23 && this.getMinutes() != 59) {
            return this.getHour() * 60 + this.getMinutes();
        } else {
            return this.getHour() * 60 + this.getMinutes() - 1;
        }
    }

}
