/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ 
		to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/
 
 import java.util.Scanner;
 class MathOperation{
	  int multiply(int num1,int num2){
		 return num1*num2;
	 }
	  float multiply(float num1,float num2,float num3){
		 return num1*num2*num3;
	 }
	  int multiply(int ar[]){
		  int mul=1;
		  for(int i=0;i<ar.length;i++){
			
			mul*=ar[i];		
		  }
		 return mul;	
	 }
	  double multiply(double num1,int num2){
		 return num1*num2;
	 }
 }
 
 class Demo1{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		MathOperation m=new MathOperation();
		int mul1=m.multiply(10,50);
		System.out.println("multiplication of int float:"+mul1);
		float mul2=m.multiply(5.5f,6.6f,7.7f);
		System.out.println("multiplication of float:"+mul2);
		int ar[]={1,2,3,4,5,6,7,8,9};
		int mul3=m.multiply(ar);
		System.out.println("multiplication of int array:"+mul3);
		double mul4=m.multiply(2.3,3);
		System.out.println("multiplication of int double int:"+mul4);
		
	 }
 }
 