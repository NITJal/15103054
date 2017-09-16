
public class AbstractClass {
	public static void main(String args[])
	{
		Trapezoid a = new Trapezoid();
		Triangle b = new Triangle();
		Hexagon c = new Hexagon();

		System.out.println(a.numOfSides());
		System.out.println(b.numOfSides());
		System.out.println(c.numOfSides());
	}
}

abstract class Shape {
	abstract public int numOfSides();
}

class Trapezoid extends Shape {
	public int numOfSides()
	{
		return 4;
	}
}

class Triangle extends Shape {
	public int numOfSides()
	{
		return 3;
	}
}

class Hexagon extends Shape {
	public int numOfSides()
	{
		return 6;
	}
}
