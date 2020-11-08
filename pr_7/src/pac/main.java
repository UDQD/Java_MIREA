package pac;

import java.util.*;


public class main {
    public static void main(String[] args) {


        Deck d1 = new Deck("1 3 5 7 9");
        Deck d2 = new Deck("2 4 6 8 10");

//        d1.out_queue();
//        d2.out_queue();

        Game game_1 = new Game(d1,d2);
        game_1.play();

    }



}
