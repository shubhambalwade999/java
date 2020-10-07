/*39.Create class Product with three data members (pid, price, quantity) 
and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and 
store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument)
 in Product class to calculate and return total amount spent on all products.
 ( amount spent on single product = price of product * quantity of product )
*/
import java.util.Scanner;
class Product{
	private int pid;
	private int price;
	private int quantity;
	
	// 3.param constructor
	Product(int pid,int price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}	
	//creating static int CalculateProduct method
	static int CalculateProduct(Product ar[]){
		//total amount spent for all products
		int AmountTP=0;
		int AmountSP=0;
		for(int i=0;i<ar.length;i++){
		 AmountSP= ar[i].price*ar[i].quantity;
		 AmountTP=AmountTP+AmountSP;
		}
		//sorting logic
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++)
			{
					if(ar[i].price<ar[j].price)
					{
						Product temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
			}
		}
		//printing pid of highest price product
		System.out.println("pid of highest price product:"+ar[0].pid);
		return AmountTP;
	}
}
class productDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Product ar[]=new Product[5];
		//accepting values and creating objects and storing it into array
		for(int i=0;i<ar.length;i++){
			System.out.println("Product:"+(i+1));
			System.out.println("Enter pid:");
			int pid=sc.nextInt();
			System.out.println("Enter price:");
			int price=sc.nextInt();
			System.out.println("Enter quantity:");
			int quant=sc.nextInt();
			Product pi=new Product(pid,price,quant);
			ar[i]=pi;
		}
		
		
		//printing total amount spent on all products by calling static CalculateProduct method
		int totalamt=Product.CalculateProduct(ar);
		System.out.println("total amount spent on all products:"+totalamt);
	}
}