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
public class GerenciaCategoria {
    private ArrayList<Categoria> listaCategorias;
    
    public GerenciaCategoria(){
        this.listaCategorias = new ArrayList();
    }
    
    public void adicionarCategoria(Categoria categoria){
        listaCategorias.add(categoria);
    }
    
    public String listarCategorias(){
        String saida;
        
        if(listaCategorias.isEmpty()){
            return saida = "Nenhuma categoria cadastrada.";
        }
        else {
            saida = "Categorias: ";
            
            for (Categoria categoria: listaCategorias) {               
                saida += "\n" + categoria.imprimirDados();
            }
            
            return saida;
        }
    }
}
