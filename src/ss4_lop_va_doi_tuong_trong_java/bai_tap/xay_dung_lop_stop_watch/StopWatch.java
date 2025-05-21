package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }
}
