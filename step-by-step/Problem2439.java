import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String star = "*";
			String blank = " ";
			
			for(int j = n-1; j > i; j--) {
				bw.write(blank);
			}
			
			for(int k = 0; k <= i; k++) {		
				bw.write(star);
			}
			bw.newLine();
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
