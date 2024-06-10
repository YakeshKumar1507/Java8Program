package LambdaExpressionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // option 1
        Supplier<String> message = () ->
                "welcome to scale soft solutions";
        System.out.println(message.get());

        // option 2
        Supplier<String> message1 = () -> {
          return "welcome to scale soft solutions";
        };
        System.out.println(message1.get());


        // option 3 example using list

        List<String> names = Arrays.asList("dinesh", "yakesh",null);
        System.out.println(names.stream().findAny().orElseGet(()->"No values present in the list"));

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"No values present in the list"));



    }

}
