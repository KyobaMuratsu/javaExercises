
public class Sequencia1 {

	public static void main(String[] args) {
//		I=1 J=60
//		I=4 J=55
//		I=7 J=50
		int j = 60;
		int i = 1; 
		
		while(j >= 0) {
			System.out.println("I=" + i + " J=" + j);
			j -= 5;
			i += 3;
		}
		
		
	}

}
