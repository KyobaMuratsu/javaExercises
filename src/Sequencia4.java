
public class Sequencia4 {

	public static void main(String[] args) {
		float i = 0;
		
		while(i<=2) {
			for(int l = 0; l<3;l++) {
				float j = l + 1 + i;
				System.out.printf("I=%.1f", i); System.out.printf(" J=%.1f", j);
				System.out.println();
			}
			i += 0.2;
		}

		
	}

}
