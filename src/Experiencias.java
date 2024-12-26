import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int quantidadeCobaias = tec.nextInt();
		
		int quantidadeTotalCobaias = 0;
		
		int quantidadeTotalCoelhos = 0;
		int quantidadeTotalRatos = 0;
		int quantidadeTotalSapos = 0;
		
		if(quantidadeCobaias <= 15 || quantidadeCobaias >= 1) {
			tec.nextLine();
			for(int i = 0; i < quantidadeCobaias;i++) {
				String cobaia = tec.nextLine();
				int quantidade = 0;
				char tipocobaia;
				if(cobaia.length() > 3) {
					quantidade = Integer.parseInt(cobaia.substring(0, 2));
					tipocobaia = cobaia.charAt(3);
				}else {
				quantidade = Integer.parseInt(cobaia.substring(0, 1));
				tipocobaia = cobaia.charAt(2);
				}
				quantidadeTotalCobaias += quantidade;
				
				switch (tipocobaia) {
				case 'C': {
					quantidadeTotalCoelhos += quantidade;
					break;
				}
				case 'R': {
					quantidadeTotalRatos += quantidade;
					break;
				}
				case 'S': {
					quantidadeTotalSapos += quantidade;
					break;
				}
				default:
				}
			}	
		}
		
		double porcentagemCoelho = ((double)quantidadeTotalCoelhos / (double)quantidadeTotalCobaias) * 100;
		double porcentagemRatos = ((double)quantidadeTotalRatos / (double)quantidadeTotalCobaias) * 100;
		double porcentagemSapos = ((double)quantidadeTotalSapos / (double)quantidadeTotalCobaias) * 100;
		
		System.out.println("Total: " + quantidadeTotalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + quantidadeTotalCoelhos);
		System.out.println("Total de ratos: " + quantidadeTotalRatos);
		System.out.println("Total de sapos: " + quantidadeTotalSapos);
	    System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelho);
	    System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRatos);
	    System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapos);
		
		tec.close();
	}

}
