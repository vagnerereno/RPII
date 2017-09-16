/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos;

import java.util.*;
import raca.*;
import rpii.*;

/**
 * @author leope
 */
public class Ato0 {

    public Raca criarJogador() {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá jogador, qual o seu nome?");
        String nome = input.next();
        System.out.println(nome + " Qual especialidade você quer ter?");
        System.out.println(" 1 - Arqueiro - ");
        System.out.println(" 2 - Guerreiro - ");
        System.out.println(" 3 - Mago - ");
        int resp;
        resp = input.nextInt();
        if (resp == 1) {
            Arqueiro classea = new Arqueiro();
            System.out.println("Então " + nome + " qual raça você gostaria de ser?");
            System.out.println("1 - Anão - ");
            System.out.println("2 - Elfo - ");
            System.out.println("3 - Humano - ");
            System.out.println("4 - Orc - ");
            System.out.println("5 - Undead - ");
            resp = 0;
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
        } else if (resp == 2) {
            Guerreiro classea = new Guerreiro();
            System.out.println("Então " + nome + "qual raça você gostaria de ser?");
            System.out.println("1 - Anão - ");
            System.out.println("2 - Elfo - ");
            System.out.println("3 - Humano - ");
            System.out.println("4 - Orc - ");
            System.out.println("5 - Undead - ");
            resp = 0;
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
        } else if (resp == 3) {
            Mago classea = new Mago();
            System.out.println("Então " + nome + "qual raça você gostaria de ser?");
            System.out.println("1 - Anão - ");
            System.out.println("2 - Elfo - ");
            System.out.println("3 - Humano - ");
            System.out.println("4 - Orc - ");
            System.out.println("5 - Undead - ");
            resp = 0;
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

        ////////////////
        return null;
    }

}
