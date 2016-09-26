package exercicio_313;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice f1 = new Invoice("123", "teclado", 10, 2.50);
		
		System.out.println(f1.getNumero());
		System.out.println(f1.getDescricao());
		System.out.println(f1.getQuantiodadeItem());
		System.out.println(f1.getPrecoItem());
		
		f1.setNumero("7996544");
		System.out.println(f1.getNumero());
		
	}

}
