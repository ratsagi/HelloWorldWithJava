import java.util.Scanner;
public class songOnRepeat{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean isOnRepeat=true;
		String userInput;
		while(isOnRepeat){
			System.out.println("Current song is playing");
			System.out.println("Would you like to change the song?");
           userInput=input.next();

           if (userInput.equals("yes")) {
           	  isOnRepeat=false;
           }
		}
		System.out.println("playing next song");

	}
}