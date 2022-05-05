package fr.av.model.bll.managers;

import fr.av.model.bll.bo.Player;

public class PlayerManagerImpl implements PlayerManager {
	private DeckManager deckManager = ManagerFactory.getDeckManager();
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
	public Player getNewPlayer(String name) {
		Player player = new Player(name);
		player.setLstPlayerBuildings(deckManager.getGameStarterDeck(1));
		return player;
	}

}
