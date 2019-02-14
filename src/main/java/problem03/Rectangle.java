package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("");
		this.width = width;
		this.height =height;
	}

	@Override
	public void resize(double rate) {
		this.width = width * rate;
		this.height = height * rate;
	}

	@Override
	public double getArea() 
	{
		double result=0;
		result = width * height;
		
		return result;
	}

	@Override
	public double getPerimeter() 
	{
		double result=0;
		result = (width+height)*2;
		
		return result;
	}
}