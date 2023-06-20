package supermercado;

public class Bebida extends Produto {

    //nao sei
    private static final long serialVersionUID = 1L;
    
    //Construtor
    public Bebida(int codigo, String nome, String fornecedo, double preco) {
        super(codigo, nome, fornecedo, preco);
        this.setTipo("Bebida");
    }

    //Metodo Validade
    @Override
    public int Validade() {
        return 60;
    }
    
}
