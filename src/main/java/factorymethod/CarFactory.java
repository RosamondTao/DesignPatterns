package factorymethod;

public class CarFactory {
    public Moveable create(){
        //定制一些创建car的操作比如说日志
        System.out.println("工厂创建Car");
        return new Car();
    }
}
