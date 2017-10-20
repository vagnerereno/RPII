/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos;

import java.util.*;
import motor.EnumEspecialidades;
import raca.*;
import rpii.*;

/**
 * @author leope
 */
public class Ato0 {

    public Raca criarJogador(String nome, EnumEspecialidades especialidade) {
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
        System.out.println("Então " + nome + " qual raça você gostaria de ser?");
        System.out.println("1 - Anão - ");
        System.out.println("2 - Elfo - ");
        System.out.println("3 - Humano - ");
        System.out.println("4 - Orc - ");
        System.out.println("5 - Undead - ");
        int resp = 0;
        resp = input.nextInt();
        Raca player = null;
        switch (resp) {
            case 1:
                player = new Anao(nome, classea);
                break;
            case 2:
                player = new Elfo(nome, classea);
                break;
            case 3:
                player = new Humano(nome, classea);
                break;
            case 4:
                player = new Orc(nome, classea);
                break;
            case 5:
                player = new Undead(nome, classea);
                break;

        }
        return player;
    }
}
