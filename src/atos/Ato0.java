/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos;

import java.util.*;
import motor.EnumEspecialidades;
import motor.EnumRacas;
import raca.*;
import rpii.*;

/**
 * @author leope
 */
public class Ato0 {

    public Raca criarJogador(String nome, EnumEspecialidades especialidade, EnumRacas raca) {
        Scanner input = new Scanner(System.in);
        Especialidade classea = null;
        switch (especialidade) {
            case ARQUEIRO: {
                classea = new Arqueiro();
                break;
            }
            case GUERREIRO: {
                classea = new Guerreiro();
                break;
            }
            case MAGO: {
                classea = new Mago();
                break;
            }
            default:
                break;
        }
        
        Raca player = null;
        switch (raca) {
            case ANAO:
                player = new Anao(nome, classea);
                break;
            case ELFO:
                player = new Elfo(nome, classea);
                break;
            case HUMANO:
                player = new Humano(nome, classea);
                break;
            case ORC:
                player = new Orc(nome, classea);
                break;
            case UNDEAD:
                player = new Undead(nome, classea);
                break;

        }
        return player;
    }
}
