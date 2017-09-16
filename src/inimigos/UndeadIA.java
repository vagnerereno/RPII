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
public class UndeadIA extends Inimigo{

    public UndeadIA(String nome, int inteligencia, int resistencia, int forca, int agilidade, int destreza, int bVida, Especialidade classeInimigo) {
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
    
    public void Status(){
        System.out.println("------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Level: " + this.getLevel());
        System.out.println("Inteligência: " + this.getInteligencia());
        System.out.println("Resistência: " + this.getResistencia());
        System.out.println("Força: " + this.getForca());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Destreza: " + this.getDestreza());
        System.out.println("Vida: " + this.getbVida());
        System.out.println("------------------------");
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

