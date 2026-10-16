class Dog{
    String name;
    String breed;
    void bark(){
        System.out.println("woof!woof!");
    }
    public class Classes{
        public static void main(String[] args){
            Dog dog1 = new Dog();
                    dog1.name = "tommy";
            dog1.breed = "German shephard";
            Dog dog2 = new Dog();
                    dog2.name = "mini";
            dog2.breed = "bulldog";
            dog1.bark();
            dog2.bark();
        }
    }
}
