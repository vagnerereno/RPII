package motor;

import atos.Ato0;
import atos.Ato1;
import audio.Tocador;
import java.util.Scanner;
import motor.EnumEspecialidades;

public class RPII {

    public static void main(String args[]) throws Exception {
        Tocador.play("audio/musica_fase1.wav");
        Scanner e = new Scanner(System.in);
        int resp = 0;
        System.out.println("Bem vindo ao MUD, O que deseja fazer? ");
        while (resp != 1 || resp != 2 || resp != 3) {
            System.out.println("1- Iniciar novo jogo  2- Sobre o jogo  3- Obter ajuda");
            resp = e.nextInt();
            if (resp == 1) {
                Ato0 x = new Ato0();
                Scanner input = new Scanner(System.in);
                System.out.println("Olá jogador, qual o seu nome?");
                String nome = input.next();
                System.out.println(nome + " Qual especialidade você quer ter?");
                System.out.println(" 0 - Arqueiro - ");
                System.out.println(" 1 - Guerreiro - ");
                System.out.println(" 2 - Mago - ");
                int especialidade;
                especialidade = input.nextInt();
                System.out.println("Então " + nome + " qual raça você gostaria de ser?");
                System.out.println("0 - Anão -");
                System.out.println("1 - Elfo - ");
                System.out.println("2 - Humano - ");
                System.out.println("3 - Orc - ");
                System.out.println("4 - Undead - ");
                int raca;
                raca = input.nextInt();

                Ato1 c;
                c = new Ato1(x.criarJogador(nome, EnumEspecialidades.values()[especialidade], EnumRacas.values()[raca]));
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
        int opcao = 1;
        for (int i = 0; i < print.proxcod.size(); i++) {
            System.out.print("(" + print.proxcod.get(i) + ")" + " Opção " + opcao);
            System.out.print("   ");
            opcao++;
        }
        boolean valido = false;
        do {
            System.out.println("");
            resp = e.nextInt();
            for (int cod = 0; cod <= 4; cod++) {
                if (resp == print.proxcod.get(cod)) {
                    int proximo = print.getProxcodigo(cod);
                    print = j.compara(geral[proximo]);
                    System.out.println(print.desc);
                    valido = true;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Numero Inválido, Tente novamente!");
            }
        } while (!valido);
        //segunda parte
        //INICIO DO LOOP DO MOTOR
        while (resp != -1) {
            Atos parcial = j.compara(geral[resp]);
            System.out.println("\nDigite a proxima opção!!!");
            opcao = 1;
            for (int i = 0; i < parcial.proxcod.size(); i++) {
                System.out.print("(" + parcial.proxcod.get(i) + ")" + " Opção " + opcao);
                System.out.print("   ");
                opcao++;
            }
            valido = false;
            do {
                System.out.println("");
                resp = e.nextInt();
                for (int cod = 0; cod <= 4; cod++) {
                    if (resp == parcial.proxcod.get(cod)) {
                        int proximo = parcial.getProxcodigo(cod);
                        parcial = j.compara(geral[proximo]);
                        System.out.println(parcial.desc);
                        if (parcial.som != null) {
                            Tocador.play("audio/" + parcial.som);
                        }
                        valido = true;
                        break;
                    }
                }
                if (!valido) {
                    System.out.println("Numero Inválido, Tente novamente!");
                }
            } while (!valido);
        }
    }
}
