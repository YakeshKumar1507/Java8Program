package OptionalExamples;

import MapAndFlatMapExample.Customer;
import MapAndFlatMapExample.CustomerDAO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    static public Customer getCustomerByEmail(String email){
        List<Customer> customerList = CustomerDAO.getCustomerList();
        return  customerList.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElseGet(()->new Customer());
    }

    public static void main(String[] args) {

        // Creating Object for Customer class

        Customer customer = new Customer(101,"john",null, Arrays.asList("1223456478","84548164521"));

        //empty
        //of
        //nullable


        // empty -- it return the empty function
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Checking the particular function either contains value or null

//        Optional<String> customerEmail = Optional.of(customer.getEmail());
//        System.out.println(customerEmail);

        // after changing the value is null

//        Optional<String> customerEmail1 = Optional.of(customer.getEmail());
//        System.out.println(customerEmail1);

        //Option3 to avoid the exception

        //ofNUllable function  ---> returns check the value is present , suppose if null it returns the Optional.empty()
        Optional<String> customerEmail2= Optional.ofNullable(customer.getEmail());
       // System.out.println(customerEmail2);


        // To get the exact value

        if(customerEmail2.isPresent()) { // the function check the element is present or not to avoid no such element function
            System.out.println(customerEmail2.get());
        }

       // System.out.println(customerEmail2.orElseThrow(()-> new IllegalArgumentException("email not present")));

        System.out.println(customerEmail2.orElseGet(()->"default email..."));

        getCustomerByEmail("pqr");

    }
}
