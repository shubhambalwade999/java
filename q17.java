import java.util.Scanner;
class q17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		//	System.out.println("The Reversed No.="+reverse);
		}
		System.out.println("The Reversed No.="+reverse);
	}
}