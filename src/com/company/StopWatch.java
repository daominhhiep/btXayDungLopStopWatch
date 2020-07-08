package com.company;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(double startTime) {
        this.startTime = startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
