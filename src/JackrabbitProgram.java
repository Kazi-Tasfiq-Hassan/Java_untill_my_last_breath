class jackrabbit{
    public static final int  Max_Water = 100;
    private static int jackrabbit_created = 0;
    private int x;
    private int y;
    private int water = 60;
    private int age;
    private String sex;
    private boolean isResting;

   jackrabbit(){
       this(0,0,1,"Female");
   }
   jackrabbit(int x, int y, int age, String sex){
       this.x = x;
       this.y = y;
       this. age = age;
       this.sex = sex;
       this.isResting = false;
       jackrabbit_created++;
   }
    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }
    public int getAge(){
        return age;
    }
    public String GetSex(){
        return sex;
    }
    public boolean isResting(){
        return isResting;
    }
    public void setX(int x){
        this.x= x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setIsResting(boolean isResting){
        this.isResting= isResting;
    }
    public void passTime(int hours){
       int waterdrop = (hours/2)*3;
       this.water-=waterdrop;
       if(water<=0){
           this.water = 0;
       }
       System.out.println(hours + " hours has passed in daytime and the Jackrabbit lost " + waterdrop + " and now his water level is " + this.water);
    }
    public void passTime(int hours, boolean isDaytime){
       int waterdrop = 0;
       if(isDaytime){
           waterdrop = (hours/2)*3;
       }else {
           waterdrop = hours *1;
       }
       this.water-=waterdrop;
       if(water<=0){
           this.water = 0;
       }
       System.out.println(hours + " hours has passed. The water level has decreased by " + waterdrop + ". Now the current water level is " + this.water);
    }
    public void drinkFromCactus() {
        this.water += 14; // Jackrabbit gains 14 water when biting a cactus
        if (this.water > Max_Water) {
            this.water = Max_Water;
        }
        System.out.println("Jackrabbit bit a cactus and drank water. Current water: " + this.water + ".");
    }
    public void println(){
       System.out.println("Current Status of Jackrabbit");
       System.out.println("Position: X Postion: " + this.x + " | Y Position: " + this.y );
       System.out.println("Water Level: " + this.water);
       System.out.println("Age: " + this.age);
       System.out.println("Sex: " + this.sex);
       System.out.println("Total Jackrabbit: " + jackrabbit_created);
    }


}

public class JackrabbitProgram{
    public static void main(String[] args){
        jackrabbit initial_jackrabbit = new jackrabbit();
        jackrabbit newjackrabbit = new jackrabbit(2,5,20,"Male");
        System.out.println("INITIAL CONDITION: ");
        initial_jackrabbit.println();
        newjackrabbit.println();
        System.out.println("EXECUTING SIMULATION METHODS: ");
        newjackrabbit.passTime(4);
        initial_jackrabbit.passTime(8, false);
        newjackrabbit.drinkFromCactus();
        System.out.println("FINAL STATE");
        initial_jackrabbit.println();
        newjackrabbit.println();

    }
}
