package Java8ExamplePrograms;

import java.util.Arrays;
import java.util.List;

public class Practice3 {

    // Print sum of the list
    // print average of the list

    public static void printSumMethod1(List<Integer> list){
        System.out.println(list.stream().reduce(0, (a,b) -> a+b));
    }

    public static void printSumMethod2(List<Integer> list){
        System.out.println(list.stream().reduce(Integer::sum));
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 3, 6, 11, 9, 5, 13);
        printSumMethod1(list);
        System.out.println("-----------------");
        printSumMethod2(list);
    }
}
