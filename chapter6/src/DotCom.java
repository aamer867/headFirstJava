import java.util.ArrayList;

public class DotCom {
    ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }
    public String checkYourself(String guess) {
        String result = "miss";
        for (String cell : locationCells) {
            if (guess.equals(cell)) {
                result ="hit";
                locationCells.remove(cell);
                break;
            }
        } // out of the loop
        if (locationCells.isEmpty()) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    } // close method
}
