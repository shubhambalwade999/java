import java.util.*;
class q8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		double pa=sc.nextDouble();
		System.out.println("Enter rate of Interest");
		double roi=sc.nextDouble();
		System.out.println("Enter Time");
		double t=sc.nextDouble();
		double si=(pa*roi*t)/100;
		System.out.println("si is "+si);
	}
}