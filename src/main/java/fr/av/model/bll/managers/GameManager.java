package fr.av.model.bll.managers;

import fr.av.model.bll.bo.Game;

public interface GameManager {
	void playTurn();
	void changePlayer();
	void removeCard();
	Game newGame(Integer playerNumber, String...strings);
}
