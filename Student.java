package org.student;

import org.department.Depatment;

public class Student extends Depatment {
	
	public void StudentName()
	{
		System.out.println("Cindhu");
	}

	public void StudentDept()
	{
		System.out.println("ComputerAppln");
	}
 
	public void StudentId()
	{
		System.out.println("C3746");
	}

public static void main(String[] args) {
	Student Colg = new Student();
	Colg.CollegeName();
	Colg.CollegCode();
	Colg.CollegRank();
	Colg.DeptName();
	Colg.StudentName();
	Colg.StudentId();
	Colg.StudentDept();

}
}