import java.util.Scanner;


/**
 * Faça um programa que realize a divisão de dois números. 
 * O programa deverá tratar divisões por zero. Independente 
 * da divisão ocorrer ou não, no final do programa deverá 
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
			
			System.out.println("O resultado da divisão "+dividendo+" / "+divisor+"  é "+resultado);
			
		}catch(ArithmeticException e){
			System.out.println("Erro: Tentativa de divisão por Zero.");
		}finally{
			System.out.println("Final do programa.");
			leitor.close();
		}
		

	}

}
