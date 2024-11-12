package board.control;

import java.util.Arrays;

public class WuerfelRichtung extends Wuerfel<String> {
	private String[] richtungen = {"Nord", "S�d", "Ost", "West"};
	
	public WuerfelRichtung() {
		seiten.addAll(Arrays.asList(richtungen));
	}

}
