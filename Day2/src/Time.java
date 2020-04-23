public class Time {
    int hour;
    int minutes;

    public void time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public boolean before(Time otherTime)
    {
        if (this.hour > otherTime.hour) {
            return true;
        } else if (this.hour == otherTime.hour) {
            return this.minutes > otherTime.minutes;
        }
        return false;
    }

    public int countMinutes()
    {
        return ( this.hour * 60 ) + this.minutes ;
    }
}
