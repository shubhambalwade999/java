import java.util.Scanner;
class q27{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		
		//Accepting size of Array
		System.out.println("Enter the Size of Array:");
		int size=sc.nextInt();
		//creating a Array
		int ar[]=new int[size];
		int o[]=new int[size];
		int a[]=new int[size];
		int d[]=new int[size];
		
		
		//accepting array element from user
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter a element:");
			ar[i]=sc.nextInt();
			o[i]=ar[i];
		}
		
		//Descending order
		//sorting logic
		//swapping element
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			d[i]=ar[i];
		}
		
		
		//Ascending order
		//sorting logic
		//swapping element
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			a[i]=ar[i];
		}
		
		//print original array element
		System.out.println("Original Array:");
		for(int i=0;i<o.length;i++)
		{
			System.out.print(" "+o[i]);
		}
		
		
		//printig Ascending order array
		System.out.println("\nAscending ordered Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		//printig descending order array
		System.out.println("\nDescending ordered Array:");
		for(int i=0;i<d.length;i++)
		{
			System.out.print(" "+d[i]);
		}
		
		//Printing Smallest And Greatest Number
			System.out.println("\nSmallest No. in array:"+a[0]);
			System.out.println("Greatest No. in array:"+a[size-1]);
	
	}
			
	}