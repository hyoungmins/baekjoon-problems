
public class Problem4673 {

	public static void main(String[] args) {
		
		int[] selfNum = new int[10001];
		
		for(int i=1; i<=10000; i++) {
			int num = notSelfNum(i);
			
			if(num < 10001) {
				selfNum[num] = num;
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(selfNum[i] == 0) {
				System.out.println(i);
			}
		}
	}
	
	static int notSelfNum(int num) {
		int notSelfNum;
		
		int unit = num % 10;
		int tens = (num / 10) % 10;
		int hun = (num / 100) % 10;
		int tho = (num / 1000) % 10;
		int tenTho = num / 10000;
		
		notSelfNum = num + unit + tens + hun + tho + tenTho;
		
		return notSelfNum;
	}
}
