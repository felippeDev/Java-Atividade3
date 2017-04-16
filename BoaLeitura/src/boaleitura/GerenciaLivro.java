/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boaleitura;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LuizFelippe
 */
public class GerenciaLivro {
    private ArrayList<Livro> listaLivros;
    
    public GerenciaLivro(){
        this.listaLivros = new ArrayList();
    }
    
    //Insere um novo livro em ArrayList<Livro> listaLivros
    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
    }
    
    public String listarLivros(){
        String saida;
        
        if(listaLivros.isEmpty()){
            return saida = "Nenhuma livro cadastrado.";
        }
        else {
            saida = "Livros: ";
            
            for (Livro livro: listaLivros) {               
                saida += "\n" + livro.imprimirDados();
            }
            
            return saida;
        }
    }
    
    public String listarLivrosAtual(){
        String saida;
        
        if(listaLivros.isEmpty()){
            return saida = "Nenhuma livro cadastrado.";
        }
        else {
            saida = "Livros Atuais: \n";
            ArrayList livrosAruais = new ArrayList();
            
            for (Livro livro: listaLivros) {               
                if(livro.getAno() >= 2014){
                    //Listando Livros com ano igual ou superior a 2014
                    livrosAruais.add(livro);
                    saida += livro.imprimirDados() + "\n\n";
                }
            }
            
            //Caso não encontre livros com ano superior ou igual a 2014
            if(livrosAruais.isEmpty()){
                return saida = "Não existem livros com ano superior a 2014.";
            }
            
            return saida;
        }
    }
}
