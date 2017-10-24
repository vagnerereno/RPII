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
import rpii.Arqueiro;
import rpii.Especialidade;
import rpii.Guerreiro;
import rpii.Mago;
import rpii.Raca;

/**
 *
 * @author unipampa
 */
public class Anao extends Raca {

    public Anao(String nome, Especialidade classeJogador) {
        super(nome, classeJogador);
    }
    public int atacar() {
            return (getArma().getDano() * this.getForca()) / 2;
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
            return (getArma().getDano() * this.getForca());
    }

    public boolean desviar() {
        Random x = new Random();
        if (x.nextDouble() < 0.25) {
            return true;
        }
        return false;
    }
}