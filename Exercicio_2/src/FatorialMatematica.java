import java.util.Scanner;
public class FatorialMatematica {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		int num = input.nextInt();
		
		int fat = 1;
		while(num>0){
			fat = fat * num;
			num--;
		}
		System.out.print("O fatorial = " + fat);
	}
}
