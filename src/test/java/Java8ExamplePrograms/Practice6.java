package Java8ExamplePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice6 {

    // print the course in ascending / descending order by course length
    // print the number in ascending/ descending order
    // store all the square number in one list
    // store all the even numbers in one list
    // store all the course based upon course length



    public static void printAscendingOrder(List<Integer> list){
        list.stream().sorted().forEach(System.out::println);
    }

    public static void printDescendingOrder(List<Integer> list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static List<Integer> storeAllSquareNumbers(List<Integer> list){
       return list.stream().map(i->i*i).collect(Collectors.toList());
    }

    public static  List<Integer> storeAllEvenNumber(List<Integer> list){
        return  list.stream().filter(i ->i%2==0).collect(Collectors.toList());
    }

    public static  List<String> storeAscendingOrder(List<String> list){
        return  list.stream().sorted().collect(Collectors.toList());
    }

    public static  List<String> storeDescendingOrder(List<String> list){
        return  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static List<String> storeBasedUponCourseLength(List<String> list){
        return list.stream().sorted(Comparator.comparing((x->x.length()))).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 3, 6, 11, 9, 5, 13);
        printAscendingOrder(list);
        System.out.println("-------------------------");
        printDescendingOrder(list);
        System.out.println("-------------------------");
        System.out.println(storeAllSquareNumbers(list));
        System.out.println("-------------------------");
        System.out.println(storeAllEvenNumber(list));

        System.out.println("-------------------------");
        List<String> courses = Arrays.asList("Spring", "SpringBoot", "Microservices", "API", "Azure", "API", "Docker");
        System.out.println(storeAscendingOrder(courses));
        System.out.println("-------------------------");
        System.out.println(storeDescendingOrder(courses));

        System.out.println("-------------------------");
        System.out.println(storeBasedUponCourseLength(courses));
    }



}
