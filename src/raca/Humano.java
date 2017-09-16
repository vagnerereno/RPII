/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raca;

import itens.armas.Arco;
import itens.armas.Cajado;
import itens.armas.Espada;
import java.util.Random;
import rpii.Especialidade;
import rpii.Raca;

/**
 *
 * @author unipampa
 */
public class Humano extends Raca {

    public Humano(String nome, Especialidade classeJogador) {
        super(nome, classeJogador);
    }

    @Override
    public int Atacar() {
        if (this.getArma() instanceof Cajado) {
            return getArma().getDano();
        } else if (this.getArma() instanceof Espada) {
            return getArma().getDano();
        } else if (this.getArma() instanceof Arco) {
            return getArma().getDano();
        }
        return 0;
    }

    @Override
    public void Defender(int dano) {
        int x = dano - this.getResistencia();
        if (x > 0) {
            this.setbVidaAtual(this.getbVidaAtual() - x);
            this.setResistencia(0);
        } else {
            this.setResistencia(x*(-1));
        }
    }

    @Override
    public boolean Desviar() {
        Random x = new Random();
        if (x.nextDouble() < 0.25) {
            return true;
        }
        return false;
    }

    @Override
    public void AumentoVida(int aumento) {
        this.setbVidaAtual(this.getbVidaAtual() + aumento);
    }


    @Override
    public String Status() {
        
        String status =   "---------------------------------"
                         + "Nome: " + this.getNome() + "\n"
                         + "Level: " + this.getLevel() + "\n"
                         + "Inteligência: " + this.getInteligencia() + "\n"
                         + "Resistência: " + this.getResistencia() + "\n"
                         + "Força: " + this.getForca() + "\n"
                         + "Agilidade: " + this.getAgilidade() + "\n"
                         + "Destreza: " + this.getDestreza() + "\n"
                         + "Vida: " + this.getbVidaAtual() + "\n"
                         + "---------------------------------";

        return status;
    }

}
