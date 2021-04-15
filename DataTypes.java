public class DataTypes{
	public static void main(String[] args) {
		 int studentAge=15;
		 double studentGPA=3.5;
		 String myFirstName="Sagi";
		 String myLastName="Rat";
		 char studentFirstInitial=myFirstName.charAt(0);
		 char studentLastInitial=myLastName.charAt(0);
		 boolean hasPerfectAttendance=true;
		 int myNameLength=myFirstName.length();
		 System.out.println(studentAge);
		 System.out.println(studentGPA);
		 System.out.println(studentFirstInitial);
		 System.out.println(studentLastInitial);
		 System.out.println(hasPerfectAttendance);
		 System.out.println(myFirstName);
		 System.out.println(myLastName);
		 System.out.println(myNameLength);
		 System.out.println(myFirstName+" "+myLastName);
		 System.out.println("My first name is "+myFirstName+" and "+"my my last name is "+
		 	myLastName+" The first letter of  my name is "+ studentFirstInitial+" I have a GPA of "+studentGPA);

	}
}