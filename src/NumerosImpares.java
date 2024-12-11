import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int numeroInicial = tec.nextInt();
		
		if(numeroInicial >=1) {
			for(int i = 0; i<=numeroInicial;i++) {
				int verificarNumero = i%2;
				if(verificarNumero == 1) {
					System.out.println(i);	
				}
			}	
		}
		
		tec.close();
	}

}
