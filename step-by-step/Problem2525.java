import java.util.Scanner;

public class Problem2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cookMinute = sc.nextInt();
		
		int totalHour = (hour * 60 + minute) + cookMinute;
		hour = (totalHour / 60) % 24;
		minute = totalHour % 60;
		
		System.out.println(hour + " " + minute);
		
		sc.close();
	}
}