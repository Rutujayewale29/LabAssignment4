package practice;

class Circle extends Shape //derived from base class
{
	public void getArea()//method of circle class
	{
		int r=4;//value declaration
		double pi=3.14;
		double carea=pi*r*r;//formula for area of circle
		System.out.println("Area of circle is:- "+carea);//print area
	}
}
class Square extends Shape//derived from base  class
{
	public void getArea()//method of square class
	{
		int side=5;//value declaration
		int sarea=side*side;//formula for area of square
		System.out.println("Area of Square is:- "+sarea);//print area
	}
}

public class Shape //base class
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle c=new Circle();//object creation
     c.getArea();//call method of circle
     Square s=new Square();//object creation
     s.getArea();//call method of square
	}

}
