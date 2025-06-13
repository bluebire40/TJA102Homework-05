package hw2;

public class ProductByFor {
	
	public static void main(String[] args) {
		
		//計算1~10的連乘積(用for迴圈)
		int product = 1;
		for ( int i = 1; i <= 10; i++ ) {
			product *= i;
		}
		System.out.println( "1~10的連乘積為: " + product );
	}

}
