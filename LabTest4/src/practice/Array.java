package practice;

import java.util.ArrayList;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> arr=new ArrayList<Integer>();
    arr.add(21);//ad numbers in arraylist
    arr.add(23);
    arr.add(90);
    arr.add(45);
    arr.add(52);
   arr.forEach((x)->//using lambda expression
   {
	   if(x%2==0)//for even number
	   {
		   System.out.print("Even number ");
		  System.out.print(x+" ");//print even number
	   }
	  
	    if(x%2==1)//for odd number
	   {
	    	System.out.print("Odd number ");
		  System.out.print(x+" ");//print odd number
	   }
	    System.out.println("");
   });   
	}
}
