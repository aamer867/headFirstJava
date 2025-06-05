import java.util.ArrayList;

public class DotComBust {
    GameHelper helper;
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

        helper = new GameHelper();

        for (DotCom dotCom : dotComList) {
            dotCom.setLocationCells(helper.placeDotCom());
        }
    }
}
