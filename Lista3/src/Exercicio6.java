import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcao;
		No exemplo_null;
		String numero_falso = "a";
		
		Date data;
		SimpleDateFormat formatador_data = new SimpleDateFormat("yyyy-MM-dd HH:mm:SSSS");
		
		int[] array = new int[3];
		int numero;
		
		
		Scanner leitor = new Scanner(System.in);
		while(true){
			try{
				System.out.println();
				System.out.println("Selecione a exceção a ser disparada:");
				System.out.println("1 - NullPointer");
				System.out.println("2 - ArrayIndexOutOfBounds");
				System.out.println("3 - NumberFormatException");
				System.out.println("4 - ParseException");
				System.out.println();
				System.out.println("5 - Sair");
				System.out.println();
				System.out.print("Opcao:");
				opcao = leitor.nextInt();
				
				
				
				switch(opcao){
					case 1:
						exemplo_null = new No();
						//Vai disparar um NullPointerException
						exemplo_null.getProximo().getAnterior();
					break;
					case 2:
						System.out.println(array[4]);
					break;
					case 3:
						//Vai falhar ao tentar converter "a" em inteiro
						numero = Integer.parseInt(numero_falso);
					break;
					case 4:
						//Vai falhar ao tentar converter "a" em Data
						data = formatador_data.parse(numero_falso);
					break;
					default:
						leitor.close();
						System.exit(0);
					break;
				}
				
			}catch(NullPointerException e){
				System.out.println("* Erro!! Uma variavel não inicializada foi acessada!");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("* Erro!! Tentativa de acesso fora do range na variavel array!");
			}catch(NumberFormatException e){
				System.out.println("* Erro!! Impossivel converter \""+numero_falso+"\" em inteiro!");
			}catch(ParseException e){
				System.out.println("* Erro!! Impossivel converter \""+numero_falso+"\" em Data!");
			}
			
		}

	}

}
