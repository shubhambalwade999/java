import java.util.Scanner;
class q20{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a lowest Number:");
		int num1=sc.nextInt();
		System.out.println("Enter a highest Number:");
		int num2=sc.nextInt();
		
		if((num1==0 || num1==1) || (num2==0|| num2==1))
				System.out.println("The number is not a prime ");
		else
		{
			System.out.println("prime number between "+num1+"-"+num2+":");
			outer:
			for(int j=num1;j<=num2;j++)
			{
				for(int i=2;i<j;i++)
				{
					if(j%i==0)
					{
						continue outer;
					}	
				}
				
				System.out.println(j);
			}	
		}
			
	}
}