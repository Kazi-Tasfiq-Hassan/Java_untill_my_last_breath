abstract class appliance{
    String brand;
    void plugIn(){
        System.out.println("The appliance is plugged in to electricity");
    }
    abstract void operate();
}
class washing_machine extends appliance{
    void operate(){
        System.out.println("The washing machine is operating");
    }
}
public class Abstract_classes {
    public static void main(String[] args){
        washing_machine my_washing_machine = new washing_machine();
        my_washing_machine.brand = "Lenovo";
        my_washing_machine.plugIn(); // concrete method
        my_washing_machine.operate(); //abstract method
    }
}
