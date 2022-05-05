package fr.av.model.bll.managers;

import fr.av.model.bll.bo.Building;

public interface BuildingManager {
	public Building getMarket();
	
	public Building getHomeBuilding(String name,Integer cost, Integer people);
}
