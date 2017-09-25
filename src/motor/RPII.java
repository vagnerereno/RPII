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
        while (resp != -1) {
            System.out.println("\nDigite a proxima opção");
            if (print.proxcod.get(1 - 1) != 0) {
                System.out.println(print.proxcod.get(1 - 1) + "- OPCAO");
            }
            if (print.proxcod.get(2 - 1) != 0) {
                System.out.println(print.proxcod.get(2 - 1) + "- OPCAO");
            }
            if (print.proxcod.get(3 - 1) != 0) {
                System.out.println(print.proxcod.get(3 - 1) + "- OPCAO");
            }
            if (print.proxcod.get(4 - 1) != 0) {
                System.out.println(print.proxcod.get(4 - 1) + "- OPCAO");
            }
            if (print.proxcod.get(5 - 1) != 0) {
                System.out.println(print.proxcod.get(5 - 1) + "- OPCAO");
            }
            resp = e.nextInt();
        }
        //compara
        Atos parcial = j.compara(geral[resp - 1]);
        System.out.println(parcial.desc);
        //segunda parte
        while (resp != -1) {
            System.out.println("\nDigite a proxima opção");
            if (parcial.proxcod.get(1 - 1) != 0) {
                System.out.println(parcial.proxcod.get(1 - 1) + "- OPCAO");
            }
            if (parcial.proxcod.get(2 - 1) != 0) {
                System.out.println(parcial.proxcod.get(2 - 1) + "- OPCAO");
            }
            if (parcial.proxcod.get(3 - 1) != 0) {
                System.out.println(parcial.proxcod.get(3 - 1) + "- OPCAO");
            }
            if (parcial.proxcod.get(4 - 1) != 0) {
                System.out.println(parcial.proxcod.get(4 - 1) + "- OPCAO");
            }
            if (parcial.proxcod.get(5 - 1) != 0) {
                System.out.println(parcial.proxcod.get(5 - 1) + "- OPCAO");
            }
            resp = e.nextInt();
            //Seleciona a opção
            while (resp != parcial.proxcod.get(1 - 1) || resp != parcial.proxcod.get(2 - 1) || resp != parcial.proxcod.get(3 - 1) || resp != parcial.proxcod.get(4 - 1) || resp != parcial.proxcod.get(5 - 1)) {
                if (resp == parcial.proxcod.get(1 - 1)) {
                    int proximo = parcial.getProxcodigo(1 - 1);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(2 - 1)) {
                    int proximo = parcial.getProxcodigo(1 - 1);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(3 - 1)) {
                    int proximo = parcial.getProxcodigo(1 - 1);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(4 - 1)) {
                    int proximo = parcial.getProxcodigo(1 - 1);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                if (resp == parcial.proxcod.get(5 - 1)) {
                    int proximo = parcial.getProxcodigo(1 - 1);
                    parcial = j.compara(geral[proximo]);
                    System.out.println(parcial.desc);
                    break;
                }
                System.out.println("Numero Inválido, Tente novamente");
                resp = e.nextInt();
            }
        }
    }
}
