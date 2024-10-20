import java.util.*;
class Area
{
	int length;
	int breadth;
	Area()
	{
		length = breadth = 0;
	}
	public void setDim(int l,int b)
	{
		length = l;
		breadth = b;
	}
	public void getArea()
	{
		System.out.println("Area = "+(length*breadth));
	}
}
class RectangleDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Area r = new Area();
		System.out.println("Enter length and breadth");
		int l = sc.nextInt();
		int b = sc.nextInt();
		r.setDim(l,b);
		r.getArea();
	}
}
