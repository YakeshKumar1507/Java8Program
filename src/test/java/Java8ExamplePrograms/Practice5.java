package Java8ExamplePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Practice5 {

    // Store all the Even numbers in one list
    // Store all the Odd Numbers in  One List
    // CreateInterfaceImpAndFindSumInList


    public static List<Integer> collectEvenNumbers(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> collectOddNumebers(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
    }

    public static Integer createInterfaceImpAndFindSumInList(List<Integer> list){
        BinaryOperator<Integer> accumlator = new
                BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                       return integer +integer2;
                    }
                };
        return  list.stream().reduce(0,accumlator);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 3, 6, 11, 9, 5, 13);
        System.out.println(collectEvenNumbers(list));

        System.out.println(collectOddNumebers(list));

        System.out.println(createInterfaceImpAndFindSumInList(list));
    }
}
