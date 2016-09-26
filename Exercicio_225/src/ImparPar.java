import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Insira um numero: ");
		int number1 = input.nextInt();
		
		if(number1 % 2==0){
			System.out.println("par");
		}else{
			System.out.println("impar");
		}
	
	}


}
