
public class Board {
	
	private String[][] checkBoard;
	
	public Board() {
		checkBoard = new String[3][3];
		
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				checkBoard[i][j] = "%";
			}
		}
	}
	
	public void setMark (String mark, int x, int y) throws InvalidPositionException{
		
		if(checkBoard[x - 1][y - 1].equals("%")) {
		checkBoard[x - 1][y - 1] = mark;
		System.out.println("Das Board sieht aktuell so aus (x, o, % (leer)):");
		System.out.println(checkBoard[0][0] + " " + checkBoard[1][0] + " " + checkBoard[2][0]);
		System.out.println(checkBoard[0][1] + " " + checkBoard[1][1] + " " + checkBoard[2][1]);
		System.out.println(checkBoard[0][2] + " " + checkBoard[1][2] + " " + checkBoard[2][2]);
		} else {
            throw new InvalidPositionException("FELD IST BESETZT!");
		}
	}
	
	public boolean hasWinner() {
		boolean hasWinner = false;
		String check1 = "x";
		
		
		if(checkBoard[0][0] == check1) {
			if(checkBoard[1][0] == check1) {
				if(checkBoard[2][0] == check1) {
					hasWinner = true;
				}
			}
			if(checkBoard[0][1] == check1) {
				if(checkBoard[0][2] == check1) {
					hasWinner = true;
				}
			}
			
			if(checkBoard[1][1] == check1) {
				if(checkBoard[2][2] == check1) {
					hasWinner = true;
				}
			}
		}
		
		if(checkBoard[1][0] == check1) {
			if(checkBoard[1][1] == check1) {
				if(checkBoard[1][2] == check1) {
					hasWinner = true;
				}
			}
		}
		
		if(checkBoard[2][0] == check1) {
			if(checkBoard[2][1] == check1) {
				if(checkBoard[2][2] == check1) {
					hasWinner = true;
				}
			}
		}
		
		if(checkBoard[0][1] == check1) {
			if(checkBoard[1][1] == check1) {
				if(checkBoard[2][1] == check1) {
					hasWinner = true;
				}
			}
		}
		
		if(checkBoard[0][2] == check1) {
			if(checkBoard[1][2] == check1) {
				if(checkBoard[2][2] == check1) {
					hasWinner = true;
				}
			}
		}
		
		if(checkBoard[0][2] == check1) {
			if(checkBoard[1][1] == check1) {
				if(checkBoard[2][0] == check1) {
					hasWinner = true;
				}
			}
		}
		
		
		if (hasWinner == false) {
			
		check1 = "o";
			if(checkBoard[0][0] == check1) {
				if(checkBoard[1][0] == check1) {
					if(checkBoard[2][0] == check1) {
						hasWinner = true;
					}
				}
				if(checkBoard[0][1] == check1) {
					if(checkBoard[0][2] == check1) {
						hasWinner = true;
					}
				}
				
				if(checkBoard[1][1] == check1) {
					if(checkBoard[2][2] == check1) {
						hasWinner = true;
					}
				}
			}
			
			if(checkBoard[1][0] == check1) {
				if(checkBoard[1][1] == check1) {
					if(checkBoard[1][2] == check1) {
						hasWinner = true;
					}
				}
			}
			
			if(checkBoard[2][0] == check1) {
				if(checkBoard[2][1] == check1) {
					if(checkBoard[2][2] == check1) {
						hasWinner = true;
					}
				}
			}
			
			if(checkBoard[0][1] == check1) {
				if(checkBoard[1][1] == check1) {
					if(checkBoard[2][1] == check1) {
						hasWinner = true;
					}
				}
			}
			
			if(checkBoard[0][2] == check1) {
				if(checkBoard[1][2] == check1) {
					if(checkBoard[2][2] == check1) {
						hasWinner = true;
					}
				}
			}
			
			if(checkBoard[0][2] == check1) {
				if(checkBoard[1][1] == check1) {
					if(checkBoard[2][0] == check1) {
						hasWinner = true;
					}
				}
			}
		}
		
		return hasWinner;
	}
}
