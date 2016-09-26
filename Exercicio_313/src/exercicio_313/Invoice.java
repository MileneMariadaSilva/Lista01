package exercicio_313;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantiodadeItem;
	private double precoItem;
	
	//Construtor
	public Invoice(String numero, String descricao, int quantiodadeItem, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		
		if(quantiodadeItem<=0){
			this.quantiodadeItem = 0;
		}else{
			this.quantiodadeItem = quantiodadeItem;
		}
		
		if(precoItem<=0){
			this.precoItem = 0;
		}else{
			this.precoItem = precoItem;
		}
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public int getQuantiodadeItem() {
		return quantiodadeItem;
	}
	public void setQuantiodadeItem(int quantiodadeItem) {
		this.quantiodadeItem = quantiodadeItem;
	}

	
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	
	//metodos operatorios
	public double getInvoiceAmount(){
		double resultado = this.quantiodadeItem * this.precoItem;
		return resultado;
	}
	
	
	
}
