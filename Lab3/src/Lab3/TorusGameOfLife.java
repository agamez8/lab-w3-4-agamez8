package Lab3;

public class TorusGameOfLife extends GameOfLife{
	
	public int neighbors(int r, int c) {
		int TL = 0, T = 0, TR = 0, L = 0, R = 0, BL = 0, B = 0, BR = 0;
		
	
		TL = prev [(r-1) %size][(c-1) %size];
		
		T = prev[(r-1) %size][(c) %size];
		
		TR = prev[(r-1) %size][(c+1) %size];
		
		L = prev[(r) %size][(c-1) %size];
		
		R = prev[(r) %size][(c+1) %size];
		
		BL = prev[(r+1) %size][(c-1) %size];
		
		B = prev[(r+1) %size][(c) %size];
		
		BR = prev[(r+1) %size][(c+1) %size];
		
		
		//System.out.println(TL + " " + T + " " + TR + " " + L + " " + R + " " + BL + " " + B + " " + BR);
		int neighbors = TL + T + TR + L + R + BL + B + BR;
		return neighbors;
	}
}

/*Torus GameOfLife extends class GameOfLife
constructors
inherit: neighbors, oneStep, evolution
@Override
int neighbors(int r, int c){
use modulus(%)
}
*/
