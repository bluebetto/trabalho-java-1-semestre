import java.util.Scanner;

/**
 * 
 */

/**
 * Escrever um algoritmo para ler dois n�meros. Se os n�meros forem iguais imprimir a 
 * mensagem: �N�meros iguais� e encerrar a execu��o; caso contr�rio, imprimir o de 
 * maior valor, acompanhando pela mensagem �� maior n�mero�.
 * @author Betto
 *
 */
public class Exercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Exercicio 01");
		Scanner leitor = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Informe um n�mero: ");
		numero1 = leitor.nextInt(); //Recebendo o numero 1
		System.out.println("Informe outro n�mero: ");
		numero2 = leitor.nextInt();//Recebendo o numero 2
		//Testando se os numeros s�o iguais
		if(numero1 == numero2){
			System.out.println("N�meros iguais");
			System.exit(0); //Encerrando a execu��o do programa
		}else{
			if(numero1 > numero2){
				System.out.println("O n�mero "+numero1+" � maior");
			}else{
				System.out.println("O n�mero "+numero2+" � maior");
			}
		}

	}

}
