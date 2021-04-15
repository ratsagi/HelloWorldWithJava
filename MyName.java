import java.util.Scanner;
public class myName{
	public static void main(String[] args) {
		String myFirstName;
		String myLastName;
		Scanner input=new Scanner(System.in);
		System.out.println("What is your first name?");
		myFirstName=input.nextLine();
		System.out.println("What is your last name?");
		myLastName=input.nextLine();
		System.out.println("Your full name is "+myFirstName+" "+myLastName);


	}
}