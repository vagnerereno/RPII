/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Armas;

/**
 *
 * @author leonardo
 */
public abstract class Especialidade {
    
    public Especialidade(int inteligencia, int resistencia, int forca, int agilidade, int destreza, int bVida, Armas arma, String descricao) {
        this.inteligencia = inteligencia;
        this.resistencia = resistencia;
        this.forca = forca;
        this.agilidade = agilidade;
        this.destreza = destreza;
        this.bVida = bVida;
        this.arma = arma;
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    protected int inteligencia;
    protected int resistencia;
    protected int forca;
    protected int agilidade;
    protected int destreza;
    protected int bVida;
    protected Armas arma;
    private String descricao;
    
    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getbVida() {
        return bVida;
    }

    public void setbVida(int bVida) {
        this.bVida = bVida;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }
    

    
}
