package com.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        String names[] = {"Pranay", "jhon", "cena", "durgesh", "Brock", "Rock", "virat", "sehwag", "raina"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            // System.out.print(e);
        });

        IntStream stream2 = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        stream2.forEach(e -> {
            System.out.print(e);
        });

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        Stream<Integer> stream3 = list2.stream();
        stream3.forEach(e->{
            System.out.println(e);
        });
    }
}
