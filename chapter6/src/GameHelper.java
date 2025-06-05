
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> placeDotCom() {

        ArrayList<String> locationCells = new ArrayList<String>();

        String firstChar = generateRandomField();

        String secondChar = generateSecondField(firstChar);

        locationCells.add(firstChar);
        locationCells.add(secondChar);

        return locationCells;
    }

    private String generateRandomField() {

        int randomNumber = rand.nextInt(7);

        char randomChar = (char) ('A' + rand.nextInt(6));

        return randomChar + String.valueOf(randomNumber);

    }

    private String generateSecondField(String firstChar) {

        boolean randomBool = rand.nextBoolean();

        if (randomBool) {
            // Horizontal Moving "We will change the Letter"

            return (char) (firstChar.charAt(0)+1) + String.valueOf(firstChar.charAt(1));

        } else {
            // Vertical Moving "We will change the Letter"

            return firstChar.charAt(0) + String.valueOf(Integer.parseInt(String.valueOf(firstChar.charAt(1)))+ 1);

        }

    }

    public String getUserInput() {
        System.out.print("Enter Your Guess: ");
        return checkUserInput(scanner.nextLine());
    }

    private String checkUserInput(String userInput) {
        if (userInput.length() == 2 && Integer.parseInt(String.valueOf(userInput.charAt(1)))<8) {
            return String.valueOf(userInput.charAt(0)).toUpperCase() + String.valueOf(userInput.charAt(1));
        } else {
            System.out.println("You entered an incorrect format. Try again.");
            return getUserInput();
        }
    }

}
