package board.model;

import java.awt.Color;

public class EdelKarte extends Spielkarte<Metall> {
	private final Color farbe;

	public EdelKarte(long id, String name, Metall wert, Color farbe) {
		super(id,name,wert);
		this.farbe = farbe;
	}

	public Color getFarbe() {
		return farbe;
	}
	
}
