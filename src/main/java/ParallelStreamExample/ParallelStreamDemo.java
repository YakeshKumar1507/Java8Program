package ParallelStreamExample;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        long start=0;
        long end =0;

        // Normal
//        start = System.currentTimeMillis();
//        IntStream.range(1,50).forEach(System.out::println);
//        end = System.currentTimeMillis();
//        System.out.println("Sequential Order : " + (end-start));
//
//        System.out.println("----------------------");
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,50).parallel().forEach(System.out::println);
//        end = System.currentTimeMillis();
//        System.out.println("parallel Order : " + (end-start));

//        IntStream.range(1,10).forEach((x)->
//        {
//            System.out.println("Thread " + Thread.currentThread().getName() + " : " +x);
//        });
//
//        System.out.println("----------------------");
//
//        IntStream.range(1,10).parallel().forEach((x)->
//        {
//            System.out.println("Thread " + Thread.currentThread().getName() + " : " +x);
//        });


    }
}
