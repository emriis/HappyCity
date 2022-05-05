package fr.av.model.bll.managers;

import java.util.List;

import fr.av.model.bll.bo.Building;

public interface DeckManager {

	List<Building> getGameLowCostBuildingsDeck();

	List<Building> getGameMidCostBuildingsDeck();

	List<Building> getGameHighCostBuildingsDeck();

	List<Building> getGameHomeBuildingsDeck(Integer playerNumber);

	List<Building> getGameStarterDeck(Integer playerNumber);

	List<Building> getGameSpecialBuildingsDeck(Integer playerNumber);

}
