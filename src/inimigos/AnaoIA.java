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
public class AnaoIA extends Inimigo{
    
    public AnaoIA(String nome, int inteligencia, int resistencia, int forca, int agilidade, int destreza, int bVida, Especialidade classeInimigo) {
        super(nome, inteligencia, resistencia, forca, agilidade, destreza, bVida, classeInimigo);
    }

    @Override
    public void Atacar() {
    }

    @Override
    public void Defender() {
    }

    @Override
    public void Desviar() {
    }

    @Override
    public void ReducaoVida() {
    }

    @Override
    public void AumentoVida() {
    }

    @Override
    public void Especial() {
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
