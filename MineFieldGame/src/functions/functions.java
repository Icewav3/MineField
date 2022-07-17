package functions;

import java.util.Scanner;

public class functions {
    double RNG = 0.0;
    String[] array = new String[80];
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
            }
        }
        Scanner In = new Scanner(System.in);
        int value = In.nextInt();
        int ones = Math.abs(value%10);
        int tens = (value-ones)/10;
        System.out.println(tens+" "+ones);
        return array;
    }
}
//⬛
//✪