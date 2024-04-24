package estruturaRepeticao;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int somapar = 0, somaimpar = 0, num;

		for (int i = 1; i <= 10; i++){
			System.out.println("Informe o valor: ");
			num = ler.nextInt();

			if (num %2 == 0 ) {
				somapar += num;

			}
			else {
				somaimpar += num;

			}
			
		}
		System.out.println("A soma dos números pares é: " + somapar);
		System.out.println("A soma dos números ímpares é: " + somaimpar);
		ler.close();
	}

}

