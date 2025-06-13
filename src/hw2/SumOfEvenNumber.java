package hw2;

public class SumOfEvenNumber {
	
	//1~1000的偶數和
	public static void main(String[] args) {
		int sum = 0;
		for ( int i = 1; i <= 1000; i++ ) {
			if ( i % 2 == 0 ) {  //i / 2等於0為偶數
				sum += i;
			}
			
		}
		System.out.println( "1~1000的偶數和為: " + sum );
	}

}
