package MapAndFlatMapExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

    static public List<Customer> getCustomerList(){
        return Stream.of(
                new Customer(101,"Yakesh","Yakesh@gmail.com", Arrays.asList("7358665392","7358649241")),
                new Customer(101,"Dinesh","Dinesh@gmail.com", Arrays.asList("7397248451","9150142512")),
                new Customer(101,"Siva","Siva@gmail.com", Arrays.asList("8562123645","9654231542")),
                new Customer(101,"Mathes","Mathes@gmail.com", Arrays.asList("7365985452","9845641242")),
                new Customer(101,"Arun","Arun@gmail.com", Arrays.asList("9165428435","9685874541"))
        ).collect(Collectors.toList());
    }
}
