package Java8ExamplePrograms;

import java.util.Arrays;
import java.util.List;

public class Practice4 {

    // PrintSumOfSquareOfAllTheNumbers
    // PrintSumOfCubeOfAllTheNumbers;
    // PrintSumOfOddNumberInList


    public static int printSumOfCube(List<Integer> list) {
        return list.stream().map(i -> i * i * i).reduce(Integer::sum).get();
    }

    public static int printSumOfSquare(List<Integer> list) {
        return list.stream().map(i -> i * i).reduce(Integer::sum).get();
    }

    public static int printSumOfOddNumber(List<Integer> list){
        return list.stream().filter(i-> i%2==1).reduce(Integer::sum).get();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 3, 6, 11, 9, 5, 13);
        System.out.println(printSumOfSquare(list));
        System.out.println("-------------------------");
        System.out.println(printSumOfCube(list));
        System.out.println("-------------------------");
        System.out.println(printSumOfOddNumber(list));
    }
}
