package factorymethod;

import factorymethod.Car;
import factorymethod.CarFactory;
import factorymethod.Moveable;

public class Main {
    public static void main(String[] args) {
        //Moveable m = new Car();  //任意定制交通工具
        //任意定制生产过程
        //Moveable m  = new SimpleVehicleFactory().createPlane();
        //Moveable m = new CarFactory().create();
        Moveable m = new PlaneFactory().create();
        m.move();
    }
}
