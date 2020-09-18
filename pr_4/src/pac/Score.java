package pac;

public class Score {
    private int score_milan;
    private int score_madrid;
    private String last = "DRAW";
    Score(){
        this.score_madrid = 0;
        this.score_milan = 0;
    }
    public void set_milan(int x){
        this.score_milan = x;
    }
    public void set_madrid(int x){
        this.score_madrid = x;
    }
    public void inc_madrid(){
        this.score_madrid++;
    }
    public void inc_milan(){
        this.score_milan++;
    }
    public int get_milan(){
        return this.score_milan;
    }
    public int get_madrid(){
        return this.score_madrid;
    }
    public String get_winer(){
        if(this.score_milan>this.score_madrid){
            return " Milan";
        }
        if(this.score_milan<this.score_madrid) {
            return " Madrid";
        }else {
            return " DRAW";
        }
    }
    public String get_last(){
        return this.last;
    }
}
