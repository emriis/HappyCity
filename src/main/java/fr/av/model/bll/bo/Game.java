package fr.av.model.bll.bo;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private Integer id;
	private Integer bank;
	private List<Player> lstPlayers = new ArrayList<>();
	private List<Building> lstLowCostBuildings = new ArrayList<>();
	private List<Building> lstMidCostBuildings = new ArrayList<>();
	private List<Building> lstHighCostBuildings = new ArrayList<>();
	private List<Building> lstSpecialBuildings = new ArrayList<>();
	private List<Building> lstHomeBuildings = new ArrayList<>();

	public Game() {

	}

	public Game(Integer id, Integer bank, List<Player> lstPlayers, List<Building> lstLowCostBuildings,
			List<Building> lstMidCostBuildings, List<Building> lstHighCostBuildings, List<Building> lstSpecialBuildings,
			List<Building> lstHomeBuildings) {
		super();
		this.id = id;
		this.bank = bank;
		this.lstPlayers = lstPlayers;
		this.lstLowCostBuildings = lstLowCostBuildings;
		this.lstMidCostBuildings = lstMidCostBuildings;
		this.lstHighCostBuildings = lstHighCostBuildings;
		this.lstSpecialBuildings = lstSpecialBuildings;
		this.lstHomeBuildings = lstHomeBuildings;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

	public List<Player> getLstPlayers() {
		return lstPlayers;
	}

	public void setLstPlayers(List<Player> lstPlayers) {
		this.lstPlayers = lstPlayers;
	}

	public List<Building> getLstLowCostBuildings() {
		return lstLowCostBuildings;
	}

	public void setLstLowCostBuildings(List<Building> lstLowCostBuildings) {
		this.lstLowCostBuildings = lstLowCostBuildings;
	}

	public List<Building> getLstMidCostBuildings() {
		return lstMidCostBuildings;
	}

	public void setLstMidCostBuildings(List<Building> lstMidCostBuildings) {
		this.lstMidCostBuildings = lstMidCostBuildings;
	}

	public List<Building> getLstHighCostBuildings() {
		return lstHighCostBuildings;
	}

	public void setLstHighCostBuildings(List<Building> lstHighCostBuildings) {
		this.lstHighCostBuildings = lstHighCostBuildings;
	}

	public List<Building> getLstSpecialBuildings() {
		return lstSpecialBuildings;
	}

	public void setLstSpecialBuildings(List<Building> lstSpecialBuildings) {
		this.lstSpecialBuildings = lstSpecialBuildings;
	}

	public List<Building> getLstHomeBuildings() {
		return lstHomeBuildings;
	}

	public void setLstHomeBuildings(List<Building> lstHomeBuildings) {
		this.lstHomeBuildings = lstHomeBuildings;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", bank=" + bank + ", lstPlayers=" + lstPlayers + ", lstLowCostBuildings="
				+ lstLowCostBuildings + ", lstMidCostBuildings=" + lstMidCostBuildings + ", lstHighCostBuildings="
				+ lstHighCostBuildings + ", lstSpecialBuildings=" + lstSpecialBuildings + ", lstHomeBuildings="
				+ lstHomeBuildings + "]";
	}

}
