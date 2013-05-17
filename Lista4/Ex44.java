/**
 * Fa�a um programa que realize a somat�ria da s�rie de Fibonacci. 
 * Se o usu�rio informar 3, dever�o ser somadas os 3 primeiros 
 * elementos da s�rie. A maneira do dado ser enviado para o 
 * programa dever� ser atrav�s do array "args" usado como par�metro
 * no m�todo main.
 * */
public class Ex44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Argumento n�o informado");
			System.exit(0);
		}
		int quantidade = Integer.parseInt(args[0]);
		int total = 0;
		
		for(int i = 1; i <= quantidade; i++) total += fibonacci(i);
		
		System.out.println("Valor: "+total);
			

	}
	
	public static int fibonacci(int n){
		if(n == 0) return 0;
		if(n <=2) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
