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
		
		System.out.println("Informe um n�mero: ");
		numero1 = leitor.nextInt();
		System.out.println("Informe outro n�mero: ");
		numero2 = leitor.nextInt();
		
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
