import java.util.Scanner;
class q30{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//Accepting rows of Array
		//System.out.println("Enter a rows");
		//int r=sc.nextInt();
		
		//Creating 2D array
		int ar[][]=new int[3][3];
		int sum=0;
		
		//Accepting_cols_Creating_1D_Array_Accepting_Element_from_User
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Row:"+i);
				/*int col=sc.nextInt();
				ar[i]=new int[col];
			 */
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter element:");
				ar[i][j]=sc.nextInt();
					if(i==j)
					{
						sum+=ar[i][j];
					}
			}
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
		System.out.println("Diagonal sum:"+sum);
	}
}