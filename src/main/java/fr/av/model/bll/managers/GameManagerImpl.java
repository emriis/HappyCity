package fr.av.model.bll.managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.av.model.bll.bo.CardLocation;
import fr.av.model.bll.bo.Game;
import fr.av.model.bll.bo.Player;

public class GameManagerImpl implements GameManager {
	private PlayerManager playerManager = ManagerFactory.getPlayerManager();
	private DeckManager deckManager = ManagerFactory.getDeckManager();
	private Game game = new Game();
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
	public Game newGame(String... strings) {
		game = new Game();
		game.setLstPlayers(getPlayers(strings));
		getGameHomeDeck(game.getLstPlayers().size());
		game.setLstLowCostBuildings(deckManager.getGameLowCostBuildingsDeck());
		game.setLstMidCostBuildings(deckManager.getGameMidCostBuildingsDeck());
		game.setLstHighCostBuildings(deckManager.getGameHighCostBuildingsDeck());
		game.setLstSpecialBuildings(deckManager.getGameSpecialBuildingsDeck(game.getLstPlayers().size()));
		game.setGameFirstPlayer(getFirstPlayerName(game.getLstPlayers()));
		return game;
	}

	private List<Player> getPlayers(String... names) {
		List<Player> lstPlayers = new ArrayList<>();
		Player player = new Player();
		for (String name : names) {
			player = playerManager.getNewPlayer(name);
			lstPlayers.add(player);
		}
		for (int i = 0; i < lstPlayers.size(); i++) {
			player.getLstPlayerBuildings().get(0).setCardLocation(CardLocation.getByNumber(i + 1));
			player.setPlayerNumber(i + 1);
			game.getLstPlayers().add(player);
		}
		return lstPlayers;
	}

	private void getGameHomeDeck(Integer playerNumber) {
		game.setLstHomeBuildings(deckManager.getGameHomeBuildingsDeck(playerNumber));
	}

	@Override
	public String getFirstPlayerName(List<Player> lstPlayers) {
		Collections.shuffle(game.getLstPlayers());
		return lstPlayers.stream().findFirst().get().getName();
	}
}
