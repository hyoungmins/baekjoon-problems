import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nArr = new int[n];
		double sum = 0.0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<nArr.length;i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nArr);
		
		for(int i=0; i<nArr.length; i++) {
			double newScore = ((double)nArr[i] / nArr[nArr.length-1]) * 100;
			sum += newScore;
		}

		double newAv = sum / nArr.length;
		System.out.print(newAv);
		
		br.close();
	}

}
