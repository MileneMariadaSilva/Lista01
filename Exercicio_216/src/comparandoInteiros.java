import java.util.Scanner;

public class comparandoInteiros {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int number1 = input.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		int number2 = input.nextInt();
		
		if ( number1 == number2 ){
			System.out.printf(" These numbers are equal ");
		}else if ( number1 > number2){
			Sytem.out.printf(number+ " Is larger");
		}
		
		}
		
}
