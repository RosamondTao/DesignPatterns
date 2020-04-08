package abstractfactory;

public class Main {
    public static void main(String[] args) {
        //AbstractFactory af = new ModernFactory();
        AbstractFactory af = new MagicFactory();
        Food f = af.createFood();
        Vehicle v = af.createVehicle();
        f.foodName();
        v.vehicleName();
    }
}
