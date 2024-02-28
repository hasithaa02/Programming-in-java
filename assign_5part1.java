package Assignment5_Part1;

public interface Shape {
	
	public double calculateArea();
	public double calculatePerimeter();
	//public double pi=3.14;

}

package Assignment5_Part1;

public class Circle implements Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}

}

package Assignment5_Part1;

public class Triangle implements Shape {
	private float side1;
	private float side2;
	private float side3;
	
	public Triangle(float side1, float side2, float side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public float getSide1() {
		return side1;
	}

	public void setSide1(float side1) {
		this.side1 = side1;
	}

	public float getSide2() {
		return side2;
	}

	public void setSide2(float side2) {
		this.side2 = side2;
	}

	public float getSide3() {
		return side3;
	}

	public void setSide3(float side3) {
		this.side3 = side3;
	}

	 @Override
	 public double calculateArea() {
	      float semi = (side1 + side2 + side3) / 2;
	      double area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
	      return Math.abs(area);
	 }

	@Override
	public double calculatePerimeter() {
		return side1+side2+side3;
	}

}


package Assignment5_Part1;

public class Rectangle implements Shape {
	private int side1;
	private int side2;
	
	public Rectangle(int side1, int side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}

	@Override
	public double calculateArea() {
		return side1*side2;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(side1+side2);
	}
}


package Assignment5_Part1;

public class Assignment5_Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7);
		System.out.println("Area of Circle is : "+c.calculateArea());
		System.out.println("Perimenter of Circle is : "+c.calculatePerimeter());
		
		System.out.println("\n");
		
		Triangle t = new Triangle(3,4,5);
		System.out.println("Area of Triangle is : "+t.calculateArea());
		System.out.println("Perimenter of Triangle is : "+t.calculatePerimeter());
		
		System.out.println("\n");
		
		Rectangle r = new Rectangle(4,5);
		System.out.println("Area of Reactangle is : "+r.calculateArea());
		System.out.println("Perimenter of Reactangle is : "+r.calculatePerimeter());

	}

}
