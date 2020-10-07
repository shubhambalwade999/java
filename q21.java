import java.util.Scanner;
class q21{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[10];
		double total=0;

		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter element:");
			ar[i]=sc.nextInt();
			 total+=ar[i];
			
		}
		double avg = total/ar.length;
			System.out.println("The Total="+total);
			System.out.println("The Average="+avg);
		}
			
	}