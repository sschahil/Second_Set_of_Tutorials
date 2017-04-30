
public class GradeBook_InstanceMethods {
	
	private String coursename; // course name for this Gradebook;
	
	public void set(String name) {
		coursename = name; // store the course name
	}// end of method set
	
	public String get() {
		
		return coursename; // get course name
	}// end of method get
	
	public void displaymessage() {
		
		System.out.printf("Welcome to the grade book for %s!\n", get());		
	}// end of method displaymessage
	
	public static void main(String[] args) {
		GradeBook_InstanceMethods course = new GradeBook_InstanceMethods();
		
		course.set("Compuational Algorithm");
		course.displaymessage();
		
		course.set("Math 31"); // this will not be shown
		course.set("Math 38");// this will be the one that is shown 
		
		course.displaymessage();
	}// end of main method
}// end of class GradeBook_InstanceMethods
