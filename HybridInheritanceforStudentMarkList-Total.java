//Q. 78:                                                                                              
//HybridInheritanceforStudentMarkList-Total(InheritanceandInterface)
/*
Java program to implement Hybrid Inheritance program
1. Create an Interface with name "Exam"
2. Create a method in the interface as percent_cal() with method return type as "void" that takes no arguments
3. Create a class "Student" and declare data members and methods as follows
a. name = String
b. roll_no, mark1,mark2,mark2,mark4,mark5 as Integer
c. Create a Constructor Parameterised for Student class that takes four arguments as "n" of type String, "r" , "m1" ,"m2," ",m3", "m4" ,"m5" of types integer
d. Assign the parameterised argument to dataMembers of "Student" class
4. Create an another method in "Student" class as follows
a. Method name= display
b. Argument = None
c. Return Type = void
d. Usage = Print the name, roll_no, mark1,mark2,mark2,mark4,mark5
5. Create a class  "Result" that extends "Student" class and implements "Exam" interface
6. Create a Constructor Parameterised for Result class that takes four arguments as "n" of type String, "r" , "m1", "m2", "m3", "m4", "m5" of types "integer"
7. Use super(n,r,m1,m2,m3,m4,m5) so that it access the Base Class constructor
Note: super keyword in "Result" class will call "Student" class (Base class for Result class).
8. Implement the percent_cal method and calculate the total and percentage
Note: Declare variable "total" and print the total result
9. Implement the "display" follows
a. Method name= display
b. Argument = None
c. Return Type = void
Note:
Call the Base class method display using super keyword (super.display())
10. In main class get the input of "name" as String, "regno", "mark1" ,"mark2",  "mark3" ,"mark4", "mark5" as Integer
11. Create an instance for Result Class "R" with parameterised constructor that takes four arguments [name,regno,mark1,mark2,mark3,mark4,mark5] 
12. Invoke display method first and percent_cal method second                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
*/

import java.io.*;
import java.util.Scanner;
interface Exam {
  
 	void percent_cal(); 
}
class Student {
 	
  	String name;
  	int roll_no,mark1,mark2,mark3,mark4,mark5;
  
  	public Student(String n, int r, int m1, int m2, int m3, int m4, int m5)
    {
      	name = n;
      	roll_no = r;
      	mark1 = m1;
      	mark2 = m2;
      	mark3 = m3;
      	mark4 = m4;
      	mark5 = m5;
    }
  	public void display()
    {
     	System.out.println("Name of Student="+name);
      	System.out.println("Roll No of Student="+roll_no);
      	System.out.println("Marks of Subject 1="+mark1);
      	System.out.println("Marks of Subject 2="+mark2);
      	System.out.println("Marks of Subject 3="+mark3);
      	System.out.println("Marks of Subject 4="+mark4);
      	System.out.println("Marks of Subject 5="+mark5);
      
    }
}
class Result extends Student implements Exam {
 	
  	public Result(String n, int r, int m1, int m2, int m3, int m4, int m5)
    {
      	super(n,r,m1,m2,m3,m4,m5);
    }
  	public void percent_cal()
    {
     	int total;
      	total = mark1+mark2+mark3+mark4+mark5;
      	System.out.println("Total="+total);
    }
  	public void display()
    {
     	super.display(); 
    }
}
public class TestClass {
	 public static void main(String[] args) { 
		
       Scanner sc = new Scanner(System.in);
       
       String name = sc.nextLine();
       int regno = sc.nextInt();
       int mark1 = sc.nextInt();
       int mark2 = sc.nextInt();
       int mark3 = sc.nextInt();
       int mark4 = sc.nextInt();
       int mark5 = sc.nextInt();
       
       Result R = new Result(name, regno, mark1, mark2, mark3, mark4, mark5);
       
       R.display();
       R.percent_cal();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         