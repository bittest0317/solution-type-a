package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int com[] = new int[3]; // 컴퓨터의 배열 3개
		int user[] = new int[3]; // 사용자의 배열 3개
		int userNum = 0;
		int ch = 0;
		int counter = 0;

		boolean randomball = true;

		while (randomball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;

			}

			

			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
				randomball = false;
			}

		}
		randomball = true;

		while (randomball) {
			int strike = 0;
			int ball = 0;
			int no=0;
			System.out.println(">");
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < user.length; i++) {
				
				
				userNum = sc.nextInt();

				user[0] = userNum / 100;
				user[1] = (userNum % 100) / 10;
				user[2] = (userNum % 100) % 10;
			}
			
			for (int i = 0; i < com.length; i++) // 컴퓨터배열(숫자)과 사용자배열(숫자)을 비교함
			{
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) // 배열이(숫자)같고 위치까지 같으면 스트라이크
					{
						strike++;
					} else if (com[i] == user[j] && i != j) // 배열이(숫자)같고 위치가 다르면 볼
					{
						ball++;
					}
					else 
					{
						no++;
					}

				}
			}
			System.out.printf("s: %d, B: %d ,O : %d",strike,ball,no);
			if (strike == 3) // 스트라이크가 세개는 맞췄다는 뜻이니깐 빠져나갈 수 있도록
			{
				randomball = false;
			}
			counter++;
		}
		System.out.println("횟수 : " + counter);
		System.out.println("게임 끝");
	}

}
