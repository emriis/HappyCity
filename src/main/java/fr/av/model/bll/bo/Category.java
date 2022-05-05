package fr.av.model.bll.bo;

public enum Category {
	LEISURE(1, "orange"), FACTORY(2, "violet"), PUBLIC(3, "bleu"), SHOP(4, "jaune"), HOME(5, "vert"),MARKET(6,"blanc"),SPECIAL(7,"rose");

	private Integer number;
	private String color;

	private Category(Integer number, String color) {
		this.number = number;
		this.color = color;
	}

	public Integer getNumber() {
		return number;
	}

	public String getColor() {
		return color;
	}
	
	
}
