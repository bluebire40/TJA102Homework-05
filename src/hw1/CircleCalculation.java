package hw1;

public class CircleCalculation {
	
	public static void main(String[] args) {
		
		//計算圓面積與圓周長
		
		final double PI = 3.1415; //宣告常數圓周率
		int r = 5; //設半徑為5
		double area = PI * r * r; //計算圓面積
		double round = 2 * PI * r; //計算圓周長
		
		System.out.println( "圓面積為 " + area );
		System.out.println( "圓周長為 " + round );
	}

}
