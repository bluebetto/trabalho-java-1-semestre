import java.util.Scanner;

/**
 * 
 */

/**
 * Escrever um algoritmo para ler dois números. Se os números forem iguais imprimir a 
 * mensagem: “Números iguais” e encerrar a execução; caso contrário, imprimir o de 
 * maior valor, acompanhando pela mensagem “é maior número”.
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
		
		System.out.println("Informe um número: ");
		numero1 = leitor.nextInt(); //Recebendo o numero 1
		System.out.println("Informe outro número: ");
		numero2 = leitor.nextInt();//Recebendo o numero 2
		//Testando se os numeros são iguais
		if(numero1 == numero2){
			System.out.println("Números iguais");
			System.exit(0); //Encerrando a execução do programa
		}else{
			if(numero1 > numero2){
				System.out.println("O número "+numero1+" é maior");
			}else{
				System.out.println("O número "+numero2+" é maior");
			}
		}

	}

}
