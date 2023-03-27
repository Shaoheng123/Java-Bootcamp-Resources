import product.Shirt;
import product.Pants;
import static product.Shirt.*;
// import static product.Pants.*;
public class Main {

    public static void main(String[] args) {
        
        Shirt shirt= new Shirt();
        shirt.setBrand("NIKE");
        shirt.setPrice(0);
        shirt.setColor("PINK");
        shirt.setSize(Size.SMALL);
        shirt.fold();
        // System.out.println(shirt.getBrand());
        Pants pants = new Pants();
        pants.setBrand("Levi");
        pants.setWaist(30);
        pants.setColor("pink");
        pants.setLength(20);
        pants.setPrice(40);
        pants.fold();



    }

}
