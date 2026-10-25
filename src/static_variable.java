class gameplayer{
    int score;
    static int game_level = 1; //static variable
    gameplayer(int score){
        this.score = score;
    }
    void display_score(){
        System.out.println("The score of the team is " + this.score + " .The Game Level is " + game_level);
    }
}
public class static_variable {
    public static void main(String[] args){
        gameplayer Team_1 = new gameplayer(50);
        Team_1.display_score();
       gameplayer Team_2 = new gameplayer(80);
        Team_2.display_score();
        //Now I'll change the static varibable
        // But I need to call it by using it's class
        gameplayer.game_level = 2;
        Team_1.score = 100;
        Team_2.score = 200;
        Team_1.display_score();
        Team_2.display_score();

    }
}