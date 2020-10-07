/*32.	Modify the above program (no. 30) to count the no of Student objects created.
 [ In this program static variable is required ]*/
 
 class Student{
	private int rno;
	private String name;
	public static int count;
	
	Student(){
		this.rno=00;
		this.name="nothing";
		count++;
	}
	
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
		count++;
	}
	
	void setData(int rollNo,String name){
		rno=rollNo;
		this.name=name;
	}
	void showData(){
		System.out.println("Roll no:"+rno+" "+"Name:"+name);
		//System.out.println("Object Created:"+Student.count);
	}
}



class StudentDemo1{
	public static void main(String args[]){
		Student s=new Student();
		s.setData(100,"Trisha");
		s.showData();
		Student s1=new Student(101,"Trisha");
		s1.showData();
		Student s2=new Student(101,"Trisha");
		s2.showData();
		Student s3=new Student(101,"Trisha");
		s3.showData();
		Student s4=new Student();
		s4.showData();
		System.out.println("Object Created:"+Student.count);
	}
}