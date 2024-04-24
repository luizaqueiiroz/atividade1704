package estruturaRepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, fat = 1;

		System.out.println("Informe o número que deseja fatorar:");
		num = ler.nextInt();

		for (int i =1; i <=num; i++) {
			fat = fat * i;


		}
		System.out.println("A fatoração do número é: " + fat);
		ler.close();
	}

}
