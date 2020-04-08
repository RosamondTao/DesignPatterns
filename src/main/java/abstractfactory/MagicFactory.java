package abstractfactory;

public class MagicFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle() {
        System.out.println("魔法工厂制造食物");
        return new MagicVehicle();
    }

    @Override
    Food createFood() {
        System.out.println("魔法工厂制造交通工具");
        return new MagicFood();
    }
}
