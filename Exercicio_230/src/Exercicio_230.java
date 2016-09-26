import java.util.Scanner;


public class Exercicio_230 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite 5 números: ");
			num = input.nextInt();
		
		while (true){
			if ((num<=9999) || (num>99999)){
				System.out.println("Valor inválido.");
				System.out.print("Digite novamente: ");
				num = input.nextInt();
				
			}else{
				char[] lista = String.valueOf(num).toCharArray();
				for(char n : lista){
				System.out.print(n+"  ");
				
				}
				break;

			}
			}
	}
}