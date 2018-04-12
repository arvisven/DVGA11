
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class View implements Observer{
	
	int SIZE = 3;
	String player1Name;
	String player2Name;
	JButton addPlayer;
	JButton showName;
	JFrame mainWindow;
	JLabel p1NameLabel, p2NameLabel, infoTextLabel;
	JPanel scoreBoard, gameBoard, infoBoard;
	JButton buttons[][] = new JButton[3][3];
	
	JMenuBar menuBar;
	JMenu file, about;
	JMenuItem quit, newGame;
	
	
	public View() {
		
		
		mainWindow = new JFrame();
		mainWindow.setLayout(new BorderLayout());
		scoreBoard = new JPanel(new GridLayout());
		gameBoard = new JPanel(new GridLayout(SIZE, SIZE));
		infoBoard = new JPanel();
		infoTextLabel = new JLabel("Welcome!");
		infoBoard.add(infoTextLabel);
		
		menuBar = new JMenuBar();
		file = new JMenu("File");
		about = new JMenu("About");
		quit = new JMenuItem("Quit");
		newGame = new JMenuItem("New Game");
		file.add(newGame);
		file.add(quit);
		menuBar.add(file);
		menuBar.add(about);
		
		mainWindow.setJMenuBar(menuBar);
		
		for(int i = 0; i < SIZE; i++) {
			
			for(int x = 0; x < SIZE; x++) {
				
				buttons[i][x] = new JButton();
				gameBoard.add(buttons[i][x]);
				buttons[i][x].add(Controller.actionlistener)
				//buttons[i][x].setEnabled(false);
				
			}
		
		}
		
		startUp(mainWindow);
		
		p1NameLabel = new JLabel(player1Name);
		p2NameLabel = new JLabel(player2Name);			
		scoreBoard.add(p1NameLabel);
		scoreBoard.add(p2NameLabel);
		mainWindow.add(scoreBoard, BorderLayout.NORTH);
		mainWindow.add(gameBoard, BorderLayout.CENTER);
		mainWindow.add(infoBoard, BorderLayout.SOUTH);
		mainWindow.setTitle("Tic - Tac - Toe, ALPHA 1.1");
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
	    JTextField player1SetName = new JTextField("Player1");
	    JTextField player2SetName = new JTextField("Player2");
	    textFields.add(player1SetName);
	    textFields.add(player2SetName);
	    
	    
	    popup.add(textFields, BorderLayout.CENTER);
	    
	    JOptionPane.showMessageDialog(mainWindow, popup, "Choose your names", JOptionPane.QUESTION_MESSAGE);
	    
	    player1Name = player1SetName.getText();
	    player2Name = player2SetName.getText();
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		
		
		
	}
	
}