package board.control;

import java.util.ArrayList;
import java.util.Random;

public abstract class Wuerfel<T> {
	private static Random rnd = new Random();
	protected ArrayList<T> seiten = new ArrayList<T>();
	
	public Wuerfel() {}
	
	public T werfen() {
		int wurf = rnd.nextInt(seiten.size());
		return seiten.get(wurf);
	}
 }
