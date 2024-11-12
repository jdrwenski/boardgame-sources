package board.model;

public abstract class Spielkarte<T> {
	private final long id;
	private String name;
	private T wert;
	
	public Spielkarte(long id, String name, T wert) {
		this.id = id;
		this.name = name;
		this.wert = wert;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public T getWert() {
		return wert;
	}
	
}
