import java.util.Scanner;

/**
 * Faça um programa que solicita um valor para o usuário de uma medida em KMs. 
 * O programa deverá converter essa medida em metros e centímetros. Para cada 
 * conversão deverá ser criado um procedimento e o retorno dos mesmos deverá 
 * ser o valor convertido.
 **/
public class Ex40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float kilometros;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a kilometragem: ");
		kilometros = leitor.nextFloat();
		
		System.out.println("Metros: "+kmParaMetros(kilometros));
		System.out.println("Centimetros: "+kmParaCentimetros(kilometros));
		
		leitor.close();
	}
	
	public static float kmParaMetros(float kilometros){
		return kilometros * 1000;
	}
	
	public static float kmParaCentimetros(float kilometros){
		return kilometros * 1000 * 100;
	}

}
