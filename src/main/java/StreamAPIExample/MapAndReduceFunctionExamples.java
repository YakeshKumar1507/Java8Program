package StreamAPIExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceFunctionExamples {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(8,5,6,1,2,7,5,6);
        // find sum of array
        // old way
        int sum =0;

        for(Integer integer:list){
            sum = sum+ integer;
        }
        System.out.println(sum);

        // Using stream

        int sum1 = list.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer sum2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);

        Optional<Integer> reduceSumWithMethodReference = list.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Optional<Integer> maxValue = list.stream().reduce(Integer::max);
        System.out.println(maxValue.get());

        // print max value using 
        Optional<Integer> minimum = list.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println(minimum.get());
    }
}
