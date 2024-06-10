package LambdaExpressionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//implements Predicate<Integer>
public class PredicateExample {


//    @Override
//    public boolean test(Integer integer) {
//        if (integer % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args) {

        // using boilerplate

//        Predicate<Integer> predicate = new PredicateExample();
//        predicate.test(5);

        // using lambda expression

        // Option1

        Predicate<Integer> integerPredicate = (integer) -> {
            if (integer % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(integerPredicate.test(15));

        // option 2

        Predicate<Integer> predicateInteger = (integer) -> integer % 2 == 0;
        System.out.println(predicateInteger.test(20));

        // Example using

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList.stream().filter(predicateInteger).forEach((integer) -> {
            System.out.println("print even values : " + integer);
        });

    }
}
