package Arrays;

public class CampeonatoFutebol {
	String [] times;
	
	public void adicionarTimes(String times) {
		this.times = times.split(" ");
		
	}
	
	public String[] criarCampeonato() {
		int quantidadeJogos = (this.times.length - 1) * 2;
		String[] campeonato = new String[quantidadeJogos ];
		
		int indiceCampeonato = 0;
		
		for (int iCasa = 0; iCasa < times.length - 1; iCasa++) {
			String timeCasa = times[iCasa];
			for (int iFora = iCasa + 1; iFora < times.length; iFora++) {
				String timeFora = times[iFora];
				
				campeonato[indiceCampeonato] = timeCasa + " X " + timeFora;
				indiceCampeonato++;
			}
		}return campeonato;
	} 

}
