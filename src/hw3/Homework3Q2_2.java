package hw3;

//進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
import java.util.Scanner;

public class Homework3Q2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = (int) (Math.random() * 101); // 宣告1個0~100的亂數答案
		
		while (true) {
			System.out.println("請輸入1個0~100的數字");
			int guess = sc.nextInt();
			if (guess < 0 || guess > 100) {
				System.out.println("小學沒畢業？");
			} else if (guess > ans) {
				System.out.println("大於正確答案");
			} else if (guess < ans) {
				System.out.println("小於正確答案");
			} else {
				System.out.println("答案就是 " + ans + " ,恭喜下班");
				break;
			}			
		}
		sc.close();
	}

}
