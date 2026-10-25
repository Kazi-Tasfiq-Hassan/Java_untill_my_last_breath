class game_player{
    int score;
    static int game_level = 1 ;
    game_player(int score){
        this.score = score;
    }
    //static method
    public static void add_level(int new_game_level){
        game_level= new_game_level;
    }
    void display_info(){
        System.out.println("The score of the match is " + this.score + ". The Game Level is " + this.game_level);
    }
}
public class Static_Method{
    public static void main(String[] args){
        game_player Team_1 = new game_player(50);
        game_player Team_2 = new game_player(80);
        Team_1.display_info();
        Team_2.display_info();
        game_player.add_level(2); //invoking static method
        Team_1.score = 90;
        Team_2.score = 120;
        Team_1.display_info();
        Team_2.display_info();

    }
}
