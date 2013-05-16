import java.util.Scanner;

/**
 * Fa�a um programa que receba como entrada um valor num�rico para se calcular 
 * o fatorial do mesmo. Caso o valor seja menor ou igual a zero dever� ser 
 * disparada uma exce��o criada pelo programador. Caso o valor n�o seja 
 * num�rico, dever� ser disparada a exce��o de problema de convers�o e 
 * apresentada a mensagem ao usu�rio.
 **/
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String recebido;
		int numero;
		int resultado = 1;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("*** Calculo de Fatorial ***");
		
		try{
			System.out.println("Informe um n�mero:");
			recebido = leitor.nextLine();
			numero = Integer.parseInt(recebido);
			
			if(numero <= 0) throw new CalculoFatorialInvalidoException();
			
			while(numero > 0){
				resultado *= numero--;
			}
			
			System.out.println("Fatorial: "+resultado);
			
		}catch(NumberFormatException e){
			System.out.println("O dado informado n�o � um n�mero!");
		}catch(CalculoFatorialInvalidoException e){
			System.out.println("Valor informado menor ou igual a zero");
		}finally{
			leitor.close();
		}
	}
}
