package week8;


public class TestCourse {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");
    
    System.out.println("Number of students in course1: "
    	      + course1.getNumberOfStudents());
    	    String[] students1 = course1.getStudents();
    	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
    	      System.out.print(students1[i] + ", ");
    System.out.println();
     
    course2.addStudent("S1");
    course2.addStudent("S2");
    course2.addStudent("S3");
    course2.addStudent("S4");
    
    System.out.println("Number of students in course2: "
  	      + course2.getNumberOfStudents());
  	    String[] students2 = course2.getStudents();
  	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
  	      System.out.print(students2[i] + ", ");
  	System.out.println();
    course1.dropStudent("Brian Smith");
    
    System.out.println("Number of students in course1 after drop Brian Smith: "
  	      + course1.getNumberOfStudents());
    	students1 = course1.getStudents();
  	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
  	      System.out.print(students1[i] + ", ");
    System.out.println();
    course1.clear();

    System.out.println("Number of students in course1 after clear: "
    	      + course1.getNumberOfStudents());
      	students1 = course1.getStudents();
    	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
    	      System.out.print(students1[i] + ", ");
    System.out.println();	    
    course2.dropStudent("S2");
    
    System.out.println("Number of students in course2 after drop S2: "
    	      + course2.getNumberOfStudents());
      	students2 = course2.getStudents();
    	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
    	      System.out.print(students2[i] + ", ");    	    

    System.out.println();	    
    course2.clear();

    System.out.println("Number of students in course2 after clear: "
    	      + course2.getNumberOfStudents());
      	students2 = course2.getStudents();
    	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
    	      System.out.print(students2[i] + ", ");
  }
}