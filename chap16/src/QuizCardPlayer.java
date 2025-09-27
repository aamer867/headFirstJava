import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class QuizCardPlayer {

    QuizCardBuilder cardBuilder = new QuizCardBuilder();
    ArrayList<QuizCard> cards = new ArrayList<>();

    public void restoreCards(String fileName) {

        try {

            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));

            if(QuizCardBuilder.numberOfCards == 0) {
                throw new IllegalStateException("No Cards Available");
            }

            for (int i=0; i<QuizCardBuilder.numberOfCards; i++) {
                QuizCard card = (QuizCard) is.readObject();
                cards.add(card);
            }

        } catch(Exception ex) {

            ex.getMessage();

        }
    }

    public static void main(String[] args) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("flashCardSaver.ser"));
            QuizCardPlayer cardPlayer = new QuizCardPlayer();

            cardPlayer.cardBuilder.addNewCard("What is the capital of France?", "Paris", oos);
            cardPlayer.cardBuilder.addNewCard("Who wrote 'Romeo and Juliet'?", "William Shakespeare", oos);
            cardPlayer.cardBuilder.addNewCard("What is 9 × 9?", "81", oos);
            cardPlayer.cardBuilder.addNewCard("Which planet is known as the Red Planet?", "Mars", oos);
            cardPlayer.cardBuilder.addNewCard("In which year did the Titanic sink?", "1912", oos);

            cardPlayer.restoreCards("flashCardSaver.ser");

            for (QuizCard card : cardPlayer.cards) {
                System.out.println(card.getQuestion());
                System.out.println(card.getAnswer());
            }

        } catch(Exception ex) {
            ex.getMessage();
        }


    }

}
