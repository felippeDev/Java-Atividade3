/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boaleitura;

import javax.swing.JOptionPane;

/**
 *
 * @author LuizFelippe
 */
public class BoaLeitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciaCategoria categorias = new GerenciaCategoria();
        GerenciaLivro livros = new GerenciaLivro();
        int menuSelecionado;
        
        do{
            menuSelecionado = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Livro"
                    + "\n2 - Exibir Atual"
                    + "\n3 - Sair"
                    + "\nEscolha uma opção:"
            ));
            
            switch(menuSelecionado) {
                case 1: //Cadastrar Livro
                    //Preenchendo atributos de Livro
                    int Codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
                    String Titulo = JOptionPane.showInputDialog("Título:");
                    Double Preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));
                    int Ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
                    
                    //Adiciona uma nova categoria
                    Categoria Categoria = new Categoria(
                        Integer.parseInt(JOptionPane.showInputDialog("Nova categoria:\nCódigo:")),
                        JOptionPane.showInputDialog("Nova categoria:\nNome da Categoria:")
                    );
                    categorias.adicionarCategoria(Categoria);
                    
                    //Adicionando Livro e atrelando a nova Categoria ao mesmo
                    Livro livro = new Livro(Codigo, Titulo, Preco, Ano, Categoria);
                    livro.setCategoria(Categoria);
                    livros.adicionarLivro(livro);
                    break;
                case 2: //Exibir Atual
                    JOptionPane.showMessageDialog(null, livros.listarLivrosAtual());
                    break;
                case 3: //Sair da aplicação
                    System.exit(0);
                    break;
            }
        } while (menuSelecionado >= 1 && menuSelecionado <= 3);
    }
    
}
