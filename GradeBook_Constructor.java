
public class GradeBook_Constructor {
	
	private String courseName; // course name for the GradeBook
	
	public GradeBook_Constructor(String name) {
		
		courseName = name; // initialize the course name
	}// end of constructor
	
	public void set(String name) {
		
		courseName = name; // store the course name
	}// end of method set
	
	public String get() {
		
		return courseName;
	}// end of method get
	
	public void displaymessage() {
		
		System.out.printf("Welcome to the grade book for %s!\n", get());
	}// end of method display message
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeBook_Constructor course1 = new GradeBook_Constructor("C++: Structures");
		GradeBook_Constructor course2 = new GradeBook_Constructor("Java: Structures");
		GradeBook_Constructor course3 = new GradeBook_Constructor("JavaScript: Structures");
		GradeBook_Constructor course4 = new GradeBook_Constructor("Ruby: Structures");
		
		// no need to use set since the course is already initialized by the constructor
		course1.displaymessage();
		course2.displaymessage();
		course3.displaymessage();
		course4.displaymessage();
	}// end of main method

}// end of class GradeBook_Constructor
