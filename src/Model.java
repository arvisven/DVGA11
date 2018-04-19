import java.util.Observable;

import javax.swing.JButton;

public class Model extends Observable{
	

	int SIZE = 3;
	int numberOfMoves = 9;
	int movesMade = 0;
	JButton cb;
	
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
	
}


