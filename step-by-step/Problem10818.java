import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nArr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<nArr.length;i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nArr);
		
		System.out.print(nArr[0] + " " + nArr[nArr.length - 1]);
		
		br.close();
	}

}
