import java.util.Scanner;

/**
 * Faça um programa que receba como entrada um valor numérico para se calcular 
 * o fatorial do mesmo. Caso o valor seja menor ou igual a zero deverá ser 
 * disparada uma exceção criada pelo programador. Caso o valor não seja 
 * numérico, deverá ser disparada a exceção de problema de conversão e 
 * apresentada a mensagem ao usuário.
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
			System.out.println("Informe um número:");
			recebido = leitor.nextLine();
			numero = Integer.parseInt(recebido);
			
			if(numero <= 0) throw new CalculoFatorialInvalidoException();
			
			while(numero > 0){
				resultado *= numero--;
			}
			
			System.out.println("Fatorial: "+resultado);
			
		}catch(NumberFormatException e){
			System.out.println("O dado informado não é um número!");
		}catch(CalculoFatorialInvalidoException e){
			System.out.println("Valor informado menor ou igual a zero");
		}finally{
			leitor.close();
		}
	}
}
