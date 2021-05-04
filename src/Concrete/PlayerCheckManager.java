package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean playerCheckRealPerson(Player player) {
		
		return true;
	}

}
