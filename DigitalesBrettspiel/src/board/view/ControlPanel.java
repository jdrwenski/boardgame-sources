package board.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import board.control.WuerfelD3;
import board.control.WuerfelRichtung;

public class ControlPanel extends JPanel {
	ChessBoard board;
	private WuerfelRichtung zufallsRichtung = new WuerfelRichtung();
	private WuerfelD3 zufallsSchritte = new WuerfelD3();
	private String richtung = "Nord";
	private int anzahlSchritte = 0;
	
	GridLayout vertical = new GridLayout(10,1);
	JButton action1 = new JButton("Richtung würfeln");
	JLabel ausgabe1 = new JLabel(richtung);
	JButton action2 = new JButton("Schritte würfeln");
	JLabel ausgabe2 = new JLabel(Integer.toString(anzahlSchritte));
	
	public ControlPanel(ChessBoard board) {
		this.board = board;
		vertical.setVgap(10);
		this.setLayout(vertical);
		this.add(action1);
		this.add(ausgabe1);
		this.add(action2);
		this.add(ausgabe2);
		action1.addActionListener(event -> richtungWuerfeln());
		action2.addActionListener(event -> schritteWuerfeln());
	}
	
	private void richtungWuerfeln() {
		richtung = zufallsRichtung.werfen();
		ausgabe1.setText(richtung);
	}

	private void schritteWuerfeln() {
		int anzahlSchritte = zufallsSchritte.werfen();
		ausgabe2.setText(Integer.toString(anzahlSchritte));
		switch (richtung) {
		case "Nord":
			board.kroneY -= anzahlSchritte;
			break;
		case "Süd":
			board.kroneY += anzahlSchritte;
			break;
		case "West":
			board.kroneX -= anzahlSchritte;
			break;
		case "Ost":
			board.kroneX += anzahlSchritte;
			break;
		}
		board.reset();
	}
	
}
