/*37.Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by 
creating Person object and calling methods.*/


import java.util.Scanner;

class person{
	
		private String name;
		private int age;
		person(){
			this("nothing",18);
		}
		person(String name,int age){
			this.name=name;
			this.age=age;
		}
		void show(){
			System.out.println("name:"+name+" "+"age:"+age);
		}
}
class personDemo{
	public static void main(String args[]){
		person p=new person();
		p.show();
		person p1=new person("stark",28);
		p1.show();
	}
}
