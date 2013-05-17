import java.util.Scanner;

/**
 * Faça um programa que receba uma temperatura em Celsius. O programa deverá 
 * converter essa temperatura para Kelvin (Celsius + 273.15) e para Fahrenheit 
 * (Celsius * 1,8 + 32). Para ambas as conversões deverão ser criadas funções 
 * que calculem e retornem o valor convertido.
 * */
public class Ex42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double temperatura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a temperatura: ");
		temperatura = leitor.nextDouble();
		
		System.out.println("Kelvin: "+celciusParaKelvin(temperatura));
		System.out.println("Fahrenheit: "+celciusParaFahrenheit(temperatura));
		
		leitor.close();

	}
	
	public static double celciusParaKelvin(double temperatura){
		return temperatura + 273.15;
	}
	
	public static double celciusParaFahrenheit(double temperatura){
		return (temperatura * 1.8 + 32);
	}
	
	

}
