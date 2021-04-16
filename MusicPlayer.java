
package musicplayer;
import java.util.Scanner;

public class MusicPlayer {

    
    public static void main(String[] args) {
      boolean isPlaying;
      System.out.println("Is the music playing?");
      Scanner input=new Scanner(System.in);
      isPlaying=input.nextBoolean();
      if(isPlaying){
          System.out.println("Music is playing");
      }else{
          System.out.println("Music is not playing");
      }
    }

    
}
