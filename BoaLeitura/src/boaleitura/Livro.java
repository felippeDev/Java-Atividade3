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
public class Livro {
    private int Codigo;
    private String Titulo;
    private double Preco;
    private int Ano;
    private Categoria Categoria;
    
    public Livro(int valorCodigo, String valorTitulo, double valorPreco,
        int valorAno, Categoria valorCategoria){
        Codigo = valorCodigo;
        Titulo = valorTitulo;
        Preco = valorPreco;
        Ano = valorAno;
        Categoria = new Categoria(valorCodigo, valorTitulo);
    }
    
    public int getCodigo(){
        return Codigo;
    }
    
    public void setCodigo(int codigo){
        this.Codigo = codigo;
    }
    
    public String getTitulo(){
        return Titulo;
    }
    
    public void setTitulo(String titulo){
        this.Titulo = titulo;
    }
    
    public double getPreco(){
        return Preco;
    }
    
    public void setPreco(double preco){
        this.Preco = preco;
    }
    
    public int getAno(){
        return Ano;
    }
    
    public void setAno(int ano){
        this.Ano = ano;
    }
    
    public Categoria getCategoria(){
        return Categoria;
    }
    
    public void setCategoria(Categoria categoria){
        this.Categoria = categoria;
    }
    
    public String imprimirDados(){
        return "Código: " + Codigo +
                "\nTitulo: " + Titulo +
                "\nPreco: " + Preco +
                "\nAno: " + Ano +
                "\nCategoria: " + Categoria.getNome();
    }
}
