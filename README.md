# Trabalho

## Apresentação


empregadar os conceitos de: 
persistência de objetos, com utilização de interface gráfica orientada a evento,
herança, polimorfismo e tratamento de exceção.




1. **Modelagem de classes com herança, realizada com o auxílio de ferramenta (PowerPoint ou Word,
por exemplo).**

    a) Cada equipe deve definir sua organização própria de classes com herança, visando a aproveitar os recursos do polimorfismo.

    b) Com um domínio de aplicação selecionado/definido, a equipe deve adaptar o exemplo dado (PetStore) para o domínio de aplicação escolhido.

    c) Sugestões de classes possíveis estão disponibilizadas no fim deste documento.



2. **Polimorfismo entre classes.**
   
    d) Sobrescrita (@override) de métodos.

    e) Referências polimórficas.

    f) Controle de repetição usado em coleção de objetos (ArrayList).

3. **Gravação e recuperação de objetos em arquivo.**
   
4. **Utilização da estrutura switch para controle de menu de opções.**
   
5. **Utilização de tratamento de exceções para manipulação de arquivos.**

---------------

## Orientaçoes gerais

Com base no exemplo (arquivo PetSore.ZIP), as equipes deverão utilizar os recursos a seguir, como
apresentado ou de forma equivalente, desde que todos os componentes da equipe demonstrem
conhecimento desses recursos.


### Lista (no exemplo da PetStore)
* Usar estrutura de ArrayList para manter em memória, semelhante à utilizada no exemplo com a
coleção de objetos mamíferos de PetStore:
`ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();`

### Menu (no exemplo, para manipulação das operações da PetStore)
* Usar estrutura de controle switch
```
switch (opc1) {
case 1:// Entrar dados
...
break;
case 2: // Exibir dados
...
break;
case 9:
JOptionPane.showMessageDialog
(null,"Fim PET Store");
break;
}
```
### Sobrescrita (@override)
* Usar no método `toString()`, aproveitando o método da classe-mãe, por meio da chamada `super`.
  
* Usar em métodos construtores (encadeamento de construtores).
### Persistência de objetos: observem os detalhes de implementação usados no exemplo.

* Objetos a serem persistidos (armazenados em arquivo) devem implementar a interface.
`java.io.Serializable`
* Gravação (void salvaProdutos (ArrayList<Mamifero> mamiferos):
```
outputStream = new ObjectOutputStream
(new FileOutputStream(nomeArquivo));
```
* Recuperação (ArrayList<Mamifero> recuperaProdutos ()):
```
inputStream = new ObjectInputStream
(new FileInputStream(nomeArquivo));
```

## Itens esperados na aplicação
1. Cada equipe deverá ter seu conjunto próprio de objetos (domínio de aplicação), que deverão ser
persistidos e recuperados, conforme escolha do usuário em menu de opções.
1. O conjunto de objetos deverá trabalhar a generalização com hierarquia, para aproveitamento das
facilidades do polimorfismo (referência polimórfica em coleção de objetos, como ArrayList, para
manter coleções de objetos com as mesmas relações hierárquicas).
1. A aplicação deverá utilizar interface gráfica, conforme exemplificado (arquivo PetSore.ZIP).
2. A aplicação deverá ter tratamento de exceção para acesso a arquivos e para tratamento de demais
erros em potencial.
1. A aplicação deverá ter tratamento de opções para o usuário via menu.
2. Utilizar construtores adequadamente: reutilizar o construtor da classe-pai, sempre que possível.
3. Utilizar getter e setter para prover encapsulamento, sempre que possível.
4. Utilizar o método `toString()` para apresentar objetos ao usuário.
