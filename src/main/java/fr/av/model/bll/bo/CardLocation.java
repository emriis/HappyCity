package fr.av.model.bll.bo;

public enum CardLocation {
	PLAYER1(1), PLAYER2(2), PLAYER3(3), PLAYER4(4), PLAYER5(5), GENERICPLAYER(6), DECK(7), AVAILABLE(8), DISCARD(9);

	private Integer number;

	private CardLocation(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public static CardLocation getByNumber(int i) {
		for (CardLocation s : values()) {
			if (s.getNumber().equals(i)) {
				return s;
			}
		}
		return null;
	}
}
