package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("student name is pavi");
	}
	public void studentDept()
	{
		System.out.println("computer Appication");
	}
	public void studentId()
	{
		System.out.println("student id is 1432");
	}
	public static void main(String[] args) {
	Student st=new Student();	
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.departmentName();
		st.studentName();
		st.studentDept();
		st.studentId();
		
		
	}
}
