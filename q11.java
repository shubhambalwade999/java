import java.util.*;
class q11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.1");
		int num1=sc.nextInt();
		System.out.println("Enter no.2");
		int num2=sc.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("Enter no.1="+num1);
		System.out.println("Enter no.2="+num2);
		
		System.out.println("After Swapping:");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Enter no.1="+num1);
		System.out.println("Enter no.2="+num2);
	}
}