package Java_new.Java_Practice;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(19);
        numbers.add(21);
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        numbers.add(-2);

        List<Integer> sortedList = new ArrayList<>(numbers);

        Collections.sort(sortedList);
        System.out.println(sortedList);
    }
}
