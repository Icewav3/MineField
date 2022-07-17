
import functions.*;


public class run {
    public static void main(String[]args){
        functions run_game = new functions();
        System.out.print("\033[H\033[2J");
        String[] game = new String[80];
        game = run_game.table();
        for (int i=0; i < run_game.getArray().length; i++) {
            if (i % 10 == 0){
                System.out.println();
            }
            else{
            System.out.print(game[i] +" ");
        }
        }
    }
}