package fr.av.dal.dao;

public class GameDaoImpl implements GameDao {
	private static GameDao instance = null;

	public static GameDao getInstance() {
		if (instance == null) {
			instance = new GameDaoImpl();
		}
		return instance;
	}

	private GameDaoImpl() {

	}

}
