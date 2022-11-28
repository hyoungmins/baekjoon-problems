import java.util.Scanner;

public class Problem3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int whiteKing = sc.nextInt();
		int whiteQueen = sc.nextInt();
		int whiteRook = sc.nextInt();
		int whiteBishop = sc.nextInt();
		int whiteKnight = sc.nextInt();
		int whitePawn = sc.nextInt();
		
		int king = -whiteKing + 1;
		int queen = -whiteQueen + 1;
		int rook = -whiteRook + 2;
		int bishop = -whiteBishop + 2;
		int knight = -whiteKnight + 2;
		int pawn = -whitePawn + 8;
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);
		
		sc.close();
	}
}