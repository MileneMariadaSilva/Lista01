import java.util.Scanner;
public class AritmeticaProduto {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n1 = input.nextInt();
		
		System.out.print("Insira outro numero: ");
		int n2 = input.nextInt();
		
		int Sum = n1+n2;
		System.out.println("A soma e: " + Sum);
		
		int multiplicaçao = n1*n2;
		System.out.println("A multiplicaçao e: " + multiplicaçao);
		
		int subtraçao = n1-n2;
		System.out.println("A subtraçao e: " + subtraçao);
		
		double divisao = (double)(n1) / n2;
		System.out.println("A divisao e: " + divisao);
		
	}

}
