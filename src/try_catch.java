public class try_catch {
    public static void main(String[] args) {

        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("There's some issue ");

        }
        System.out.println("The program continues to run ");
    }
}
