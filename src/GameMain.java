
public class GameMain {
	
	
	public static void main(String[] args) {
		
		Model M = new Model();
		Controller C = new Controller(M);
		View gameView = new View(C);
		M.addObserver(gameView);
	}

}
