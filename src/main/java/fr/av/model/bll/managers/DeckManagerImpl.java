package fr.av.model.bll.managers;

import java.util.ArrayList;
import java.util.List;

import fr.av.dal.dao.DeckDao;
import fr.av.dal.dao.DeckDaoImpl;
import fr.av.model.bll.bo.Building;

public class DeckManagerImpl implements DeckManager {
	private static DeckManager instance = null;
	private DeckDao deckDao = DeckDaoImpl.getInstance();

	// Singleton du manager
	public static DeckManager getInstance() {
		if (instance == null) {
			instance = new DeckManagerImpl();
		}
		return instance;
	}

	private DeckManagerImpl() {

	}

	/**
	 * Récupère la liste des batiments dont le cout est inférieur à 4 et le stocke
	 * dans un sous deck.
	 */
	@Override
	public List<Building> getGameLowCostBuildingsDeck() {
		List<Building> lowCostBuildingsDeck = getBuildingsByCost(0,4);
		return lowCostBuildingsDeck;
	}

	/**
	 * Récupère la liste des batiments dont le cout est inférieur à 6 et le stocke
	 * dans un sous deck.
	 */
	@Override
	public List<Building> getGameMediumCostBuildingsDeck() {
		List<Building> mediumCostBuildingsDeck = getBuildingsByCost(3,6);
		return mediumCostBuildingsDeck;
	}


	/**
	 * Récupère la liste des batiments dont le cout est supérieur ou égal à 6 et le
	 * stocke dans un sous deck.
	 */
	@Override
	public List<Building> getGameHighCostBuildingsDeck() {
		List<Building> highCostBuildingsDeck = getBuildingsByCost(5,10);
		return highCostBuildingsDeck;
	}
	
	private List<Building> getBuildingsByCost(Integer borneMin,Integer borneMax) {
		List<Building> buildingsDeckByCost = new ArrayList<>();
		List<Building> buildingDeck = deckDao.getBuildingCards("buildings");
		for (Building building : buildingDeck) {
			if (building.getCost() > borneMin && building.getCost() < borneMax) {
				buildingsDeckByCost.add(building);
			}
		}
		return buildingsDeckByCost;
	}
	/**
	 * récupère tous les bâtiments spéciaux
	 */
	@Override
	public List<Building> getGameSpecialBuildingsDeck() {
		List<Building> specialBuildingDeck = deckDao.getBuildingCards("specialBuildings");
		return specialBuildingDeck;
	}

	/**
	 * récupère toutes les habitations et en produit autant qu'il n'y a de joueur -1
	 */
	@Override
	public List<Building> getGameHomeBuildingsDeck(Integer playerNumber) {
		List<Building> homeDeck = new ArrayList<>();
		List<Building> homeDeckInit = deckDao.getBuildingCards("homeBuildings");
		for (int i = 0; i < playerNumber-1; i++) {
			homeDeck.addAll(homeDeckInit);
		}
		return homeDeck;

	}

	/**
	 * récupère les marchés et en produit autant qu'il n'y a de joueur
	 */
	@Override
	public List<Building> getGameStarterDeck(Integer playerNumber) {
		List<Building> starterDeck = new ArrayList<>();
		
		for (int i = 0; i < playerNumber; i++) {
		starterDeck.add(deckDao.getBuildingCards("starterBuildings").get(0));
		}		
		return starterDeck;
	}

}
