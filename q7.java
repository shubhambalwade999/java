import java.util.*;
class q7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of subjects: ");
		int sub=sc.nextInt();
		int sum=0;
		System.out.println("enter no of subjects marks: ");
		for(int i=0;i<sub;i++)
		{
			int marks=sc.nextInt();
			sum+=marks;
		}
		
		int totalmarks=sub*100;
		double perc=sum/(double)sub;
		System.out.println("percentage is ="+perc+"%");
	}
}