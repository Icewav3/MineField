package functions;
import java.util.Scanner;

public class functions {
    private static double RNG = 0.0;

    public static String[] table() {
        double[] array = new double[80];
        String[] game = new String[80];
        Scanner In = new Scanner(System.in);
        while (In.hasNext()) {
            int x = In.nextInt(0);
            int y = In.nextInt(1);
        }
        if (RNG == 0.0) {
            RNG = Math.random();
            for (int i = 0; i < array.length; i++) {
                array[i] = RNG = Math.random();
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
