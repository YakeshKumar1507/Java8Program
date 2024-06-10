package StreamAPIExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamExample {

    public static void main(String[] args) {

        // Streams using list

        List<String> names = new ArrayList<>();
        names.add("Yakesh");
        names.add("Dinesh");
        names.add("Vijay");
        names.add("Mathes");
        names.add("Varun");
        names.add("Arun");

        // foreach function

        // iterate all the names in the list
        names.stream().forEach((t) -> {
            System.out.println(t);
        });

        System.out.println("-----------------------------");

        // filter functions

        // iterate the names based upon the condition which starts from "V"
        names.stream().filter((t) -> (t.startsWith("V"))).forEach((t) -> System.out.println(t));

        System.out.println("-----------------------------");

        // Streams using Map

        Map<Integer, String> studentsNames = new HashMap<>();
        studentsNames.put(1,"Arun");
        studentsNames.put(2,"Divakar");
        studentsNames.put(3,"Ganesh");
        studentsNames.put(4,"Siva");
        studentsNames.put(5,"Yakesh");

        // Iterate all the values

        studentsNames.forEach((key,value) ->{
            System.out.println(key + " : " + value) ;
        });

        System.out.println("-----------------------------");

        studentsNames.entrySet().stream().forEach((t) ->{
            System.out.println(t.getKey() + " " +t.getValue());
        });


        System.out.println("-----------------------------");

        //filter function in map

        studentsNames.entrySet().stream().filter((t)->(t.getKey() %2 ==0)).forEach((obj) ->{
            System.out.println(obj);
        });

    }
}
