package board.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import board.model.EdelKarte;
import board.model.Metall;

public class ChessBoard extends JPanel {
	GridLayout grid = new GridLayout(8,8);
	JButton[][] square = new JButton[8][8];
	Color[] colors = {Color.CYAN, Color.BLUE};
	EdelKarte krone = new EdelKarte(1234L, "Krone", Metall.Gold, Color.yellow);
	int kroneX = 2;
	int kroneY = 4;
	
	public ChessBoard() {
		this.setLayout(grid);
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				square[j][i] = new JButton();
				this.add(square[j][i]);
			}
		}
		reset();
	}
	
	public void reset() {
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				square[j][i].setBackground(colors[(i+j)%2]);
			}
		}
		square[kroneX][kroneY].setBackground(krone.getFarbe());
	}
}
