import java.util.Scanner;
class q18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		if(num==0 || num==1)
				System.out.println("The number "+num+" is not a prime number");
		else
		{
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						System.out.println(num+" is not a prime number");
						return;
					}	
				}
			System.out.println(num+" is prime number");
				
		}
			
	}
}