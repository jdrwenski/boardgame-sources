package board.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.Border;

public class MainWindow extends JFrame {
	JPanel mainPanel = new JPanel();
	ChessBoard board = new ChessBoard();
	ControlPanel actions = new ControlPanel(board);
	Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
	
	public MainWindow(int width, int height) {
		mainPanel.setBorder(padding);
		mainPanel.setLayout(new BorderLayout(20,20));
		mainPanel.add(board, BorderLayout.CENTER);
		mainPanel.add(actions, BorderLayout.LINE_END);
		board.setPreferredSize(new Dimension(height, height));
		this.add(mainPanel);
		this.setTitle("Digitales Brettspiel");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(width, height);
		this.pack();
		this.setVisible(true);
	}
	
}
