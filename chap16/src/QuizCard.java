import java.io.Serializable;

public class QuizCard implements Serializable {

    private String questsion;
    private String answer;
    private static final long serialVersionUID = 7811629613655683157L;


    public QuizCard(String q, String a) {
        this.questsion=q;
        this.answer=a;
    }

    public String getQuestion() {
        return questsion;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Qustion " + questsion + " Answer: " + answer;
    }
}
