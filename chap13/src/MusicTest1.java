import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class MusicTest1 {
    public void play() throws Exception{
/*
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Sequencer started");

            List<Integer> a = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            System.out.println(a.get(11));
            System.out.println("Succeed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sequencer stopped");
*/
        /*
        List<Integer> a = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(a.get(11));
        System.out.println("Succeed");
         */

        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("Sequencer started");
    }
    public static void main(String[] args) throws Exception {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
