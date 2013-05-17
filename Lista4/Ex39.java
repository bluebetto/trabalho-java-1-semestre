import java.util.Scanner;


public class Ex39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float notas[] = new float [4];
		Scanner in = new Scanner(System.in);
	
		System.out.println();
		System.out.println("Calculo da Media!");
		
		for(int i=0; i< 4; i++){
			System.out.println();
			System.out.print("Digite a " + i + "ª nota: ");
			notas[i] = in.nextFloat();
		}
		
		
		System.out.print("A media do aluno eh: " );
		calc_Media(notas);
		in.close();
	}
	
	public static void calc_Media(float a[]){
		float total = 0;
		for(int i = 0; i < a.length;i++){
			total += a[i];
		}
		System.out.println(total/a.length);
	}//fim do MEDIA

}
