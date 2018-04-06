
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View {
	
	String player1;
	String player2;
	JButton addPlayer;
	JButton showName;
	JFrame mainWindow;
	
	public View() {
		
		mainWindow = new JFrame();
		mainWindow.setLayout(new BorderLayout());
		
//		player1 = JOptionPane.showInputDialog(parent, "What is your name?", null);
		
		
		addPlayer = new JButton("Lägg till spelar");
//		addPlayer.addActionListener(this);
		
		showName = new JButton("Visa namnet");
		
		startUp(mainWindow);
		
		mainWindow.add(addPlayer, BorderLayout.EAST);
		mainWindow.add(showName, BorderLayout.WEST);
		mainWindow.setTitle("Tic - Tac - Toe, ALPHA 1.0");
		mainWindow.setSize(500,500);
		mainWindow.setVisible(true);
		mainWindow.setDefaultCloseOperation(mainWindow.EXIT_ON_CLOSE);
		
			
	}


	public void startUp(JFrame mainWindow) {

		JPanel popup = new JPanel(new BorderLayout(5,5));
	
	    JPanel labels = new JPanel(new GridLayout(0,1,2,2));
	    labels.add(new JLabel("Player One:", SwingConstants.RIGHT));
	    labels.add(new JLabel("Player Two:", SwingConstants.RIGHT));
	    popup.add(labels, BorderLayout.WEST);
	
	    JPanel textFields = new JPanel(new GridLayout(0,1,2,2));
	    JTextField playerUno = new JTextField("Player1");
	    JTextField playerDos = new JTextField("Player2");
	    textFields.add(playerUno);
	    textFields.add(playerDos);
	    
	    popup.add(textFields, BorderLayout.CENTER);
	    
	    JOptionPane.showMessageDialog(mainWindow, popup, "Choose your names", JOptionPane.QUESTION_MESSAGE);
	
	}
	
}


//public class CreateDialogFromOptionPane {
//
//  public static void main(final String[] args) {
//      final JFrame parent = new JFrame();
//      JButton button = new JButton();
//
//      button.setText("Click me to show dialog!");
//      parent.add(button);
//      parent.pack();
//      parent.setVisible(true);
//
//      button.addActionListener(new java.awt.event.ActionListener() {
//          @Override
//          public void actionPerformed(java.awt.event.ActionEvent evt) {
//              String name = JOptionPane.showInputDialog(parent,
//                      "What is your name?", null);
//          }
//      });
//  }
//}