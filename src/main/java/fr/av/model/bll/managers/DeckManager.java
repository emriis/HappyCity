package fr.av.model.bll.managers;

import java.util.List;

import fr.av.model.bll.bo.Building;

public interface DeckManager {

	List<Building> getGameLowCostBuildingsDeck();

	List<Building> getGameMediumCostBuildingsDeck();

	List<Building> getGameHighCostBuildingsDeck();

	List<Building> getGameSpecialBuildingsDeck();

	List<Building> getGameHomeBuildingsDeck(Integer playerNumber);

	List<Building> getGameStarterDeck(Integer playerNumber);

}
