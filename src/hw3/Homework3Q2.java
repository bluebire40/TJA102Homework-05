package hw3;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//對則顯示正確訊息

import java.util.Scanner;

public class Homework3Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = (int) (Math.random() * 10); // 產生1個0~9的亂數答案
		while (true) { // 宣告無窮迴圈
			System.out.println("請輸入0~9的數字");
			int guess = sc.nextInt(); // 輸入數字不符合規則或是猜錯就回來繼續輸入
			if (guess < 0 || guess > 9) {
				System.out.println("小學沒畢業?");
			} else if (guess == ans) {
				System.out.println("答案就是 " + ans + " ,恭喜下班");
				break;
			} else {
				System.out.println("繼續猜，猜到死");
			}
		}
		sc.close();
	}

}
