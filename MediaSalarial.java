package estruturaRepeticao;

import java.util.Scanner;

public class MediaSalarial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int salario, func, sal, soma=0;

		System.out.println("Informe quantos funcionários tem na sua empresa");
		func = ler.nextInt();

		for (int i = 1; i <= func; i++) {
			System.out.println("Informe qual o salário do funcionário");
			salario = ler.nextInt();
			soma += salario;

		}

		sal = soma/func;
		System.out.println ("A média salarial é R$" +sal);
		ler.close();
	}
}