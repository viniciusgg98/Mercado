package Mercado;

public class Bebida extends Produto {

	private static final long serialVersionUID = 1L;
	
	public String preco() {
		return "R$ 10,00";
	}
	public Bebida(String nome, int codigo, String fornecedor) {
		super(nome, codigo, fornecedor);
		this.tipo = "Bebida";
	}
}