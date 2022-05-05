package fr.av.model.bll.bo;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private Integer id;
	private String name;
	private Integer money = 2;
	private List<Building> lstPlayerBuildings = new ArrayList<>();
	private Integer playerNumber;
	
	
	public Player() {

	}
	

	public Player(Integer id, String name, Integer money, List<Building> lstPlayerBuildings, Integer playerNumber) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.lstPlayerBuildings = lstPlayerBuildings;
		this.playerNumber = playerNumber;
	}


	public Player(String name) {
		this(null,name,2,null,null);
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

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public List<Building> getLstPlayerBuildings() {
		return lstPlayerBuildings;
	}

	public void setLstPlayerBuildings(List<Building> lstPlayerBuildings) {
		this.lstPlayerBuildings = lstPlayerBuildings;
	}

	
	public Integer getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(Integer playerNumber) {
		this.playerNumber = playerNumber;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", money=" + money + ", lstPlayerBuildings=" + lstPlayerBuildings
				+ ", playerNumber=" + playerNumber + "]";
	}

}
