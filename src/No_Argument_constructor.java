class computer{
    String brand;
    int ram_size;
    //No argument constructor
    computer(){
        this.brand = "hp";
        this.ram_size = 8;
    }
    //Parameterized Constructor
    computer(String brand,  int ram_size){
        this.brand = brand;
        this.ram_size = ram_size;
    }

    void displayinfo(){
        System.out.println("Your computer's brand is " + this.brand + " .And the RAM size is " + this.ram_size);
    }
}
public class No_Argument_constructor {
    public static void main(String[] args){
        computer default_info = new computer(); //Invoking No argument constructor
        default_info.displayinfo();
        computer computer_one =  new computer("Dell" , 16);
        computer_one.displayinfo();
        computer computer_two = new computer("Asus", 32);
        computer_two.displayinfo();
    }

}
