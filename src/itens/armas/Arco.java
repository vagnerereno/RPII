/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens.armas;

/**
 *
 * @author unipampa
 */
public class Arco extends Armas {

    private String nome;

    public Arco(String nome, int magia, int dano, int defesa) {
        this.nome = nome;
        this.magia = magia;
        this.dano = dano;
        this.defesa = defesa;
    }

    public String getNomeArma() {
        return nome;
    }

    public void setNomeArma(String nomeArma) {
        this.nome = nomeArma;
    }

}
