package truongphuoc;

public class Storage{
    private int number;
    boolean isUnread = false;

    public void setUnread(boolean unread) {
        isUnread = unread;
        notify();
    }

    public synchronized int getNumber() {
        ensureUnread(false);
        setUnread(true);
        return number;
    }

    public synchronized void setNumber(int number) {
        ensureUnread(true);
        setUnread(false);
        this.number = number;
    }

    public void ensureUnread(boolean check) {
        while (isUnread != check) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
