package atividade;

public class Calculadora {
	// ATRIBUTOS;
	double somar, subtrair, multiplicar, dividir;
	double resultado;

	// CRIANDO MÉTODO SOMAR;
	public int somar(double valor1, double valor2) {
		this.resultado = valor1 + valor2;
		return (int) resultado;

	}

	// CRIANDO MÉTODO SUBTRACAO
	public int subtrair(double valor3, double valor4) {
		this.resultado = valor3 - valor4;
		return (int) resultado;
	}

	// CRIANDO MÉTODO MULTIPLICACAO;
	public int multiplicar(double valor1, double valor2) {
		this.resultado = valor1 * valor2;
		return (int) resultado;
	}

	// CRIANDO MÉTODO DIVISAO;
	public int dividir(double valor1, double valor2) {
		this.resultado = valor1 / valor2;
		return (int) resultado;
	}

}
