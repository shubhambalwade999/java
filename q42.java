/*42.Create a class Tile to store the edge length of a square tile, 
and create another class Floor to store length and width of a rectangular floor. 
Add method totalTiles(Tile t) in Floor class with 
Tile as argument to calculate the whole number of tiles needed to cover the floor completely.*/

class Tile{
	double edgelength;
	Tile(double edgelength){
		this.edgelength=edgelength;
	}
	
}
class Floor{
	double length;
	double width;
	Floor(double length,double width){
		this.length=length;
		this.width=width;
	}
	void totalTiles(Tile t){
		 double area=length*width;
		 double Width=√[(t.edgelength*t.edgelength)- 1];
		 double noOfTiles=area/Width;
	}
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length:");
	double length=sc.nextDouble();
	System.out.println("Enter width:");
	double width=sc.nextDouble();
	System.out.println("Enter edgelength:");
	double edgelength=sc.nextDouble();
	Tile t=new Tile(edgelength);
	Floor f=new Floor(length,width);
	
}