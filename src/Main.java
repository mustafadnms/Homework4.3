import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1,"Mehmet","Yýldýz","28861499108",new Date(1985,1,6),"Ali87","ali@gmail.com");
		
		Game game = new Game(1, "Crysis 2", "Türk yapýmý oyun", 200);
		
		Campaign campaign = new Campaign(1, "Fýrsat ürünü", "Kampanya detay");
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);
		playerManager.update(player);
		playerManager.delete(player);
		
		GameManager gameManager = new GameManager();
		
		gameManager.addCampaing(game, campaign);
		gameManager.sellGame(game, player);
		gameManager.updateCampaign(game, campaign);
		gameManager.deleteCampaign(game, campaign);

	}

}
