class Animal{
    String name;
    void eat(){
        System.out.println(name + "is eating");
    }
}
class Doggies extends Animal{
    void bark() {
        System.out.println(name + "  is barking");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Doggies dog1 = new Doggies();
        dog1.name = "tommy";
        dog1.bark();
        dog1.eat();
    }
}