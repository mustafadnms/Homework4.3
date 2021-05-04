package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	
	PlayerCheckService checkService;
	
	public PlayerManager(PlayerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Player player) {
		
		if(checkService.playerCheckRealPerson(player)) {
			System.out.println("Oyuncu sisteme kaydedildi: "+ player.getFirstName());
		}else {
			System.out.println("Oyuncu doğrulanamadı: "+ player.getFirstName());
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu bilgileri güncellendi: "+ player.getFirstName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi : "+ player.getFirstName());
		
	}

}
