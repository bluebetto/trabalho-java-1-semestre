import java.util.Scanner;

/**
 * Fa�a um programa que solicita um valor para o usu�rio. O programa dever� indicar 
 * se esse valor � zero, positivo ou negativo. Esse status dever� ser retornado em uma 
 * fun��o que ter� as seguintes sa�das:
 * 	a.	0 (Zero): Valor igual a zero.
 *	b.	1 (Um): Valor positivo.
 *	c.	-1 (Menos um): Valor negativo.
 * Depois que o valor do retorno for calculado, o programa dever� ter uma outra fun��o 
 * que imprimir� na tela o status do n�mero (De acordo com a tabela anterior). 
 **/

public class Ex41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numero;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		numero = leitor.nextInt();
		
		System.out.println("O numero �: ");
		imprimirStatus(posivitoOuNegativo(numero));
		
		leitor.close();
	}
	
	public static int posivitoOuNegativo(int numero){
		if(numero == 0) return 0;
		if(numero > 0){
			return 1;
		}else{
			return -1;
		}
	}
	
	public static void imprimirStatus(int status){
		if(status == 0) System.out.println("Valor igual a zero");
		if(status == -1) System.out.println("Valor negativo");
		if(status == 1) System.out.println("Valor positivo");
	}

}
