/*34.Create a class Circle that has two data members,
 one to store the radius and another to store area and three methods first init() method to input radius
 from user, second calculateArea() method to calculate area of circle and 
 third display() method to display values of radius and area. 
 Create class CircleDemo ( main class) that creates the 
 Circle object and calls init(), calculateArea() and display() methods.*/
 import java.util.Scanner;
 class Circle{
	 Scanner sc=new Scanner(System.in);
	 private float radius;
	 private double area;
	 
	 void init(){
		 System.out.println("Enter radius of Circle:");
		 radius=sc.nextFloat();
	 }
	 void calculateArea(){
		 area=(2*3.142*radius*radius);
	 }
	 void display(){
		 System.out.println("radius of Circle:"+radius);
		 System.out.println("area of Circle:"+area);
	 }
 }
 class CircleDemo{
	 public static void main(String args[]){
		 Circle c=new Circle();
		 c.init();
		 c.calculateArea();
		 c.display();
	 }
 }