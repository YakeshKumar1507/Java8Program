package Java8ExamplePrograms;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

    //Print All Numbers
    //Print Even Number
    //print Odd Numbers

    public static void printAllNumbers(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }

    public static void printAllEvenNumbers(List<Integer> list){
        list.stream().filter( i-> i%2==0).forEach(System.out::println);
    }

    public static void printAllOddNumbers(List<Integer> list){
        list.stream().filter( i-> i%2==1).forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(8, 4, 3, 6, 11, 9, 5, 13);
        printAllNumbers(list);
        System.out.println("---------------");
        printAllEvenNumbers(list);
        System.out.println("---------------");
        printAllOddNumbers(list);

    }
}
