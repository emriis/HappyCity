package fr.av.model.bll.managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.av.model.bll.bo.CardLocation;
import fr.av.model.bll.bo.Game;
import fr.av.model.bll.bo.Player;

public class GameManagerImpl implements GameManager {
	PlayerManager playerManager = ManagerFactory.getPlayerManager();
	BuildingManager buildingManager = ManagerFactory.getBuildingManager();
	DeckManager deckManager = ManagerFactory.getDeckManager();
	Game game = new Game();
	private static GameManager instance = null;

	public static GameManager getInstance() {
		if (instance == null) {
			instance = new GameManagerImpl();
		}
		return instance;
	}

	private GameManagerImpl() {

	}

	@Override
	public void playTurn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePlayer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public Game newGame(Integer playerNumber, String... strings) {
		List<String> lstPlayersName = new ArrayList<>();
		getPlayers(playerNumber, lstPlayersName, strings);
		getGameHomeDeck(playerNumber);
		game.setLstLowCostBuildings(deckManager.getGameLowCostBuildingsDeck());
		return game;
	}

	private void getGameHomeDeck(Integer playerNumber) {
		game.setLstHomeBuildings(deckManager.getGameHomeBuildingsDeck(playerNumber));
		Collections.shuffle(game.getLstHomeBuildings());
	}

	private void getPlayers(Integer playerNumber, List<String> lstPlayersName, String... strings) {
		for (String name : strings) {
			lstPlayersName.add(name);
		}
		for (int i = 0; i < playerNumber; i++) {
			Player player = playerManager.getNewPlayer(lstPlayersName.get(i), i + 1);
			player.getLstPlayerBuildings().get(0).setCardLocation(CardLocation.getByNumber(i + 1));
			game.getLstPlayers().add(player);
		}
	}

}
