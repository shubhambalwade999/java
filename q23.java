import java.util.Scanner;
class q23{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//Accepting size of Array
		System.out.println("Enter the Size of Array:");
		int size=sc.nextInt();
		
		//creating a Array
		int ar[]=new int[size];
		int rev[]=new int[size];
		
		//accepting array element from user
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter a element:");
			ar[i]=sc.nextInt();
		}
		
		//print original array element
		System.out.println("Original Array:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
		
		//reverse logic
		for(int i=0,j=size;j>0;j--,i++)
		{
			rev[i]=ar[j-1];
		}
		
		//print reversed array element
		System.out.println("\nReversed Array:");
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(" "+rev[i]);
		}
	}
}