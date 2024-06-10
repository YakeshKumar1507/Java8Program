package Java8ExamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

    //Questions
    // Print all the numbers in list
    // print cube of odd numbers in the list
    // print all course in the list
    // Print the coruse contians "Spring"
    // print the course having more than four letter
    // print course length in the list

    public static void printAllTheNumber(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }

    public static void printOddNumbers(List<Integer> list) {
        list.stream().filter(i -> i % 2 == 1).forEach(System.out::println);
    }

    public static void printCubeNumbers(List<Integer> list) {
        list.stream().map(i -> i * i * i).forEach(System.out::println);

    }

    public static void printAllTheCourse(List<String> list) {
        list.forEach(x -> System.out.println(x));
    }

    public static void printCourseContainsSpring(List<String> list) {
        list.stream().filter(x -> x.contains("Spring")).forEach(System.out::println);
    }

    public static void printCourseHavingThreeLetters(List<String> list) {
        list.stream().filter(x -> x.length() > 3).forEach(System.out::println);
    }

    public static void printCourseLength(List<String> list){
        list.stream().map(x -> x.length()).forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 3, 6, 11, 9, 5, 13);
        printAllTheNumber(list);
        System.out.println("---------------");
        printOddNumbers(list);
        System.out.println("---------------");
        printCubeNumbers(list);
        System.out.println("---------------");
        List<String> courses = Arrays.asList("Spring", "SpringBoot", "Microservices", "API", "Azure", "API", "Docker");
        printAllTheCourse(courses);
        System.out.println("---------------");
        printCourseContainsSpring(courses);
        System.out.println("---------------");
        printCourseHavingThreeLetters(courses);
        System.out.println("---------------");
        printCourseLength(courses);

    }


}
