package exercicio_317;

public class HealthProfile {
	private String nome;
	private String sobrenome;
	private int mes;
	private int dia;
	private int ano;
	private double altura;
	private double peso;
	private String sexo;
	
	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public HealthProfile(String nome, String sobrenome, int mes, int dia, int ano, double altura, double peso, String sexo) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getSobrenome() {
		return sobrenome;
		
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getDia() {
		return dia;
		
	}
	public void setDia(int dia) {
		this.dia = dia;
		
	}
	public int getAno() {
		return ano;
		
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getAltura() {
		return altura;
		
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int Calculomaxima(int idade){
		return (220 - idade);
		}
	
	public int Idade(int anonascimento, int anoatual, int mesatual, int diaatual){
		int a = anoatual- anonascimento;
		if (mesatual != mes){
			if(diaatual != dia){
				return a-1;}
		}if(diaatual != dia){
			return a-1;
		}else{
			return a;
		}
	}
	public double Alvo1(double FCM){
		return (FCM * 0.5);
	}
	public double Alvo2(double FCM){
		return (FCM * 0.85);
	}
	
	public void IMC(double peso, double altura){
		double kg = peso * 0.453592;
		double a = altura * 0.0254;
		double IMC = (kg)/(a*a);
		System.out.printf("\nSeu IMC: %.2f", IMC);
		System.out.print("\nOs valores de IMC\nAbaixo do peso: menos de 18,5\nNormal: entre 18,5 e 24,9\nExcesso de peso: entre 25 e 29,9\nObeso: 30 ou maior");
	}
	
	
}
