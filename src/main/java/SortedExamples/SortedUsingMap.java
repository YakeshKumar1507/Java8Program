package SortedExamples;

import ProductExample.Product;

import java.util.*;

public class SortedUsingMap {

    public static void main(String[] args) {

        String name = "Yakesh Kumar";
        char ch[] = name.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        System.out.println("-------------------------");
        // Sorting using list

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        // Option 1
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        System.out.println(list);

        System.out.println("-------------------------");
        //Option 2 using Lambda expression.
        Collections.sort(list,(o1, o2)->o1.getKey().compareTo(o2.getKey()));
        System.out.println(list);

        System.out.println("-------------------------");
        // Option3 using stream

        map.entrySet().stream().sorted(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        }).forEach(System.out::println);

        //Option 4 using stream api and lambda expression
        System.out.println("-------------------------");
        map.entrySet().stream().sorted(((o1, o2) -> o1.getKey().compareTo(o2.getKey()))).forEach(System.out::println);

        System.out.println("-------------------------");
        //Option 5 using Stream api and Comparing Function
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("-------------------------");
        //Option 6 using Stream api and Comparing Function using value

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // Example using object

        Map<Integer,Product> hashmap = new HashMap<>();
        hashmap.put(1,new Product(101,"Dhal",100));
        hashmap.put(3,new Product(102,"Milk",40));
        hashmap.put(6,new Product(103,"Oil",1300));
        hashmap.put(10,new Product(104,"Rice",1800));
        hashmap.put(2,new Product(105,"Wheat",1000));
        hashmap.put(5,new Product(106,"Chocolates",500));

        //Iterate the value based upon price

        hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Product::getPrice))).forEach(System.out::println);

        System.out.println("-------------------------");

        // Using lambda expression

        hashmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(((o1, o2) -> o1.getName().compareTo(o2.getName()))))
                .forEach(System.out::println);


    }
}
