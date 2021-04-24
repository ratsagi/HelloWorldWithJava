import java.util.Scanner;
public class calculateMealPrice{
	public static double calculateMealPrice(double listedMealPrice, double tipRate, double taxRate){
		double tip=tipRate*listedMealPrice;
		double tax=taxRate*listedMealPrice;
		double total=tip+tax+listedMealPrice;
		return total;

	}

public static void main(String[] args) {
	double priceOfGroup=calculateMealPrice(150,.25,.05);
	System.out.println("the total price is "+ priceOfGroup);
	Scanner input= new Scanner(System.in);
	System.out.println("How many are you?");
	int peopleNumner= input.nextInt();
	double induvidualPrice=priceOfGroup/peopleNumner;
	System.out.println("the individual price is "+induvidualPrice);
}
}