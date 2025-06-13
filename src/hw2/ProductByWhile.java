package hw2;

public class ProductByWhile {
	
	public static void main(String[] args) {
		
		//計算1~10的連乘積(用while迴圈)
		int i = 1;
		int product = 1;
		while ( i <= 10) {
			product *= i;
			i++;
		}
		System.out.println( "1~10的連乘積為: " + product );
	}

}
