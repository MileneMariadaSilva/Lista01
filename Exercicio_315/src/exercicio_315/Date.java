package exercicio_315;

public class Date {
	private int mes;
	private int dia;
	private int ano;


//Construtor
public Date(int mes, int dia, int ano) {
	this.mes = mes ;
	this.dia = dia;
	this.ano = ano;
	
	if(mes>12 || mes<1){
		this.mes = 0;
	}else{
		this.mes = mes;
	}
	
	if(dia>30 || dia<1){
		this.dia = 0;
	}else{
		this.dia = dia;
		
		}
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
	
	
	public String displayDate(){
		String a = this.mes + "/" + this.dia + "/" + this.ano;
		return a;
	}
	
}
