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
        }
    }

    public void startPlaying() {
        while(!dotComList.isEmpty()){
            checkUserGuess(helper.getUserInput());
        }
    }

    public void checkUserGuess(String guess) {}
}
