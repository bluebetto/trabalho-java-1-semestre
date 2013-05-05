import java.util.Scanner;

/**
 * Exercicio 02
 * Fa�a um algoritmo que leia um n�mero e mostre uma mensagem indicando se este 
 * n�mero � par ou �mpar e se � positivo ou negativo.
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
		
		System.out.println("Informe um n�mero: ");
		numero = leitor.nextInt();
		//Testando se o n�mero � diferente de zero
		if(numero != 0){
			System.out.print("Este n�mero � ");
			//Testando se o n�mero � par ou impar
			if(numero % 2 == 0){
				System.out.print("par e ");
			}else{
				System.out.print("impar e ");
			}
			//Testando se o numero � positivo ou negativo
			if(numero > 0){
				System.out.print("positivo.");
			}else{
				System.out.print("negativo.");
			}
		}else{
			System.out.println("O n�mero � zero");
		}
		leitor.close();
	}

}
