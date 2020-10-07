import java.util.*;
class q13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the no.1");
		int num1=sc.nextInt();
		System.out.println("Enetr the no.2");
		int num2=sc.nextInt();
		System.out.println("Enetr the no.3");
		int num3=sc.nextInt();
		int greater=(num2>num3)?((num2>num1)?num2:num1):((num3>num1)?num3:num1);
		System.out.println("greater no="+greater);
	}
}
