import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int[] aArr = new int[a];
		
		
		for(int i=0; i<aArr.length;i++) {
			aArr[i] = sc.nextInt();
		}
		
		for(int i=0; i<aArr.length;i++) {
			if(n > aArr[i]) {
				System.out.print(aArr[i] + " ");
			}
		}
		
		sc.close();
	}

}
