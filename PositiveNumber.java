import java.util.Scanner;
public class PositiveNumber{
	public static void main(String[] args) {
		int number;
		System.out.println("Enter your number: ");
		Scanner input=new Scanner(System.in);
		number= input.nextInt();
		if (number>=0) {
			System.out.println("Your number is positive!");
		}else{
			System.out.println("Your number is negative!");
		}
	}
}