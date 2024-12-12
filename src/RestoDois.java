import java.util.Scanner;

public class RestoDois {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int divisor = tec.nextInt();
		
		for(int i = 1; i<10000;i++) {
			int verificador = i % divisor;
			if(verificador == 2) {
				System.out.println(i);
			}
		}
		tec.close();
	}

}
