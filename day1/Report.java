package week1.day1;


class Student {

	public void studData() {
	
		String student_Name = "Ram";
		int roll_No = 50;
		String college_name = "Sairam Engineering College";
		int mark_Scored = 495;
		char cgpa = 'A';
		System.out.println ("Name of student is : " + student_Name);
		System.out.println ("Roll no of the student is : " + roll_No);
		System.out.println ("College in which student is studying : " + college_name);
		System.out.println ("Total marks scored is : " + mark_Scored);
		System.out.println("The overall CGPA is : " + cgpa);
		
		}
}

public class Report {

	public static void main(String[] args) {
	
		Student stud = new Student();
		stud.studData(); 

	}

}
