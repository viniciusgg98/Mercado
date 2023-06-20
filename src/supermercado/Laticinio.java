package supermercado;

public class Laticinio extends Produto{
    
    //nao sei
    private static final long serialVersionUID = 1L;
    
    //Construtor
    public Laticinio(int codigo, String nome, String fornecedo, double preco) {
        super(codigo, nome, fornecedo, preco);
        this.setTipo("Laticinio");
    }

    //Metodo Validade
    @Override
    public int Validade() {
        return 30;
    }
    
}
