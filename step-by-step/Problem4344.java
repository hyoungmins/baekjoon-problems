import java.util.Scanner;

public class Problem4344 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		
		for(int i=0; i<n1; i++) {
			double sum = 0.0;
			
			int n2 = sc.nextInt();
			int[] scoreArr = new int[n2];
			
			for(int j=0; j<n2; j++) {
				scoreArr[j] = sc.nextInt();
				
				sum += scoreArr[j];
			}
			
			double av = sum / n2;
			double count = 0.0;
			
			for(int k=0; k<n2; k++) {
				if(scoreArr[k] > av) {
					count++;
				}
			}
			double percent = (count / n2) * 100;
			
			System.out.printf("%.3f%%\n", percent);
		}
		sc.close();
	}
}
