interface smart_device{
    void turn_on();

    }
    class smart_speaker implements smart_device{
        public void turn_on(){
            System.out.println("The smart speaker is turned on");
        }
    }
    class smart_lights implements smart_device{
        public void turn_on(){
            System.out.println("The smart lights are turned on");
        }
    }

public class interfaces {
    public static void main(String[] args){
        smart_device[] smart_home = new smart_device[2];
        smart_speaker my_speaker = new smart_speaker();
        smart_lights my_lights = new smart_lights();

        smart_home[0] = my_speaker;
        smart_home[1]= my_lights;

        for(int i = 0; i<=1; i++){
            smart_home[i].turn_on();
        }
    }
}
