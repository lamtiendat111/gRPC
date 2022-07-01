package com.ltd.protobuf;

import com.ltd.models.Person;

public class PerformanceTest {
    public static void main(String[] args) {
        //json
        Runnable runnable1;
        Person dat = Person.newBuilder()
                .setAge(18)
                .setName("dat")
                .build();

        //protobuf
        Runnable runnable2;


    }

    private static void runPerformanceTest(Runnable runnable, String method)
    {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)
        {
            runnable.run();
        }

        long time2 = System.currentTimeMillis();

        System.out.println(method + " " + (time2 - time1) + " ms");

    }
}
