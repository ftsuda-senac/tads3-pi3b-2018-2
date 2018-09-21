package br.senac.tads.pi3b.exemplos.web;

/**
 *
 * @author fernando.tsuda
 */
public class Produto {
    
    private Long id;
    
    private String nome;
    
    private int preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
}
