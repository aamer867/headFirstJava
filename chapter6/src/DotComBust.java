import java.util.ArrayList;

public class DotComBust {
    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    int numGuesses = 0;
    String[] dotComNames;

    public void setUpGame() {

        for (int i = 0; i < 3; i++) {
            DotCom dotCom = new DotCom();
            dotComList.add(dotCom);
        }

        dotComNames = new String[dotComList.size()];

        dotComNames[0] = "<DE>";
        dotComNames[1] = "<US>";
        dotComNames[2] = "<UK>";

        for (DotCom dotCom : dotComList) {
            dotCom.setLocationCells(helper.placeDotCom());
            System.out.println(dotCom.locationCells);
        }
    }

    public void startPlaying() {
        setUpGame();
        while(!dotComList.isEmpty()){
            checkUserGuess(helper.getUserInput());
        }
    }

    public void checkUserGuess(String guess) {
        numGuesses++;
        String result = "miss";

        for (int i = 0; i < dotComList.size(); i++) {
            DotCom dotCom = dotComList.get(i);
            // Now you can use 'i' as the index
            result = dotCom.checkYourself(guess);
            System.out.println(result);
            if(result.equals("Kill")){
                System.out.println("You guessed the word!: " + dotComNames[i]);
                dotComList.remove(dotCom);
            }
        }
    }
}
