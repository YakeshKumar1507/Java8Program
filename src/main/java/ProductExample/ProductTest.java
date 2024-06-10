package ProductExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ProductTest {

    public static void main(String[] args) {

        //Option 1 : Bioler plate
        ProductDAO productDAO = new ProductDAO();
        List<Product> listOfProduct = productDAO.getProductList();
        for(Product product:listOfProduct){
            System.out.printf(product.toString());
        }

        // Using Lambda Expression
        System.out.println("Sorting on the basis of name");

        System.out.println("-------------------------------");

        // option 2
        Collections.sort(listOfProduct,(p1,p2) ->{
            return  p1.name.compareTo(p2.name);
        });

        for(Product product:listOfProduct){
            System.out.println(product.id + " " + product.name+ " " +product.price);
        }


        System.out.println("-------------------------------");
        // option 3

        Collections.sort(listOfProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        for(Product product:listOfProduct){
            System.out.println(product.id + " " + product.name+ " " +product.price);
        }


        System.out.println("-------------------------------");
    }
}




