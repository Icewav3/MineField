import java.util.Objects;
import java.util.Scanner;

public class functions {
    double RNG = 0.0;
    String[] array = new String[80];
    String[] screen = new String[80];
    public functions(){

    }
    public String[] getArray(){
        return this.array;
    }


    public String[] table() {
        if (RNG == 0.0) {
            for (int i = 0; i < array.length; i++) {
                RNG = Math.random();
                if (RNG < 0.12) {array[i] = "☢";}
                else {array[i] = "⬜";}
                screen[i] = "⬛";
            }
        }
        return array;
    }
    public String[] screen() {
        Scanner In = new Scanner(System.in);
        int value = In.nextInt();
        int ones = Math.abs(value%10);
        int tens = (value-ones)/10;
        System.out.println(tens+", "+ones);
        int index = ones + (tens*10-10);
        if (Objects.equals(array[index], "☢")){screen[index] = "☢";}
        else {screen[index] = "⬜";}
        return screen;
    }
}
//⬜⬛✪