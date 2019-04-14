/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;


import dados.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author victorramide
 */
@SessionScoped
@ManagedBean
public class RetornoBean {
    private Livro livro;
    private List<Livro> livros;
    int id=0;
    
    @PostConstruct
    public void init(){
        livro = new Livro();
        livros = new ArrayList<>();
    }
    
    public void salvar(){
        
        if(!livro.getTitulo().isEmpty() && !livro.getTipo().isEmpty() && !livro.getAutor().isEmpty() && !livro.getCategoria().isEmpty()){
            id++;
            livro.setId(id);
            livros.add(livro);
            livro = new Livro();

        }else{
            // TODO
        }
    }
    
    public void remover(int id){
        for(Livro l : livros){
            if(l.getId() == id){
                livros.remove(l);
            } else {
            }
            break;
        }       
        
    }
    
    public String redirecionar(){
        return "/index.xhtml";
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}
