import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class NotaseMoedas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
		double[] quantidadeNotas = new double[6];
		
		double[] moedas = {1, 0.5, 0.25, 0.10, 0.05, 0.01};
		double[] quantidadeMoedas = new double[6];
		
		double valorEntrada = tec.nextFloat();
		
		int index = 0;
		while(true) {
			quantidadeNotas[index] = Math.floor(valorEntrada / notas[index]);
			valorEntrada = valorEntrada % notas[index];
			if(index==5) {
				index = 0;
				break;
			}
			index++;
		}
		
		while(true) {
			valorEntrada = Math.round(valorEntrada *100);
			valorEntrada = valorEntrada / 100;
			quantidadeMoedas[index] = Math.floor(valorEntrada / moedas[index]);
			valorEntrada = valorEntrada % moedas[index];
			if(index==5) {
				break;
			}
			index++;
		}
		
		System.out.println("NOTAS:");
		for(int i = 0; i<quantidadeNotas.length;i++) {
			System.out.printf("%.0f", quantidadeNotas[i]); System.out.printf(" nota(s) de R$ %.2f", notas[i]);
			System.out.println();
		}
		
		System.out.println("MOEDAS:");
		for(int i = 0; i<quantidadeMoedas.length;i++) {
			System.out.printf("%.0f", quantidadeMoedas[i]); System.out.printf(" moedas(s) de R$ %.2f", moedas[i]);
			System.out.println();
		}
		
		tec.close();
	}

}
