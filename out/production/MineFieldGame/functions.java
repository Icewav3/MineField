package functions;
import java.util.Scanner;

public class functions {
    double RNG = 0.0;
    double[] array = new double[80];
    String[] game = new String[80];
    public functions(){

    }
    public String[] getArray(){
        return this.game;
    }


    public String[] table() {
        Scanner In = new Scanner(System.in);
            int x = In.nextInt();
            int y = In.nextInt();
        if (RNG == 0.0) {
            for (int i = 0; i < array.length; i++) {
                RNG = Math.random();
                array[i] = RNG;
            }
        } else {
            for (int n = 0; n < array.length; n++) {
                if (array[n] < 0.12) {
                    game[n] = "m";
                } else {
                    game[n] = "s";
                }
            }
        }
        return game;
    }
}