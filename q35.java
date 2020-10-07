/*35.Create a class MathOperation that has four static methods.
 add() method that takes two integer numbers as parameter and returns the sum of the numbers.
 subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
 multiply() method that takes two integer numbers as parameter and returns the product.
 power() method that takes two integer numbers as parameter and returns the power of first number to second number.
 Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of 
 MathOperation class by providing entered numbers and prints the return values of every method.*/
 
 import java.util.Scanner;
 class MathOperation{
	 static int add(int num1,int num2){
		 return num1+num2;
	 }
	 static int subtract(int num1,int num2){
		 return num1-num2;
	 }
	 static int multiply(int num1,int num2){
		 return num1*num2;
	 }
	 static int power(int num1,int num2){
		 int power=((num1*num1)/(num2*num2));
		 return power;
	 }
 }
 
 class Demo{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter num1:");
		 int num1=sc.nextInt();
		 System.out.println("Enter num2:");
		 int num2=sc.nextInt();
		 int add=MathOperation.add(num1,num2);
		 System.out.println("Addition:"+add);
		 int sub=MathOperation.subtract(num1,num2);
		 System.out.println("Subtraction:"+sub);
		 int mul=MathOperation.multiply(num1,num2);
		 System.out.println("Multiplication:"+mul);
		 int pow=MathOperation.power(num1,num2);
		 System.out.println("Power:"+pow);
	 }
 }
 