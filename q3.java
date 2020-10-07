class q3{
	public static void main(String args[]){
	int x=5;
	 int y=x*x+3*x-7;
	System.out.println("Value of y="+y);
		y=x++ + ++x;
	System.out.println("Value of x=" + x + " Value of y="+y);	
	 int z=x++ - --y;
	System.out.println( "Value of x="  +x+  " Value of y="  +y+  " Value of z=" +z );
	
		 boolean a=true;
		 boolean b=false;
	  boolean c= a && b || !(a || b) ;
	System.out.println("Value of c="+c);
	}
}