class vehicle{
    String brand;
    int speed;
    void start_engine(){
        System.out.println("The engine has started");
    }
}
class car extends vehicle{
    int number_of_doors;
    void drift(){
        System.out.println("DRIFTTTTTTTTTTTTTTTTTTT");
    }
}
class motorbike extends vehicle{
    boolean has_side_car;
    void wheelie(){
        System.out.println("Wheelieeeeeeeeeeee");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        vehicle[] my_garage = new vehicle[2];
        car mycar = new car();
        mycar.number_of_doors= 4;
        mycar.brand = "Toyota";
        mycar.speed= 120;
        motorbike mymotorbike = new motorbike();
        mymotorbike.has_side_car= false;
        mymotorbike.brand = "Subaru";
        mymotorbike.speed = 80;
        my_garage[0]=mycar;
        my_garage[1]=mymotorbike;
        for(int i=0 ; i<=1 ; i++){
            my_garage[i].start_engine();
        }
    }
}+
