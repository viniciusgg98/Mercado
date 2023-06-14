package supermercado;

public class Bebida extends Produto {

    //Construtor
    public Bebida(int codigo, String nome, String fornecedo, float preco) {
        super(codigo, nome, fornecedo, preco);
        this.setTipo("Bebida");
    }

    //Metodo Validade
    @Override
    public int Validade() {
        return 60;
    }
    
}
