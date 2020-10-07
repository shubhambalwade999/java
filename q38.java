/*38.Create a class Employee with three data members
 (empNo, salary and totalSalary) and following 
 features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
	Create another class EmployeeDemo (main class) that creates
	some Employee objects and calls Employee method to display no. 
	of employees and total of their salaries.
 */

class Employee{
	private int empNo=0;
	private double salary;
	static double totalSalary;
	Employee(double salary){
		this.empNo+=1;
		this.salary=salary;
		this.totalSalary+=salary;
	}
	void show(){
		System.out.println("Total employees:"+empNo);
		System.out.println("Total salary:"+totalSalary);
	}
}
class EmployeeDemo{
	public static void main(String args[]){
		Employee e=new Employee(15000);
		e.show();
		Employee e1=new Employee(16000);
		e1.show();
		Employee e2=new Employee(17000);
		e2.show();
		Employee e3=new Employee(18000);
		e3.show();
	}
}