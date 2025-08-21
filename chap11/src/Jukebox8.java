import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox8 {

    public static void main(String[] args) {
        Jukebox8 j8 = new Jukebox8();
        j8.go();

    }
    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        //Collections.sort(songList, a);
        songList.sort((one, two)-> (one.getBpm() - two.getBpm()));
        Set<SongV3> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}
