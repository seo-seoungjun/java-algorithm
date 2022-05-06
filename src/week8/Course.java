package week8;

import java.util.Arrays;

public class Course {
	  private String courseName;
	  private int numberOfStudents;
	  private int ArraySize = 2; 
	  private String[] students = new String[ArraySize];
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
		  if(numberOfStudents > ArraySize -1) {
			  ArraySize++;
			  String[] temp = new String[ArraySize];
		      int length = students.length;
		      for (int i = 0; i < length; i++) {
		          temp[i] = students[i];
		      }
		      students = temp;
			  students[numberOfStudents] = student;
		  }else {			  
			  students[numberOfStudents] = student;
		  }
	    numberOfStudents++;
	  }
	  
	  public String[] getStudents() {
	    return students;
	  }

	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  

	  public String getCourseName() {
	    return courseName;
	  }  
	  
	  public void dropStudent(String student) {
		  int index = Arrays.asList(students).indexOf(student);
		  String[] temp = new String[ArraySize-1];
	      int length = students.length;
	      
		  for (int i = 0; i <index; i++) {
			  temp[i] = students[i];
	      }
		  
		  for (int j = index+1; j <length; j++) {
			  temp[j-1] = students[j];
	      }
		  
		  students = temp;
		  ArraySize--;
		  numberOfStudents--;
	  }
	  
	  public void clear() {
		  String[] temp = new String[ArraySize];
		  students = temp;
		  numberOfStudents = 0;
	  }
	}
