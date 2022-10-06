package com.gl.assignment2.FOP.Sayak5;

/*import Packages*/

import com.gl.assignment2.FOP.Sayak1.Super_Department;
import com.gl.assignment2.FOP.Sayak2.Admin_Department;
import com.gl.assignment2.FOP.Sayak3.HR_Department;
import com.gl.assignment2.FOP.Sayak4.Tech_Department;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin_Department ad1,ad2,ad3;
		Super_Department su;
		ad1=new Admin_Department();
		ad2=new Admin_Department();
		ad3=new Admin_Department();		//object define for Admine_Department
		su=new Super_Department();
		
		String x1=ad1.DepartmentName();
		String x2=ad2.getTodaysWork();
		String x3=ad3.getWorkDeadline();
		String x4=su.isTodayAholiday();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println();
		
		/*Creating objects for HR_Department*/
		
		HR_Department hr1,hr2,hr3,hr4;
		hr1=new HR_Department();
		hr2=new HR_Department();
		hr3=new HR_Department();		//object define for HR_Department
		hr4=new HR_Department();
		su=new Super_Department();
		
		String x5=hr1.DepartmentName();
		String x6=hr2.getTodaysWork();
		String x7=hr3.getWorkDeadline();
		String x8=hr4.doActivity();
		String x9=su.isTodayAholiday();
		
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x9);
		System.out.println();
		
/*object define for Tech_group*/
		
		Tech_Department th1,th2,th3,th4;
		th1=new Tech_Department();
		th2=new Tech_Department();
		th3=new Tech_Department();		//object define for Tech_Department
		th4=new Tech_Department();
		su=new Super_Department();
		
		String x10=th1.DepartmentName();
		String x11=th2.getTodaysWork();
		String x12=th3.getWorkDeadline();
		String x13=th4.getTechStackInformation();
		String x14=su.isTodayAholiday();
		
		System.out.println(x10);
		System.out.println(x11);
		System.out.println(x12);
		System.out.println(x13);
		System.out.println(x14);
		
		
	}

}

/*outputs of the project*/

/*Welcome to Admine Department
Complete your Document Submission
Complete by EOD
Today is not a holiday

Welcome to HR Department
Fill today's timesheet and mark your attendance
Complete by EOD 
team launch
Today is not a holiday

Welcome to Tech Department
Complete coding of module 1
Complete by EOD
Core Java
Today is not a holiday
*/