package supermercado;

public class Laticinio extends Produto{
    //Construtor
    public Laticinio(int codigo, String nome, String fornecedo, float preco) {
        super(codigo, nome, fornecedo, preco);
        this.setTipo("Laticinio");
    }

    //Metodo Validade
    @Override
    public int Validade() {
        return 30;
    }
    
}
