package LambdaExpressionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("Print the given numbers  " + integer);
//    }

    public static void main(String[] args) {

        // option 1
        Consumer<Integer> integerConsumer =   (integer) ->{
            System.out.println("Print the given numbers  " + integer);
        };

        integerConsumer.accept(15);

        //option2

        Consumer<Integer> consumerInteger =  integer ->{
            System.out.println("Print the given numbers  " + integer);
        };

        consumerInteger.accept(35);

        //Option 3 using list

        List<Integer> integerList =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList.stream().forEach(consumerInteger);

        System.out.println("--------------------------");

        //option 4 passing directly consumer function in for each

        integerList.stream().forEach(integer -> {
            System.out.println("print " + integer);
        });



    }

}
