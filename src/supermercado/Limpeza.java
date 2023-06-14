package supermercado;

public class Limpeza extends Produto{

    //Construtor
    public Limpeza(int codigo, String nome, String fornecedo, float preco) {
        super(codigo, nome, fornecedo, preco);
        this.setTipo("Limpeza");
    }

    //Metodo Validade
    @Override
    public int Validade() {
        return 360;
    }
    
}
