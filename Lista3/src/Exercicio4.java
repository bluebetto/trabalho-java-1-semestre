import java.util.Scanner;

/**
 * Fa�a um programa que receba 2 valores num�ricos. 
 * As entradas dever�o ser validadas com tratamento de exce��o. 
 * Ao final das entradas, o programa dever� apresentar a soma, 
 * subtra��o, divis�o, multiplica��o e pot�ncia dos valores.
 **/
public class Exercicio4 {

	public static void main(String[] args) {
		String recebido;
		float numero1, numero2;
		
		Scanner leitor = new Scanner(System.in);
		
		try{
			System.out.println("Informe o primeiro n�mero:");
			recebido = leitor.nextLine();
			numero1 = Float.parseFloat(recebido);
			System.out.println("Informe o segundo n�mero:");
			recebido = leitor.nextLine();
			numero2 = Float.parseFloat(recebido);
			
			System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
			System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
			System.out.println(numero1+" * "+numero2+" = "+(numero1*numero2));
			System.out.println(numero1+" ^ "+numero2+" = "+(Math.pow(numero1, numero2)));
			if(numero2 == 0) throw new ArithmeticException();
			System.out.println(numero1+" / "+numero2+" = "+(numero1/numero2));
		}catch(NumberFormatException e){
			System.out.println("N�mero inv�lido");
		}catch (ArithmeticException e) {
			System.out.println("Tentativa de divis�o por Zero.");
		}finally{
			leitor.close();
		}
	}

}
