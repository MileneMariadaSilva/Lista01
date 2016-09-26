public class Employce {
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	
	//Construtor
	public Employce(String primeiroNome, String sobrenome, double salarioMensal){
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		
		if (salarioMensal<=0){
			this.salarioMensal = 0;
			
		}else{
			this.salarioMensal = salarioMensal;
		}
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
 

	public double aumento(){
		double a = this.salarioMensal + (salarioMensal*0.10);
		return a;
	}
		
	}