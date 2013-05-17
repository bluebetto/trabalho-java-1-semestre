import java.util.Scanner;

/**
 * Faça um programa solicite ao usuário o tamanho do array (do tipo inteiro) 
 * a ser utilizado. Depois disso, enquanto houver espaço reservado no array, 
 * deverá ser permitida a inserção de elementos no mesmo. O programa deverá 
 * ter dois tipos de tratamento de erro. O primeiro é tratar para que somente 
 * valores do tipo inteiro sejam inseridos no array. O segundo deverá parar o
 * programa quando se estourar a quantidade de elemento, observe que não 
 * deverá ser verificada a quantidade de elementos pelo comprimento do 
 * mesmo, todavia, deverá ser criado um laço infinito que vá permitindo a 
 * inserção dos elementos até essa exceção ser acionada.
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
				System.out.println("Erro! O dado fornecido não é um número inteiro válido");
				i--;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Erro! Não há mais espaço na lista!");
				System.out.println("Numeros na lista:");
				for(int j = 0;j<lista.length;j++) System.out.print(lista[j]+" ");
				leitor.close();
				System.exit(0);
			}
		}
		
		
		

	}

}
