package hw1;

public class AmountOfEggs {
	
	public static void main(String[] args) {
		
		//200顆蛋共有幾打幾顆
		
		int totalEggs = 200;
		int dozen = totalEggs / 12;
		int remaining = totalEggs % 12;
		
		System.out.println( "200顆蛋共有 " + dozen + " 打又 " + remaining + " 顆" );
	}

}
