
public class GradeBook_MethodParameter {

	public static void displaymessage(String coursename) {
		System.out.printf("Welcome to the grade book for %s!\n" , coursename);
	}// end of displaymessage
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course = "Computational Algorithm";
		
		// static way of using the method displaymessage
		displaymessage(course); // passing a variable through to the method
		displaymessage("Math 21- Differential Calculus"); // passing a string without variable through method
	}// end of main method

}// end of class GradeBook_MethodParameter
