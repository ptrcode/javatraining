package Chapter9OOPS.Encapsulation;

/**
 * Created by papu bhattacharya on 12/8/16.
 */
class CricketScorer {
    private int score1 = 0;

    public int getScore() {
        return score1;
    }

    public void addRuns(int score) {
        this.score1 = this.score1 + score;
    }

    public void six() {
        addRuns(6);
    }

    public void four() {
        addRuns(4);
    }

    public void single() {
        addRuns(1);
    }

    public void printScore() {
        System.out.println("Score : " + score1);
    }

}

public class EncapsulationExample {
    public static void main(String[] args) {
        CricketScorer scorer = new CricketScorer();
        scorer.four();
        scorer.four();
        scorer.single();
        scorer.six();
        scorer.six();
        scorer.six();
        scorer.printScore();
    }
}