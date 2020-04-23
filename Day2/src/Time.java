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
        if (this.hour != 23 && this.minutes != 59)
        {
            return ( this.hour * 60 ) + this.minutes ;
        } else
        {
            return this.hour * 60 + this.minutes - 1;
        }
    }
}
