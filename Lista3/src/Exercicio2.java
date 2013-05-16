import java.util.Scanner;


/**
 * Fa�a um programa que realize a divis�o de dois n�meros. 
 * O programa dever� tratar divis�es por zero. Independente 
 * da divis�o ocorrer ou n�o, no final do programa dever� 
 * ser apresentada a mensagem "Final do programa."
 **/
public class Exercicio2 {

	
	public static void main(String[] args) {
		float dividendo, divisor, resultado;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Informe o dividendo:");
		dividendo = leitor.nextFloat();
		
		System.out.println("Informe o divisor:");
		divisor = leitor.nextFloat();
		
		try{
			if(divisor == 0) throw new ArithmeticException();
			
			resultado = dividendo / divisor;
			
			System.out.println("O resultado da divis�o "+dividendo+" / "+divisor+"  � "+resultado);
			
		}catch(ArithmeticException e){
			System.out.println("Erro: Tentativa de divis�o por Zero.");
		}finally{
			System.out.println("Final do programa.");
			leitor.close();
		}
		

	}

}
