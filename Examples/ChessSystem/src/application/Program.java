package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		sc.close();
		
//		Position pos = new Position(3, 5);
//		System.out.println(pos);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
