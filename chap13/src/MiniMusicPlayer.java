import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer {
    public static void main(String[] args) {
        MiniMusicPlayer mp = new MiniMusicPlayer();
        mp.play();
    }
    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(144, 1, 20, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);

            ShortMessage msg = new ShortMessage();
            msg.setMessage(192, 1, 102, 0);
            MidiEvent event = new MidiEvent(msg, 8);
            track.add(event);

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(ShortMessage.NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);

            player.setSequence(sequence);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
