import java.util.Scanner;

public class atividade_2 {

	public static void main(String[] args) {
		
		System.out.println("Digite a primeira nota: ");
		Scanner Sc = new Scanner(System.in);
		double N1 = Sc.nextDouble();
		
		
		System.out.println("Digite a segunda nota: ");
		Scanner Sc2 = new Scanner(System.in);
		double N2 = Sc2.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		Scanner Sc3 = new Scanner(System.in);
		double N3 = Sc3.nextDouble();
		
		double Media = (N1*2 + N2*3 + N3*5)/10;
		
		if (Media>=7) {
			
			System.out.println("Aprovado");

		}else if(Media<3) {
		
		System.out.println("Reprovado");
		
		}else{
			
			System.out.println("Recuperacao");
		}
	}
}
