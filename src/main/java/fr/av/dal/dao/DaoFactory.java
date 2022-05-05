package fr.av.dal.dao;

public abstract class DaoFactory {

	public static GameDao getGameDao() {
		return GameDaoImpl.getInstance();
	}

	public static DeckDao getDeckDao() {
		return DeckDaoImpl.getInstance();
	}
}
