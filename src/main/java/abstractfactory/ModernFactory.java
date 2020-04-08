package abstractfactory;

public class ModernFactory extends AbstractFactory{
    @Override
    Food createFood() {
        System.out.println("现代工厂制造食物");
        return new ModernFood();
    }

    @Override
    Vehicle createVehicle() {
        System.out.println("现代工厂制造交通工具");
        return new ModernVehicle();
    }
}
