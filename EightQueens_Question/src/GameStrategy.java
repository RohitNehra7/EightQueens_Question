public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int column = cellId % 8;
		return column;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int row = 0;
		if(cellId >=0 && cellId <= 7) row = 0;
		else if(cellId >=8 && cellId <= 15) row = 1;
		else if(cellId >=16 && cellId <= 23) row = 2;
		else if(cellId >=24 && cellId <= 31) row = 3;
		else if(cellId >=32 && cellId <= 39) row = 4;
		else if(cellId >=40 && cellId <= 47) row = 5;
		else if(cellId >=48 && cellId <= 55) row = 6;
		else if(cellId >=56 && cellId <= 63) row = 7;
		return row;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		 int i, j;
		  
	        /* Check this row */
	        for (i = 0; i < 8; i++)
	            if (placedQueens[row][i] == true && i != col )
	            	isValid = false;
	    
	        /* Check this column */
	        for (i = 0; i < 8; i++)
	            if (placedQueens[i][col] == true && i != row)
	            	isValid = false;
	        
	        /* Check upper diagonal on left side */
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	            if (placedQueens[i][j] == true)
	            	isValid = false;
	  
	        /* Check lower diagonal on right side */
	        for (i = row, j = col; i <= 7 && j <= 0; i++, j++)
	            if (placedQueens[i][j] == true)
	            	isValid = false;
	        
	        /* Check lower diagonal on left side */
	        for (i = row, j = col; j >= 0 && i < 8; i++, j--)
	            if (placedQueens[i][j] == true)
	            	isValid = false;
	        
	        /* Check upper diagonal on right side */
	        for (i = row, j = col; i >= 0 && j < 8; i--, j++)
	            if (placedQueens[i][j] == true)
	            	isValid = false;
	       
	        if(isValid == true) {
	        	placedQueens[row][col] = true;
	        	numQueens+=1;
	        }
		
		return isValid;
	}
}














