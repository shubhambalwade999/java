import java.util.*;
class q9{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter no of days");
int days=sc.nextInt();
int year=days/365;
int months=days%365;
int months1=months/30;
days=days%365;
int days1=days%30;
System.out.println("year="+year+" months="+months1+" days="+days1);


}
}