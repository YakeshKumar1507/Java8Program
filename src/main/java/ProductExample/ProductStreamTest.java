package ProductExample;

import java.util.List;
import java.util.stream.Collectors;

public class ProductStreamTest {

    // Without Arguments
//    public static List<Product> getOilItems(){
//        return  ProductDAO.getProductList().stream().filter((t) -> (t.getName().contains("Oil"))).collect(Collectors.toList());
//    }

    // with arguments

    public static List<Product> getOilItems(String items) {
        if (items.contains("Oil")) {
            return ProductDAO.getProductList().stream().filter((t) -> (t.getName().contains("Oil"))).collect(Collectors.toList());
        } else {
            return ProductDAO.getProductList().stream().filter((t) -> !(t.getName().contains("Oil"))).collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {

        // System.out.println(getOilItems());

        System.out.println(getOilItems("Dhall"));

        System.out.println("------------------------");
        System.out.println(getOilItems("Oil"));

    }

}
