package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("dhanasekaran");
	}
	public void studentDept() {
		System.out.println("b.com");
	}
	public void studentId() {
		System.out.println("id:1921");
	}
	

	public static void main(String[] args) {
		Student A = new Student();
		A.studentName();
		A.studentId();
		A.studentDept();
		A.collegeCode();
		A.collegeRank();
		A.deptName();
		A.collegeName();
		
		
		

	}
      
	
}
