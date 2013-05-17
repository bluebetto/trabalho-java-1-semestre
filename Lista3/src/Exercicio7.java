import java.util.Scanner;

/**
 * Fa�a um programa solicite ao usu�rio o tamanho do array (do tipo inteiro) 
 * a ser utilizado. Depois disso, enquanto houver espa�o reservado no array, 
 * dever� ser permitida a inser��o de elementos no mesmo. O programa dever� 
 * ter dois tipos de tratamento de erro. O primeiro � tratar para que somente 
 * valores do tipo inteiro sejam inseridos no array. O segundo dever� parar o
 * programa quando se estourar a quantidade de elemento, observe que n�o 
 * dever� ser verificada a quantidade de elementos pelo comprimento do 
 * mesmo, todavia, dever� ser criado um la�o infinito que v� permitindo a 
 * inser��o dos elementos at� essa exce��o ser acionada.
 * */
public class Exercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lista;
		int tamanho;
		String recebido;
		int i = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da lista: ");
		tamanho = leitor.nextInt();
		System.out.println();
		lista = new int[tamanho];
		recebido = leitor.nextLine();
		while(true){
			try {
				System.out.print("Informe o numero array["+i+"]: ");
				recebido = leitor.nextLine();
				
				lista[i++] = Integer.parseInt(recebido);
			} catch (NumberFormatException e) {
				System.out.println("Erro! O dado fornecido n�o � um n�mero inteiro v�lido");
				i--;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Erro! N�o h� mais espa�o na lista!");
				System.out.println("Numeros na lista:");
				for(int j = 0;j<lista.length;j++) System.out.print(lista[j]+" ");
				leitor.close();
				System.exit(0);
			}
		}
		
		
		

	}

}
