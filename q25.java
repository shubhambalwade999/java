import java.util.Scanner;
class q25{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//Accepting size of Array
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		
		//creating a Array
		int ar[]=new int[size];
		int osum=0;
		int esum=0;
		
		//accepting array element from user
		for( int i=0;i<ar.length;i++)
		{
			System.out.println("Enter a element:");
			ar[i]=sc.nextInt();
		}
		
		//even odd logic
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				esum+=ar[i];
			}
			else
			{
				osum+=ar[i];
			}
		}
		
		//Printing sum of even and odd numbers
		System.out.println("sum of even="+esum);
		System.out.println("sum of odd="+osum);
	}
}