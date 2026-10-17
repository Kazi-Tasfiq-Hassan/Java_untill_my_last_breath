import java.util.Scanner;

public class Userinput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String Username = scanner.nextLine();
        System.out.println("Welcome " + Username);
    }
}
