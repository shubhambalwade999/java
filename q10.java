import java.util.*;
class q10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter fahrenheit Temperature:");
		double fah=sc.nextDouble();
		double cel=5*(fah-32)/9;
		System.out.println("temperature in celcius="+cel);
	}
}