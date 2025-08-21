import java.util.*;

public class Jukebox1 {
    public static void main(String[] args) {
        Jukebox1 j1 = new Jukebox1();
        j1.go();

    }
    public void go() {
        List<String> songList = MockSongs.getSongsStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}
