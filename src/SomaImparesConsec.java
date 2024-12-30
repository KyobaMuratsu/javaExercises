import java.util.Scanner;

public class SomaImparesConsec {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n = tec.nextInt();
		
		for(int i = 0; i<n;i++) {
			int x = tec.nextInt();
			int y = tec.nextInt();
			int somaImpares = 0;
			
			if(x < y) {
				int repeticoes = y - x;
				for(int j = 1;j<repeticoes;j++) {
					int numerosImpares = (x+j) % 2;
					if(numerosImpares == 1) {
						somaImpares += x+j; 
					}
				}
			}else
			if(x > y) {
				int repeticoes = x - y;
				for(int j = 1;j<repeticoes;j++) {
					int numerosImpares = (y+j) % 2;
					if(numerosImpares == 1) {
						somaImpares += y+j; 
					}
				}
			}
			
			System.out.println(somaImpares);
		}

		tec.close();
	}

}
