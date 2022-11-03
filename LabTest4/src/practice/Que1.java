package practice;


interface Adder//interface
{
  public void add();	//method declaration
}
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=5;//value initialization
     int b=45;
     String str="welcome";
     Adder x=()->//used lambda expression
     {
     System.out.println("Numbers is:-"+a+" "+b);//print numbers
     System.out.println(str.toUpperCase());//string converting to uppercase
     };
     x.add();//calling method
}
}