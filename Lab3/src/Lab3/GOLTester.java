package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GOLTester {
	
	//GOLNeighbor
	@Test
	void testGOLNeighborsTL() {
		int[][] array = {{0, 1, 0},
		         		 {1, 1, 0},
		         		 {0, 0, 0}
		         		};
		GameOfLife x = new GameOfLife(array);
		int expected = 3; 
		int actual = x.neighbors(0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGOLNeighborsC() {
		int[][] array = {{0, 1, 0},
		         		 {1, 1, 0},
		         		 {0, 0, 0}
		         		};
		GameOfLife x = new GameOfLife(array);
		int expected = 2; 
		int actual = x.neighbors(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGOLNeighborsTR() {
		int[][] array = {{0, 1, 0},
		         		 {1, 1, 0},
		         		 {0, 0, 0}
		         		};
		GameOfLife x = new GameOfLife(array);
		int expected = 2; 
		int actual = x.neighbors(0, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGOLNeighborsB() {
		int[][] array = {{0, 1, 0},
		         		 {1, 1, 0},
		         		 {0, 0, 0}
		         		};
		GameOfLife x = new GameOfLife(array);
		int expected = 2; 
		int actual = x.neighbors(2, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGOLNeighborsBR() {
		int[][] array = {{0, 1, 0},
		         		 {1, 1, 0},
		         		 {0, 0, 0}
		         		};
		GameOfLife x = new GameOfLife(array);
		int expected = 2; 
		int actual = x.neighbors(2, 0);
		assertEquals(expected, actual);
	}
	
	//TGOLNeighbor
	@Test
	void testTGOLNeighborsTL() {
		int[][] array = {{0, 1, 0},
		         		 {0, 0, 0},
		         		 {0, 0, 1}
		         		};
		TorusGameOfLife y = new TorusGameOfLife(array);
		int expected = 1; 
		int actual = y.neighbors(0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTGOLNeighborsT() {
		int[][] array = {{0, 1, 0},
		         		 {0, 0, 0},
		         		 {0, 0, 1}
		         		};
		TorusGameOfLife y = new TorusGameOfLife(array);
		int expected = 0; 
		int actual = y.neighbors(0, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTGOLNeighborsL() {
		int[][] array = {{0, 1, 0},
		         		 {0, 0, 0},
		         		 {0, 0, 1}
		         		};
		TorusGameOfLife y = new TorusGameOfLife(array);
		int expected = 1; 
		int actual = y.neighbors(1, 0);
		assertEquals(expected, actual);
	}
	
	void testTGOLNeighborsBR() {
		int[][] array = {{0, 1, 0},
		         		 {0, 0, 0},
		         		 {0, 0, 1}
		         		};
		TorusGameOfLife y = new TorusGameOfLife(array);
		int expected = 0; 
		int actual = y.neighbors(2, 2);
		assertEquals(expected, actual);
	}
	
	void testTGOLNeighborsR() {
		int[][] array = {{0, 1, 0},
		         		 {0, 0, 0},
		         		 {0, 0, 1}
		         		};
		TorusGameOfLife y = new TorusGameOfLife(array);
		int expected = 1; 
		int actual = y.neighbors(1, 2);
		assertEquals(expected, actual);
	}
}
