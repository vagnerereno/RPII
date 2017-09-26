package motor;

import atos.Ato0;
import audio.Som;
import atos.Ato1;
import atos.Ato2;
import java.util.Scanner;
import motor.Atos;
import motor.Engine;
import raca.Anao;
import raca.Elfo;
import raca.Humano;
import raca.Orc;
import raca.Undead;
import sun.audio.AudioStream;

public class RPII {

    public static void main(String args[]) throws Exception {

        Scanner e = new Scanner(System.in);
        int resp = 0;
        System.out.println("Bem vindo ao MUD, Oque deseja fazer? ");
        while (resp != 1 || resp != 2 || resp != 3) {
            System.out.println("1- Iniciar novo jogo 2- Escolher onde comecar o jogo 3- Obter ajuda");
            resp = e.nextInt();
            if (resp == 1) {
                Ato0 x = new Ato0();

                Ato1 c = new Ato1(x.criarJogador());
                break;
            }
        }
        //inicio de todas as classes e metodos
        Engine j = new Engine();
        Atos geral[] = j.iniciando();
        Atos print = geral[0];
        System.out.println(print.desc);
        //primeira parte
        System.out.println("\nDigite a proxima opção");
        if (print.proxcod.get(0) != 0) {
            System.out.println(print.proxcod.get(0) + " -P/ 1ª OPCAO");
        }
        if (print.proxcod.get(1) != 0) {
            System.out.println(print.proxcod.get(1) + " -P/ 2ª OPCAO");
        }
        if (print.proxcod.get(2) != 0) {
            System.out.println(print.proxcod.get(2) + " -P/ 3ª OPCAO");
        }
        if (print.proxcod.get(3) != 0) {
            System.out.println(print.proxcod.get(3) + " -P/ 4ª OPCAO");
        }
        if (print.proxcod.get(4) != 0) {
            System.out.println(print.proxcod.get(4) + " -P/ 5ª OPCAO");
        }
        resp = e.nextInt();
        while (resp != print.proxcod.get(0) || resp != print.proxcod.get(1) || resp != print.proxcod.get(2) || resp != print.proxcod.get(3) || resp != print.proxcod.get(4)) {
            if (resp == print.proxcod.get(0)) {
                int proximo = print.getProxcodigo(0);
                print = j.compara(geral[proximo]);
                System.out.println(print.desc);
                break;
            }
            if (resp == print.proxcod.get(1)) {
                int proximo = print.getProxcodigo(1);
                print = j.compara(geral[proximo]);
                System.out.println(print.desc);
                break;
            }
            if (resp == print.proxcod.get(2)) {
                int proximo = print.getProxcodigo(2);
                print = j.compara(geral[proximo]);
                System.out.println(print.desc);
                break;
            }
            if (resp == print.proxcod.get(3)) {
                int proximo = print.getProxcodigo(3);
                print = j.compara(geral[proximo]);
                System.out.println(print.desc);
                break;
            }
            if (resp == print.proxcod.get(4)) {
                int proximo = print.getProxcodigo(4);
                print = j.compara(geral[proximo]);
                System.out.println(print.desc);
                break;
            }
            System.out.println("Numero Inválido, Tente novamente!");
            resp = e.nextInt();
        }  
        //segunda parte
        //INICIO DO LOOP DO MOTOR
        while (resp != -1) {
             Atos parcial = j.compara(geral[resp]);
             System.out.println(parcial.desc);
            System.out.println("\nDigite a proxima opção!!!");
            if (parcial.proxcod.get(0) != 0) {
                System.out.println(parcial.proxcod.get(0) + " - P/ 1ª OPCAO");
            }
            if (parcial.proxcod.get(1) != 0) {
                System.out.println(parcial.proxcod.get(1) + " - P/ 2ª OPCAO");
            }
            if (parcial.proxcod.get(2) != 0) {
                System.out.println(parcial.proxcod.get(2) + " - P/ 3ª OPCAO");
            }
            if (parcial.proxcod.get(3) != 0) {
                System.out.println(parcial.proxcod.get(3) + " - P/ 4ª OPCAO");
            }
            if (parcial.proxcod.get(4) != 0) {
                System.out.println(parcial.proxcod.get(4) + " - P/ 5ª OPCAO");
            }
            resp = e.nextInt();
            //Seleciona a opção
            while (resp != parcial.proxcod.get(0) || resp != parcial.proxcod.get(1) || resp != parcial.proxcod.get(2) || resp != parcial.proxcod.get(3) || resp != parcial.proxcod.get(4)) {
                if (resp == parcial.proxcod.get(0)) {
                    int proximo = parcial.getProxcodigo(0);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(1)) {
                    int proximo = parcial.getProxcodigo(1);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(2)) {
                    int proximo = parcial.getProxcodigo(2);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(3)) {
                    int proximo = parcial.getProxcodigo(3);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(4)) {
                    int proximo = parcial.getProxcodigo(4);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                System.out.println("Numero Inválido, Tente novamente!");
                resp = e.nextInt();
            }
        }
    }
}
