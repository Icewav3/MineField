import java.util.Objects;
import java.util.Scanner;

public class functions {
    double RNG = 0.0;
    int pwrup = 0;
    String[] array = new String[80];
    String[] screen = new String[80];
    public functions(){

    }
    public String[] getArray(){
        return this.array;
    }
    public String getpwrs(){
        int out = this.pwrup;
        return Integer.toString(out);
    }

    //Dice rolling function
    public int roll_dice(double sides){
        double value = 0.0;
        double cycles = 0.0;
        double fraction = 1/sides;
        double RNG = Math.random();
        while (RNG > value){value = value + fraction; cycles++;}
        return (int)(cycles);
    }

    //generation
    public String[] table() {
        String s = "";
        if (RNG == 0.0) {
            for (int i = 0; i < array.length; i++) {
                RNG = Math.random();
                if (RNG < 0.12) {array[i] = "☢";}
                else if (RNG < 0.24) {array[i]="✪";}
                else {array[i] = "⬜";}
                screen[i] = "⬛";
            }
        }
        return array;
    }
    public String[] screen(Scanner In) {
        if (In.hasNextBigInteger()) {
            int value = In.nextInt();
            int ones = Math.abs(value % 10);
            int tens = (value - ones) / 10;
            System.out.println(tens + ", " + ones);
            int index = ones + (tens * 10 - 10);
            if (Objects.equals(array[index], "✪")){pwrup++;}
            screen[index] = array[index];
        }
        else {
            if (pwrup > 0){
                System.out.println("Input Position to use power-up");
                Scanner in = new Scanner(System.in);
                int value = in.nextInt();
                int ones = Math.abs(value % 10);
                int tens = (value - ones) / 10;
                System.out.println(tens + ", " + ones);
                int index = ones + (tens * 10 - 10);
                screen[index+1] = "⬜";
                screen[index] = "⬜";
                screen[index-1] = "⬜";
                screen[index+9] = "⬜";
                screen[index-9] = "⬜";
                pwrup--;
                }
            else{
                System.out.println("Fuck you, you sneaky motherfucker");
                }
            }
        return screen;
        }
    }

//⬜⬛✪☢◂▴▾▸