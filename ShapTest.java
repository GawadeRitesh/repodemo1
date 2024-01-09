class Shape {
int calarea()
{
return 0;
}
}

class Square extends Shape 
{
	int side;
int calarea()
{
	side=4;
	return side*side;
}

}


class Rectangle extends Shape 
{
	int len,bre;
int calarea()
{
len=3;
bre=7;
return len*bre;
}
}

class ShapTest
{
public static void main (String args[])
{
Shape s1=new Square();
Shape s2=new Rectangle();

System.out.println("Area of Square is "+s1.calarea());
System.out.println("Area of Rectangle is "+s2.calarea());
}}