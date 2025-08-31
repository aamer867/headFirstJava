import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        /*
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        long result = limit.count();
        System.out.println("result = " + result);
        */


        /*
        Dog a  = new Dog();
        a.name = "So";
        Dog b = new Dog();
        b.name = "Bob";
        Dog c = new Dog();
        c.name = "Cathy";
        Dog d = new Dog();
        d.name = "David";
        List<Dog> dogs = List.of(a, b, c, d);
        Stream<Dog> dogStream = dogs.stream().sorted().limit(2);
        System.out.println(dogStream.collect(Collectors.toList()));
        System.out.println(dogStream);
         */

        Songs songs = new Songs();
        List<Song> songsList = songs.getSongs();
        List<Song> rockList = songsList.stream().filter(
                (song) -> song.getGenre().equals("Rock")
        ).toList();

        long rockListCounnt = songsList.stream().distinct().count();
        System.out.println(rockListCounnt);

        Map<String, Song> songsMap= songsList.stream().distinct().collect(Collectors.toMap(Song::getTitle, (song)->song));
        System.out.println(songsMap);

    }
}