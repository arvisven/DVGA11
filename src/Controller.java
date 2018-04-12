import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	
	private Model controller;
	public Controller (Model aModel) {
		
		controller = aModel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		controller.setChange();
		
	}

}
