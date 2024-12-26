
public class Sequencia2 {

	public static void main(String[] args) {
//		I=1 J=7
//		I=1 J=6
//		I=1 J=5
//		I=3 J=7
//		I=3 J=6
//		I=3 J=5
		
		int j = 7;
		int i = 1;
		
		while(i<=9) {
			for(int l = 0; l<3;l++) {
				System.out.println("I=" + i + " J=" + j);
				j -= 1;
			}
			if(j == 4) {
				j = 7;
				i += 2;
			}
		}
		

	}

}
