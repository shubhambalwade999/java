import java.util.*;
class q16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a No.");
		int num=sc.nextInt();
		System.out.println("Table of "+num);
		for(int i=1;i<=10;i++)
		{
			int num1=num*i;
			System.out.println(num1);
		}
	}
}