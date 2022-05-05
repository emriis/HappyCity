package fr.av.model.bll.managers;

import java.util.List;

import fr.av.model.bll.bo.Game;
import fr.av.model.bll.bo.Player;

public interface GameManager {

	void playTurn();

	void changePlayer();

	void removeCard();

	Game newGame(String... strings);

	String getFirstPlayerName(List<Player> lstPlayers);
}
