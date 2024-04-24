package estruturaRepeticao;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		int inicial, fim;

		Scanner ler = new Scanner(System.in);


		System.out.println("Informe o valor inicial do intervalo de número que você deseja descobrir quais são ímpares");
		inicial = ler.nextInt();

		System.out.println("Informe o valor final do intervalo de número que você deseja descobrir quais são ímpares");
		fim = ler.nextInt();

		System.out.println("Os números ímpares presentes nesse intervalo são: " );
		for (int i =inicial; i<=fim; i++) {

			if (i %2 == 1) {	
				System.out.println(i);

			}

		}
		ler.close();
	}
}

