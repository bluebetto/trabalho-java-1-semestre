import java.awt.font.NumericShaper;
import java.util.Scanner;

/**
 * Fa�a um programa que receba como entrada um valor. Caso esse 
 * valor seja num�rico, apresentar a mensagem "Valor num�rico". 
 * Sen�o, apresentar a mensagem: "Valor n�o num�rico".
 **/
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String recebido;
		float numero;
		
		Scanner leitor  = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		recebido = leitor.nextLine();
		
		try{
			numero = Float.parseFloat(recebido);
			
			System.out.println("Valor n�merico.");
			System.out.println("Valor: "+numero);
		}catch(NumberFormatException e){
			System.out.println("Valor n�o n�merico");
		}finally{
			leitor.close();
		}
	}
}
