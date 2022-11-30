import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int copyN = n;
		int cycle = 0;
		
		while(true) {
			int units = n % 10;
			int tens = (n / 10) % 10;
			int newNumberUnits = (units + tens) % 10;
			
			int newNumber = (units * 10) + newNumberUnits;
			n = newNumber;
			cycle++;
			
			if(n == copyN) {
				break;
			}
		}
		
		br.close();
		
		bw.write(cycle + "");
		bw.flush();
		bw.close();
	}
}
