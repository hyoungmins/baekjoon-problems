import java.util.Scanner;

public class Problem8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] OX = new String[n];
	
		for(int i=0; i<OX.length; i++) {
			OX[i] = sc.next();
			int cnt = 0;
			int score = 0;
			
			for(int j=0; j<OX[i].length(); j++) {
				if(OX[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				score += cnt;
			}
			System.out.println(score);
		}
		sc.close();
	}

}
