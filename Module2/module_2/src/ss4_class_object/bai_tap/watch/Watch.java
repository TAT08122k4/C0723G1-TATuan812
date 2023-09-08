package ss4_class_object.bai_tap.watch;

public class Watch {
    private long startTime;
    private long endTime;

    public Watch() {

    }

    public long start() {
        return startTime = System.currentTimeMillis();
    }

    public long stop() {
        return endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
