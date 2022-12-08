import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem2742 {

	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			bw.write(i + "");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
		sc.close();
	}

}
