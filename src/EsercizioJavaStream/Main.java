package EsercizioJavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1L,"Geronimo Stilton 1st ed","Books",150.25);
        Product p2 = new Product(2L,"World at war","Books",75.0);
        Product p3 = new Product(3L,"A DRG Story","Books",275.0);
        Product p4 = new Product(4L,"MachineGun","Boys",100.0);
        Product p5 = new Product(5L,"Fobal","Boys",15.0);
        Product p6 = new Product(6L,"How to survive against squirrels/Doom-Pack","Boys",975.0);
        Product p7 = new Product(7L,"Silencer","Baby",55.0);
        Product p8 = new Product(8L,"How To Make your baby cry","Baby",9.0);
        Product p9 = new Product(9L,"Baby-Monitor","Baby",250.0);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);

        List<Product> over100 = products.stream().filter(product -> product.getCategory().equals("Books")&&product.getPrice()>100).collect(Collectors.toList());
        System.out.println("Books that costs as my grandpa would say 'Più di una gamba'");
        over100.forEach(System.out::println);
    }
}
