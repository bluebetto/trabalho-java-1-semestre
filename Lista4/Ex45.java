/**
 * Faça um programa que explore pelo menos 15 métodos da biblioteca Math. 
 * A chamada aos métodos deverá ser feita diretamente no código.
 * */
public class Ex45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int negativo = -5;
		int numero = 2;
		int potencia = 3;
		double decimal = 7.2;
		
		
		System.out.println("Math.abs("+negativo+"): "+Math.abs(negativo)+" //Retorna o valor absoluto.");
		System.out.println("Math.pow("+numero+","+potencia+"): "+Math.pow(numero, potencia)+" //Eleva o numero a potencia informada.");
		System.out.println("Math.sqrt(4): "+Math.sqrt(4)+" //Retorna a raiz quadrada");
		System.out.println("Math.floor("+decimal+"): "+Math.floor(decimal)+" //Arredonda um número para baixo");
		System.out.println("Math.ceil("+decimal+"): "+Math.ceil(decimal)+" //Arredonda um número para cima");
		System.out.println("Math.round("+decimal+"): "+Math.round(decimal)+" //Arredonda um número para o mais proximo");
		System.out.println("Math.max("+numero+","+potencia+"): "+Math.max(numero, potencia)+" //Retorna o maior numero");
		System.out.println("Math.min("+numero+","+potencia+"): "+Math.min(numero, potencia)+" //Retorna o menor numero");
		System.out.println("Math.log(10): "+Math.log(10)+" //Logaritmo natural");
		System.out.println("Math.sin(Math.PI / 2): "+Math.sin(Math.PI /2)+" //Seno de 90 (Recebe argumento em Radianos)");
		System.out.println("Math.cos(Math.PI / 4): "+Math.cos(Math.PI /4)+" //Coseno de 45 (Recebe argumento em Radianos)");
		System.out.println("Math.tag(Math.PI / 6): "+Math.sin(Math.PI /6)+" //Tangente de 30 (Recebe argumento em Radianos)");
		System.out.println("Math.toDegrees(Math.PI / 6): "+Math.toDegrees(Math.PI/6)+" //Converte Radianos em graus");
		System.out.println("Math.toRadians(30): "+Math.toRadians(30)+" //Converte graus em radianos");
		System.out.println("Math.random(): "+Math.random()+" // retornar um valor aleatorio entre  0.0 e 1.0");

	}

}
