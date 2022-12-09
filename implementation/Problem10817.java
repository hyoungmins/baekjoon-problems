import java.util.Scanner;

public class Problem10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int middleNumber = 0;
		
		if(a>=b && a>=c) {
			if(b>=c) {
				middleNumber = b;
			} else {
				middleNumber = c;
			}
		} else if(b>=a && b>=c) {
			if(a>=c) {
				middleNumber = a;
			} else {
				middleNumber = c;
			}
		} else if(c>=a && c>=b) {
			if(a>=b) {
				middleNumber = a;
			} else {
				middleNumber = b;
			}
		}
		System.out.print(middleNumber);
		
		sc.close();
	}
}
