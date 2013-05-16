import java.awt.font.NumericShaper;
import java.util.Scanner;

/**
 * Faça um programa que receba como entrada um valor. Caso esse 
 * valor seja numérico, apresentar a mensagem "Valor numérico". 
 * Senão, apresentar a mensagem: "Valor não numérico".
 **/
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String recebido;
		float numero;
		
		Scanner leitor  = new Scanner(System.in);
		System.out.println("Digite um número:");
		recebido = leitor.nextLine();
		
		try{
			numero = Float.parseFloat(recebido);
			
			System.out.println("Valor númerico.");
			System.out.println("Valor: "+numero);
		}catch(NumberFormatException e){
			System.out.println("Valor não númerico");
		}finally{
			leitor.close();
		}
	}
}
