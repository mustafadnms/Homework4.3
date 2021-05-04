package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Player player) {
		System.out.println("Oyun satýn alýndý : "+game.getName() + player.getUserName());
		
	}

	@Override
	public void addCampaing(Game game, Campaign campaign) {
		System.out.println("Kampanya eklendi : "+ game.getName() + campaign.getCampaingName());
		
	}

	@Override
	public void updateCampaign(Game game, Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi : "+ game.getName() + campaign.getCampaingName());
		
	}

	@Override
	public void deleteCampaign(Game game, Campaign campaign) {
		System.out.println("Kampanya silindi : "+ game.getName() + campaign.getCampaingName());
		
	}

}
