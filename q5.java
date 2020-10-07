import java.util.*;
class q5{
	
static public void main(String[] args){
	if(args.length>0)
	{
		System.out.print("Welcome ");
		for(String val:args)
		System.out.print(val+" ");
	}
	else
		System.out.println("Commandline?? arguments not found!!");
	}

}