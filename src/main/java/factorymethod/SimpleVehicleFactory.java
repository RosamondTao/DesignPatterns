package factorymethod;

/**
 * 简单工厂的可扩展性不好
 * 故针对每一种产品建一个工厂->工厂方法
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        System.out.println("简单工厂创建Car");
        return new Car();
    }
    public Plane createPlane(){
        System.out.println("简单工厂创建Plane");
        return new Plane();
    }
}
