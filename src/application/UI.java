package application;

import chess.ChessPiece;

//user interface
public class UI {

	public static void PrintBoard(ChessPieces[][] pieces) {
		//impressao do tabuleiro
		for( int i= 0; i<pieces.length; i++ ) {
			System.out.print((8-i) + " ");
			for(int j =0; i<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			//quebra de linha
			System.out.println();
		}
		System.out.println(" a b c d e f g h ");
	}
	
	//impressao de uma peca
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}else {
			
			System.out.print(piece);
		}
			System.out.print("");
		}
	}

