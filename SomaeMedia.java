package estruturaRepeticao;

import java.util.Scanner;

public class SomaeMedia {

	public static void main(String[] args) {
		int soma = 0, media, num;

		Scanner ler = new Scanner (System.in);


		for (int i =1; i<=5; i++) {
			System.out.println("Informe o valor da nota: ");
			num = ler.nextInt();
			soma += num;
		}

		media = soma/5;
		System.out.println("A soma das notas é: " + soma);
		System.out.println("A média das notas é: " + media);

		ler.close();
	}

}


