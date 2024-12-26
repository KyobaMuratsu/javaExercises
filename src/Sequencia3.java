
public class Sequencia3 {

	public static void main(String[] args) {
		int j = 7;
		int i = 1;
		
		while(i<=9) {
			for(int l = 0; l<3;l++) {
				System.out.println("I=" + i + " J=" + j);
				j -= 1;
			}
			j += 5;
			i += 2;
		}

	}

}
