package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameService {
	
	void sellGame(Game game, Player player);
	void addCampaing(Game game, Campaign campaign);
	void updateCampaign(Game game, Campaign campaign);
	void deleteCampaign(Game game, Campaign campaign);
	
}
