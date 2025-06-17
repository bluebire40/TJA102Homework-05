package hw3;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數

import java.util.Scanner;

public class Homework3Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入討厭的數字: ");
		String hateNum = sc.next();
		int count = 0;

		for (int i = 1; i <= 49; i++) {
			if (String.valueOf(i).contains(hateNum)) {
				continue;
			} else {
				System.out.print(i + ", ");
			}
			count++;
		}
		System.out.println("\n總共有 " + count + " 個數字可選");
		sc.close();
	}

}
