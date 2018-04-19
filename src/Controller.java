import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener {
	
	private Model ctrl;
	JButton clickedButton;
	public Controller (Model aModel) {
		
		ctrl = aModel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedButton =  (JButton) e.getSource();
		ctrl.move(clickedButton);
		
		
	}	

}
