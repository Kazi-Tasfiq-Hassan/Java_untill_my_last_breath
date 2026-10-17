import java.util.HashMap;
public class Hashmaps{
    public static void main(String[] args){
        HashMap<String, Integer> age = new HashMap<>();
        age.put("Maria", 22);
        age.put("Tashfiq", 23);
        System.out.println("Second person's age is " + age.get("Maria"));
    }
}
