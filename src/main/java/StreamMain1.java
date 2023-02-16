import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {


        //create a list and filter all even numbers from the list

        //of is a method in a list ...the elements in this list are immutable
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        //System.out.println(list1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        //  System.out.println(list2);

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        // System.out.println(list3);

        //without stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);

            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        //using stream API
       /* Stream<Integer> stram = list1.stream();
        List<Integer> newList = stram.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);*/
        List<Integer> newList2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList2);

        List<Integer> newList3 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList3);
    }
}
