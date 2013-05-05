import java.util.Scanner;

/**
 * 
 */

/**
 * Exercicio 01
 * Escrever um algoritmo para ler dois valores numéricos e apresentar qual é o maior
 * @author Betto
 *
 */
public class Exercicio01 {

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
		
		//Se o primeiro é maior que o segundo
		if(numero1 > numero2){
			System.out.println("O primeiro número é maior");
		}else if(numero2 > numero1){
			System.out.println("O segundo número é maior");
		}else{
			System.out.println("Os números são iguais");
		}
		
		leitor.close();
	}

}
