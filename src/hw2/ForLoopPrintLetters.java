package hw2;

//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class ForLoopPrintLetters {
	
	public static void main(String[] args) {
		for ( int row = 1; row <= 6; row++ ) {
			String letter = "";
			switch( row ) {
			case 1: 
				letter = "A"; 
				break;
			case 2: 
				letter = "B";
				break;
			case 3:
				letter = "C";
				break;
			case 4:
				letter = "D";
				break;
			case 5:
				letter = "E";
				break;
			case 6:
				letter = "F";
				break;
			}
			for ( int i = 1; i <= row; i++ ) {
				System.out.print( letter );
			}
			System.out.println();
		}
	}

}
