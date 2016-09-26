import java.util.Scanner;

public class NegativosPositivosZero {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int positivo=0, negativo=0;
		int zero=0;
		for(int x = 0; x<5; x++){
			System.out.print("Informe um número: ");
			int num = input.nextInt();
			
			if(num>0){
				positivo +=1;
				
			}
			
			if(num<0){
				negativo += 1;
				
			}
			if(num==0){
				zero +=1;
				
			}
			
		 
		}
		
		System.out.println(positivo+ " Positivos ");
		System.out.println(negativo+ " Negativos ");
		System.out.println(zero+ " Zeros ");
		input.close();
		}

	}
