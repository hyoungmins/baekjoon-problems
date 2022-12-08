import java.util.Scanner;

public class Problem2577 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int[] numArr = new int[10];
		 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int abc = a * b * c;
		String num = Integer.toString(abc);
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<num.length(); j++) {
				char ch = num.charAt(j);
				if(i == ch - '0') {
					numArr[i]++;
				}
			}
			System.out.println(numArr[i]);
		}
		
		sc.close();
	}
}
