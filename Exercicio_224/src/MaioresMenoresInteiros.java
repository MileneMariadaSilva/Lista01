import java.util.Scanner;


public class MaioresMenoresInteiros {
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, maior, menor;
		
		System.out.print("Informe um número: ");
		num = input.nextInt();
		
		maior = num;
		menor = num;
		
		for(int x = 0; x<4; x++){
			System.out.print("Informe um número: ");
			num = input.nextInt();
			
			if(num>maior){
				maior = num;
				
			}
			
			if(num<menor){
				menor = num;
				
			}
			
		 
		}
		
		System.out.println(maior+ " Maior ");
		System.out.println(menor+ " Menor ");
		
	}


}
