import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nArr = new int[9];
		int max = 0;
		int count = 0;
		int index = 0;
		
		for(int i=0; i<nArr.length;i++) {
			nArr[i] = Integer.parseInt(br.readLine());
			count++;
			
			if(nArr[i] > max) {
				max = nArr[i];
				index = count;
			}
		}
		
		System.out.print(max + "\n" + index);
		
		br.close();
	}

}
