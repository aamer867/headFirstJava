import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // In this chapter we start learning ArrayList:

        ArrayList<String> list = new ArrayList<String>();

        // I can not add the object to the list in the index bigger than the size.

        list.add(0, "A");
        list.add(1, "B");
        list.add(2, "C");
        list.add(3, "D");

        // If we used the index of the element in the list,
        // the new element will be added to the same index,
        // and the list size will increase.

        list.add(2, "E");

        System.out.println(list);

        // Check the dotComBust Class:
        DotComBust dotComBust = new DotComBust();
        dotComBust.startPlaying();
    }
}