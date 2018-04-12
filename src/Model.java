import java.util.Observable;

public class Model extends Observable{
	
	int numberOfMoves = 0;
	
	public Model () {
		
		
	}
	
	public void makeDraw() {
		
		setChanged();
		notifyObservers();
		
	}
}


