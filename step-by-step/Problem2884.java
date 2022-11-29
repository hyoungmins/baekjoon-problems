import java.util.Scanner;

public class Problem2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute < 45) {
			if(hour == 0) {
				hour = 23;
				minute = minute + 15;
			} else {
				hour = hour - 1;
				minute = minute + 15;
			}
		} else {
			minute = minute - 45;
		}
		
		System.out.print(hour + " " + minute);
		
		sc.close();
	}
}