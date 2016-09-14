package Chapter9OOPS.Encapsulation;

/**
 * Created by papu bhattacharya on 12/8/16.
 */
//very bad way--
/*
class BadScorer {
    int score = 0;
}

public class BadProgram {
    public static void main(String[] args) {
        BadScorer scorer = new BadScorer();
        scorer.score += 1;
        scorer.score += 6;
        scorer.score += 4;
        System.out.println("Score="+scorer.score);
    }
}
*/

//Little better, see the other program for good example
class BadScorer {
    int score = 0;

    public int getScore() {
        return score;
    }

    public void addRun(int score) {
        this.score += score;
    }
}

public class BadProgram {
    public static void main(String[] args) {
        BadScorer scorer = new BadScorer();
        scorer.addRun(1);
        scorer.addRun(4);
        scorer.addRun(6);
        scorer.addRun(2);
        System.out.println("Score=" + scorer.score);
    }
}
