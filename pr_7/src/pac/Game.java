package pac;

import com.sun.source.util.SourcePositions;

import javax.sound.midi.Soundbank;

public class Game {
    private Deck d1, d2;
    private int turn_counter;

    Game(Deck deck_1, Deck deck_2){
        d1 = deck_1;
        d2 = deck_2;
        turn_counter = 0;
    }
    public void turn(){
        int top_card_1 = d1.out_top();
        int top_card_2 = d2.out_top();
        if(top_card_1>top_card_2){
            d1.put_down(top_card_1, top_card_2);
        }else{
            d2.put_down(top_card_1, top_card_2);
        }
        turn_counter++;
    }
    public void play(){
        while (true){
            turn();
            if(d1.is_empty()){
                System.out.println("second "+turn_counter);
                break;
            }
            else if(d2.is_empty()){
                System.out.println("second "+turn_counter);
                break;
            }
            else if(turn_counter>106){
                System.out.println("botva");
                break;
            }
//            d1.out_queue();
//            d2.out_queue();
//            System.out.println("==============");
        }
    }


}
