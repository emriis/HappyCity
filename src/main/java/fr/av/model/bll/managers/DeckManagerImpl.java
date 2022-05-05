package fr.av.model.bll.managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.av.dal.dao.DeckDao;
import fr.av.dal.dao.DeckDaoImpl;
import fr.av.model.bll.bo.Building;

public class DeckManagerImpl implements DeckManager {
	private static DeckManager instance = null;
	private final int[] COST_CHEAP_BUILDINGS = {1,3};
	private final int[] COST_MEDIUM_BUILDINGS = {4,5};
	private final int[] COST_EXPENSIVE_BUILDINGS = {6,9};
	private final int SPECIAL_BUILDINGS_MODIFIER = 2;
	private final int HOME_BUILDINGS_MODIFIER = 1;
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
		List<Building> lowCostBuildingsDeck = getBuildingsByCost(COST_CHEAP_BUILDINGS);
		return lowCostBuildingsDeck;
	}

	/**
	 * Récupère la liste des batiments dont le cout est inférieur à 6 et le stocke
	 * dans un sous deck.
	 */
	@Override
	public List<Building> getGameMidCostBuildingsDeck() {
		List<Building> mediumCostBuildingsDeck = getBuildingsByCost(COST_MEDIUM_BUILDINGS);
		return mediumCostBuildingsDeck;
	}


	/**
	 * Récupère la liste des batiments dont le cout est supérieur ou égal à 6 et le
	 * stocke dans un sous deck.
	 */
	@Override
	public List<Building> getGameHighCostBuildingsDeck() {
		List<Building> highCostBuildingsDeck = getBuildingsByCost(COST_EXPENSIVE_BUILDINGS);
		return highCostBuildingsDeck;
	}
	
	private List<Building> getBuildingsByCost(int[] borneRange) {
		List<Building> buildingsDeckByCost = new ArrayList<>();
		List<Building> buildingDeck = deckDao.getBuildingCards("buildings");
		for (Building building : buildingDeck) {
			if (building.getCost() >= borneRange[0] && building.getCost() <= borneRange[1]) {
				buildingsDeckByCost.add(building);
			}
		}
		return buildingsDeckByCost;
	}
	/**
	 * récupère tous les bâtiments spéciaux puis on en récupère 
	 * autant que le nombre de joueurs +2
	 */
	@Override
	public List<Building> getGameSpecialBuildingsDeck(Integer playerNumber) {
		List<Building> specialBuildingDeck = new ArrayList<>();
		List<Building> specialBuildingDeckInit = deckDao.getBuildingCards("specialBuildings");
		Collections.shuffle(specialBuildingDeckInit);
		for (int i = 0; i < playerNumber+SPECIAL_BUILDINGS_MODIFIER; i++) {
			specialBuildingDeck.add(specialBuildingDeckInit.get(i));			
		}
		return specialBuildingDeck;
	}

	/**
	 * récupère toutes les habitations et en produit autant qu'il n'y a de joueur -1
	 */
	@Override
	public List<Building> getGameHomeBuildingsDeck(Integer playerNumber) {
		List<Building> homeDeck = new ArrayList<>();
		List<Building> homeDeckInit = deckDao.getBuildingCards("homeBuildings");
		for (int i = 0; i < playerNumber-HOME_BUILDINGS_MODIFIER; i++) {
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
