package atividade;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {

		// ATRIBUTOS DA MINHA CLASSE CALCULADORA;
		double valor1;
		double valor2;
		double resultado;
		//INSTANCIANDO UM OBJETO DA CLASSE CALCULADORA E USANDO O SCANNER PARA COLETAR DADOS DO TECLADO;

		Calculadora c1 = new Calculadora();
		Scanner valores = new Scanner(System.in);
		System.out.println("Digite primeiro valor double");
		valor1 = valores.nextDouble();
		System.out.println("Digite segundo valor double");
		valor2 = valores.nextDouble();

		// CHAMANDO O MÉTODO SOMAR;
		c1.somar(valor1, valor2);
		System.out.println("O valor da soma " + c1.resultado);

		//CHAMANDO O MÉTODO SUBTRAIR;
		c1.subtrair(valor1, valor2);
		System.out.println("O valor da subtracao: " + c1.resultado);

		// CHAMANDO O MÉTODO MULTIPLICAR;
		c1.multiplicar(valor1, valor2);
		System.out.println("O valor da multiplicacao: " + c1.resultado);

		//  CHAMANDO O MÉTODO DA DIVIDIR;

		c1.dividir(valor1, valor2);
		System.out.println("O valor da divisao: " + c1.resultado);

	}

}
