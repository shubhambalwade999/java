import java.util.Scanner;
class q28{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//Accepting size of Array
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		
		//creating a Array
		String city[]=new String[size];
		int i;
		
		//accepting array element from user
		for( i=0;i<city.length;i++)
		{
			System.out.println("Enter a city:"+i);
			city[i]=sc.next();
		}
		
		//Printing cities using for each loop
		System.out.println("cities:");
		for(String s:city)
		{
			System.out.println(s);
		}
	}
}