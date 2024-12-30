import java.util.ArrayList;
import java.util.Scanner;

public class SequelandSum {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n = tec.nextInt();
		int m = tec.nextInt();
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		ArrayList<Integer> mList = new ArrayList<Integer>();
		
		while(n != 0 && m != 0 && n > 0 && m > 0) {
			nList.add(n);
			mList.add(m);
			
			n = tec.nextInt();
			m = tec.nextInt();
		}
		
		for(int i = 0;i<nList.size();i++) {
			int numberN = nList.get(i);
			int numberM = mList.get(i);
			
			if(numberN < numberM) {
				int repeticoes = numberM - numberN;
				int total = 0;
				for(int j = 0;j<=repeticoes;j++) {
					total += numberN+j;
					System.out.print(numberN+j + " ");
				}
				System.out.println("Sum=" + total);
			}
			
			if(numberM < numberN) {
				int repeticoes = numberN - numberM;
				int total = 0;
				for(int j = 0;j<=repeticoes;j++) {
					total += numberM+j;
					System.out.print(numberM+j + " ");
				}
				System.out.println("Sum=" + total);
			}
		}
		
		tec.close();
	}

}
