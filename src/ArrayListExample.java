import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> to_do_list = new ArrayList<>();

        to_do_list.add("waking up");
        to_do_list.add("Eat Breakfast");
        to_do_list.add("go to work");

        System.out.println("First thing I'll do is " + to_do_list.get(0));
        System.out.println("First thing I'll do is " + to_do_list.get(1));
        System.out.println("First thing I'll do is " + to_do_list.get(2));
        System.out.println(to_do_list.size());
    }
}
