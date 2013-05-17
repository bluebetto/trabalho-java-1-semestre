import java.util.Scanner;

class Ex38{
	public static void main (String args[])	{
	
		float notas[] = new float [4];
		float media;
		Scanner in = new Scanner(System.in);
	
		System.out.println();
		System.out.println("Calculo da Media!");
		
		for(int i=0; i< 4; i++){
			System.out.println();
			System.out.print("Digite a " + i + "ª nota: ");
			notas[i] = in.nextFloat();
		}
		
		media = calc_Media(notas);
		
		System.out.println("A media do aluno eh: " + media);
		in.close();
	}//Fim do Main
	
	
	public static float calc_Media(float a[]){
		float total = 0;
		for(int i = 0; i < a.length;i++){
			total += a[i];
		}
		return total/a.length;
	}//fim do MEDIA
}//fim Class