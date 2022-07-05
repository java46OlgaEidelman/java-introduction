package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictacoeGame;

class TictacoeTest {

	@Test
		void testTictacoeTest() {
			
			char matrixColumnX[][] = {
					{'x','0','x'},
					{'x','0','0'},
					{ 0 , 0 , 0 }
				};
			char matrixRowO[][] = {
					{'x','0','x'},
					{'0', 0 ,'0'},
					{'x','x', 0 }
				};
			char matrixRightDiagonalX[][] = {
					{'0','0','x'},
					{'x', 0 ,'0'},
					{'x','x', 0 }
				};
			char matrixLeftDiagonalO[][] = {
					{'0','x','x'},
					{'x','0','0'},
					{'x','x','0' }
				};
			
			char matrixDrow[][] = {
					{'0','0','x'},
					{'x','x','0'},
					{'0','x', 0 }
				};
			
			char emptyMatrix[][] = new char[3][3];
			
			assertEquals(1,TictacoeGame.tictactoeMove(matrixColumnX, 2, 0, 'x'));
			assertEquals(1,TictacoeGame.tictactoeMove(matrixRowO, 1, 1, '0'));
			assertEquals(1,TictacoeGame.tictactoeMove(matrixRightDiagonalX, 1, 1, 'x'));
			assertEquals(1,TictacoeGame.tictactoeMove(matrixLeftDiagonalO, 2, 2, '0'));
			assertEquals(2,TictacoeGame.tictactoeMove(matrixDrow, 2, 2, 'x'));
			assertEquals(0,TictacoeGame.tictactoeMove(emptyMatrix, 1, 2, 'x'));
		}

}
