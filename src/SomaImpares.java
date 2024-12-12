import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numeroX = tec.nextInt();
		int numeroY = tec.nextInt();
		int cont = 0;
		int sum = 1;
		
		if(numeroX > numeroY) {
			while(numeroY<numeroX) {
				numeroY = numeroY + sum;
				if(numeroY==numeroX) {
					break;
				}
				int imparPar = numeroY % 2; 
				if(imparPar == 1 || imparPar == -1) {
					cont += numeroY;
				}
			}
		}
		
		if(numeroY > numeroX) {
			while(numeroX<numeroY) {
				numeroX = numeroX + sum;
				if(numeroX==numeroY) {
					break;
				}
				int imparPar = numeroX % 2; 
				if(imparPar == 1 || imparPar == -1) {
					cont += numeroX;
				}
			}
		}
		
		System.out.println(cont);

	}

}
