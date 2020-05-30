package questao7.excecoes;

import java.util.Date;
import java.util.GregorianCalendar;

public class Alarme {
	private int hora;
	private int minuto;

	public Alarme(int hora, int minuto) throws HoraInvalidaException, MinutoInvalidoException {
		
		this.hora = hora;
		this.minuto = minuto;
		
		if (hora < 0 || hora > 23) {
			throw new HoraInvalidaException();
		} else if (minuto < 0 || minuto > 59) {
			throw new MinutoInvalidoException();
		} 
		
	}

	public boolean isAgora() {
		GregorianCalendar agora = new GregorianCalendar();
		agora.setTime(new Date());
		return this.hora == agora.get(GregorianCalendar.HOUR_OF_DAY)
				&& this.minuto == agora.get(GregorianCalendar.MINUTE);
	}
}