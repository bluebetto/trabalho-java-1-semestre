/**
 * Faça um programa que realize a somatória da série de Fibonacci. 
 * Se o usuário informar 3, deverão ser somadas os 3 primeiros 
 * elementos da série. A maneira do dado ser enviado para o 
 * programa deverá ser através do array "args" usado como parâmetro
 * no método main.
 * */
public class Ex44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Argumento não informado");
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
