import functions.*;


public class run {
    public static void main(String[]args){
        System.out.print("\033[H\033[2J");
        String[] game = new String[80];
        game = functions.table();
        for (String s : game) {
            System.out.print(s);
        }

    }
}