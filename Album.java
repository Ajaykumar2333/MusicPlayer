import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Songs> songs; //here we are not initializing bcz of waste of space suppose if no one created album there is a waste of space

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Songs>();
    }

    public Songs findSong(String title){
        for (Songs checkedSong : songs){
            if(checkedSong.getTitle().equals(title)
                return checkedSong;
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Songs(title,duration));
            System.out.println(title + "Song succesfully added to the list");
            return true;

        }else{
            System.out.println("Song with name" + title+ "Already exists in the list");
            return false;
        }
    }


    public  boolean addToPlayList(int trackNumber, LinkedList<Songs>playList){
        int index= trackNumber-1;
        if(index >= 0 && index <= songs.size()) {
            playList.add(this.songs.get(index));
            return true;
//
//            Songs song = this.songs.get(index); //we can also do like this.....
//            playList.add((song));
        }
        System.out.println("this album does not have song with tracknumber" + trackNumber);
        return false;
    }
    public boolean addToPlaylist(String title,LinkedList<Songs>Playlist) {
        for (Songs Checkedsong : songs) {
            if (Checkedsong.getTitle().equals(title)) {
                Playlist.add(Checkedsong);
                return true;
            }
        }
        System.out.println("there is no such song in album");
        return false;

    }
}
