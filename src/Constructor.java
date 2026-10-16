class Doggy {
    String name;
    String breed;

    public Doggy(String dog_name, String dog_breed) {
        name = dog_name;
        breed = dog_breed;
    }

    void bark(){
        System.out.println("woof! woof!");
    }
}
        public class Constructor{
    public static void main(String[] args){
        Doggy dog1 = new Doggy("tommy", "german shepherd");
        Doggy dog2 = new Doggy("mini", "bulldog");
        dog1.bark();
        dog2.bark();
    }
        }