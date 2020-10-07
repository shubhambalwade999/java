import java.util.*;
class q15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sex M/F:");
		int sex=sc.next().charAt(0);
		System.out.println("Enter a age:");
		int age=sc.nextInt();
		if((sex== 'M') && (age>= 21))
		{
			System.out.println("!!!Congratulations!!! You are eligible for Marriage!!");
		}
		else if((sex== 'F') && (age>=18))
		{
			System.out.println("!!!Congratulations!!! You are eligible for Marriage!!");
		}
		else
		{
			System.out.println("Sorry?? You Are Not eligible for Marriage??");
			
		}
	}
}