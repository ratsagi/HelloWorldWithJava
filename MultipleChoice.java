import java.util.Scanner;
public class MultipleChoice{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String quesion="Who created this code?";
		String choiceOne="James";
		String choiceTwo="Rat";
		String choiceThree="Sagi";
		String userAnswer;

        String corectAnswer=choiceThree;
        
         	 System.out.println(quesion);
         	 System.out.println("The answers are following:");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        System.out.println("Write answer here:");
         userAnswer=input.next();
         if (userAnswer.equals(corectAnswer)) {
         	System.out.println("Congrats!");
         }else{
         	System.out.println("You are incorrect!");
         }
         
         
        
          

	}
}