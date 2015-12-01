import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BoardTester {

	Board board;
	
	@Before
	public void initialize() {
		board = new Board();
	}
	
	@Test
	public void emptyBoard() {
		boolean test = false;
		assertEquals(test, board.hasWinner());
	}
	
	@Test
	public void noWinner() throws InvalidPositionException{
		boolean test = false;
		board.setMark("x", 1, 1);
		board.setMark("o", 1, 2);
		board.setMark("x", 2, 2);
		board.setMark("o", 2, 1);
		board.setMark("x", 3, 2);

		assertEquals(test, board.hasWinner());
	}
	
	@Test
	public void winner() throws InvalidPositionException{
		boolean test = true;
		board.setMark("x", 1, 1);
		board.setMark("o", 1, 2);
		board.setMark("x", 2, 2);
		board.setMark("o", 2, 1);
		board.setMark("x", 3, 3);
		assertEquals(test, board.hasWinner());
	}
	
	@Test (expected = InvalidPositionException.class)
	public void invalidPosition() throws InvalidPositionException {
		board.setMark("x", 1, 1);
		board.setMark("o", 1, 1);
	}
}
