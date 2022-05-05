package fr.av.model.bll.managers;

import fr.av.model.bll.bo.Building;

public class BuildingManagerImpl implements BuildingManager {
	private static BuildingManager instance = null;
	
	
	public static BuildingManager getInstance() {
		if(instance == null) {
			instance = new BuildingManagerImpl();
		}
		return instance;
	}
	
	
	private BuildingManagerImpl() {

	}
	
	@Override
	public Building getMarket() {
		//TO DO
		return new Building();
	}
	
	public Building getHomeBuilding(String name,Integer cost, Integer people) {
		//TO DO
		return new Building();
	}
}
