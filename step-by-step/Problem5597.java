import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] studentArr = new boolean[31];
		
		for(int i=0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			studentArr[n] = true;
		}
		for(int i=1; i<studentArr.length; i++) {
			if(!studentArr[i]) {
				System.out.println(i);
			}
		}
		
		br.close();
	}
}
