import java.util.Scanner;

/**
 * 
 */

/**
 * Exercicio 01
 * Escrever um algoritmo para ler dois valores num�ricos e apresentar qual � o maior
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
		
		System.out.println("Informe um n�mero: ");
		numero1 = leitor.nextInt(); //Recebendo o numero 1
		System.out.println("Informe outro n�mero: ");
		numero2 = leitor.nextInt();//Recebendo o numero 2
		
		//Se o primeiro � maior que o segundo
		if(numero1 > numero2){
			System.out.println("O primeiro n�mero � maior");
		}else if(numero2 > numero1){
			System.out.println("O segundo n�mero � maior");
		}else{
			System.out.println("Os n�meros s�o iguais");
		}
		
		leitor.close();
	}

}
