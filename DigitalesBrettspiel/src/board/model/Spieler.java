package board.model;

public class Spieler {
	public final String name;
	public String rolle;
	public int punkte = 0;
	
	public Spieler(String name, String rolle) {
		this.name = name;
		this.rolle = rolle;
	}
}
