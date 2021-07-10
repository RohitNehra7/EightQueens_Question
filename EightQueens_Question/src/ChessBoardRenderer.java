public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int box = square+1;
		if((box >= 1 && box <=8) || (box >= 17 && box <=24) || (box >= 33 && box <= 40) ||
				(box >= 49 && box <=56)) {
			if(box%2 == 0) return true;
			else return false;
		} else {
			if(box%2 == 0) return false;
			else return true;
		}
		
	}
}
