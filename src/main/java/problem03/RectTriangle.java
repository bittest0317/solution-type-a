package problem03;

public class RectTriangle extends Shape {
	private double width;	// 밑변
	private double height;	// 높이

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double getArea() {
		System.out.println("");
		double result=0;
		
		result = height*width /2;
		return result;
	}

	@Override
	public double getPerimeter() {
		
		double result =0;
	
		double c =0; // 빗변
		
		// 빗변 구하기 -- Math함수 사용
		c = Math.sqrt((width*width)+(height*height));
		
		result = width + height + c;
		
		return result;
	}
}
