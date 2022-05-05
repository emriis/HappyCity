package fr.av.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.av.model.bll.bo.Building;
import fr.av.model.bll.bo.CardLocation;
import fr.av.model.bll.bo.Category;
import fr.av.model.bll.bo.DeckName;

public class DeckDaoImpl extends AbstractDao implements DeckDao {
	private static DeckDao instance = null;
	private List<Building> buildingDeck = new ArrayList<>();

	public static DeckDao getInstance() {
		if (instance == null) {
			instance = new DeckDaoImpl();
		}
		return instance;
	}

	private DeckDaoImpl() {

	}

	@Override
	public List<Building> getBuildingCards(String deckName) {
		try (Connection cnx = PoolConnection.getConnection(database, userBDD, passwordBDD)) {
			final String QUERY = "SELECT * FROM Decks "
					+ "JOIN Buildings ON Decks.deckId = Buildings.deckId "
					+ "LEFT JOIN Categories ON Buildings.categoryId = Categories.categoryId "
					+ "LEFT JOIN CardsLocation on Buildings.cardLocationID = CardsLocation.cardLocationId "
					+ "WHERE DeckName = ?;";
			PreparedStatement pstmt = cnx.prepareStatement(QUERY);
			pstmt.setString(1,DeckName.valueOf(deckName.toUpperCase()).toString());

			ResultSet rs = pstmt.executeQuery();

			buildingDeck.clear();
			while (rs.next()) {
				Building building = new Building();
				building.setId(rs.getInt("buildingId"));
				building.setName(rs.getString("buildingName").toUpperCase());
				building.setCategory(Category.valueOf(rs.getString("category").toUpperCase()));
				building.setCost(rs.getInt("cost"));
				building.setPeople(rs.getInt("people"));
				building.setHearts(rs.getInt("hearts"));
				building.setIncome(rs.getInt("income"));
				building.setCardLocation(CardLocation.valueOf(rs.getString("cardLocation").toUpperCase()));

				buildingDeck.add(building);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return buildingDeck;

	}

}
