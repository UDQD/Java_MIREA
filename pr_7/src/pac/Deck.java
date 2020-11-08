package pac;
import java.util.*;
public class Deck {
    private Queue<Integer> queue = new LinkedList();

    Deck(String s){
        StringTokenizer st;
        st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            queue.add(Integer.parseInt(st.nextToken()));
        }
    }
    public void put_down(int card_1, int card_2){
        queue.add(card_1);
        queue.add(card_2);
    }

    public int out_top(){
        return queue.poll();
    }

    public boolean is_empty(){
        if(queue.peek() == null){
            return true;
        }else{
            return false;
        }
    }
    public void out_queue(){
        System.out.println(queue);
    }

}
