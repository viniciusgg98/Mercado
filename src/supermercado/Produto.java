package supermercado;

import java.io.Serializable;
public abstract class Produto implements Serializable {
    //Atributos
    private static final long serialVersionUID = 1L; //nao sei
    private int codigo;
    private String nome;
    private String fornecedo;
    private float preco;
    protected String tipo;
    

    //Métodos
    public abstract int Validade();

    //Construtor
    public Produto(int codigo, String nome, String fornecedo, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.fornecedo = fornecedo;
        this.preco = preco;
    }
    
    //Status
    @Override
    public String toString() {
        return "PRODUTO\n CÓDIGO: " + codigo + "\nNOME: " + nome + "\nFORNECEDOR: " + fornecedo + "\nPREÇO: " + preco + "\nTIPO: " + tipo + "\nVALIDADE DEPOIS DE ABERTO: " + Validade() + " dias"; //Desconto metodo 
    } 
    
    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFornecedo() {
        return fornecedo;
    }
    public void setFornecedo(String fornecedo) {
        this.fornecedo = fornecedo;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
