package fr.av.model.bll.bo;

public class Building {
	private Integer id;
	private String name;
	private Category category;
	private Integer cost;
	private Integer hearts;
	private Integer people;
	private Integer income;
	private CardLocation cardLocation;

	public Building() {

	}

	public Building(String name, Category category, Integer cost, Integer hearts, Integer people, Integer income,
			CardLocation cardLocation) {
		this(null, name, category, cost, hearts, people, income, cardLocation);
	}

	public Building(Integer id, String name, Category category, Integer cost, Integer hearts, Integer people,
			Integer income, CardLocation cardLocation) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.cost = cost;
		this.hearts = hearts;
		this.people = people;
		this.income = income;
		this.cardLocation = cardLocation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getHearts() {
		return hearts;
	}

	public void setHearts(Integer hearts) {
		this.hearts = hearts;
	}

	public Integer getPeople() {
		return people;
	}

	public void setPeople(Integer people) {
		this.people = people;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public CardLocation getCardLocation() {
		return cardLocation;
	}

	public void setCardLocation(CardLocation cardLocation) {
		this.cardLocation = cardLocation;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", category=" + category + ", cost=" + cost + ", hearts="
				+ hearts + ", people=" + people + ", income=" + income + ", status=" + cardLocation + "]";
	}

}
