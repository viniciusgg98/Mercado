package supermercado;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SuperMercado {

	private ArrayList<Produto> produtos;


	public SuperMercado( ) {
		this.produtos = new ArrayList<Produto>();
	}

	public void adicionaProduto(Produto pro) {
		this.produtos.add(pro);
	}

	public void listarProdutos() {
		for(Produto pro:produtos) {
			System.out.println(pro.toString());
		}
		System.out.println("Total = " + this.produtos.size() + " produtos listados com sucesso!\n");
	}
	
	public void excluirProduto(Produto pro) {
		if (this.produtos.contains(pro)) {
			this.produtos.remove(pro);
			System.out.println("[Produto " + pro.toString() + "excluido com sucesso!]\n");
		}
		else
			System.out.println("Produto inexistente!\n");
	}

	public void excluirProduto() {
		produtos.clear();
		System.out.println("Produtos excluidos com sucesso!\n");
	}
	public void gravarProdutos()  {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream (new FileOutputStream("c:\\temp\\produtos.dat"));
			for(Produto pro:produtos) {
				outputStream.writeObject(pro);
			}
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try {
				if (outputStream != null ) {
					outputStream.flush();
					outputStream.close();
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void recuperarProdutos() {
		ObjectInputStream inputStream = null;
		try {
			inputStream	= new ObjectInputStream (new FileInputStream ("c:\\temp\\produtos.dat"));
			Object obj = null;
			while((obj = inputStream.readObject ()) != null) {
				if (obj instanceof Bebida)  
					this.produtos.add((Bebida)obj);
				else if (obj instanceof Laticinio)  
					this.produtos.add((Laticinio)obj);
				else if (obj instanceof Limpeza)  
					this.produtos.add((Limpeza)obj);
			}
		}catch (EOFException ex) {     // when EOF is reached
			System.out.println ("End of file reached");
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try {
				if (inputStream != null ) {
					inputStream.close();
					System.out.println("Produtos recuperados com sucesso!\n");
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		SuperMercado pro1  = new SuperMercado();

		Bebida leite = new Bebida(123, "leite", "Lacta", 30.34);
		Bebida agua = new Bebida(111, "agua", "aqua", 3.99);
		Laticinio queijo = new Laticinio(432, "queijo", "Lacta", 60.45);
		Limpeza pasta = new Limpeza(643, "pasta de dente", "couglate", 21.49);
		Limpeza escova = new Limpeza(867, "escova de dente", "clougate", 23.10);
		pro1.adicionaProduto(leite);
		pro1.adicionaProduto(agua);
		pro1.adicionaProduto(pasta);
		pro1.adicionaProduto(queijo);
		pro1.adicionaProduto(escova);
		pro1.listarProdutos();
		pro1.gravarProdutos();
		pro1.excluirProduto(leite);
		pro1.gravarProdutos();
		pro1.listarProdutos();
		pro1.excluirProduto();
		pro1.listarProdutos();
		pro1.recuperarProdutos();
		pro1.listarProdutos();
	}

}
