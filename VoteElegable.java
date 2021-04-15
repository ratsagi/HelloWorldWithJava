import java.util.Scanner;
public class VoteElegable{
	public static void main(String[] args) {
		int age;
		System.out.println("How old are you?");
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		if (age>=18) {
		System.out.println("You are elegable to vote!");

			
		}else{
			System.out.println("You are not elegable to vote!");
		}
	}
}