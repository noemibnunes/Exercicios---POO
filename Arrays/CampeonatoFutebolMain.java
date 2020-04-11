package Arrays;

import java.util.Arrays;

public class CampeonatoFutebolMain {
	public static void main(String[] args) {
		
		CampeonatoFutebol jogo = new CampeonatoFutebol();
		
		jogo.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		
		String[] jogos = jogo.criarCampeonato();
		System.out.println(Arrays.toString(jogos));
		
	}

}
