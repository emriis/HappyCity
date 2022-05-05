package fr.av.dal.dao;

import java.util.List;

import fr.av.model.bll.bo.Building;

public interface DeckDao {

	List<Building> getBuildingCards(String deckName);

}
