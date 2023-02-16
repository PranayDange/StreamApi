package com.example.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //filter----> always takes a (predicate)
        //predicate is a boolean i.e, true or false value function


        //map
        //by using this we can perfrom operation on each element
        List<String> name = List.of("Pranay", "jhon", "cena", "durgesh", "Brock", "Rock", "virat", "sehwag", "raina", "prawn", "Prajwal");
        //if we have to filter out name strating with p
        List<String> stream4 = name.stream().filter(e -> e.startsWith("P")).collect(Collectors.toList());
        System.out.println(stream4);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 4, 5, 64, 7, 47, 47, 686, 84, 353, 5, 36, 4, 55);
        List<Integer> numbersList = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(numbersList);

        //sorting
        numbers.stream().sorted().forEach(e -> {
            System.out.print(e+" ");
        });
    }
}
