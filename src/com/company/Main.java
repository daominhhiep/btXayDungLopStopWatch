package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double time = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch(time);

        stopWatch.start();
        sortArray();
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

    public static void sortArray() {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(array);
    }
}