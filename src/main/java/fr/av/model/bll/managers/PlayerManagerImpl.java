package fr.av.model.bll.managers;

import fr.av.model.bll.bo.Player;

public class PlayerManagerImpl implements PlayerManager {
	private BuildingManager buildingManager = ManagerFactory.getBuildingManager();
	private static PlayerManager instance = null;

	public static PlayerManager getInstance() {
		if (instance == null) {
			instance = new PlayerManagerImpl();
		}
		return instance;
	}

	private PlayerManagerImpl() {

	}

	@Override
	public void buyBuilding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void claimSpecialBuilding() {
		// TODO Auto-generated method stub

	}

	@Override
	public Player getNewPlayer(String name, Integer playerNumber) {
		Player player = new Player(name, playerNumber);
		player.getLstPlayerBuildings().add(buildingManager.getMarket());
		return player;
	}

}
