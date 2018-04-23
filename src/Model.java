import java.util.Observable;

import javax.swing.JButton;

public class Model extends Observable{
	

	int SIZE = 3;
	int numberOfMoves = 9;
	int player1Status = 1, player2Status = 2;
	int moveCounter;
	JButton cb;
	int movesMade[][] = new int[SIZE][SIZE];
	
	public Model () {
		
		
		
		
	}
	
	public JButton getClickedButton() {
		
		return cb;
		
	}
	
	public boolean playerTurn() {
		
		if(numberOfMoves % 2 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}


	public void move(JButton clickedButton) {
				
				numberOfMoves--;
				setChanged();
				notifyObservers((Object)clickedButton);				
		
	}

	public void saveMove(int x, int y) {
		
		if(playerTurn()) {
			movesMade[x][y] = player1Status;
			//System.out.println("Spelare 1 sparat");
		} else {
			
			movesMade[x][y] = player2Status;
			//System.out.println("Spelare 2 sparat");
		}
		
		checkWin(x, y);
	
	}
	
	public void checkWin(int x, int y) {
		
		int player1Match = 0, player2Match = 0;

		//Lodrätt
		int i = 0;
		System.out.println(x + "" + y);
			
			if(movesMade[x][i] == movesMade[x][i+1] && movesMade[x][i+1] == movesMade[x][i+2]) {
				
				if(movesMade[x][i] == 1) {
					
					System.out.println("player1 win! lodrätt");
					
				} else {
					System.out.println("player2 win! lodrätt");
					
				}
				
			}
			
			if(movesMade[i][y] == movesMade[i+1][y] && movesMade[i+1][y] == movesMade[i+2][y]) {
				
				if(movesMade[i][y] == 1) {
					
					System.out.println("Player1 win! vågrätt");
				} else {
					
					System.out.println("Player2 win!  vågrätt");
				}
				
			}

			
			if(x == y) {	
				
				for(int j = 0; j < SIZE; j++) {
					
					if(movesMade[j][j] == 0) {
						
						 break;
						 
					}
					if(j == SIZE-1) {
						
						if(movesMade[j][j] + movesMade[j-1][j-1] + movesMade[j-j][j-j] == 3) {
							
							System.out.println("player1 win! Diagonalt");
							
						} else if (movesMade[j][j] + movesMade[j-1][j-1] + movesMade[j-j][j-j] == 6) {
							
								System.out.println("Player2 win! Diagonalt");
								
						}
						
					}
						
				}
				
			}
			
			if(x + y == SIZE - 1) {
				
				for(int j = 0; j < SIZE; j++) {
					
					if(movesMade[j][(SIZE-1)-j] == 0) {
						
						break;
						
					}
					
					if(j == SIZE-1) {
						
						if(movesMade[j][j-j] + movesMade[j-1][j-1] + movesMade[j-j][j] == 3) {
							
							System.out.println("player1 win! Diagonalt");
							
						} else if (movesMade[j][j-j] + movesMade[j-1][j-1] + movesMade[j-j][j] == 6) {
							
								
							System.out.println("Player2 win! Diagonalt");
								
						}
						
					}
					
				}
				
			}
			
			int buttonsLeft = 0;
			
			for(int j = 0; j <SIZE; j++) {
				
				for(int k = 0; k<SIZE; k++) {
					
					if(movesMade[j][k] == 0) {
						
						buttonsLeft++;
					}
				}
				
			}
			
			if(buttonsLeft == 0) {
				
				drawModel();
				
			}
		
	}
	
	public void drawModel() {
		boolean draw = true;
		setChanged();
		notifyObservers(draw);
		
	}
	
}

