package com.datastruct.linkedlist.controller;
import java.util.Scanner;

import com.datastruct.linkedlist.LinkedList;
import com.datastruct.linkedlist.model.Employee;
import com.datastruct.linkedlist.model.NodeG;
public class EmployeeDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many employees you want to enter: ");
	    final int empSize = input.nextInt();
	    System.out.println("EmpSize is" + empSize);
	    Employee[] employees = new Employee[empSize];
	    String empId = "xyz";
	    int empAge = 0;
	    
	    input.nextLine();
	    for (int i = 0; i <empSize; i++) {
	        System.out.print("Please enter employeeId: ");
	        
	        empId = input.nextLine();
	        System.out.println("EmpID is" + empId);
	        System.out.print("Please enter employeeAge: ");
	        empAge = input.nextInt();
	        
	        input.nextLine();
	        System.out.println("EmpAge is" + empAge);
	        Employee emp = new Employee();
		    emp.setEmpAge(empAge);
		    emp.setEmpId(empId);
		    employees[i] = emp;
	        
	    }
	    input.close();
	    
	    LinkedList ls = new LinkedList();
	    NodeG<Employee> e = ls.createEmployeeList(employees);
	    
	    System.out.println("Print the Linked List Created");
	    while (e.getPost()!=null) {
	    	empId = e.getData().getEmpId();
		    empAge = e.getData().getEmpAge();
		    System.out.println("Id, Age is::" + empId + "::"+ empAge);
		    System.out.println("----------------------------");
		    e = e.getPost();
	    	
	    }
	    
//	   
	}

}
