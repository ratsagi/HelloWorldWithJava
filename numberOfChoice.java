import java.util.Scanner;
public class numberOfChoice{
	public static void main(String[] args) {
		int choosenNumber;
		Scanner input=new Scanner (System.in);
		System.out.println("Write your number in between 1 and 100");
		choosenNumber=input.nextInt();
		if (choosenNumber>0 && choosenNumber<=100){
			System.out.println("Excelent!");
		} else{
			System.out.println("You have broken the rule");
		}
	}
}