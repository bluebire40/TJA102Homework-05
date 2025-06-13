package hw2;

//輸出結果為1~49且不含4的可以選擇的數字有哪些? 總共有幾個?

public class NoNumber4 {
	
	public static void main(String[] args) {
		int count = 0;
		for ( int i = 1; i <= 49; i++ ) {
			if ( String.valueOf(i).contains("4")) {
				continue;
			}
			count++;
			System.out.print( i + " " );			
		}
		System.out.println( "\n總共有" + count + "個" );
	}

}
