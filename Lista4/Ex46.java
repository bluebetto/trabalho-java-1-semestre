/**
 * Faça um programa que explore pelo menos 5 métodos de uma biblioteca 
 * escolhida por você. A chamada aos métodos deverá ser feita diretamente 
 * no código.
 * */
public class Ex46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" *** Biblioteca String ***");
		
		String curso = "Sistemas de Informação ";
		String ano = "2º ano";
		System.out.println("String.concat(): "+(curso.concat(ano))+" //Concatena a string fornecida");
		System.out.println("String.length(): "+curso.length()+" //Retorna o tamanho da String");
		System.out.println("String.startsWith(): "+curso.startsWith("Sis")+" //Compara se a String começa com o argumento informado");
		System.out.println("String.substring(inicio, fim): "+curso.substring(0, 8)+" //Extrai um pedaço da String");
		System.out.println("String.toUpperCase(): "+curso.toUpperCase()+" //Converte todas os caracteres para maiusculo.");

	}

}
