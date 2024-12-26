
public class Sequencia4 {

	public static void main(String[] args) {
		double i = 0;
		double somador = 2.0 / 10.0;
		
		while(i<=2) {
			double verificar = (Math.round(i * Math.pow(10, 1)) / Math.pow(10, 1)) % 1;
			if(verificar == 0) {
				for(int l = 0; l<3;l++) {
					double j = l + 1 + i;
					System.out.printf("I=%.0f", i); System.out.printf(" J=%.0f", j);
					System.out.println();
				}
				i += somador;
			}else {
				for(int l = 0; l<3;l++) {
					double j = l + 1 + i;
					System.out.printf("I=%.1f", i); System.out.printf(" J=%.1f", j);
					System.out.println();
				}
				i += somador;	
			}
		}

		
	}

}
