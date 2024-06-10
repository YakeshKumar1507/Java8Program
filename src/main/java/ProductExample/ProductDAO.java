package ProductExample;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public static List<Product> getProductList(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(101,"Rice",1800));
        list.add(new Product(103,"Oil",1200));
        list.add(new Product(104,"Wheat",600));
        list.add(new Product(108,"Dhal",800));
        return list;
    }
}
