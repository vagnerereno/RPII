/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inimigos;

import itens.armas.Arco;
import itens.armas.Armas;
import itens.armas.Cajado;
import itens.armas.Espada;
import java.util.Random;
import rpii.Arqueiro;
import rpii.Especialidade;
import rpii.Guerreiro;
import rpii.Mago;

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
    private Armas arma;
    private Especialidade classeInimigo;

    public Inimigo(String nome, Especialidade classeInimigo) {
        this.nome = nome;
        this.level = 1;
        this.inteligencia = classeInimigo.getInteligencia();
        this.resistencia = classeInimigo.getResistencia();
        this.forca = classeInimigo.getForca();
        this.agilidade = classeInimigo.getAgilidade();
        this.destreza = classeInimigo.getDestreza();
        this.bVida = classeInimigo.getbVida();
        this.arma = classeInimigo.getArma();
        this.classeInimigo = classeInimigo;
    }

    public int atacar() {
        if (this.getClasseInimigo() instanceof Guerreiro) {
            return (getArma().getDano() * this.getForca()) / 2;
        } else if (this.getClasseInimigo() instanceof Mago) {
            return (getArma().getDano() * this.getInteligencia()) / 2;
        } else if (this.getClasseInimigo() instanceof Arqueiro) {
            return (getArma().getDano() * this.getDestreza()) / 2;
        } else {
            return 0;
        }
    }

    public void defender(int dano) {
        int x = this.getResistencia() - dano;
        if (x > 0) {
            this.setResistencia(x);
        } else {
            x = x * -1;
            this.setbVida(this.getbVida() - x);
        }
    }

    public int especial() {
        if (this.getClasseInimigo() instanceof Guerreiro) {
            return getArma().getDano() * this.getForca();
        } else if (this.getClasseInimigo() instanceof Mago) {
            return getArma().getDano() * this.getInteligencia();
        } else if (this.getClasseInimigo() instanceof Arqueiro) {
            return getArma().getDano() * this.getDestreza();
        } else {
            return 0;
        }
    }

    public boolean desviar() {
        Random x = new Random();
        if (x.nextDouble() < 0.25) {
            return true;
        }
        return false;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

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