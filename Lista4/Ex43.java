import java.util.Scanner;

/**
 * Utilizando a sobrecarga de m�todos, crie 3 m�todos que realizem a 
 * soma dos valores de entrada e possuam o nome "somatoria". 
 * O primeiro m�todo dever� receber como entrada 2 par�metros. 
 * O segundo dever� receber como entrada 3 par�metros. 
 * O terceiro m�todo dever� receber como entrada um vetor de elementos. 
 * Para todos os m�todos, os par�metros de entrada dever�o ser do tipo 
 * float e o retorno das referidas fun��es tamb�m.
 * */
public class Ex43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float numero1, numero2, numero3;
		float[] numeros = new float[3];
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o numero1: ");
		numero1 = leitor.nextFloat();
		numeros[0] = numero1;
		System.out.println("Informe o numero2: ");
		numero2 = leitor.nextFloat();
		numeros[1] = numero2;
		System.out.println("Informe o numero3: ");
		numero3 = leitor.nextFloat();
		numeros[2] = numero3;
		
		System.out.println(numero1+" + "+numero2+" = "+somatoria(numero1,numero2));
		System.out.println(numero1+" + "+numero2+" + "+numero3+" = "+somatoria(numero1,numero2,numero3)+" (3 parametros)");
		System.out.println("somatoria(numeros) = "+somatoria(numeros)+" (Vetor de floats)");
		
		
		leitor.close();
	}
	
	public static float somatoria(float numero1, float numero2){
		return numero1+numero2;
	}
	
	public static float somatoria(float numero1, float numero2, float numero3){
		return numero1+numero2+numero3;
	}
	
	public static float somatoria(float numeros[]){
		float total = 0;
		for(int i=0; i < numeros.length; i++) total += numeros[i];
		return total;
	}

}
