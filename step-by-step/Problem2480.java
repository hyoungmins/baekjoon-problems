import java.util.Scanner;

public class Problem2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		
		if(dice1 == dice2 && dice2 == dice3) {
			int prize = 10000 + (dice1 * 1000);
			System.out.print(prize);
		}
		
		if(dice1 == dice2 && dice2 != dice3) {
			int prize = 1000 + (dice1 * 100);
			System.out.print(prize);
		} else if(dice2 == dice3 && dice3 != dice1) {
			int prize = 1000 + (dice2 * 100);
			System.out.print(prize);
		} else if(dice1 == dice3 && dice3 != dice2){
			int prize = 1000 + (dice3 * 100);
			System.out.print(prize);
		}
		
		if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			if(dice1 > dice2 && dice1 > dice3) {
				int prize = dice1 * 100;
				System.out.print(prize);
			} else if(dice2 > dice1 && dice2 > dice3) {
				int prize = dice2 * 100;
				System.out.print(prize);
			} else if(dice3 > dice2 && dice3 > dice1) {
				int prize = dice3 * 100;
				System.out.print(prize);
			}
		}
	
		// 문제를 해결할 때 여러 가지 접근 방법을 생각해 보자.
		/* if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			int max;
			if(dice1 > dice2) {
				if(dice3 > dice1) {
					max = dice3;
				} else {
					max = dice1;
				}
			} else {
				if(dice3 > dice2) {
					max = dice3;
				} else {
					max = dice2;
				}
			}
			int prize = max * 100;
			System.out.print(prize);
			
		} else {
			if(dice1 == dice2 && dice1 == dice3) {
				int prize = 10000 + (dice1 * 1000);
				System.out.print(prize);
			} else {
				if(dice1 == dice2 || dice1 == dice3) {
					int prize = 1000 + (dice1 * 100);
					System.out.print(prize);
				} else {
					int prize = 1000 + (dice2 * 100);
					System.out.print(prize);
				}
			}
		}*/ 
		
		sc.close();
	}
}