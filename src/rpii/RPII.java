package rpii;

import atos.Ato0;
import audio.Som;
import atos.Ato1;
import atos.Ato2;
import java.util.Scanner;
import raca.Anao;
import raca.Elfo;
import raca.Humano;
import raca.Orc;
import raca.Undead;
import sun.audio.AudioStream;

public class RPII {

    public static void main(String args[]) throws Exception {
        // new janela().setVisible(true);
        Scanner input = new Scanner(System.in);
        int resp;
        String nome;
        resp = 0;
        System.out.println("Bem vindo ao MUD, Oque deseja fazer? ");
        while (resp != 1 || resp != 2 || resp != 3) {
            System.out.println("1- Iniciar novo jogo 2- Escolher onde comecar o jogo 3- Obter ajuda");
            resp = input.nextInt();
            if (resp > 0 && resp < 4) {
                if (resp == 1) {
                    Ato0 x = new Ato0();

                    Ato1 c = new Ato1(x.criarJogador());
                    c.Enredo_1();
                    System.out.println("Você está pronto para começar essa jornada? 1- SIM 2- AINDA NAO");
                    int res = input.nextInt();
                    if (res == 1) {
                        c.fase_1();
                    }
                    break;
                }
                if (resp == 2) {
                    while (resp != 1 || resp != 2 || resp != 3) {
                        System.out.println("1-Iniciar no Ato1   2-Iniciar no Ato2   3-Iniciar no Ato3");
                        resp = input.nextInt();
                        if (resp == 1) {
                            Ato0 ato = new Ato0();
                            ato.criarJogador();
                            Ato1 c = new Ato1(ato.criarJogador());
                            //Som.parar(musica);
                            c.Enredo_1();
                            break;
                        }
                        if (resp == 2) {

                            Ato0 atos = new Ato0();
                            Ato2 c = new Ato2(atos.criarJogador());
                            //Som.parar(musica);
                            c.Enredo_2();
                            break;
                        }
                        System.out.println("Opcao invalida, tente novamente!\n"
                                + "1-Iniciar no Ato1   2-Iniciar no Ato2   3-Iniciar no Ato3");
                        resp = input.nextInt();
                    }
                    break;
                }
                if (resp == 3) {
                    break;
                }
            }
            System.out.println("Opcao invalida, tente novamente!\n"
                    + "1- Iniciar novo jogo 2- Escolher onde comecar o jogo 3- Obter ajuda");
            resp = input.nextInt();
        }
    }
}

