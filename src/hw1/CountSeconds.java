package hw1;

public class CountSeconds {
	
	public static void main(String[] args) {
		
		//計算256559秒為多少天多少小時多少分多少秒
		
		int totalSeconds = 256559;
		int seconds = totalSeconds % 60; //剩餘幾秒
		int minutes = totalSeconds / 60 % 60; //剩餘幾分
		int hours = totalSeconds / 60 / 60 % 24; //剩餘幾小時
		int days = totalSeconds / 60 / 60 / 24; //天數
		
		System.out.println( "256559秒為 " + days + " 天 " + hours + " 小時 " + minutes + " 分 " + seconds + " 秒 " );
	}

}
