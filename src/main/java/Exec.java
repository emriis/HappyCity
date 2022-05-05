import java.util.List;

import fr.av.dal.dao.DaoFactory;
import fr.av.dal.dao.DeckDao;
import fr.av.model.bll.bo.Building;
import fr.av.model.bll.managers.DeckManager;
import fr.av.model.bll.managers.GameManager;
import fr.av.model.bll.managers.ManagerFactory;

public class Exec {

	public static void main(String[] args) {
		DeckDao deckDao = DaoFactory.getDeckDao();
		DeckManager deckManager = ManagerFactory.getDeckManager();
		GameManager gameManager = ManagerFactory.getGameManager();
		
		
//		List<Building> starterDeck = deckManager.getGameStarterDeck(3);
//		for (Building building : starterDeck) {
//			System.out.println(building);
//		}
//
//		System.out.println();
//		System.out.println();
//
//		List<Building> homeDeck = deckManager.getGameHomeBuildingsDeck(3);
//		for (Building building : homeDeck) {
//			System.out.println(building);
//		}
//
//		System.out.println();
//		System.out.println();
//
//		List<Building> buildingDeck = deckManager.getGameLowCostBuildingsDeck();
//		for (Building building : buildingDeck) {
//			System.out.println(building);
//		}
//
//		System.out.println();
//		System.out.println();
//		
//		List<Building> buildingDeck2 = deckManager.getGameMidCostBuildingsDeck();
//		for (Building building : buildingDeck2) {
//			System.out.println(building);
//		}
//
//		System.out.println();
//		System.out.println();
//
//		List<Building> specialDeck = deckManager.getGameSpecialBuildingsDeck(3);
//		for (Building building : specialDeck) {
//			System.out.println(building);
//		}

		gameManager.newGame("Jean","Noémie","Callie");
		
	}

}
