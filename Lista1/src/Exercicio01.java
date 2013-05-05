import java.util.Scanner;

/**
 * 
 */

/**
 * @author Betto
 *
 */
public class Exercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Informe um número: ");
		numero1 = leitor.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = leitor.nextInt();
		
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
