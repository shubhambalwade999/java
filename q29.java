import java.util.Scanner;
class q29{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//Accepting rows of Array
		System.out.println("Enter a rows");
		int r=sc.nextInt();
		
		//Creating 2D array
		int ar[][]=new int[r][];
		int count=0;
		
		int totalE[]=new int[r];
		
		//Accepting_cols_Creating_1D_Array_Accepting_Element_from_User
		for(int i=0;i<5;i++)
		{
			int count1=0;
			System.out.println("Row:"+i);
			System.out.println("Enter a Cols:");
				int col=sc.nextInt();
				ar[i]=new int[col];
				count++;
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter element:");
				ar[i][j]=sc.nextInt();		
				count1++;
			}
			totalE[i]=count1;
			
		}
		
		//Printing 2D array
		for(int arr[]:ar)
		{
			for(int b:arr)
			{
				System.out.print(" "+b);
			}
			System.out.println(" ");
		}
		System.out.println(" Toatal no of 1D Array:"+count);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(" Toatal no of Elements in Array["+i+"] position:"+totalE[i]);
		}
	}
}