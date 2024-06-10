package MapAndFlatMapExample;


import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapTest {

    public static void main(String[] args) {

        List<Customer> customerList =
                CustomerDAO.getCustomerList();

        // get Emails
        List<String> emails = customerList.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        // get Phone numbers

        List<List<String>> phonesNumbers = customerList.stream()
                .map(customer -> customer.getPhonenumber())
                .collect(Collectors.toList());
        System.out.println(phonesNumbers);

        // using flat map datatransform and data flattering

        List<String> numbers = customerList.stream().
                flatMap(customer -> customer.getPhonenumber().stream())
                .collect(Collectors.toList());
        System.out.println(numbers);

    }

}
