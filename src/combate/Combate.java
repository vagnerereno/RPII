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
            System.out.println("2 - Curar -");
            int esc = 0;
            esc = input.nextInt();
            switch(esc){
                case 1: inimigo.Defender();
            }
        }
        Object esc = null;
        return esc;
    }
    
}
