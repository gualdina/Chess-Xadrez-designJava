package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if(column < 'a' || column >'h' || row < 1 || row > 8 ) {
			throw new ChessException("error instantiating ChessPosition. Invalid Values")
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	//Conversao das linha da matriz para a as linhas do jogo
	protected Position toPosition() {
		//matrix_row = 8 - chess_row
		//matrix_column = chess_column - a
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a'- position.getColumn()), 8 - position.getRow());
	}
	@Override
	public String toString() {
		return "ChessPosition [column=" + column + ", row=" + row + "]";
	}
	
}
