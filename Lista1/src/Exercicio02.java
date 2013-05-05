import java.util.Scanner;

/**
 * Exercicio 02
 * Faça um algoritmo que leia um número e mostre uma mensagem indicando se este 
 * número é par ou ímpar e se é positivo ou negativo.
 * 
 * @author Betto
 *
 */
public class Exercicio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Exercicio 02");
		
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um número: ");
		numero = leitor.nextInt();
		//Testando se o número é diferente de zero
		if(numero != 0){
			System.out.print("Este número é ");
			//Testando se o número é par ou impar
			if(numero % 2 == 0){
				System.out.print("par e ");
			}else{
				System.out.print("impar e ");
			}
			//Testando se o numero é positivo ou negativo
			if(numero > 0){
				System.out.print("positivo.");
			}else{
				System.out.print("negativo.");
			}
		}else{
			System.out.println("O número é zero");
		}
		leitor.close();
	}

}
