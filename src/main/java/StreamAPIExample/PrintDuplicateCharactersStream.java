package StreamAPIExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateCharactersStream {


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

        //System.out.println(map);

        // iterate all the count of the values

        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("-------------------------");

        map.entrySet().stream().sorted((i1, i2) -> i1.getKey().compareTo(i2.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------");


        map.entrySet().stream().filter((t) -> t.getValue() > 1).forEach((t) -> {
            System.out.println((t));
        });

    }

}
