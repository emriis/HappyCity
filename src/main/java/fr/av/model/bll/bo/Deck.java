package fr.av.model.bll.bo;

public class Deck {
	private Integer id;
	private DeckName deckName;

	public Deck() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DeckName getDeckName() {
		return deckName;
	}

	public void setDeckName(DeckName deckName) {
		this.deckName = deckName;
	}

	@Override
	public String toString() {
		return "Deck [id=" + id + ", deckName=" + deckName + "]";
	}

	

}
