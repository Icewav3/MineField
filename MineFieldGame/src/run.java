import java.util.Scanner;
public class run {
    public static void main(String[]args){
        functions run_game = new functions();
        boolean win = Boolean.FALSE;
        while (!win){
            System.out.print("\033[H\033[2J");
            String[] game = new String[80];
            String[] screen = new String[80];
            game = run_game.table();
            Scanner scan = new Scanner(System.in);
            screen = run_game.screen(scan);
                for (int i=0; i < run_game.getArray().length; i++) {
                    if (i % 10 == 0){
                        System.out.println();
                    }
                    else{
                        System.out.print(screen[i] +" ");
                        }

                }
            System.out.println("Power ups: "+run_game.getpwrs());
        }

    }
}
