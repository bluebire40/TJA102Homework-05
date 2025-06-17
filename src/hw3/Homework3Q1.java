package hw3;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形

import java.util.Scanner;

public class Homework3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個邊長整數: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();

		if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) { // 檢查是否兩邊相加大於第三邊
			if (s1 == s2 && s2 == s3) {
				System.out.println("正三角形");
			} else if (s1 == s2 || s2 == s3 || s1 == s3) {
				System.out.println("等腰三角形");
			} else if ((int) (Math.pow(s1, 2)) + (int) (Math.pow(s2, 2)) == (int) (Math.pow(s3, 2))
					|| (int) (Math.pow(s2, 2)) + (int) (Math.pow(s3, 2)) == (int) (Math.pow(s1, 2))
					|| (int) (Math.pow(s1, 2)) + (int) (Math.pow(s3, 2)) == (int) (Math.pow(s2, 2))) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

		sc.close();
	}

}
