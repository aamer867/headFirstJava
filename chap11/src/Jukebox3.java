import java.util.Collections;
import java.util.List;

public class Jukebox3 {
    public static void main(String[] args) {
        Jukebox3 j3 = new Jukebox3();
        j3.go();

    }
    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        //Collections.sort(songList, a);
        songList.sort((one, two)-> (one.getBpm() - two.getBpm()));

        songList.sort((two, one)-> two.getTitle().compareToIgnoreCase(one.getTitle()));
        System.out.println(songList);
        songList.sort((one, two)-> two.getTitle().compareToIgnoreCase(one.getTitle()));
        System.out.println(songList);
    }
}
