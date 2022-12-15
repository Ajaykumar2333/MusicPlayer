import java.util.*;

public class Main {

  private static ArrayList <Album> albums  = new ArrayList<>();

    public static void main(String[] args) {

      Album obj = new Album("Album1","SidSriram");
      obj.addSong("MaateVinadhuga",3.00);
        obj.addSong("Sreevalli",2.30);
        obj.addSong("Samajavaragamana",3.10);
        obj.addSong("Ninnu choose Anandhamulo ",3.00);
        albums.add(obj);

        obj = new Album("Album2","anirudh");
        obj.addSong("Hoyna Hoyna",2.56);
        obj.addSong("Pattas pilla",2.52);
        obj.addSong("gundellona", 2.30);
        albums.add(obj);


      LinkedList<Songs>playList1 = new LinkedList<>();
      albums.get(0).addToPlaylist("MaateVinadhuga",playList1);
      albums.get(0).addToPlaylist("gundellona",playList1);
      albums.get(1).addToPlaylist("Samajavaragamana",playList1);
      albums.get(1).addToPlaylist("Sreevalli",playList1);

      play(playList1);

    }
    private  static  void play(LinkedList<Songs>playList){
      Scanner sc = new Scanner(System.in);
      boolean quit = false;
      boolean forward = true;
      ListIterator<Songs> listIterator = playList.listIterator();
      if(playList.size() == 0){
        System.out.println("this playlist have no song ");
      }else{
        System.out.println("Now Playing" + listIterator.next().toString());
        printMenu();
      }

    }
    private static  void printMenu(){
      System.out.println("Availbale Options\n  press");
      System.out.println("0 - to quit\n" +
                 "1 - to play next Song\n" +
                 "2 - to play previous song\n" +
                 "3 -to replay the current song\n" +
                 "4 - List of all Songs\n" +
                 "5 - print  all available options\n" +
                 "6 -  delete current song =");
    }
    private  static  void printList(LinkedList<Songs> playlist){
      Iterator<Songs> iterator = playlist.iterator();
      System.out.println("---------------------------");
      while(iterator.hasNext()){
        System.out.println(iterator.next());
      }
      System.out.println("---------------------------");
    }
}
