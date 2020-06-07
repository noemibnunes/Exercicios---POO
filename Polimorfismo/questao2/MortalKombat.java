package Polimorfismo.questao2;

import java.util.Random;

public class MortalKombat {
	
	private Lutador l1, l2;
	
	public MortalKombat (Lutador l1, Lutador l2) {
		this.l1 = l1;
		this.l2 = l2;
		fight();
	}
	
	public void fight() {
		
		while (l1.getVida() > 0 || l2.getVida() > 0) {
			
			Random aleatorio = new Random();
			int jogador = aleatorio.nextInt(2);
			
			Random ataqueSort = new Random();
			int ataque = ataqueSort.nextInt(2);
			
			Lutador vezJogador;
			
			switch (jogador) {
			
			case 0:
			
				vezJogador = l1;
				
				if (l1.getNome().equals("Jax")) {
					l1.chutar(l2);
				} 
				
				else if (l1.getNome().equals("NightWolf")) {
					
					if (ataque == 0) {
						l1.atirar(l2);
					}else if (ataque == 1) {
						l1.lancarMagia(l2);
					}
				}
				
				else if (l1.getNome().equals("SubZero")) {
					l1.lancarMagia(l2);
				}
				
				else if (l1.getNome().equals("Rayden")) {
					l1.lancarMagia(l2);
				}
				
				else if (l1.getNome().equals("Liu Kang")) {
					
					if (ataque == 0) {
						l1.chutar(l2);
					} else if (ataque == 1) {
						l1.lancarMagia(l2);
					}
				}
				
				else if (l1.getNome().equals("Sônia")) {
					
					if(ataque == 0) {
						l1.chutar(l2);
					} else if (ataque == 1) {
						l1.socar(l2);
					}
				}
			
				break;
			
			case 1:
			
				vezJogador = l2;
				
				if (l2.getNome().equals("Jax")) {
					l2.socar(l1);
				} 
			
				else if (l2.getNome().equals("NightWolf")) {
					
					if (ataque == 0) {
						l2.atirar(l1);

					} else if (ataque == 1) {
						l2.lancarMagia(l1);
					}
				}
				
				else if (l2.getNome().equals("SubZero")) {
					l2.lancarMagia(l1);
				}
				
				else if (l2.getNome().equals("Rayden")) {
					l2.lancarMagia(l1);
				}
				
				else if (l2.getNome().equals("Liu Kang")) {
					
					if (ataque == 0) {
						l2.chutar(l1);
					} else if (ataque == 1) {
						l2.lancarMagia(l1);
					} 
				
				}
				
				else if (l2.getNome().equals("Sônia")) {
					
					if(ataque == 0) {
						l2.chutar(l1);
						
					} else if (ataque == 1) {
						l2.socar(l1);
					}
				}
				
				break;	
			}
		}
	}
	
	public String fimFight() {
		String vencedor = null;
		if(l1.getVida() < 0) {
			vencedor = l2.getNome();
		} else if (l2.getVida() < 0) {
			vencedor = l1.getNome();
		}
		return vencedor;
	}


	
	public static void main(String[] args) {
		
		Lutador l1 = new Lutador ("NightWolf");
		Lutador l2 = new Lutador ("Jax");
	
		MortalKombat luta1 = new MortalKombat(l1, l2);
		String vencedor = luta1.fimFight();
		
		System.out.println("O vencedor da partida foi: " + vencedor);
	}
}
