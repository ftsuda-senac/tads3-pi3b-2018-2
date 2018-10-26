/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b.exemplos.poo;

/**
 *
 * @author fernando.tsuda
 */
public class Pessoa {

    private String nome;

    private String nacionalidade;

    /* Valor de 0 a 99 */
    private int energia;

    public Pessoa(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.energia = 50;
    }

    public String falar() {
        this.energia -= 4;
        if (this.energia > 10) {
            if ("bra".equals(this.nacionalidade)) {
                return "Olá";
            } else if ("arg".equals(this.nacionalidade)) {
                return "Hola";
            } else {
                return "Hello!";
            }
        } else {
            throw new SemEnergiaException();
        }
    }

    public void comer(int energia) {
        this.energia += energia;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

}
