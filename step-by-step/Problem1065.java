import java.util.Scanner;

public class Problem1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.print(hansoo(x));
		
		sc.close();
	}
	
	static int hansoo(int num) {
		int count = 0;
		
		if(num<100) {
			return num;
		} else {
			count = 99;
			
			for(int i=100; i<=num; i++) {
				int units = i % 10;
				int tens = (i / 10) % 10;
				int hundreds = i / 100;
				
				if((hundreds - tens) == (tens - units)) {
					count++;
				}
			}
		}
		return count;
	}
}
