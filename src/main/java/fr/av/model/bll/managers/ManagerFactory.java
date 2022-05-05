package fr.av.model.bll.managers;

public class ManagerFactory {
	public static GameManager getGameManager() {
		return GameManagerImpl.getInstance();
	}

	public static PlayerManager getPlayerManager() {
		return PlayerManagerImpl.getInstance();
	}

	public static DeckManager getDeckManager() {
		return DeckManagerImpl.getInstance();
	}
}
