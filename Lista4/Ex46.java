/**
 * Fa�a um programa que explore pelo menos 5 m�todos de uma biblioteca 
 * escolhida por voc�. A chamada aos m�todos dever� ser feita diretamente 
 * no c�digo.
 * */
public class Ex46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" *** Biblioteca String ***");
		
		String curso = "Sistemas de Informa��o ";
		String ano = "2� ano";
		System.out.println("String.concat(): "+(curso.concat(ano))+" //Concatena a string fornecida");
		System.out.println("String.length(): "+curso.length()+" //Retorna o tamanho da String");
		System.out.println("String.startsWith(): "+curso.startsWith("Sis")+" //Compara se a String come�a com o argumento informado");
		System.out.println("String.substring(inicio, fim): "+curso.substring(0, 8)+" //Extrai um peda�o da String");
		System.out.println("String.toUpperCase(): "+curso.toUpperCase()+" //Converte todas os caracteres para maiusculo.");

	}

}
