/*40.Create a class Student having data members name,
 roll no., age and score. Write a program to accept
 10 records of student and store them in an array.
 And then arrange the student records based on
 the score group [0-50], [50-65], [65-80], [80-100].*/
 
 import java.util.Scanner;
 class Student{
	 private String name;
	 private int rollNo;
	 private int age;
	 private int score;
	 
	Student(String name,int rollNo,int age,int score)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score;
	}
			
		void show(Student ar){
			//sorting logic
			for(int i=0;i<ar.length;i++){
				for(int j=i+1;j<ar.length;j++)
				{
						if(ar[i].score>=0 &&ar[i].score<=50)
						{
							
						}
				}
			}
			
			for(int i=0;i<ar.length;i++){
				if()
			}
			System.out.println("Enter age:");
			
		}
		
	
 }
 class studentDemo{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 Student ar[]=new Student[10];
		 for(int i=0;i<10;i++){
			 System.out.println("Student:"+i);
			 System.out.println("Enter name:");
			 String name=sc.nextInt();
			 System.out.println("Enter rollNo:");
			 int rollNo=sc.nextInt();
			 System.out.println("Enter age:");
			 int age=sc.nextInt();
			 System.out.println("Enter score:");
			 int score=sc.nextInt();
			 Student si=new Student(name,rollNo,age,score);
			 ar[i]=si;
		 }
		 int totalamt=Product.group(ar);
	 }
 }
 