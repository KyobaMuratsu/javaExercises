
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TempodeEvento {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String diaInicialEntrada = tec.nextLine();
		String tempoInicialEntrada = tec.nextLine();
		
		String diaFinalEntrada = tec.nextLine();
		String tempoFinalEntrada = tec.nextLine();
		
		int diaInicialTexto = Integer.parseInt(diaInicialEntrada.substring(4));
		int horaInicialTexto = Integer.parseInt(tempoInicialEntrada.substring(0, 2));
		int minutoInicialTexto = Integer.parseInt(tempoInicialEntrada.substring(5, 7));
		int segundoInicialTexto = Integer.parseInt(tempoInicialEntrada.substring(10, 12));
		
		int diaFinalTexto = Integer.parseInt(diaFinalEntrada.substring(4));
		int horaFinalTexto = Integer.parseInt(tempoFinalEntrada.substring(0, 2));
		int minutoFinalTexto = Integer.parseInt(tempoFinalEntrada.substring(5, 7));
		int segundoFinalTexto = Integer.parseInt(tempoFinalEntrada.substring(10, 12));
		
		LocalDateTime DataInicial = LocalDateTime.of(2024, Month.APRIL, diaInicialTexto, horaInicialTexto,
													 minutoInicialTexto, segundoInicialTexto);
		
		LocalDateTime DataFinal = LocalDateTime.of(2024, Month.APRIL, diaFinalTexto, horaFinalTexto,
				 									 minutoFinalTexto, segundoFinalTexto);
		
		long dia = ChronoUnit.DAYS.between(DataInicial, DataFinal);
		
		long segundos = ChronoUnit.SECONDS.between(DataInicial, DataFinal);
		long hours = TimeUnit.SECONDS.toHours(segundos);
		long minutes = TimeUnit.SECONDS.toMinutes(segundos);
		
		System.out.println(dia + " dia(s)");
		System.out.println(hours%24 + " hora(s)");
		System.out.println(minutes%60 + " minuto(s)");
		System.out.println(segundos%60 + " segundo(s)");
		
		tec.close();
	}

}
