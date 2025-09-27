import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class QuizCardBuilder{

    // ArrayList<QuizCard> cards = new ArrayList<>();

    static int numberOfCards;

    public void addNewCard(String question, String answer, ObjectOutputStream oos) {

        QuizCard card = new QuizCard(question, answer);

        numberOfCards++;
        try {

        } catch(Exception ex) {
            ex.printStackTrace();
        }

        saveCard(card, oos);

        // cards.add(card);

    }

    private void saveCard(QuizCard card, ObjectOutputStream oos) {

        try {

            oos.writeObject(card);

        } catch (Exception ex) {

            ex.printStackTrace();

        }
    }
}
