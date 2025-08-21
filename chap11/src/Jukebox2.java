import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        Jukebox2 j2 = new Jukebox2();
        j2.go();

    }
    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
//        Collections.sort(songList);
        System.out.println(songList);
    }
}
