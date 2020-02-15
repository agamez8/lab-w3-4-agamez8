package Lab3;

public class GameOfLife {
	protected int[][] board;
	protected int[][] prev;
	protected int size;
	
	public GameOfLife() {
		board = new int[0][0];
		prev = new int[0][0];
		size = 0;
	}
	
	public GameOfLife(int size1) {
		size = size1;
		board = new int[size1][size1];
		prev = new int[size1][size1];
	}
	
	public GameOfLife(int[][] newBoard) {
		board = newBoard;
		prev = newBoard;
		size = newBoard.length;
	}
	
	public int[][] getBoard() {
		return board;
	}
	
	/*public void printGrid() { 
	        for (int i = 0; i < size; i++) { 
	            for (int j = 0; j < size; j++) 
	            { 
	                if (board[i][j] == 0) 
	                    System.out.print("."); 
	                else
	                    System.out.print("*"); 
	            } 
	            System.out.println(); 
	        } 
	        System.out.println();  
	}*/
	
	//tweaker
	public void oneStep() {
		prev = board;
		for(int l = 0; l < size; l++) {
			for(int m = 0; m < size; m++) {
				int alive = neighbors(l, m);
				//for(int i = -1; i <= 1; i++) {
					//for(int j = -1; j <= 1; j++) {
						
						//rules
						if((prev[l][m] == 1) && (alive < 2))
							board[l][m] = 0;
						else if((prev[l][m] == 1) && (alive > 3))
							board[l][m] = 0;
						else if((prev[l][m] == 0) && (alive == 3))
							board[l][m] = 1;
						else
							board[l][m] = prev[l][m];
						
						//System.out.println(l + " " + m + " " + alive);
					//}
				//}
				
			}
		}
	}
	
	public int neighbors(int r, int c) {
		int TL = 0, T = 0, TR = 0, L = 0, R = 0, BL = 0, B = 0, BR = 0;
		
		if(r > 0 && c > 0) {
		TL = prev[r-1][c-1];
		}
		if(r > 0) {
		T = prev[r-1][c];
		}
		if(r > 0 && c < size-1) {
		TR = prev[r-1][c+1];
		}
		if(c > 0) {
		L = prev[r][c-1];
		}
		if(c < size-1) {
		R = prev[r][c+1];
		}
		if(r < size-1 && c > 0) {
		BL = prev[r+1][c-1];
		}
		if(r < size-1) {
		B = prev[r+1][c];
		}
		if(r < size-1 && c < size-1) {
		BR = prev[r+1][c+1];
		}
		
		//System.out.println(TL + " " + T + " " + TR + " " + L + " " + R + " " + BL + " " + B + " " + BR);
		int neighbors = TL + T + TR + L + R + BL + B + BR;
		return neighbors;
	}
	
	public void evolution(int n) {
		int i = 0;
		while(i < n) {
			oneStep();
			//printGrid();
			i++;
		}
	}
	
	 public static void main(String[] args) {
		 GameOfLife myObj = new GameOfLife();
		 GameOfLife hello = new GameOfLife(7);
		 int[][] board1 = { { 1, 0, 0, 0, 0}, 
		            		{ 0, 0, 0, 1, 0}, 
		            		{ 0, 0, 0, 1, 1}, 
		            		{ 0, 0, 0, 0, 0}, 
		            		{ 0, 1, 0, 0, 0}
		        		  };
		 
		 GameOfLife grid = new GameOfLife(board1);
		 //grid.printGrid();
		 //grid.oneStep();
		 //grid.printGrid();
		 //grid.evolution(5);
	 }
}

	


