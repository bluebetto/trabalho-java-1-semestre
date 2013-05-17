import java.util.Scanner;

/**
 * Faça um programa que receba 2 valores numéricos. 
 * As entradas deverão ser validadas com tratamento de exceção. 
 * Ao final das entradas, o programa deverá apresentar a soma, 
 * subtração, divisão, multiplicação e potência dos valores.
 **/
public class Exercicio4 {

	public static void main(String[] args) {
		String recebido;
		float numero1, numero2;
		
		Scanner leitor = new Scanner(System.in);
		
		try{
			System.out.println("Informe o primeiro número:");
			recebido = leitor.nextLine();
			numero1 = Float.parseFloat(recebido);
			System.out.println("Informe o segundo número:");
			recebido = leitor.nextLine();
			numero2 = Float.parseFloat(recebido);
			
			System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
			System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
			System.out.println(numero1+" * "+numero2+" = "+(numero1*numero2));
			System.out.println(numero1+" ^ "+numero2+" = "+(Math.pow(numero1, numero2)));
			if(numero2 == 0) throw new ArithmeticException();
			System.out.println(numero1+" / "+numero2+" = "+(numero1/numero2));
		}catch(NumberFormatException e){
			System.out.println("Número inválido");
		}catch (ArithmeticException e) {
			System.out.println("Tentativa de divisão por Zero.");
		}finally{
			leitor.close();
		}
	}

}
