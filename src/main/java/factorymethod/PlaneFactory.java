package factorymethod;

public class PlaneFactory {
    public Plane create(){
        System.out.println("工厂创建Plane");
        return new Plane();
    }
}
