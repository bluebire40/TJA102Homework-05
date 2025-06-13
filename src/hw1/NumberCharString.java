package hw1;

public class NumberCharString {
	
	public static void main(String[] args) {
		
		System.out.println( 5 + 5 ); //整數5加上整數5等於10
				
		System.out.println( 5 + '5' ); //字元5等於ASCII code中的整數53，故相加後等於58
		
		System.out.println( 5 + "5" ); //由於後者5為字串，前者也由整數轉變為字串，故結果會以字串形式55呈現
	}

}
