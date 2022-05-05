package fr.av.model.bll.managers;

import fr.av.model.bll.bo.Player;

public interface PlayerManager {
	void buyBuilding();
	void updateMoney();
	void claimSpecialBuilding();
	Player getNewPlayer(String name,Integer PlayerNumber);
}
