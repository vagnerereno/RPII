/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inimigos;

import rpii.Especialidade;

/**
 *
 * @author unipampa
 */
public abstract class Inimigo {

    protected String nome;
    protected int level;
    protected int inteligencia;
    protected int resistencia;
    protected int forca;
    protected int agilidade;
    protected int destreza;
    protected int bVida;
    private Especialidade classeInimigo;

    public Inimigo(String nome, int inteligencia, int resistencia, int forca, int agilidade, int destreza, int bVida, Especialidade classeInimigo) {
        this.nome = nome;
        this.level = 1;
        this.inteligencia = inteligencia;
        this.resistencia = resistencia;
        this.forca = forca;
        this.agilidade = agilidade;
        this.destreza = destreza;
        this.bVida = bVida;
        this.classeInimigo = classeInimigo;
    }

    public abstract void Atacar();

    public abstract void Defender();

    public abstract void Desviar();

    public abstract void ReducaoVida();

    public abstract void AumentoVida();

    public abstract void Especial();

    public Especialidade getClasseInimigo() {
        return classeInimigo;
    }

    public void setClasseInimigo(Especialidade classeInimigo) {
        this.classeInimigo = classeInimigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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

  

}
