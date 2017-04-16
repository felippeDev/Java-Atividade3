/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boaleitura;

/**
 *
 * @author LuizFelippe
 */
public class Categoria {
    private int Codigo;
    private String Nome;
    
    public Categoria(int valorCodigo, String valorNome){
        Codigo = valorCodigo;
        Nome = valorNome;
    }
    
    public int getCodigo(){
        return Codigo;
    }
    public void setCodigo(int codigo){
        this.Codigo = codigo;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public String imprimirDados(){
        return "Código: " + Codigo +
                "\nNome: " + Nome;
    }
}
