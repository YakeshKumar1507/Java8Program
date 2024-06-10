package SortedExamples;

import ProductExample.Product;
import ProductExample.ProductDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedUsingList {

    public static void main(String[] args) {

        //Example using data types
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(23);
        list.add(9);
        list.add(13);
        list.add(6);

        // Traditional Execution

        Collections.sort(list);
        System.out.println("Ascending order : " + list);
        Collections.reverse(list);
        System.out.println("Descending Order : " + list);

        // Using Lambda expression

        // option1
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);

        //option 2

        // Using Stream and Method references
        System.out.println("Ascending order");
        list.stream().sorted((o1,o2)->o1-o2).forEach(System.out::println);
        System.out.println("Descending order");
        list.stream().sorted((o1,o2)->o2-o1).forEach(System.out::println);


        // Examples using Objects

        List<Product> list1=ProductDAO.getProductList();

        // using traditional

        Collections.sort(list1, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });

        System.out.println(list1);

        // using lambda expressions

        Collections.sort(list1,((o1, o2) -> (int)(o1.getName().compareTo(o2.getName()))));
        System.out.println("Sorted using name");

        System.out.println(list1);


        // using stream api option1
        System.out.println("----Sorted using ID ---");
        list1.stream().sorted(Comparator.comparing(Product::getId).reversed()).forEach(System.out::println);

        System.out.println("----Sorted using name ---");
        // Using Stream api option2
        list1.stream().sorted(((o1, o2) -> o2.getName().compareTo(o1.getName()))).forEach(System.out::println);
    }
}
