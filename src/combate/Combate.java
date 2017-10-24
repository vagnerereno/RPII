/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combate;

import inimigos.Inimigo;
import java.util.Scanner;
import rpii.Raca;

/**
 *
 * @author leope
 */
public class Combate {

    private Raca jogador;
    private Inimigo inimigo;

    public Combate(Raca jogador, Inimigo inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public Object combatturn() {
        Scanner input = new Scanner(System.in);
        System.out.println(inimigo.getNome() + "se prepara para o combate!");
        while (jogador.getbVida() > 0 && inimigo.getbVida() > 0) {
            System.out.println(jogador.getNome() + "Qual a sua ação?");
            System.out.println("1 - Atacar - ");
            System.out.println("2 - Especial - ");
            System.out.println("3 - Curar -");
            System.out.println("4 - Status da batalha - ");
            int esc = 0;
            esc = input.nextInt();
            switch(esc){
                case 1: inimigo.defender(jogador.getForca());
                        jogador.defender(inimigo.atacar());
                        System.out.println("Sua vida: " + jogador.getbVida());
                        break;
                case 2: inimigo.defender(jogador.getForca());
                        jogador.defender(inimigo.especial());
                        System.out.println("Sua vida: " + jogador.getbVida());
                        break;
                case 3: jogador.aumentoVida(10);
                        System.out.println("Sua vida: " + jogador.getbVida());
                        break;
                case 4: System.out.println("Vida atual: " + jogador.getbVida() + "\n" + "Vida do Inimigo: " + inimigo.getbVida());
                        break;
                default: System.out.println("Comando inválido!");
            }
        }
        Object esc = null;
        return esc;
    }
    
}