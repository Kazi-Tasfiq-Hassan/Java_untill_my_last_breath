class vehicles {
    String brand;
    int wheels;

    vehicles(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
}

class bicycle extends vehicles{
    bicycle(String brand) {
        super(brand, 2);
    }
}
public class Super {
    public static void main(String[] args){
        vehicles my_car = new vehicles("Toyota", 4);
        System.out.println("My car brand is " + my_car.brand + " and the number of wheels are " + my_car.wheels);
        bicycle my_bicycle = new bicycle("Veloce");
        System.out.println("My bicycle brand is " + my_bicycle.brand + " and the number of wheels are " + my_bicycle.wheels);
    }
}
