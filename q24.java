import java.util.Scanner;
class q24{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//Accepting size of Array
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		
		//creating a Array
		int ar[]=new int[size];
		int i;
		
		//accepting array element from user
		for( i=0;i<ar.length;i++)
		{
			System.out.println("Enter a element:");
			ar[i]=sc.nextInt();
		}
		
		//Accepting Searching element
		System.out.println("Enter a element to be search:");
		int a=sc.nextInt();
		
		//Searching Logic
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]==a)
			{		
				System.out.println(a+" is present at Index "+i);
				return;
			}
			
		}
		System.out.println(a+" is not present in given array");
	
	}
}