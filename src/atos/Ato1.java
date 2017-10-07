package atos;

import ItemJogo.Comida;
import audio.Som;
import static audio.Som.parar;
import java.util.Scanner;
import sun.audio.AudioStream;
import ItemJogo.Inventario;
import ItemJogo.Item;
import ItemJogo.ItemAtaque;
import ItemJogo.ItemDeCombate;
import ItemJogo.Itens;
import inimigos.AnaoIA;
import java.util.ArrayList;
import java.util.Scanner;
import raca.Anao;
import raca.Elfo;
import raca.Humano;
import rpii.Arqueiro;
import rpii.Especialidade;
import rpii.Guerreiro;
import rpii.Raca;

public class Ato1 {

    private Raca jogador;
    private Raca jogadorTeste;
    private Inventario dispensa;
    private String nome;
    
    public static void main(String[] args) {
        Ato0 a0 = new Ato0();
        Ato1 as = new Ato1(a0.criarJogador());
        as.abrirInventario(as.getDispensa(), "dispensa");
    }

    public Ato1(Raca jogador) {
        this.jogador = jogador;
        inicializarJogador();
        // Ato0 atinho = new Ato0();
        // this.jogador = atinho.criarJogador();
        // abrirInventario(getDispensa(), "dispensa");
    }

    public long Enredo_1() throws Exception {
        Som.fase1();
        System.out.println("");
        System.out.println(jogador.getNome() + ", vive numa pequena vila hermitao, se exilou, passado obscuro voltando de uma cacada, avista fumaca vindo da vila proxima \n"
                + "onde estao todos os seus amigos, encontra um sobrevivente nos escombros, que lhe conta quem destruiu, vagamente, e morre() \n"
                + "foi a caravana... disse o sobrevivente usando toda sua energia que o mantinha vivo " + jogador.getNome() + " se lembra que eles estão buscando artefatos\n"
                + "para reviver inimigo pica que tem poderes de mandar em criaturas e esse inimigo so pode ser derrotado com armas imbuídas com uma \n"
                + "magia perdida dos antigos contos de taodistante agora, precisa achar pedacos de adamantium pra montar ritual de criacao dessas \n"
                + "armas sagradas! furioso, " + jogador.getNome() + " vai para sua casa se preparar para a sua jornada em busca de adamantium para conseguir sua vinganca\n"
                + " Mas tome CUIDADO! pois o caminho possui altos exercitos e alguns lideres q comandam a hierarquia da caravana");
        fase_1();
        return 0;
    }

    public long fase_1() throws Exception {
        Scanner e = new Scanner(System.in);
        System.out.println("."
                + ".#####...######..##...##..........##..##..######..##..##..#####....####..\n"
                + ".##..##..##......###.###..........##..##....##....###.##..##..##..##..##.\n"
                + ".#####...####....##.#.##..........##..##....##....##.###..##..##..##..##.\n"
                + ".##..##..##......##...##...........####.....##....##..##..##..##..##..##.\n"
                + ".#####...######..##...##............##....######..##..##..#####....####..\n"
                + ".........................................................................");
        System.out.println("Pois bem, então " + jogador.getNome() + " parte em sua longa jornada.\n"
                + "Nos arredores da vila Kenko, você descança, sem abrir os olhos voce pensa: acordo ou durmo mais um pouco?\n"
                + "1-SEGUIR DORMINDO   2-ACORDAR");
        int resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                Som.galinha();
                System.out.println("As galinhas cacarejam enlouquecidamente anunciando o novo dia, por vezes você sente vontade de dar cabo delas \n"
                        + "devido a irritação sonora recorrente. Agora desperta por completo.");
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-SEGUIR DORMINDO   2-ACORDAR");
            resp = e.nextInt();
        }
        System.out.println("Abrindo os olhos, ainda meio confuso, percebe que esqueceu de apagar a vela, e agora o cheiro de cera invade o recinto.\n"
                + "░▒░░░░░░░░░░░░░▒░░░░░░░▒░░░░░░░░░░░░░░\n"
                + "░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░▒\n"
                + "░▒░░░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░░░▒░░░░░░░░\n"
                + "░▒░░▒░▒░▒░▒░▒░▒░▒▒▒▒▒░▒░▒▒▒░▒░▒░░░░░░░\n"
                + "░▒░▒▒▒░▒░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▒░▒░░░▒\n"
                + "░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▒░▒░░░░▒\n"
                + "░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░░░▒\n"
                + "░▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░░▒\n"
                + "░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒\n"
                + "░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▒▒▒▒▒▒▒▒▒░▒▒▒░▒▒\n"
                + "░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▓███▓▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                + "░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▓██▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                + "░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                + "░▒▒░▒░▒▒▒▒▒▒▒▒▒▒░▓████░▒▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                + "░▒░▒░▒▒▒▒▒▒▒▒▒▒▒░█████░▒▒▒▒▒▒▒░▒░▒▒▒░▒\n"
                + "░▒▒░░░▒░▒▒▒▒▒▒▒▒░████▓░▒▒▒▒▒▒▒▒▒▒░▒░░▒\n"
                + "░▒░░░▒░▒▒▒▒▒▒▒▒▒░████▓░▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                + "░▒░░▒░▒▒▒░▒░▒▒▒░░██▓▓▓░░▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                + "░▒░▒░▒░▒▒▒▒▒▒▒▒░░██▓▓▓░▒▒▒▒▒▒▒▒▒▒▒░░░▒\n"
                + "░▒░░▒░▒░▒░▒░▒▒▒░░██▓▓▒░▒▒▒▒▒▒▒▒░▒░▒░░▒\n"
                + "░▒░░░▒░▒▒▒░▒▒▒▒▒░██▓▓▒░▒▒▒▒▒▒▒▒▒░▒░▒░▒\n"
                + "░▒░░░░▒░▒░▒▒▒▒▒░░▓█▓▓▒░▒▒▒▒▒▒░▒▒▒▒▒░▒▒\n"
                + "░▒░▒░▒▒▒░▒▒▒▒▒▒▒░██▓▓▒░▒▒▒▒▒▒▒▒▒░▒░▒░▒\n"
                + "░▒▒░▒░▒░▒▒▒▒▒▒▒░░▓█▓▓▒░▒▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                + "░▒░▒░░░░░░░▒░░▒░░██▓▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                + "░▒░░░░▒▒▒▒▒▒▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒░░░▒░▒▒\n"
                + " ░░░░▒▒▒▒░░▒▒▒▒▒░░░░░░░░░░░░     ░░░░░\n"
                + "░░░░░░▒▒▒░                   ░▒▒▒▒░░░░\n"
                + "▓█████▓▓▒▒▒                 ▒▒▒▒▓▓████\n"
                + "██████████████████████████████████████"
                + "\n1-APAGAR VELA   2-IR AO BANHEIRO");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("\n"
                        + "░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▓██▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                        + "░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                        + "░▒▒░▒░▒▒▒▒▒▒▒▒▒▒░▓████░▒▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                        + "░▒░▒░▒▒▒▒▒▒▒▒▒▒▒░█████░▒▒▒▒▒▒▒░▒░▒▒▒░▒\n"
                        + "░▒▒░░░▒░▒▒▒▒▒▒▒▒░████▓░▒▒▒▒▒▒▒▒▒▒░▒░░▒\n"
                        + "░▒░░░▒░▒▒▒▒▒▒▒▒▒░████▓░▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                        + "░▒░░▒░▒▒▒░▒░▒▒▒░░██▓▓▓░░▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                        + "░▒░▒░▒░▒▒▒▒▒▒▒▒░░██▓▓▓░▒▒▒▒▒▒▒▒▒▒▒░░░▒\n"
                        + "░▒░░▒░▒░▒░▒░▒▒▒░░██▓▓▒░▒▒▒▒▒▒▒▒░▒░▒░░▒\n"
                        + "░▒░░░▒░▒▒▒░▒▒▒▒▒░██▓▓▒░▒▒▒▒▒▒▒▒▒░▒░▒░▒\n"
                        + "░▒░░░░▒░▒░▒▒▒▒▒░░▓█▓▓▒░▒▒▒▒▒▒░▒▒▒▒▒░▒▒\n"
                        + "░▒░▒░▒▒▒░▒▒▒▒▒▒▒░██▓▓▒░▒▒▒▒▒▒▒▒▒░▒░▒░▒\n"
                        + "░▒▒░▒░▒░▒▒▒▒▒▒▒░░▓█▓▓▒░▒▒▒▒▒▒▒▒▒▒░▒░▒▒\n"
                        + "░▒░▒░░░░░░░▒░░▒░░██▓▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒░▒\n"
                        + "░▒░░░░▒▒▒▒▒▒▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒░░░▒░▒▒\n"
                        + " ░░░░▒▒▒▒░░▒▒▒▒▒░░░░░░░░░░░░     ░░░░░\n"
                        + "░░░░░░▒▒▒░                   ░▒▒▒▒░░░░\n"
                        + "▓█████▓▓▒▒▒                 ▒▒▒▒▓▓████\n"
                        + "██████████████████████████████████████"
                        + "\nVela apagada!\n ");
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-APAGAR VELA   2-IR AO BANHEIRO");
            resp = e.nextInt();
        }
        System.out.println(jogador.getNome() + " vai até o lavabo atirar agua em sua face para dissipar a preguiça ainda remanescente, a agua está\n"
                + "um arrepio percorre todo o seu corpo, você encara-se no velho espelho e contempla sua triste feição\n"
                + "trazendo flashes das lembranças de seu passado de mercenário, tempos de matança em prol do atual reino.\n"
                + "Voltando a si, ainda contemplando sua face no reflexo:\n");
        /* + "Qual será sua classe?\n"
                + "1-HUMANO   2-ELFO   3-ORC   4-ANAO   5-UNDEAD");
        resp = e.nextInt();
        while (resp != 1 || resp != 2 || resp == 3 || resp == 4 || resp == 5) {
            if (resp == 1) {
                break;
            }
            if (resp == 2) {
                break;
            }
            if (resp == 3) {
                break;
            }
            if (resp == 4) {
                break;
            }
            if (resp == 5) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-HUMANO   2-ELFO   3-ORC   4-ANAO   5-UNDEAD");
            resp = e.nextInt();
        }
        System.out.println("1-ESCOLHER NOVAMENTE   2-IR PARA O QUARTO");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("Qual será sua classe?\n"
                        + "1-HUMANO   2-ELFO   3-ORC   4-ANAO   5-UNDEAD");
                resp = e.nextInt();
                while (resp != 1 || resp != 2 || resp == 3 || resp == 4 || resp == 5) {
                    if (resp == 1) {
                        break;
                    }
                    if (resp == 2) {
                        break;
                    }
                    if (resp == 3) {
                        break;
                    }
                    if (resp == 4) {
                        break;
                    }
                    if (resp == 5) {
                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "1-HUMANO   2-ELFO   3-ORC   4-ANAO   5-UNDEAD");
                    resp = e.nextInt();
                }
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ESCOLHER NOVAMENTE   2-IR PARA O QUARTO");
            resp = e.nextInt();
        }*/
        System.out.println("Então você dirige-se para o quarto para equipar-se\n"
                + "Hora de comer alguma coisa\n"
                + "1-IR PARA A DISPENSA   2-CAÇAR SUA COMIDA");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                abrirInventario(getDispensa(), "dispensa");
                System.out.println(jogador + " percebendo a pouca quantia de alimento em sua dispensa decide ir caçar na floresta");
                System.out.println("Mochila!");
                abrirMochila(jogadorTeste.getInventario(), "mochila");
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-IR PARA A DISPENSA   2-CAÇAR SUA COMIDA");
            resp = e.nextInt();
        }
        System.out.println("Olhando para perto da porta da frente, encontra sua arma\n"
                + "1-SAIR DA CASA   2-PROCURAR POR COMIDA DENTRO DA CASA");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 2) {
                System.out.println("\n"
                        + "                                  ░▒▒▓▓▓▓▓▓▓▒▒░                                 \n"
                        + "                           ▒▓▓███████▓▓▓▓▓▓▓███████▓▓▒░                         \n"
                        + "                      ▒▒▓▓███▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▒▓▓▓▓██████▓▒                     \n"
                        + "                   ▒▓██▓▒░▒░▓▓██████████████████████▓▓▓▒▒▒███▒                  \n"
                        + "                ▒███▓░░▓███▓█████████████████████████████▓▓▓▓██▓▒               \n"
                        + "              ▒███░░▓██▓███▓▓█████▓█████████████████████████▓▓▓███▓             \n"
                        + "             ███▒░▒▓███▓███▓▓█████▓███████████████████████████▓▒▒███░           \n"
                        + "            ███░░██▒███▓▓███▓█████▓█████████████████████████████▒░███▒          \n"
                        + "           ███▒▒█▒██▒███▓███▒█████▓█████████████████████████████▓▓▒███░         \n"
                        + "          ▓███▒█▓▓▓█▓▓██▓▓██▓█████▓▓█████████████████████████▓█▓██░████         \n"
                        + "        ▒▓▒▓▒ ░▓▓▓▓▓█▒██▓▓██▓▓▓▓▓▓▓▓█████████████████████████▓█▓█▓░▒▒▓▓         \n"
                        + "       ▒▓▓ ███░▓▓▓▓▓██▒██▓▓▓▓▓█████▓████████████████████████▓▓▓█▓▒ ▒██▓ ▒       \n"
                        + "      ░█▓▓ ▓██▒ ▓▓▓▓▒█▓▓▓▓▓██▓██████████████████████████████▓█▓▓▒ ░███░▒▓▒      \n"
                        + "      ▒▓▓█▒ ███░ ▒▓▓▓▒▓▒██▓███▓███████████████████████████▓▓█▓▓▓░ ███▒░▓▒▓░     \n"
                        + "      ▒█▓▓█▒ ▓██▒ ░▒▓▒▒█▓██▓███▓▓░  ░▒░▓▓▓▓████████████████▓▓█▓░ ███░▒▓▓▓▓▒     \n"
                        + "     ▒▓▓▓█▓█▓ ▒███▒ ░▒▓▓█▓██▓▒ ▒▒▒░  ░     ░ ░▒▒▓▓██████████▓▒▒▓██▓░▓▓█▓▓█▓     \n"
                        + "   ░ █▒▓█▓▓███▒░▒███▒░▒▒▒▓▓▓█▓▓▓███████████████▓▓████▓██▓▓▓▒▒▓██▒░▒▒██▒█▓▓▒░ ░  \n"
                        + "  ▒░▒▓█▓▒▓██████▒░▒▓███▓▒░░███████████████████████████▓▓▓▓█▓▓▓░▒▓██▓▓██▓█▒▓▓ ▒  \n"
                        + "  ▓░▓▓█▓▓▓███▓▓████▓▓▓▓▓▓▓▓▒▒▒▒▒ ░▒▒░░▒▒▒▓▓▓▓▓▓▓▓▓▓█▓▓▒▓▓▒▒▒▒▓▓▓████▓▓██░█▓█▒▒▒ \n"
                        + " ░▓░▓█▓▓█▓▒▓▓▓████████▓▓▓▒▒▒▒▒▒▒░░▒░░░░    ░░░░       ░░▒▒▓████▒▓████▓▒▓▓▓█▓▓░▓ \n"
                        + " ▓▒▒▓█▓████▒▒▓██████████████▓▓▒▒░░░            ░░▒▒▓▓███████████▒███▓▒░██▓█▓▒█▓░\n"
                        + " █▓▓ ▓████▓██▓▒▓▓█▓█████████████████████████████████████▓███████▓▓▓▒▓█▓▓█▓▒█░█▒▓\n"
                        + " █▓▓▒ ███▓▓████▓▓▒▒▓▓███████████████████████████████████▓▓████▓▓▒▒▓████▒▓██░▓▓▓▒\n"
                        + " ░██▓▒ ▓█▓████████▓▓▓▒▓▓▓██████████████████▓█████████████▓▓▓▓▒▓▓█▓▓████▓▓█░▓▓░█░\n"
                        + "  ██▓▓▓▒░█████████████▓▓▓▓▒▓▓▓▓▓▓██████████▓██████▓▓▓▓▓▓▓▒▓▓██████▒█████▒░▓▒▓█▓ \n"
                        + "   ▓██▓▓▓▒▓████▓███████████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓█▓▓███████▓▓██▓░▒▓▓▓▓█  \n"
                        + "    ▓██▓▓▓▒▒▓▓▓▓██████████████████████▓▓▓▓▓▓▓█████████████▓████████▓▓▒▒▒▓▒███   \n"
                        + "     ░▓██▓▓▓▓▓▓▓███████████████████████████▓██████████████▓██████▓▒▒▒▒▓▓███▓    \n"
                        + "       ▒████▓▓▓▓▓▓▓▓▓██████████████████████▓██████████████▓▓█▓▒▒▒▒▒▓▓████▓      \n"
                        + "         ░▓████▓▓▓▓▓▓▓▓▓▓▓█████████████████▓███████████▓█▓▓▒▒▒▒▒▓▓█████▒        \n"
                        + "            ░▓██████▓▓▒▓▒▒▒▓▓▓▓▓▓██████████▓███▓▓▓▒▒▒▓▓▒▒▒▒▓▓▓██████▒           \n"
                        + "                ▒▓███████▓▓▓▒▒░░▒▒░░░░░░▒▒▒░░░▒▒▒▒░▒▒▒▒▓▓███████▓▒              \n"
                        + "                    ░▒▓█████████▓▓▓▓▒▒▒▒▒▒▒▓▒▓▓▓▓██████████▒▒░                  \n"
                        + "                           ░▒▒▓▓▓████████████████▓▓▓▒▒░                         ");
                System.out.println("Voce nao encontra nada, sua barriga esta roncando e sua saude diminuindo, entao sai da casa.");
                break;
            }
            if (resp == 1) {

                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-SAIR DA CASA   2-PROCURAR POR COMIDA DENTRO DA CASA");
            resp = e.nextInt();
        }
        Som.porta();
        System.out.println("\n"
                + "                                                                              \n"
                + "                              ░                                               \n"
                + "                            ░ ░▒                                              \n"
                + "                            ░░ ▒░                                             \n"
                + "                             ▒ ░                                              \n"
                + "                             ▓ ▒▒                                             \n"
                + "                            ▒█▓▓█▓                                            \n"
                + "                           ░▒░░░▓█                  ░                         \n"
                + "                            ▒▒▒▒█▓                  ░░                        \n"
                + "                            ▒▒▒▒█▓                   ░░                       \n"
                + "                            ▒▒░░█▓                    ░                       \n"
                + "                      ░▒▓▓▓▓▓▓▓▒█▓                    ▒                       \n"
                + "                    ▒▓████████████▓░                 ▒█▓░                     \n"
                + "                  ░███▓▓▓▓███████████▓▒░░            ▒▒▓▓                     \n"
                + "                 ▓█▓▓▓████▓█▓███▓███████████▓░       ▒▒▓▒                     \n"
                + "               ░█▓    ▒▓███▓▓▓█▓▓▓█▓███████████      ▒▒▓▒                     \n"
                + "              ░█▒       ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████▓ ░▒▓█▓███▓                   \n"
                + "             ░█▒ ▒▓▓▓▒▒░ ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓█▓████▓                 \n"
                + "            ░█░ ░▒▓█▓▓█▒  ▒█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████░               \n"
                + "           ░█▒ ░░ ▒████▒   ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓              \n"
                + "           █▒  ░░░▒▓▓██▒ ░  ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓            \n"
                + "          ▓▓ ░░▒░░▒▓▓▓▓░░░░  ▒▓▓▓▓▓▓▓▓▓▓█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████           \n"
                + "         ▓▓  ░▒▒▒░░▒░░░░░▒░░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓██          \n"
                + "        ▓█  ▒▒▒▒░░░░░░░░▒▒▒▒░  ▓▓▓▓▓▓▓▓▓▓▓▓▓█▓███▓▓▓▓▓▓▓▓▓▓▓▓▓█▓   ██         \n"
                + "       ▒█░ ░▒▒▒▒░ ░▒░░░  ▒▒▒▒░ ░▓▓▓▓▓▓▓▓▓▓▓███████▓▓▓▓▓▓▓▓▓▓▓██░ ░  ██        \n"
                + "       ▓▒ ░░▒░░░▒▒▒▒▒▒▒▒▓░░░░░░ ░▓▓▓▓▓▓▓█████▓░░▒▓███▓▓▓▓▓████▓▒▒▒▒  █▓       \n"
                + "       ░ ░░▒▒▒░░█▓▓██████▒ ▒▒░░░▒░▒ ▒███░░░ ░▒▒   ▒▓░████▓▒▒▓▓▒███▒▒░▒█       \n"
                + "         ▒▓░░▒▒░▓▓▓▓▓▓▓▓█▒░▒░░▒░▓░  ░██▓  ░ ░██░   ░ ████   ░▓▒▓█▓▓▓▓         \n"
                + "         ▒▓▒░░▒░▓▒▓▓▓▓███▒░░▒▓▒▒▓░  ░▓▓▓░░░░░██▒░  ░░██▓▓░░░▒▓▓▓▓▓▓▓▒         \n"
                + "         ▒▒▒▒░░░█▓▒▓▓████▒ ▒▒▒▒░▓░  ░▓▓▓░░▒▒░▓█░░░░░▒██▓▓░▒░▒▓▓▒▓▓▒▓▓         \n"
                + "         ░▒▒▒▒░▒▒▓▒▓▓▓▓▓▒░░▒░▒▒▒▓▓▓█▓▓▒▒░░▒▒░░░░░░░░░░░▒▓▒▒░░▓▒▓▓▓▓▓█▒        \n"
                + "         ░▓▒▓▓▒▓▓▒▓█▓▒▓▓▓▒░ ▒▒▒▓▒▓▓▓▓██▓▒ ▒▒▒░░░▒  ░░░▒▓▓▓▓███▓▓███████░      \n"
                + "       ░▒▓▓▒▓▓▒▒▒░▒▒░░░▒▒▓▓▒▒▓▒▒▒▒░░▒▒▓▒░░▒▒░░░░░░▒█▓▒▒▒▒▒▒▓▒▓█▓▒▓▓▓████▓░    \n"
                + "      ▓▓▓▒░▒▒░░▒▒░░░░ ░▒░▒▓▒▒▒▒▓▒▒ ░░▒▓▓▓▒▒▒░░░░░▓▓▓▒▒▓▒▒▒░▒▒▒▒░░ ▒░▒▓██▓     \n"
                + "     ░▒▒░░▒▓▓▒▒▒▒▒░ ░░░▒▒░ ░▒▓▒░░░ ░▒▒▒▒░▒▓▓▒▒▒▒▒▓▒      ░░      ░            \n"
                + "            ░                 ░                                               "
                + "\nAo sair, vislumbra seu pequeno casebre de madeira cedido pelo ancião da vila após voce salva-lo em certa ocasião\n"
                + "este imóvel é sua morada a alguns anos, sempre solitariamente acolhendo seus pensamentos e seu corpo cansado.\n"
                + "Virando-se para a densa floresta de Lavitan\n"
                + "1-SENTAR UM POUCO  2-ENTRAR NA FLORESTA");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println(jogador.getNome() + " recupera um pouco de sua saude durante seu descanso, depois disso adentra a floresta de Levitan.");
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-SENTAR UM POUCO  2-ENTRAR NA FLORESTA");
            resp = e.nextInt();
        }
        Som.entradaFloresta();
        System.out.println("\n"
                + "█████████████████████████████████▓ █████████████████████████████████████████████\n"
                + "████████████████████████████████▓▓▓▓████████████████████████████████████████████\n"
                + "███████████████████████████████▒▒▒▒▒▒▒███████████████████████████▓██████████████\n"
                + "██████████████▒░█████████████▓▒▒▒▒▒▒▒▒▒▓████████████████████████▒▒▒█████████████\n"
                + "████████████▓▒▒▒▒▓██████████▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████▓█████████████▓▓▓▒▒▓███████████\n"
                + "███████████▒▒▒▒▒▒▓▓███████▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓▒▒▓██████████▒▓▓▒▒▓▒▓██████████\n"
                + "██████████▒▒▒▒▒▒▒▒▓▒▓███▒░░░░▒░░░▒▒▒▒▒░▒░▒░ ░██▓▒▓▒▒▒████████▒▓▒▒▒▒▒▒▒▒█████████\n"
                + "████████▓▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▓▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒█▓▓▓▒▒▒▒▒▒▒▓████▓▒▒▒▒▒▒▒▒▒▒▒▒▒███████\n"
                + "██████▓▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓█ ░▒░▒▒░▒▒▒░▒▒░  ░▓████\n"
                + "█████░░░▒▒▒▒▒░▒▒▒░▒▒▒░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒████\n"
                + "█████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▒ ░▒▓▒ ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ ░  ▒░▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██████\n"
                + "████▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒░▒▒▒▒▒░▒▒░▒▓▒ ▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░████\n"
                + "██░ ░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓ ░▓▓▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▓▓▒▒▒▓▒▒▒░░▒▒░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███\n"
                + "██▓███▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒ ▒░ ▒▒▒▒▒░▒▒▒▒▒░░▒▒▒▒░ ▒▒▒▒░▒▒▒▒▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓████\n"
                + "████▓░▒░▒░░▒▒▒▒▒▒▒░░▒░░░░▓▒▒▒▒▒▒▒▒░▒░▒▒▒▒▒▒▒ ░░░░▒ ░▒▓▒░▓▒░▒░░░▒▒▒▒▒▒▒░▒░▒▒▒ ▒▓█\n"
                + "███▓░▒░░▒▒▒░░▒▒▒░░▒▒▓▓░▒▓▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▓▒ ▒▒▒▒▓▒▒░ ░ ▒▒▒▒▒▒░▒▒▒░░▒▒▒▒ ░▒▒░ ▒\n"
                + "█████▓▓▒▒▒▒▒▒▒░▒▒▒▒▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒░░▒▒▒▒░▒▒▒▓▓▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒░▓████\n"
                + "███▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒░░▒▒▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░███\n"
                + "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒░░  ▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓  ░▒▒  ▒▒▒▓▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░  ░█\n"
                + "▓ ░░▒░▓▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒░▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ ▒▒▒▓░ ▒▒░ ▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓░░█▓▒░▒\n"
                + "▓▓███▒▓▒▒▒▒▒▒▒▒▒▒▒▓▓▒▓░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▓ ░▒▒▓▒▒▒▓▒░▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ █████\n"
                + "████▒▓▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒░▒▓▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒ ▒▒▒▓▓▒▒ ▓▓▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒ ▓███\n"
                + "███▓▓▓▒▒░░░░░░░▒▒▒▒▒░░█▒▒▒▒▒▒▒     ░░░▒▒▒▒▒▒▒▓░ ░░░▒░ ▒▓░▒▒▒▒░ ░░░░░░▒▒▒▒▒▒▒ ▓██\n"
                + "██▓░▒░░ ░░▒        ░ ▓▒░░░░░░▒  ░░░ ░  ▒░░░░░▒▓      ░▓░░░░░▒░ ░  ░  ░░░░░░▒▒ ██\n"
                + "██░░ ░▒▓▓▒▒ ░▒▓▒░ ▒▓  ░     █▓░ ▓▓▓▒░  ░░▒░░▒  ▒ ▒▒░ ░░░▒▒▒▒░  ▒▒▓▓░ ▓▒▒░░▒▒░ ▓█\n"
                + "██▒▓█████▓  ▒▓▓▓▓ ███████████  ░▓▓▓▓▓ ████████▒ ▒▓▓▒ ███████▒ ░▒▓▓▓░▓████████▓██\n"
                + "██████▓▓███ ░▒▓▓▓ ████████████▒ ▒▒▒▓▒ ████▓████ ▓▓▓▒▒█████████ ▒▓▓▓░░████▓██████\n"
                + "▓████▓▒▒▓██ ▒▒▒▒▒ ▓▒▓████▓▓░██▓ ▓▒▒▒▒░▓█▓▒▒▓███ ▓▒▒░▒██▓ ██▓██ ░▒▒▓░▓▒▓██ ▒█████\n"
                + "▒ ▒█▓▒▒░▒▒▒▒▒▓▒▒▒▒▒ ▒▓▓▓▒░▓▒▓▓▒▒▒▓▒▒▓▓▒▒▒▒▒▒▓█  ▒░▒▒▒▓▒▒ ▓▒ ░▓ ▒▒▒▒▒▓▒▒▓▒▒▒▒▓▓▒▒\n"
                + "██░░▒▒░▒░▒▒▒▒▒▒▒▒▒▒░ ░▒░░░▒▒░░▒░▒░▒▓▒░▒▒▒░░▒▒▒░ ▒▒▓▒▒▒▒░▒▒▒▒▒▒▓▒ ▒▒▓▒░░░▒▒░▒▒ ▒█");
        System.out.println("\nvoce caminha calmamente por uma pequena trilha, ela mal pode ser vista pois a vegetação muito densa\n"
                + "mas sua notável experiência ela se torna apenas uma trilha normal, seguindo mais adiante voce depara-se com\n"
                + "uma bifurcação.\n"
                + "Ao norte leva para uma grande elevação, a leste, a segunda trilha entra em um terreno mais baixo e umido.\n\n"
                + "                                               \n"
                + "                      ▒▒░                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▓▒           ▒▒▒░░░     \n"
                + "                     ░▒▓▒        ░▒▒▒▓▓▓▒▓▒▓▓▓░\n"
                + "                     ░▒▒▒      ░▒▒▒░▓▒▒▒ ▒▒▓▒  \n"
                + "     ░░▒▒▒░░         ░▒▓▒    ░▒▒▒▒ ░░ ░▒▒▓▓▒   \n"
                + "  ▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░  ▒▒░ ░░▒▒▒▒▒▒▒▒▒▒▓▓▓▒░    \n"
                + "  ▒▒░░░  ░░░▒▒▒▒▒▒▒░░░ ▒░▒▒▒░░░░░░▒▒▒▒░        \n"
                + "   ░▒░ ░▒░▒▒░▒▒░░░░░▒▒▒ ░▒▒▒▒▒▒▒▒░░░░          \n"
                + "    ░░░▒▒▒░░░░░░░▒▒▒▒▒▒░░▒▒▒  ▒▒▒▒▒▒▒▒▒▒▒░     \n"
                + "          ░░░▒▒▒▒▒▒▒▒▒▒ ░▒▒░ ▒░░░ ▒▒▒▒▒▒▒▒▒░   \n"
                + "        ░▒▒▒▒▒▒░░▒▒▒▒▒░░░▒▒▒▒▒▒▒▒ ░░░▒▒▒▒▒▒▒▒▒ \n"
                + "      ░▒▒░ ░ ░  ▒▒▒▒▒▒░▒▒  ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒ \n"
                + "     ▒▒▒▒░▒░ ▒▒▒▒▒░░  ▒▒▓░      ░░▒▒▒▒▒▒▒▒▒░   \n"
                + "    ░▒▒▒▒▒▒▒▒▒▒░     ░▒▒▓▒            ░░▒      \n"
                + "         ░░░         ░▒▒▓▒                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ░▒▒▓                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▒▓                      \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ▒▒▒▒▒                     \n"
                + "                     ▒▒▒▓▒                     \n"
                + "                    ░▒▒▒▒▒                     \n"
                + "                    ░▒▒▒▓▒                     \n"
                + "                     ▒▒▒▒▒                     \n"
                + "                     ▒▒▒▓░                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                 ▒    ▒▒▓                      \n"
                + "                ░█▒█▒ ░▒▒                      \n"
                + "                ▓▓██▓ ▒▒▒ ▒▒▒░                 \n"
                + "               ▒▓▓▓█▒ ▒░░▓▓█▓▒                 \n"
                + "              ░▒▒▓▓▓  ▒▒████████               \n"
                + "              ▓▓▓▓██ ░▒▒▓███████               \n"
                + "              ▒█▓▓▒     ▒▓▒                    ");
        System.out.println("1-IR PARA O LESTE  2-IR PARA O NORTE");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                irLeste();
                break;
            }
            if (resp == 2) {
                irNorte();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-IR PARA O LESTE  2-IR PARA O NORTE");
            resp = e.nextInt();
        }
        System.out.println("");
        System.out.println("PARABENS! voce acaba de concluir a primeira fase do Ato1.\n"
                + "1-INICIAR FASE 2");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("Mochila!");
                abrirMochila(jogadorTeste.getInventario(), "mochila");
                fase2();
                break;
            }
            if (resp == 2) {
                System.out.println("Mochila!");
                abrirMochila(jogadorTeste.getInventario(), "mochila");
                System.out.println("MOSTRAR STATUS");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-INICIAR ATO 2   2-VERIFICAR STATUS");
            resp = e.nextInt();
        }
        System.gc();

        return 0;
    }

    public long irLeste() throws Exception {
        Scanner e = new Scanner(System.in);
        int resp;
        System.out.println("Seguindo adiante neste caminho a vegetação diminui de tamanho, mas nao perdendo em densidade por parte das pequenas vegetações\n"
                + "voce sente em seus passos que o solo esta ficando cada vez mais umido e mole por certas vezes seus pes afundam na lama\n"
                + "caracteristica de terrenos alagados.\n"
                + ""
                + "                                                                                           \n"
                + "                                                                                           \n"
                + "                                                                                           \n"
                + "                                                                                           \n"
                + "                                                                                           \n"
                + "                             ░░     ░░ ░▒▒▒▒  ░░░░░                                        \n"
                + "                             ░░░░░░▒░▒▒░▒▒▒▒▒▒▒▒░░░░░░                                     \n"
                + "                                ░▒▒░░▒▒▒▒░░▒▒▒▒░▒░▒░▒▒░░░░░                                \n"
                + "                  ▒▒░             ░▓▒░▒▒▒░▒▒░▒▒▒▒▒▒░░▒▒▒░▒▒░                               \n"
                + "                   ░▒▒▒▒▒░▒▒▒░     ▒▒░▒░▒▒▒░░░░░▒▒▒▒▒▒▒░░░▒▒▓▒                             \n"
                + "                       ░▒▒▒▓▒▓▒▒░ ▒▒▒▒░▒▒▒▒░░░░░▒▒▒▒▒▒░░░░░▒▒▒▒▒   ░                       \n"
                + "                     ░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░▒▒▒▓▒▒░▒▒░▒▒▒░▓▓░▒░░░░░▒▒▒▒▒▒▒░▒░                   \n"
                + "                    ▒▓▒▓▒░▒▒▒░░▒▒▒▒░░▒░░▒▒░░▒▒▒▒▒▒░▒░▒▒▓▒▒▒░░▒▒▓▒▓▓▒▒▒▒▒▒▒░░               \n"
                + "                   ░▒▒░▒▒░▒▓▓░▒▒░▒▓▒▒░▒▒░▒▒░▒▒▒░░▒▒░▒▒▒▒▓▓▒▒▒░▒▒▒▓▒▒▓▒▒▓▒▒▒▒▒▒             \n"
                + "                  ▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▓▒▒░░░▒▓▒▒▒▒░░▒░░▒▒▒▒▒░░▒░▒▒▒▒▒▒▒▓▓▓▒▒▓▓▒▒▒▒▓▓░           \n"
                + "                 ░▒▒▓▓▓▓▓▒░▒▒▒▒░▒▒▒▒▒░░░▒▒▓▒░▒░░▒▒░▒▒▒░▒▒▓▒▒▒▒▒▒▒▒ ▓▓▓▒░▒▓▒▒▒▒▓▓▒          \n"
                + "                 ▒▒▒▒▒    ░░░░ ░▒▒▒▒▒▒▓▓▒▒▓▓░▒▒░▒▒▒▒░▒▒░ ▒▒░▓▓▓▒▒▒▒░▒▓▒▒▒▒▒▒░░▒▒▓▓         \n"
                + "              ░▒▒▒░░░▒░░▒▒▒▒▒▓▒▒▓▓▒▒▓▓▓█▓▓▓▓▓▒▒▒░░▒░░░▒▒░ ▒▒░▒▓▒░░▓▒▒░▒▒▒░▒▓▒░▒▒▒▓▓        \n"
                + "             ▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓█▓▓▒▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒░░▒░▒░▒▒░░▒▒▒▒▓░▒░▒░▒░░▒▒▒░░▒▓▓▓▒▒        \n"
                + "          ░░▒▒▒▒░▒▓▓▒░▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒░▒▒░▒▒░▒▒ ░░▒▒░░▒▒░ ▒▓▓▓▓▒        \n"
                + "    ░░ ░░░▒░ ▒▓░▒▓▓▓██▓█▓█▓▓▓▒▒▓▓▓▓▓▒▒▒░▒▒▒░▒▒▒▒▒▒▒▒▒░░░░░░ ░▒▒░░▒░░░░░▒░░▒▒▒▒▒▒▒▓▒░       \n"
                + "    ▒▓▓▒░▒▒░ ░█▒░▓█▒▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▒▒░░▒▒▒▒░░░░░░░  ░░▒░▒▒░░░   ░░░░░▒▒▒▒        \n"
                + "     ░▒▒░░░░  ██░ ░░ ▒░ ▒░░▒▒▒▒░▒▒▒▒░▒▒▒░▒░▒▒░░░░░▒▒░▒▒▒░░░░░░▒░░░ ░       ░░░░░░▒▒        \n"
                + "      ░▒░   ▒▓░██▓░▒    ░░ ░░░▒░░░░░░░░ ░░░░░░░░░░▒▒▒▒░  ░░ ░░░     ░       ▒░░░▒▒         \n"
                + "             ▓▓ ▒▓▒▒░░░░                 ░░░░▒░▒░▒▒▒▒░   ░░         ░▒▒░▒░   ░░░░░         \n"
                + "        ▓▒                                ░░░░░░░░▒░▒░░               ▒▒▒░    ░░▒░         \n"
                + "                                             ░░░░░░▒▒░                 ▒░░     ░▒░         \n"
                + "                                        ░     ░░░░▒▒░                  ░▒░     ░▒░         \n"
                + "                                        ░▒░░   ░░▒▒▒                   ░░░     ░▒░         \n"
                + "                                        ░░░    ░░░▒░                   ░▒      ░▒░         \n"
                + "                                         ░░    ░▒▒░░                   ░░      ░░          \n"
                + "                                         ░░     ░▒░                   ░░       ░░          \n"
                + "                                         ░░     ░▒░                           ░░           \n"
                + "                                        ░░░     ░░                                         \n"
                + "                                       ░░░       ░                                         \n"
                + "                                               ░░                                          \n"
                + "                                             ░░░                                           "
                + "Ao longe ouve o som da vegetação sendo pisada ou mexida observando calmamente voce avista um imponente javali\n"
                + "os pelos escuros dão um tom sombrio a fera, contrastando com suas presas brancas como o leite, suas patas e focinho estão cobertas de lama.\n"
                + "com seu equipamento em maos, e seu instinto de caça agucado,  prepara-se para o ataque no desavisado animal.\n"
                + "aproximando-se sorrateiramente por trás da criatura, segurando firmemente sua arma e tentando fazer o minimo de barulho possivel.");
        System.out.println("1-ATACAR FEROSMENTE  2-ATACAR SILECIOSAMENTE");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                Som.javali();
                System.out.println("A criatura percebe seu movimento e começa a fugir, com muita dificuldade voce consegue alcansa-la");
                break;
            }
            if (resp == 2) {
                Som.javali();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ATACAR FEROSMENTE  2-ATACAR SILECIOSAMENTE");
            resp = e.nextInt();
        }
        Som.cervo();
        System.out.println("com um rápido e súbito movimento você lanca-se sobre a fera que num grunhido de dor e aflição cai por terra\n"
                + "ao lado, voce solta sua bolsa e empunha sua pequena adaga para dilacerar a fera e coletar sua carne e seu couro");
        System.out.println("1-ESFOLAR O ANIMAL");
        resp = e.nextInt();
        while (resp != 1) {
            if (resp == 1) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ESFOLAR O ANIMAL");
            resp = e.nextInt();
        }

        System.out.println("você começa a descarnar o animal, coletando o conteudo da caçada.");
        Som.esfolar();
        AnaoIA javaliLeste = new AnaoIA("Javali", new Guerreiro());
        Inventario loot = javaliLeste(javaliLeste.getClasseInimigo());
        abrirInventario(loot, "Javali");
        return 1;
    }

    public long irNorte() throws Exception {
        Scanner e = new Scanner(System.in);
        int resp;
        System.out.println("\n"
                + "                                                                     \n"
                + "                                                    ░░               \n"
                + "                                                    ▒▓               \n"
                + "                                                   ▒▓▓               \n"
                + "                                                   ░▓▓░  ░           \n"
                + "                                                  ░░▓▓  ▒            \n"
                + "                                                  ▒▓██▓▓             \n"
                + "                                                ░▓▓▓▓▓▒▒▒░           \n"
                + "                                                ░▒▓▓▒██▓▓▒           \n"
                + "                                                ░░░▒▓▓░░▒░░          \n"
                + "               ▒▓▓██████▓▓▒░       ░           ▒▓▓█▓▓▒▒▒▒▒░          \n"
                + "            ▒████████████████▓░   ██▓          ░░▒▒░██▒▓▓▓░          \n"
                + "          ▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▒█▓            ▓██▒              \n"
                + "        ░███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▒███▒▓█▒   ▒▒▓▓▓▒▒▓█░▓▒▒▒░░░░░      \n"
                + "       ░██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓░▓█████▓▒▓▓░▒▓██▓▓▓▓▓█▓▒▓▓▓███▓▒░     \n"
                + "       ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░█████████▒▒▓▒██▓▓█▒▒▓▓██▒▒ ░▒░░▒░     \n"
                + "      ▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓░▓████████████▒▒▒▒▒▓▒ ▓█▓░▒▓▒░           \n"
                + "      █▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▒████████████████▓▒▒▒▓▒███░▒▒▒▓█▓▓▒▒░░    \n"
                + "     ▒█▓▓▓▓▓▓▓▓▓▓▓▓█▓███▓▒▒█████▓█████▒▓██▒▒█▓▒▓▓▓████▓▓█▒████▓▒░░   \n"
                + "     ▒█▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▒▒▒▒▒▒▓██▓░▓▓██▒░▒▓▓██▓▓▒▓▒░████░▓▓▓▒▒▒░      \n"
                + "     ░██▓▓▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒░▒▓▒▒▒▒▓█▒▒▒▓▒▒▒▓▒▒▒▒█▓██░             \n"
                + "      ██▓▓▓▓▓▓██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒██▒██░            \n"
                + "      ▒█▓▓▓▓██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒██▒▓▓▓▓▓▒▒░       \n"
                + "       ▓█▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒██░▒███▓▒▓██▓▓▒░  \n"
                + "        ▒██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓█▓▒░█▓▒▒▒▓██▓░░       \n"
                + "        ▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▓▒▒▒███░▒▒▒▒▓██▓▓▒░▒▒▒  \n"
                + "      ▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓███▓░▒███▒▒▓▓▓▓▓░   \n"
                + "     ▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▒▒▓█▓▒▓███████▒█▓▒▒▓▓▓▓▓▒░\n"
                + "   ▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▓▓▒▓█▒▒░▓▓▒▓▓▒▓▓▒▒ \n"
                + " ▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▒▒▓▒▒▓▓▓▓▓▓▓▓▓▓▓█▒ "
                + "\nCom muitas rochas entre as grandes arvores e arbustos de variados tamanhos, avancar por aqui se torna por vezes bastante dificultoso\n"
                + "tendo que frequentemente escalar ou desviar das grandes rochas. Mais alguns minutos de caminhada voce se depara com uma pequena falésia\n"
                + "pelo seu tamanho reduzido ainda é possivel escalá-la, mas ainda assim esta acao pode vir a ser perigosa caso algo de errado.\n"
                + "O pensamento de contorná-la ou encontrar um ponto melhor para escalada passa por sua mente.");
        System.out.println("1-ESCALAR  2-CONTORNAR");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("Utilizando de suas grandes capacidades físicas escalar tal elevação se torna brinquedo de criança mas ainda assim o instinto\n"
                        + "diz a voce para seguir com cuidado, nunca se sabe quando uma pedra solta ou lisa ou sem aderencia suficiente vai ser a proxima a ser\n"
                        + "escolida como alavanca. Ao terminar de subir voce avista a sua frente mais claridade que o normal para o meio de uma floresta.");
                System.out.println("1-AVANÇAR  2-VOLTAR E CONTORNAR");
                resp = e.nextInt();
                while (resp != 1 || resp != 2) {
                    if (resp == 1) {
                        System.out.println(""
                                + "                                                    \n"
                                + "     ▒   ░       ▒░ ░██                             \n"
                                + "   ░█░  █░     ░ ░█▓  ██                            \n"
                                + "   ▓█  ▒█ ▒    ░█ ▓█  ██                            \n"
                                + "    ██▓███▓     ████████▓█▓░                        \n"
                                + "     ▓█████▓▓▓▓████▓▒▒ ░░░▒                         \n"
                                + "     ▒▒    █████▓▓███▓                              \n"
                                + "         ░██████████▓                               \n"
                                + "     ░▓██████████▒                                  \n"
                                + "     ▓███████████▓                                  \n"
                                + "       ░▒░ ▓██████                                  \n"
                                + "           █████▓▓░ ░▒▒▒░      ░░▒▒▒▓▓▓▓████▓▒      \n"
                                + "           ██▒░  ▓█████████████████████████████░    \n"
                                + "          ░▓██░▒████████████████████████████████    \n"
                                + "            ████████████████████████████████████▒   \n"
                                + "             ████████████▓████████▓▒▒██████████▒█▒  \n"
                                + "              ▒███████████████████▓▒▒▓████████▒ ▓█  \n"
                                + "                ▓█▓▒██████████████████████████░  ░  \n"
                                + "                 ▒█ ████▓████████████▒ ▓██████      \n"
                                + "                    ███▓░▒▒▒▓▓▒▒▒▓█   ░ ░█████▒     \n"
                                + "                    ███░░            ░██▓▓░████▒    \n"
                                + "  ▒▓                ██░               ░███▒  ▒███▒  \n"
                                + " ███░  ░            ██ ▓░              ███▒    ███  \n"
                                + "▒█▓▓▓ ▒▒            █▒ ▓░              ▓█▒     ░█▓  \n"
                                + "▒▒ ▓█░▓            ▓█  █               █▓       █▓  \n"
                                + "▒░ ▓███  ░         █▓  █▓             ██        █▓  \n"
                                + "▒▓ ▓▓█▓ ▓░  ░ ▒░░ ██   ██            ▒█░        ██  \n"
                                + "▒█▒▓░███▒   ▓░▓▓▒ ██   ██           ░██     ▒  ░██ ░\n"
                                + " ▓█▓░███▒▒░ ░▒▒▓ ▒█▒   █▓         ░ ▒█▒  ░ ███░▒██ ░\n"
                                + " ░▓  ▒░ ░▒▒  ░░   ░                        ▒▒░  ░   "
                                + "\nno centro da clareira agora avistada totalmente esta um majestoso cervo, com seus grandes chifres e seu andar despreocupado.\n"
                                + "voce ja consegue sentir o sabor de sua suculenta carne em sua boca. E com este pensamento prepara-se para o ataque.");
                        System.out.println("1-ATACAR");
                        Som.cervo();
                        resp = e.nextInt();
                        while (resp != 1) {
                            if (resp == 1) {
                                System.out.println("O cervo mesmo ferido ainda tenta correr para o abrigo da floresta, mas antes de atingir seu objetivo tomba, levantando leivas de grama com sua pesada galhada.");
                            }
                            System.out.println("Numero invalido, tente novamente\n"
                                    + "1-ATACAR");
                            resp = e.nextInt();
                        }
                        System.out.println("Você começa a descarnar o animal, coletando o conteudo da caçada.");
                        Som.esfolar();
                        AnaoIA cervoNorte = new AnaoIA("Cervo", new Guerreiro());
                        Inventario loot = cervoNorte(cervoNorte.getClasseInimigo());
                        abrirInventario(loot, "Cervo");
                        System.out.println("Apos a tarefa voce percebe que grande parte do dia já se passou e é sabio retornar antes que a noite caia sobre Lavitan, apesar desta parte ser apenas sua borda ainda assim, varios perigos podem surgir.");
                        return 2;
                    }
                    if (resp == 2) {
                        return 2;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "1-AVANÇAR  2-VOLTAR E CONTORNAR");
                    resp = e.nextInt();
                }
            }
            if (resp == 2) {
                System.out.println("Voce segue esgueirando-se da vegetação e rochas, contornando a pequena falésia. Ela parece nunca terminar\n"
                        + "mas voce segue destemidamente seu caminho em busca de algo para caçar.\n"
                        + "Após um bom tempo de caminhada você ja se sente cansado, pois o esforço de andar nesta parte da floresta nomeDaFloresta é grande.\n"
                        + "Passa pela sua mente o pensamento de voltar para casa e ir na vila nomeDaVila comprar alimentos\n"
                        + "embora não seja a opção mais barata neste momento parece bastante convidativa.");
                System.out.println("1-VOLTAR PARA CASA  2-SEGUIR EM FRENTE");
                resp = e.nextInt();
                while (resp != 1 || resp != 2) {
                    if (resp == 2) {
                        System.out.println(""
                                + "▓████▓▓▓██▓▓▓▓▓████▓██████████████▓█▓█▓▓▓▓█▓▓▓▓▓▓▓██▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓██▓▓▓▓▓▓█\n"
                                + "██▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓█▓▓█▓▓████████████████████████▓███████▓▓▓▓▓▓▓█████████▓█████████████▓█▓███████████████▓██████\n"
                                + "██ ░▒░▒▒░▓▓▓ ▒░░░░▒█▒▒ ▓░▒▓▒▒▒ ░░░▓██▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒░░░░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓\n"
                                + "▓▓░▒▒▒▒▒▒▓▓▓▒▓▒▓▒▒▒█▒▒░▒░▓▓▓▓░▒▒▒▒█████▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▒░░░░▒░░▒░ ░░░▒▒▒▒▒▓██▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓█\n"
                                + "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓█▓▒██████▓███████▓█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▒░░░░▒▒▒░▒▒▒▒▒▒▒░░░▒▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n"
                                + "▓▓▓▓██████▓▓▓▓▓▓██▒ ░▒▒▒█  ▒▒░░▓██▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓███▓▓▓▓▓▓█▓▒░▒▒ ░░▒▒▓▒▒▒▒▒▒░  ░▒▓▒░▒░░░░▒▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n"
                                + "▓▓▓███▓█▓▓████▓▓▓█▓▓▒▓▓▒▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▒▒▒▒▓▓▓▓████▓░▒░▒▓▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒░ ░▒░░▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n"
                                + "▓▓▓▓██▓▓▓▓█████▓▓▓▓▓█████████▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░▒░░▒▒░░░░▒▒▒▒▒ ▒▒▒░▒▒▒▒▒▒▒▒▒░░░░▒▒░░▒▒░░░░░▒▒▒▒▒░▒▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓█\n"
                                + "▓█▓▓▓█▓▓██▓███▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░ ░░ ░▒░▒░░░░░░  ░░░░░ ░▒▓▒▒░░▒▒▒░▒▒▒▓▓▓▒░▒▒░▒▒░░▒▒▒▒▒▒▓▓█▓▓▓▓▓▓▓▓▓▓▓█\n"
                                + "███████████▓▓▓▓▓▓███▓▓▓▓▓▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▒░▒▒░░▒░░▒░░░░▒░░░░░░▒░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓\n"
                                + "██▓█▓█████████▓█████▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▒ ▒▒▒▒▓▒░▒▒░▒▒▒▒▒▒░░░░▒▒▒▒▒▒░ ░▒▓▒ ░▓▒▒▒▒▒▒░ ░▒▒▒▒░░░░▒░░░░░░▒██▓▓▓▓▓▓▓▓▓\n"
                                + "███▓▓▓███▓██▓▓█▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▒░░▒▒▓▒▒░░▒▒▒▒▒░░░ ░ ░░░░  ░▒▒▒▒▒▒▒▒░▒▒░░▒▒▓▒▒░░░░ ░░░░░   ░░░░▒▓▓▓▓▓▓▓▓▓▓▓\n"
                                + "▓█▓█▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░░░▒▒▓▒░▒▒░▒▒▒▒▒▒░░   ░    ░░▒▒▒▒▒░▒░░▒▒▒▒▓▓▓▒▒▒▒░░░░  ░▒▒▒▓▓▒▒░ ░▒▒▒▒▓▓▓▓█\n"
                                + "▓█▓▓█▓█▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒░░▒░░░░▒▒▒▒▒▒▒▒▓▓▓▒░▒░░░░░░░░░░░ ░░▒▒░   ▒▒▓▓▓▒░░░░░░▒▒░░░▒▒▒▒░▒▒▒░░░░▒▒▒▒░▒▓▓▓\n"
                                + "▓█▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓ ▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒░▒   ░░ ░░ ░░░░░░▓▒░░░  ░▒▒░░▒▒▒▒▒░░ ░ ░ ░░░░ ░▒▒░░▒▒░▒▓▒▒▒▒▒▓\n"
                                + "██▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓░░▒░▒░▒░▒▒░  ░░░░░░   ░░░     ░░░░░ ░▒░▒▒▒░░░░▒▒▒▒▒▒░  ░▒▒░    ░░░░░░░▒░░░░▓▓▒▒▒▒▒\n"
                                + "██▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓░░░▒▒   ░▒▒▒░░▒▒░░▒░░░▒░░░░░ ░░▒▒░░░░░░░▒░▒▒▒▒░░▒░░   ░▒▒▒▓▒▒▒▒  ░░░░░░░░▒▒░▒░░▒▒▒▓▒▓\n"
                                + "▓██▓▓▓▓▓▓██▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒░▒░░░░ ▒▒▒▒▒▒▒░▒▒▒░░░▒▒▒░░   ▒▒▒▒░░░░░ ▒░░░░░░░░▒▒░  ░░▒▒▒▒▒▒▓▒▒░   ░░░▒▒▒▒▒░▒▒▒▒▒▒▒▓\n"
                                + "██▓███▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░▒░░░░ ▒░░▒▒░▒▒▒▒▓▒░░░░▒▒░░  ░▒░░░ ░   ░▒▒░░░▒▒▒▒▒░░░░▒░░▒▒▒▒░░░░░   ░░░ ░▓▓▒▒▒▒▒▒▒▒▒▓\n"
                                + "▓█▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒░░░░▒▒▒░░▒▒░▒▒ ░▒▒▓▒ ░░░▒░░░░ ░▒▒▒▒░░    ░▒▒▒▒▒▒▓▓▒░░░░ ░ ░▒▒░   ░░░░    ░░  ░▒▒▒▒▒▒▓▒▒▓\n"
                                + "▓█▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▒ ░▒▒▒░▒▒▒▒▒▒▒▒▒░▒▓▒  ░░▒░      ░░░░▒▒    ░░░░░░▒░░░▒░░░░░░░░░░░▒▒▒▒▒▒░░▒▒▓▓░▒▒▒▒░   ░░▒▓\n"
                                + "▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓░░▒▓░░░░░░░░░▒░░▒▒░░░░▒▒░░░░░░   ░░░░░     ░░▒▒░░       ░░▒▒░░▒▒▒▒▒░░▒▒▒▒▒▓▒░▒▒▒▒▒▒░░░░  \n"
                                + "▓█▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒░░▒░▒▒▒▒░  ░▒▒░░▒▒░▒▒░░▒░░░░░░  ▒▒▒▒░░     ░▒░░       ░░▒░▒▒░ ░▒▒░░░▒▒▒▒▒▓▓░░ ▒▒▒▒▒▒▓▓▒▒▒\n"
                                + "███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓ ░░░▒▒▒░░  ░▒▒░▒▒░░░▒░░░░░░▒░░▒░ ░▒▒▒░░     ▒░░░░░▒░▒▒▒▒░░░░ ░░░▒░▒▒▒░▒▒▒▒▒░▒▒▒░▒▒▒░░▒▒▒░░\n"
                                + "▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▒  ░▒▒▒░░ ░  ░▒▒▒░   ░░░░░░░░░░░░ ░   ▒░     ░▒▒▒░░░▒▒▒░░    ░▒░▒░░▒▒▒▒▒▒▒▓▒ ░▒▒▒░▒░ ░░ ░░▒\n"
                                + "▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓░░▒░░░░░░░░░░░░░   ░▒▒▒░░░░░░░░░░░ ░    ░░░▒▒░ ░     ░░░ ░░░ ░░░░▒░▒░░░░▒▒▒▒░▒▒▒▒▒   ░ ░▒▒▒▒▒▒▒▒▒\n"
                                + "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓ ░▒░░░░░░░░░░      ░ ░░░░░░▒░▒░░░   ░░░  ░ ░░░ ░     ░▒▒▒▒░░░░░░░░░░  ░▒▒▒▒░░░▒░░▒▒░░▒▒▒▒▒░░▒░░▒▒▒\n"
                                + "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░▒░░░░░▒▒▓▒▒▒░░░░░░░ ░▒░▒▒░░▒▒░░░░░░  ░░░░ ░ ░    ░▒░░░░░░░▒░░░░░░░▒▒▒░░░░▒▓▒▒▒▒░▒▒▒░▒▒░░░ ░░░░\n"
                                + "▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓░▒▒▒▒▒▒░░░░▒▒░▒▒▒░░░░░░░░░▒░▒▒▒░░ ░░░ ░░  ░░░░░ ░░░       ░ ░░░░░   ░░  ▒▒░░▒░░▒▒▒▒░░ ░░░░▒░░░░░░░▒\n"
                                + "▓█▓▓▓▓▓▓▓▓▓▓▓██▓██████▒░▒▒▒░▒░░ ░▒▒░▒▒▒▒▒░░ ░ ░░▒▒▒░▒▒░  ░▒░  ░  ░▒░  ░░░          ░░░▒░░░░░░  ▒▒░▒▒░ ░▒▒░░ ░▒▒▒▒▒░░▒▒▒▒▒▒\n"
                                + "▓▓▓▓▓▓▓▓▓▓▓██▓▒▒▒▒░░░░░░ ░░░░░░░░░░░▒▒▒▒▒░░  ▒▒▒░▒▒▒▒▒░░░░       ░                   ░   ░░░░  ▒▒▒▒▒▒▒▒▒▓▒░░░▒▒▒▒▓▒▒▒▒▒▒▒▒\n"
                                + "▓▓▓▓▓▓▓▓▓▓█▓░ ▒░  ░   ▒▓▒░▒░░░▒▒░  ▒▒▒▒▒░░░▒░▓▒░░░▒░░░░░░   ░ ░     ░░░ ░     ░░░░░      ░░░░░  ░▒▒░░░░▒▒▓▒▒░░░░▒░░░▒▒▒▒▒░\n"
                                + "▓█▓▓▓▓▓▓▓▓▓  ░ ░░░░░  ▒▒░░ ░░░░░░░░▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒░░░░▒▒▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒░   ░  ░  ░░▒▒▒▒▒▒▓▓▒▒▒░░▒▓▓▒▒▒▒▓▒▒\n"
                                + "▓█▓▓▓▓▓▓▓█▒     ░░░▒▒▒▒░▒▒░░▒░  ░░▒░▒▒▒▒▒░▒▒▒▒░▒░░▒▒▒░  ▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒░░░░       ░░ ░░░▒▒▒▒░▒▒▒▒▒░▒▒▒░░ ░░░░\n"
                                + "█░ █▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░   ░░░▒▒▒▒░░░▒▒▒▒▒▒░ ▒▒▒░░ ░▒▒   ░░▒▒▒░▒▒▒▒▓▓▒▒▓▒▒▒▒▒▒░░░  ░░▒▒░░▒▒▒   ░ ░▒▒░ ░ ░░▒▒▒▒▒░░     \n"
                                + "█░ ███▓▒░░▓▓▒░░▒▒▒▒░░░░░░ ░   ░░░░▒▒▒░░░░░▒ ░▒▒░▒▒░░  ▒▒░▒▒▒▒▒▒░░  ░░░▒▒▒▒▓▓▓▒░░░░   ▒▒▒▓▒▒▒▒▒▒░░░░ ▒░▒░░  ░░░░  ░░░▒░░░░░\n"
                                + "█▓▒▓░░▒▒▒▒▒░░░░▒▒░ ░   ░ ░ ░░░ ░░░░▒░░▒▒▒▒░░░░░░░░░░   ░▒▒░░░░▒▒▒░░▒▒▒▒░░   ░░░░░░  ░▓▓▓▒░▒▒▒▒▒▒░░░░░▒░░░░░░░░░░░░░░░▒▒▒░▒\n"
                                + "▓▓▒░ ▒▒▒▒▒░░▒▒▒░        ░      ░░░░░░░▒░▒░░▒▒░  ░░░░░   ░▒░░░░░▒▒ ░░░░░░░░▒░  ░░░░ ░▒▒▒▓▒░▒▒▒▒▒▒▒▒▒░░▒░░░░░░░░░░░ ░░  ░░░░\n"
                                + "▒▓▓▒▒▓▒▒░░░▒░░░  ░░░   ░░░░░░░░░  ░░ ▒▒▒░░▒▓░░░░░░░░░░▒▒ ░ ░░░░░ ░░▒▒▒▒▒░▒▒░    ░░ ▓▒░░▒▒░▒▓▒▒▒▒▒▒▒▒░  ░ ░               ░\n"
                                + "▒▒░▒▓▒▒▒░░▒░░░░░▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒░ ▒▒ ░▒▒▒▒▒░░░░ ░░░  ░▒▒▒▒▓▓▒▓▓▒▒▒▓▒▒▒▒▒▒▒▒░░░░░░ ▒▒▒░▒▒░▒▒▒▒▒▒▒▓▒▒▒▒░    ░░░░░ ░ ░░░░▒▒▒ "
                                + "\nVocê segue bravamente seu caminho, sempre atento para os sons da floresta, nunca se sabe quando uma presa pode surgir.\n"
                                + "Mas apesar dos seus esforços você se encontra em um “beco” sem saída formado pelas rochas\n"
                                + "nesta parte da falésia não é possivel escalar devido a inclinacao vertical da formação.\n"
                                + "Farto da situação e sem encontrar nenhum alvo para sua caçada voce decide voltar para casa e ir à vila comprar algo");
                        return 2;
                    }
                    if (resp == 1) {
                        return 2;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "1-VOLTAR PARA CASA  2-SEGUIR EM FRENTE");
                    resp = e.nextInt();
                }
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ESCALAR  2-CONTORNAR");
            resp = e.nextInt();
        }
        return 2;
    }

    public long fase2() throws Exception {
        Scanner e = new Scanner(System.in);
        int resp;
        System.out.println("ATO 2");
        System.out.println("");
        System.out.println(""
                + "                                               \n"
                + "                      ▒▒░                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▓▒           ▒▒▒░░░     \n"
                + "                     ░▒▓▒        ░▒▒▒▓▓▓▒▓▒▓▓▓░\n"
                + "                     ░▒▒▒      ░▒▒▒░▓▒▒▒ ▒▒▓▓  \n"
                + "     ░░▒▒▒░░         ░▒▓▒    ░▒▒▒▒ ░░ ░▒▒▓▓▒   \n"
                + " ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░  ▒▒░ ░░▒▒▒▒▒▒▒▒▒▒▓▓▓▒░    \n"
                + "  ▒▒░░░  ░░░▒▒▒▒▒▒▒░░░ ▒░▒▒▒░░░░░░▒▒▒▒░        \n"
                + "   ░▒░ ░▒░▒▒░▒▒░░░░░▒▒▒ ░▒▒▒▒▒▒▒▒░░░░          \n"
                + "    ░░░▒▒▒░░░░░░░▒▒▒▒▒▒░░▒▒▒  ▒▒▒▒▒▒▒▒▒▒▒░     \n"
                + "          ░░░▒▒▒▒▒▒▒▒▒▒ ░▒▒░ ▒░░░ ▒▒▒▒▒▒▒▒▒░   \n"
                + "       ░░▒▒▒▒▒▒░░▒▒▒▒▒░░░▒▒▒▒▒▒▒▒ ░░░▒▒▒▒▒▒▒▒▒ \n"
                + "      ░▒▒░ ░ ░  ▒▒▒▒▒▒░▒▒  ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒ \n"
                + "     ▒▒▒▒░▒░ ▒▒▒▒▒░░  ▒▒▓░      ░░▒▒▒▒▒▒▒▒▒░   \n"
                + "    ░░▒▒▒▒▒▒▒▒▒░     ░▒▒▓░            ░░░      \n"
                + "          ░░         ░▒▒▒▒                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ░▒▒▓                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▒▒                      \n"
                + "                     ░▒▒▓                      \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ░▒▒▓░                     \n"
                + "                     ▒▒▒▒▒                     \n"
                + "                     ▒▒▒▓▒                     \n"
                + "                    ░▒▒▒▒▒                     \n"
                + "                    ░▒▒▒▓▒                     \n"
                + "                    ░▒▒▒▒▒                     \n"
                + "                     ▒▒▒▓░                     \n"
                + "                     ░░▒▓░                     \n"
                + "                 ▒    ▒▒▓                      \n"
                + "                ░█▒█▒ ░▒▒                      \n"
                + "                ▓▓██▓ ▒▒▒ ▒▒▒░                 \n"
                + "               ▒▓▓▓█▒ ▒░░▓▓█▓▒                 \n"
                + "              ░▒▒▓▓▓  ▒▒████████               \n"
                + "              ▓▓▓▓██ ░▒▒▓███████               \n"
                + "              ▒█▓▓▒     ▒▓▒                    "
                + "\nVoce retorna enfrentando as adversidades do caminho já passado anteriormente, agora com mais pressa e tranquilidade\n"
                + "por fim depara-se com a bifurcação norte/leste e ve o caminho ao sul de onde veio.\n"
                + "1-VOLTAR PARA A CIDADE   2-IR PARA O LESTE  3-IR PARA O NORTE");
        resp = e.nextInt();
        while (resp != 1 || resp != 2 || resp != 3) {
            if (resp == 1) {
                break;
            }
            if (resp == 2) {
                irLeste();
                break;
            }
            if (resp == 3) {
                irNorte();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-VOLTAR PARA A CIDADE   2-IR PARA O LESTE  3-IR PARA O NORTE");
            resp = e.nextInt();
        }
        System.out.println("Seguindo seu caminho de retorno para sua casa voce tem o pressentimento de estar sendo observado, nao interrompe sua caminhada mas sua atenção eleva-se\n"
                + "para qualquer ruido ou movimentacao nas proximidades. Com um subito salto um Goblin surge na sua frente, com uma clava em mãos segue velozmente em sua direcao.\n"
                + "                                                                 \n"
                + "                                                                 \n"
                + "                                                                 \n"
                + "                                                                 \n"
                + "                                                                 \n"
                + "                                                                 \n"
                + "                                  ░░░                            \n"
                + "                      ▓▓░      ▓███████▓                         \n"
                + "                       ██▓   ░██▓▓▓▓▓░▒██▒                       \n"
                + "                       ░███  ████▓▓▓▒░░▒▓█▒                      \n"
                + "     ░░░                █▓▓███▒░▒▒▒▓▒▒▒▓▓█▓                      \n"
                + "    ██▓▓▓▒              ▓▓▒▓▓▒▓▓   ░▓▓▓▓▒▒▒░▓█▒                  \n"
                + "   ▒▒▓▓▒▒▒░             ▓█▓▓███▓▒▒░▓█▓  ░  ▓▓▒                   \n"
                + "   ▒░▒▒░░               ▓░▒▓▒▓███▓▓██▓░▒▓▓▓▒░                    \n"
                + "    ▒░ ░                 ▓ ▓  ▒▒░▓▒▓▒░▒▓▓▓▓                      \n"
                + "    ▒▒░              ░▒▓▓▒▒▒▓▓▒  ▓▓▒░░░░▒▒░                      \n"
                + "     ▒▓▓▒░ ░░      ▓█████▓▓▓▓▓██▓▒░▒▒░░                          \n"
                + "      ░▓▓▒       ░██████▓▒▓▒▒▓████▓▓▓▒░▒▒▓░           ▒▓█████▒   \n"
                + "        ▓█▓▓░   ▒█▓▓▓███▓▓▓▒▒▓▒▓▓▒▒░░░░░░▒▓▓▒░    ▓█▓███▓░▒▒     \n"
                + "       ▒█▓█▓░  ░▒▓▒▓▓▓████▓▓▓▒▒░    ░░░░▒▒▒▓▓▓▓▒▓█▓▓ ▓▒▓▒▓█▓     \n"
                + "       ▓██▒▓█▒░░▒▒░ ▓▓▓███▒▒▒▒▓▓▒░▓███▓▒▒▒▒░░▒▒▒▓▓░▓  ░  ░░░     \n"
                + "        ▓▓▓█▓░▒░▒░░  ▓▓▓▓▓▓▓▒▒▓▒▒▒▓██▓▒▒▒▒░░░▒▒▒░▒▒░▒▒▒          \n"
                + "         ░▒░ ░▒▒░░   ▓▓▓▒▒▒▒▒▒░░░░▓█▓▒ ▒░         ▒░░▒           \n"
                + "           ░▒░      ▒█▓▓█████▓▓▒▒░▒▒▒░░░                         \n"
                + "           ░▓▒ ░    ▓▓▓▓██████████▒▒░░░▒                         \n"
                + "            ▒▓▓▒   ░█▓▓▓▓▓███▓████▓▒░░░▒                         \n"
                + "             ░░     ▓▓▓▓▓▓▓▓▓▓▓▒▒▒░▒▒░▒░                         \n"
                + "                    ▒▒▒▒▓▓▓▒▒▒▒░░░░░░░▒                          \n"
                + "                    ░▒░░░░░  ░       ░▒                          \n"
                + "                    ░░▒▒▒░░░░░░░░░░░░▒▓▒                         \n"
                + "                    ▒░▒▒░░░░░░░░░░░▒▒▒▒▓▒                        \n"
                + "                    ▒░▒▒▒░░░░░░░░░▒▒▒▒▒▓▓▒                       \n"
                + "                   ▓▒▒▒░░░░       ░▒▒▒▒▒▒▒                       \n"
                + "                   ▒▒▒░░           ▒▒░░                          \n"
                + "                       ░░░             ░░░                       \n"
                + "                      ▓▒░░░           ▒▒▓▓                       \n"
                + "                    ▒▒▓▒░▒░          ░▒▒░▒▒                      \n"
                + "              ▒▒▒▒▒▒▒░░░░░░           ▒▒▒░▒▒                     \n"
                + "               ░░░░                    ░░  ░                     \n"
                + "Apesar dos poucos segundos do surgimento da criatura voce observa sua grotesca feição, a boca aberta exibia seus amarelados dentes\n"
                + "também vestindo alguns farrapos e um velho colete de couro. Sem titubear voce esta pronto para a batalha\n"
                + "com um rapido movimento já está com sua arma em maos e a adrenalina elevada.\n"
                + "1-ATACAR O GLOBIN  2-FUGIR");
        Som.globin();
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                Som.lutasoco();
                System.out.println("Com a criatura estirada ao chao na sua frente voce ainda com o sangue quente da pequena luta, espera que mais deles aparecam para lhe enfrentarem\n"
                        + "pois estas criaturas sempre atacam em bando. Apesar do pequeno momento de espera mais inimigos não aparecem");
                AnaoIA globinFase2 = new AnaoIA("Globlin", new Guerreiro());
                Inventario loot = globinFase2(globinFase2.getClasseInimigo());
                abrirInventario(loot, "Goblin");
                break;
            }

            if (resp == 2) {
                Som.corre();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ATACAR O GLOBIN  2-FUGIR");
            resp = e.nextInt();
        }

        System.out.println("Voce acha estranho, mas agradece mentalmente que isso não aconteceu, um inimigo, apesar do susto, não era um grande oponente\n"
                + "mas uma grande quantidade com certeza seria perigoso. Sem mais nada a fazer resta apenas retornar para a sua morada ao sul.\n"
                + "1-IR PARA O SUL");
        resp = e.nextInt();
        while (resp != 1) {
            if (resp == 1) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-IR PARA O SUL");
            resp = e.nextInt();
        }
        System.out.println(""
                + "██████████████████████████████████████████████▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▒▒▒▒▒▒▒\n"
                + "████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "█████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▒▒▓▒▒▒▒▒▓\n"
                + "███████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓▒▒▒▓▒▒▓\n"
                + "████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓▒▒▒▓▒▓▒▓\n"
                + "███████████████████████████████████████████▓█████▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▓▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓▒▓▓▓▒▒▓\n"
                + "██████████████████████████████████████████▓█████▓▓▓▓▓▓▒▓▒▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▓▒▓▒▓▒▓▒▓▒▓▒▓▒▓▒▓▓▓▓▓▓▓▓▓▒▓▒▓▒▓▓▓▒▓▒▓\n"
                + "████████████████████████████████████████████████▓▓▓▓▓▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▒▓▒▓▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▒▒▒▓▒▓▒▓▓▓▒▓▒▒▒▒▒▓▓▓▒▓▒▒▒\n"
                + "████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▒▓▒▓▒▓▒▓▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▓▒▓▒▒▒▓\n"
                + "███████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▒▒▒\n"
                + "██████████████████████████████████████████████▓█▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▒▒▓▓▒▓▒▒▒▒▒▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▒▒▒▓\n"
                + "███████████████████████████████████████████████▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓▓▓▒▓▓▓▒▒▒▒▒▒▒▓▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓\n"
                + "███████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▓▒▓▒▒▓▓▒▓▒▓▒▒▒▒▒▒▒▓▒▒▒▓▓▓▓▓\n"
                + "███████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓\n"
                + "██████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓\n"
                + "█████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▓▓▓▒▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▒▓▓▓▓▓▓\n"
                + "████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▒▓▓▓▒▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓\n"
                + "█████████████████████████████████████████████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓███▓▓▓▓█\n"
                + "███████████████████████████████████████████████▓▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "███████████████████████████████████████████████▓▓▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓███████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒░▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "███████████████████████████████████████████▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓█▓███▓████████████████████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓████████████████████████████████████████████▓▓▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒░▒▒▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓█▓███████████████████████████████████████████▓▒▒▒░▒▒▓▓▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▓▒▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "███████████████████████████████████████▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "████████████████████████████████████████▓▒▒▒▒▒▓▓▓▓▓▓▒▒░▒▓▓▓▓▒▒▒▒▒▒▒▒░▒▒▒░░▒▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "████████████████████████████████████████▓▓▒▒░▒▓▓▓▓▒▒▒░▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒░▒░░░▒▓▓▒▒▒▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓███████████████████████████████████████▓▒▒░▒▒▒▓▒▒▒▒▒▒░▒▒▓▓▓▓▒▒▒▒▒░▒▒░░░░▒▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "████████████████████████████████████████▒▒░░▒▒▒▒▒░▒▒▒░░▒▓▓▓▓▓▓▒▒▒▒░░░░░▒▒▒▓▓█▓▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓█▓████████████████████████████████████▓▓▓▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒░░▒░░░░▒▒░░▓█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "██████████████████████████████████████▓ ░▒▒▒▓▓▓▒▒▒▒░▒░▒░░░░▒▒▓▒░░░░▒▒▒░░░░░▓█▓█▓█▓█▓█████████▓█▓█▓▓▓█▓▓▓█▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓█▓█▓▓██▓█████████████████████████████▓▒  ▒▒▓▒▒▒▒░░░░░░░░░░▒▒▒░░░░░░▒▒▒░  ▒████████████▓▓█████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "░  ░░ ░░░   ░▒░░░ ░       ░▒░░░░░░▒▒░▒░   ▒▒▓▓▓▓▒░░▒▒░░░░░░░░░▒▒░░░░▒░░░░ ░░░░░░░░░ ░     ░ ░    ░▒░░ ░░░                 \n"
                + "░░░░ ░ ░░░   ░  ░▒░░░                ░ ░░▒▒▒▒▒▒▒░░▒▒▓░░▒▒▒░░ ░░▒░░░ ░░                            ░                       \n"
                + "▒▒▒▒▒▒▒▒▒▒▒▒▓▒░ ░▒░ ▒▒▓▒▒    ░░░░░░░░░░░░░  ░░░░░░░░░   ░           ░░      ░     ░   ░   ░                     ░░░░   ░░ \n"
                + "        ░▒▒▒░░░▒░░░▒▒▒░▒▓▒▒▒░░▒▒▒▒▒░▒▒▒░░░░▒░░░░░░░░░░░░ ░░░   ░     ░ ░     ░ ░ ░ ░         ░░░ ░  ░░       ░    ░░░░░░░▒\n"
                + "▒▒▒▒▒▒▒░░▒▒ ▒▒▒░░░▓▓░░░░▒▒▒░░░▒░▒▒░░▒▒▒▒▒▒▒░   ░▒▒▒▒▒▒▓▒  ░░  ░░                    ░       ░░░░░         ░   ░    ░░░▒▒▒▓\n"
                + "▒▓▓▓▒▒▒▒▒▒▓▓▒▒▒░ ░░ ░▒▒▒░  ░░▒░░  ▒▒░▒░   ░     ░░    ░          ░ ░            ░░         ░     ░             ░ ░░░▒▒░░░░\n"
                + "░░░                         ░     ░░            ░                     ░ ░     ░ ░   ░░░░░                        ░░ ░▒░░░ "
                + "\nCaminhando para fora da floresta, ainda com sua arma em mãos para prevenir qualquer surpresa e encurtar seu tempo de reacao\n"
                + "nesta parte da mata já é possivel avistar o sol comm clareza pois a vegetação nao e mais tao densa\n"
                + "Voce observa que ja passou do meio dia e a fome é grande, fazendo apressar seu passo. Ao sair da mata\n"
                + "voce avista fumaça no ceu, nao é algo totalmente estranho, mas a quantidade meio que lhe deixa preocupado.\n"
                + "Entao voce sente vontade de saber do que se trata, procurando um ponto de observacao melhor.\n"
                + "1-OBSERVAR");
        resp = e.nextInt();
        while (resp != 1) {
            if (resp == 1) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-OBSERVAR");
            resp = e.nextInt();
        }
        System.out.println(""
                + "                                                                                     \n"
                + "                                           ▒                                         \n"
                + "                                        ░▓▓█▓▓█▓▓███▒                                \n"
                + "                       ░           ▒▓▓░ ▓█▓██▓████████▓░                             \n"
                + "                       █▓          ▓██▓██▓█▓▓████▓▓███▓▓░▒  ▒░ ▒                     \n"
                + "                     ▒██▓▓██▓▓█▓▓░ ▓▓▓█▓█▓██▓▓██▓▓▓▓█▓▓▓▓▒▒▒▓█▓█▓ ░▓▓░▓              \n"
                + "                   ▓█▓▓███▓███▓██▓▒░▒█▓▓█▓▓▓▓▓▓█▓█▓▓▒▒▓▒▒▓██████████▒▓░              \n"
                + "           ░▓█▓    ▓▓▓███████████▓▓▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▒░▒▒▒▓█▓████████▓▒░              \n"
                + "         ▓▓█████▒░░▓▓▓▓█▓████▓▓▓█▓▒▒▒░░▓▓▓░░░░░░▒▒▒▒░░░▒▒░▒▒▓█▓▓▓▒▒▒▒▓▒              \n"
                + "         ▓████████▓▓▓▓▓█▓▓▓▓█▓▓▓▓▒▒▒░ ░▒▒░░▒░  ░░▒░░░░░░▒▒▒░░ ░ ▒▒░▒▒░▒ ░▒░          \n"
                + "          ▒▓▓█▓▒▓▓▓▓██▒▓▓▓▒▓█▓▒▓▒▒▓▒ ░░░░░ ▒▒▓▓▒▒▒░▒▒▒░▒▒▓██▓▓▓▓▓▓███▓▒▓▓▓░          \n"
                + "                  ▒▒▒▒▒▒▓▓▓▓▓▓▒▓▓░▒░▓▓█████████▓█▓▓▒░░▒▒▓▓████████▓██▓▓█▓▓░          \n"
                + "              ▒▒░ ▒░  ▒▒▓▓▓▒░░▒▓░░▒▓██████████▓▓▓▓█▓▓▒▒▒▓▓▓▓████████▓▓▓▓▒▒▒▒░        \n"
                + "          ▓███████▓▓░░▒▒░░▒▒▒░▒▒▒▒▒██▓▓▓▓████▓▓▓▓█▓▒▓▒░▒▒▒▒▓▓█▓▓█▓█▓▓▓▒▓▓▓▓░░        \n"
                + "     ░▓██▓██▓▓██████▓▓▒░▒▒▒░░░░░░▒▒▓▓▓▓▓▓▓██▓▓▓▒░▓▒▒▓▓▒▒▓▓░▒▒▒▒░▒░░▒▒▒▓▓░▓           \n"
                + "     ▒█▓█▓▓▓███▓▓▓▓███▓▒▒▒▒░░     ▒▒▓▒▒░░ ▒ ░▒░ ░░ ░▓███▓▓█░░▒░▒█▓▒░░░▓              \n"
                + "   ░▒▒▓▓▓▒▓▓███▓█████▓▓▒▒░░░░░░░░░░░ ░   ░         ░░▒▓▓▒▒▒▓████▓██████▓▓▓█▒ ▒▒▓     \n"
                + "   ░▓▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▒░░▒▒▒░▒▒▒▓▓▓█▓▓▓▓█▓█▓▓█▓▓▒▒▒▒░░░░▒▒▒▒▓█▓██▓▒███▓███████▒░░░    \n"
                + "  ░█▓▓▒▒░▒▒▒▒▒▒▒▒▒▓▓▒▒░▒▒▒▒▒▒▓█▓████▓▓██▓████▓████▓▒░░░░▒▒▒▒▓▓▓▓█▓▒██▓█▓▓████▓▓▓▓    \n"
                + "   ░▒▒░▒▓▓▒░▒▒▒▒▒░▒▒▒▒▓▒▒▒▓▓▓▓█▓█▓▓███▓▓█████▓▓███▓▓▓░░░░ ░░▒▒▒▓▒▓▓█▓█▓▓█▓▓▓▓▓▓▓▓▓   \n"
                + "          ░   ▒▒ ░░░▓▒▒▒▓▓██▓███▓▓▓█▓▓▓██▓▓▓▒▒▒▓▓▒▓▓█▒▒▒░░ ░░▒▒▒▒▓▒▒▓▓▓▒▓▓▓▓░▒▓▒▒░   \n"
                + "       ▒▒▓▒▓░░░░░░░░▒▒▓▒▒▒▓▓▓▓▒██▓█▓▓▓▒▒▓▒▓▒▒▒▓▓▓▓▓▓█▓▒░░▒▓▒▒░▒▒▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▒▒▓▓░ \n"
                + "   ░▒▓▓████▓▒▓▓▓▒░░░  ▒▒▒▒▒▒▓▓░▓▒▓▒▒▒▓▒▓▒░▒▒▒▓▓█▓▓▓█▓▒▒▒▓███▓▓░   ░░░▒▓▒▒▒░▓▓▒░▒▓▓   \n"
                + "  ▒▓█▓▓▓▓▓▓▓▒▓▓▓▓▒▓▒▒░░▒▒▒▒▒▒▒▒░▒▒▒▒▓▓▒▒░░░░▒▒▒▓▒▒░▒░░▒▓███▒▓▓▒▒▒░░░░░░░▒░░▒▒░▒▒▒▒▒  \n"
                + "    ▒█▓▒▓▓▒▒▒▓▓▓▓▒▓▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒░░░░▒▓▒▓▒░░░░▒▒▒░▒▒▒▓███▓▓░░░░▓▒▒░░░▒▓▓░▒  \n"
                + "     ░░░░▒▒▒▒░▒▒▒░░░░░░░░▒▒▒▒ ░░░▒░▒░ ░░░▒▒ ▒▒░▒▒▓▒ ░▒▒░░  ▒▒░▒▓▓███▓▓▒▓▓▒▒▒ ░ ▓▒    \n"
                + "         ░▓▒▒▓░▒▒▒▒▒▒▒░░░░░▒▒░▒▓▒░░▒░░░░░░░ ░▒░░   ░░▒ ░░▒▒░▒▒▓▒▒▓▓█▓▓▒░▓▓▒          \n"
                + "          ░  ▒▓▒▒▒▒░▒▓▒▒▒▒▒▓▓▒▒▒▒▓▒▒▒▒▒░░░░░░░░ ░░▒░░░▒▓▓▓▓▒▒▒▒▒▒ ▒▓▒▓░  ░           \n"
                + "                      ▒▒▒▓▓░▓█▒  ░░▒ ░▒▒▒░░▒▒░ ░░░░ ▒█▓▓░▒▓▒                         \n"
                + "                             ░         ░▒░░░▒░░░░░  ░░                               \n"
                + "                                        ░▒░▒░░░░░░                                   \n"
                + "                                         ▒▒▒░░▒░▒                                    \n"
                + "                                         ▒▒▒░▒▒░▒░                                   \n"
                + "                                         ▒▒▒▒▒░░▒▒                                   \n"
                + "                                         ▓▒▒▒▒░▒▒▒                                   \n"
                + "                                        ▒▒▒▒▒▒░░▒▒                                   \n"
                + "                                       ░▓▒▒▒▒▒░▒▒▒▒░                                 \n"
                + "                                  ░▒▒▒▓▓▓░▒▒▓▒░░▒▒▒▓▒▒░                              \n"
                + "                                 ░░░▒▒▒░░░▒▒▒░   ░░░░▒▒▒                             \n"
                + "                                                                                     "
                + "\nSubindo em uma arvore já nas proximidades de sua casa voce avista a vila toda envolta em chamas e fumaca.\n"
                + "Uma sensação de desespero enche seu corpo, a sensação de perder entes queridos novamente o deixa perplexo\n"
                + "o unico pensamneto agora é correr para a vila.\n"
                + "1-CORRER PARA A VILA!");
        resp = e.nextInt();
        while (resp != 1) {
            if (resp == 1) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-CORRER PARA A VILA!");
            resp = e.nextInt();
        }
        System.out.println(""
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                                                                \n"
                + "                                              ░                                 \n"
                + "                                ░▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒░              \n"
                + "                           ░░▒▓▓▓▓▓▓▓▓▓▒▓▒▓▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓▓█▓▓▒▒▒▒▒          \n"
                + "                         ░▓▓▓▓▓▓▓▓▓▓▒▒ ░  ░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░░▒▒▒▓▓░         \n"
                + "                         ▒▒▒▒▒▒░▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒░░░▒▒▒░░░▒▒▒░░▒▒▒▒▒▓▓▒▓░         \n"
                + "                       ▒▓▒    ▒░      ░░▒▒▓▓▓▓▓▓▓▓▓▒▒░░ ░░▒▒▒▒▒▒▒▒▒▒▒▒▓▒        \n"
                + "                   ░▒▓▓▓░  ░░ ▓▓▒░  ░░▒       ░░▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▓▒░░     \n"
                + "                  ▒▓▓██▓ ░ ░  ░▒▒░ ░▒▒▒░░░ ░░░░      ░▒▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░▒ ░▒▓▒   \n"
                + "                 ░▒▓░▒██▒  ▒▒▒░▒░▒▓▒░  ░▒░  ░▓▓▒░░░░░░  ▒▓▓▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓░   \n"
                + "                 ░ ░░░▒██▒ ░░▒ ░ ░░░░ ░░▒▓▒▒░░▒░░▒░░ ░▓░ ▓▓▒▒▒▓▓▒▒░▓▓▓▓▓▓▓▓▓    \n"
                + "                  ░░░▒ ░█▓█▓▓▒▓▓▓▓▓▒   ░░░▒▒░░░ ░░▒▒▒   ░▓▓▒▓ ░█▓▓░▒▓▓▓▓▓▓▓▒    \n"
                + "                     ▒▒▒   ░▒▒▒▓▓▓▓█▓▒░░░▒   ░  ░░▒░░ ░▓▓▓▓▒▓▒ ▓█▓▓▓░░░         \n"
                + "                    ▓▓▓▒▒▒▒▒▒░░       ░   ░░▒▓▓░░░▒ ░▓▓▓▓▓▓▒▒▒▒▒▓▒░             \n"
                + "                   ▓▓▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░  ▓█▓▒▒▓▓▒ ▒█▒                \n"
                + "                 ▒▓▒▒▒▒░▒▒▒▒▒░▒░░░▒▒▒▒▒▒▒▒▒▒░░▒░░   ▒▓▓▓▓▒▓▒░▒                  \n"
                + "               ░▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒░░   ▒▓▓▓▓▓▓▓░                  \n"
                + "            ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒  ▒█▓▓▒▒▓░                   \n"
                + "         ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒░▒ ▓▒                         \n"
                + "       ▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░                          \n"
                + "         ░░░░▒▒▒▓▓▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▓▓                            \n"
                + "            ░▒▒▒░▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▓▒                             \n"
                + "        ░▒▒▓▓▒▒░     ░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒░░▒▒▒▓▒                               \n"
                + "      ░▓▓▒▓▒▒                  ▒▒▒▒░▒▓▓▒▒▒▓▓▓▒░                                 \n"
                + "     ▒▓▓▒▒                 ░▒▒▒▓▓▓                                              \n"
                + "     ░░░                  ▒▓▒▓▓▒                                                \n"
                + "                        ░▓▓▓▒░                                                  \n"
                + "                       ▒▒▒▒▒                                                    "
                + "\nAbandonando sua bolsa (cheia ou nao) voce se põe em corrida, ignorando o cansaco e fome das suas acoes anteriores.\n"
                + "Apesar de voce ser um estrangeiro aquelas pessoas o receberam de bracos abertos, ha alguns anos voce convive com eles\n"
                + "seja em confraternizações, trabalhos ou caçadas, eles não eram sua familia de sangue mas não importava, voce gosta deles\n"
                + "e vice versa. A vontade de chegar logo lhe forcava a correr ainda mais rápido.\n"
                + "1-USAR TODA A SUA ENERGIA PARA CORRE MAIS  2-CORRER NORMALMENTE");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                Som.corre();
                System.out.println(""
                        + "                                      \n"
                        + "               ▒▒▒▒░                  \n"
                        + "            ░ ▓▒░▒▒▒▒ ▓▒              \n"
                        + "           ░▓▒█░▒▒▒▒▒▒▒  ▒▒▒▒▒▒░░░    \n"
                        + "             ▒▓▒▒░░▓▒▒ ▓▓▓▒▒▒▒▒▒▒▒▒   \n"
                        + "        ░▒▒▒▒░▓▓▓█▓▓▒▒▓▒▒▒▒▒▒▒▒▒▒▒▓▓  \n"
                        + "      ▓█▓▓▒▓▓▒░█████ ░▒▒▒▒▒▒▒▒ ░▒▒▓█  \n"
                        + "     ██▒░ ▓█▒▒░ ▓██░ ░░░▒▒▒▒░     ░▒▒ \n"
                        + "  ░▓█▓▒▓▒▓▓░░░░░     ░░▒▒▓▒      ░░▒▒ \n"
                        + "  ▓▓▓░░░░▒░░░░░░▒▓▓▓▓▒░▒▒▓       ▓▒▒▒ \n"
                        + " ░▒█▓░ ░  ░░░▒▒▒█████▓▒▓▓░         ░  \n"
                        + " ░▒▒▓▒▒▒█▒ ▒▒▒▒▒▓███▓▒▒▒▓             \n"
                        + "   ░░▒░ ▓█░░░▒▒▒░░░  ░░▒              \n"
                        + "         ▒█▒░░░░░ ░▒░░▒               \n"
                        + "           █░░░▒▒░▒▒▒░░               \n"
                        + "           ▒▓░▒▒▒░░▒▓▓▓               \n"
                        + "           ░▓▒▓█▓▓▒█▓▒░░              \n"
                        + "            ▓ ░▒▒▒▒▒░░▒▒░             \n"
                        + "            █▒ ░░▒░░░▒▒░▒             \n"
                        + "            ▒█░░▒░░█▒▒▒░▒░            \n"
                        + "             ▒█▒▒▒▒█ ▒▒▒▒▒            \n"
                        + "              ░▓▒░▒█░▒▒░░▒            \n"
                        + "                ▒▒░▓▒▒▒░░▒            \n"
                        + "                   ░▒░▒░▒░            \n"
                        + "                   ░▓░░░▒░            \n"
                        + "                    ▓░▒▒░             \n"
                        + "                    ░▒▒▓░             \n"
                        + "                    ░▓░▒░░            \n"
                        + "                    ░▓ ░░▒░           \n"
                        + "                     ▓  ░░▒           \n"
                        + "                     ▓▓████           \n"
                        + "                     ▓████▓           \n"
                        + "                     ░███▓▓           \n"
                        + "                      █▓█▓█           \n"
                        + "                      █▓███░          \n"
                        + "                      ▓▓▓██░          \n"
                        + "                       █▓██           \n"
                        + "                       ▓█▓██▒         \n"
                        + "                       ▒█▓███▓        \n"
                        + "                        ▓▒░           ");
                System.out.println("\nNOSSA!! Voce é o Usain Bolt dos RPGs!");
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-USAR TODA A SUA ENERGIA PARA CORRE MAIS  2-CORRER NORMALMENTE");
            resp = e.nextInt();
        }
        System.out.println("O caminho para a vila parecia aumentar em vez do oposto, as passadas não condiziam com a vontade de chegar.\n"
                + "Por fim, voce finalmente para de correr na entrada da vila, Seus olhos nao conseguem acreditar no que veem\n"
                + "e o cansaco da corrida não vem. Quase todas as construcoes viraram uma pilha de cinzas e as que ainda resistiam\n"
                + "ardiam em chamas, varios corpos sem estavam espalhados pelo local, alguns ardendo em chamas junto das construcoes.\n"
                + "Uma indescritivel sensação domina seu corpo mas voce nao fala nada, está em um estado catatônico, apenas\n"
                + "as suas ainda respondem, e elas deviam ir em direção ao centro de Kenko.\n"
                + "1-IR AO CENTRO DA VILA  2-SENTAR E DESCANSAR");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 2) {
                System.out.println("Voce, aparentemente desolado desaba no solo, ficando ali algum tempo\n"
                        + "passado algumas horas, resolve ir ao centro de Kenko");
                break;
            }
            if (resp == 1) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-IR AO CENTRO DA VILA  2-SENTAR E DESCANSAR");
            resp = e.nextInt();
        }
        System.out.println(""
                + "                                                                                                \n"
                + "                                                                                                \n"
                + "                                             ▒                                                  \n"
                + "                                            ░▓▒                                                 \n"
                + "                                                                                                \n"
                + "                                            ░                                                   \n"
                + "                                           ░                                                    \n"
                + "                                                                                                \n"
                + "                                     ░░░░░░░ ░░░░ ░░░                                           \n"
                + "                                ░░░░░▒░░░░▒░░▒▒░▒▒░░▒▒▒░▒░░                                     \n"
                + "                            ░░░░░▒░▒░░░░▒▒░░▒▒▒░▒▓▒▒░▒▒▒▒▒▒▓▒▒░                                 \n"
                + "                                  ░ ░ ░░░  ░░░▒░░░▒▒▒░▒▒▒░░░░                                   \n"
                + "                                     ░  ░▒▒▒                                                    \n"
                + "                                       ░░░░▒░░░ ░░░░   ░                        ░▓▓▓░           \n"
                + "       ▒▓▓▒                   ░▓▒▒ ▒▓▓ ░▓▓▒▓▓▓▒ ▓▓▓▓▒▓ ░▒░▒▒▓░                 ░▒▒▒▓▓           \n"
                + "      ░▒▓▓▓▓                    ▒▒▒▓▓▓▒▒▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▒                  ░▒▒▒▓▓           \n"
                + "      ░▒▒▓▒▓░                  ░▒▒░▒░▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▒▒▓▓░░                 ░░▒▒▓▓           \n"
                + "      ░▒▒▓▒▓▒          ░▒▒▓▓█████▓░░▒▒▒░░░▒▒░░░░░░▒▒▒░░▒▒░▒▓███████▓▓▓▓▒▒▒░░    ░░▒▓▓           \n"
                + "      ░░▒▓▒▓▒  ░░▒▒▒▓▓██████▓▒░        ░░░░░░░░░░▒▒▒▓▒       ░░▒▓▓▓████▓▓███████░ ▒▓▓           \n"
                + "      ░░▒▒▒▒░▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒░░              ░▒▒▓▓▓      ░▒▒▓▓████▓▓▓█▓▓▓▓▓▓█▒ ▒▓█░          \n"
                + "      ░▒▒▓▓▒░▒░░░░░▒▒▒▒▒▒▓▓▓▓██████████▓▓▓▓▓▓▒▒▒░▒▒▓▓▓▓▓▓███████▓▓▓▓▒▓▓▒▓█▓▓▒▒▒▒  ░▒▒           \n"
                + "      ░░▒▓▒▒░░░░░░░░░░░  ░  ░░░░▒▒▒▒▓▓██████████░▒▒▓▓▒▓████▓▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓█▒░▒█▒ ▒▒▓░          \n"
                + "      ░░ ░░░▒▒░░░░░░░░░░░░░░░░░░    ░░    ░░░▒▒▒ ▒░▒▒▒▒▓▓▓▓▓▒▓██▓▓▓█▓▓▒▒▒░ █████▒ ▓▓█▒          \n"
                + "      ░▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▓▓▓▒▓▓▓▒▒▒▓██▓▒░▒▓▓▓▓▓▓▒ ▓██░ ▒▓█░          \n"
                + "      ░▒░▒▓▒▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓▒░░░▒▒  ▒▓███▓▓▒▒▒▒▓▓▓▓▒▒█▓▒▓█▒          \n"
                + "      ░▒▒▒▓▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░ ░▒▒▒▓▒▒░▓▓▓▓▓░▒░░▒▓██▓▓▓▓▓▓▒▒▒▒▒▓▓█▓▒▒▒▒▓▓▒     \n"
                + "      ░▒▒░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒ ░░░░░▒▓▓▓▒▓▓░▒▓▓░▒▓▓██▓░▒▓▓██▓▒░ ▓█▓░░▒▓▓      \n"
                + "░▒▒▒▓▓▒▒░░▒▓▒▒░░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▓▓▓▓▓█▒▒▓▓▓▓ ░▒▓▒░░▒▓▓██▓▒▒▒▒▓▓▓▓▓░▒██▓▓▓      \n"
                + "  ▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒░▒░░░░░▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▓█▓░░▒▓▓▒▓▒░▒▓██▓▓▓▓▓▓▒▒▒▒▓▓▓█▓       \n"
                + "  ▒▒▒▒▓█▓▒▓▓▓▓▒░▒▒▒▒▒▒▒▒▒░▒▒▒░▒░▒░░░▒░▒▒▒▒░▒▒░▒▒▒▒▒▓▓▒▓▓░▒▒▒▓░░▒▓▓▓▓▓▓▒░▒▓██▒░▓▓██▓▒▒░░▓█▓▒     \n"
                + "   ░░░░░  ░▒░     ░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒░░░░▒▒▒▒▒█▓▒▓▓▒▓▓██▒ ▒▒▒▒▓▓▓▓▓░░▒▓██▓▒░▒▓▓█▓▓▒ ▒██▒   \n"
                + "                          ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▓██████▒ ▒▒▒▒▒▒▒▓▒▒▒░░▓██▓█▓▓▒▒▒▓▓█▓▓▓██▒ \n"
                + "                                     ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▒▓▓▓▒  ░▒▒▓▓▓▓▓▓▓█▓▓░▒▓██▓▒▓████▓▒   ▒▒ \n"
                + "                                              ▒▒▒░▒▒▒▒▒▒░             ░░▒▒▓▓▓▒▒▓████▓░          \n"
                + "                                               ░▒▒▒░▒▒▓█░                        ▒▒▓▒           \n"
                + "                                                 ░░▒▒▒▒░                                        "
                + "\nA paisagem anteriormente se extendia a esta parte da vila também, apenas o antigo templo em seu centro ainda resistia\n"
                + "nao por falta da insistência de seja lá quem que atacou este pacato lugar, suas grossas paredes feitas de solidas\n"
                + "rochas a muito tempo, desde que se tem registro esta edificação existia em Kenko\n"
                + "certamente fazia parte de algo antigo.\n"
                + "Apenas sua porta estava totalmente destruida, certamente os moradores tentaram abrigar-se do ataque neste solido abrigo.\n"
                + "Voce sente que deve entrar.\n"
                + "1-ADENTRAR NO TEMPLO");
        resp = e.nextInt();
        while (resp != 1) {
            if (resp == 1) {
                Som.templo();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ADENTAR NO TEMPLO");
            resp = e.nextInt();
        }
        System.out.println("A imagem ali dentro com certeza não sairá da sua mente tão cedo, varios corpos mutilados e sinais de luta pelo ambiente.\n"
                + "Em meio ao silencio enlouquecedor voce ouve alguns gemidos. mais que depressa tenta localizar a origem deste som\n"
                + "uma breve sentelha de esperanca ascende em seu interior.\n"
                + "2-PROCURAR A ORIGEM DO SOM");
        resp = e.nextInt();
        while (resp != 2) {
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "2-PROCURAR A ORIGEM DO SOM");
            resp = e.nextInt();
        }
        Som.ferido();
        System.out.println(""
                + "                                                                            ▒   \n"
                + "     ▒░                                                                    ▒▓   \n"
                + "     ▓▓                                                                    █░   \n"
                + "     ▒█                                                                   ░█    \n"
                + "      █░                                                                  █▓    \n"
                + "      █▓                                                                  █░    \n"
                + "      ▓█                                                                 ▓█     \n"
                + "      ░█                                                                 █▓     \n"
                + "       █▒                                                              ▒▓██░    \n"
                + "      ▒██▓                                                              ▒▓▒     \n"
                + "      ▒▓█▒                      ▓▓▓▒▒░  ░▒▒▓▓██▓                   ░    ▓▒      \n"
                + "        ▓░        ░ ░ ░░░░░░░░░▓████████████████▒ ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░ ▒█▓      \n"
                + "        ██▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓█████████████████░░▒▒▒░▒▒▒░▒░▒░▒░▒░▒░░░▓█▓      \n"
                + "       ▒██▓ ░░░░░░░░░░░░▒░▒░░░░▓█▓███████████████▓░░░░░░▒░░░░░░░▒░░░░░░▒▓       \n"
                + "      ░░░▓▓  ░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░▒▓▓░░     \n"
                + "     ░░ ░▓▓░ ░░░░░░░░░░░░░░░░░░░░░░░░ ░ ░ ░░░░░░░░░░░░░░░░▒░░░▒░▒░▒░▒▓▓███▒▒░   \n"
                + "    ░▒░░▒█▓██▒ ░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░▒░░░▒░▒░░░▒░▒░░░░░░░░░░░░▒▒▓▓░░▒░  \n"
                + "   ▒▒░░▓▓▓███▒░░▒░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ ░░░░░░░░░░░░░     ░░░░▒░\n"
                + "  ░░░░░░       ░ ░░  ░ ░ ░ ░░░░░░░░░░░░░░░░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
                + "░▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒\n"
                + " ▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓▒▓▒▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ \n"
                + " ░▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▒▓▓▓▒▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░       \n"
                + "  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒░░▒░▒░░░░░░░░░░░░░░░░░░░░ ░         ░░░       ░        \n"
                + "         ░░   ░░░░░░░ ░ ░   ░ ░ ░ ░░░ ░░░ ░ ░░░░░░░░░ ░░░░░░▒░▒░░░░ ░ ░         \n"
                + "         ░░░░▒░░░▒▒▒░░░░         ░ ░ ░   ░ ░░░ ░ ░ ░░░░░░▒▒▒▒▒▒▒░░░▒░░          \n"
                + "          ░░▓▓░░▒░▒░░░░░░░░                     ░░░░░░░░░░░░░░░░░░▒░░           \n"
                + "            ░▓▓░░▒░░░░░░ ░ ░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░░░░░░░░░░░░▒▒░            \n"
                + "             ░▓▒░░▒░░░░░░░▒░▒░▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░            \n"
                + "              ░▓▓░░░░░░░░▒░░░░░░░░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓░░░░           \n"
                + "           ░░░ ░▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░ ░░░░          \n"
                + "           ░░░░ ░▒▒▒▒▒▒▒▒▒▒▒░▒░░░░░░░░░░   ░             ░ ░░░░░░▒▒▒▒▒░         \n"
                + "          ░░░░░░░         ░░░░░░░░░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▓▒▓▒▒▒▒▒░░        \n"
                + "          ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▓▒       \n"
                + "         ░░░▒░░░░░░░░░░░░░░░░░░░░░▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░       \n"
                + "        ░▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒░░░░░▒░░░░░░░░                                      "
                + "\nContornando o altar central esta nomeDoTio no chao, encharcado de sangue de um ferimento em seu peito e notaveis sinais\n"
                + "de tortura pelo corpo. Ele rastejava para fora de uma abertura no chao do templo que você sequer sabia da existencia\n"
                + "Seu amigo de longa data, foi o motivo de voce vir morar em nomeDaVila, salvando-o da perdição que se encontrava e dando\n"
                + "de certa maneira um novo motivo para continuar vivendo depois dos acontecimentos de seu passado. Ele balbucia algumas palavras\n"
                + "mas voce não entende, deve se aproximar para compreender melhor.\n"
                + "3-APROXIMAR-SE");
        resp = e.nextInt();
        while (resp != 3) {
            if (resp == 3) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "3-APROXIMAR-SE");
            resp = e.nextInt();
        }
        System.out.println("Em seus bracos Henry reconhecendo sua feição começa a falar: - Eles levaram o fragmento do orbe que estavamos protegendo\n"
                + "por favor impeça que eles consigam utiliza-lo, por favor, eramos seus guardioes e agora o tomaram de nós\n"
                + "por favor o recupere e os impeça de ressuscitar nomeDoVilao. Você não entende muito bem a situação\n"
                + "Agora o unico clamor em seu pensamento é saber quem fez tal barbárie com todos e o questiona.\n"
                + "1-QUEM FEZ ISSO?   2-VOCE IRA FICAR BEM?");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println(""
                        + "                                                                                \n"
                        + "                                                                                \n"
                        + "                    ▒░                                                          \n"
                        + "                    ▒                                                           \n"
                        + "                   ▒                                                            \n"
                        + "                  ▒         ░▒▓▒░                                               \n"
                        + "                 ▒    ░▓▒░▒███████▓▓░    ▒▓░▒▓▒                                 \n"
                        + "                ▒  ▒▓▓███▓▒▓▓▒▒▓▓▓████▓▓▓▓▓▓▓░                                  \n"
                        + "     ░▒▓▒▓▒    ░▒░▒▒▓▓▓▓█▓░▒░      ░░░░▒░░       ░░░                            \n"
                        + "   ▒▓▓▒░▓█▓▒▓▒▓▓▓▒░     ▒░                   ░░░░░▒░░                           \n"
                        + "  ▒▓▒░░░▒▓▒▓▓▓▓▓▒░░▒▒░                    ░░░░░░░░░░░░                          \n"
                        + "  ▒▒▓▒▒▒▒▒▓▓▓▒▒░▓▓▒▒█▓▒           ░░░░░ ░░░░░░░░▒░░░▒░░                         \n"
                        + "  ░▒▒▒▒░▒▒▒▒░░▒░▒████▓▒▒         ░░   ░░░░░░░░░░░░▒▓▒░░░                        \n"
                        + "      ░▒░░▒░░░▓▓▓▓██▓▓▓▓▒▒░ ▒▓▒░░░░░░░░░░░░░░░░░░░▒▓▓█▓░░                       \n"
                        + "     ▒███▒▒░▒▒▒▓██▓▓▓▓▓▓▒▒▒▒░▒▓▓░░░▒▒▓▒▒░░░░░░░    ▒▓▓█▓▒░                      \n"
                        + "     ▓██▓▓░░▒▒▒▓▓▒▓▓▓▓▒▒▒▓▒░▒▒▒▒▒▒▒░▒░▒▒▒░▒▒▒       ░░▒▓▓▒▒░                    \n"
                        + "     ▒▒▓▒▒░░░▒▒▒▒▒▓▒▒▒░▒▓█▒▓▒▒░░░░░░░░░░░░▒▒░▒▓        ░▒▓▒▒░░                  \n"
                        + "    ▒▓███▒░   ░░░░▒▒▒▒▒▒█▓ ░▒▓▓▓▓▓▓▒▒▒░░░░▒░░░▓          ░▒▒▒░░                 \n"
                        + "   ░▓█▓▓▓▓▒░   ▒▒    ░░▓█░ ░░░ ░▒░░▒▒▓▒░░▒░░ ▒▒            ░▒▒░░                \n"
                        + "     ▒▓███▓░   ░▓      ▒▓░▒▒▒▒▒▒▒░░ ░░▒▒▒▒░ ░▓▒              ▒▓▒▒▒▒░░           \n"
                        + "     ▒▓▓▓▒▒░    ▓▒        ▒▓▓▓▓▓▒▒░▒░░░▒░░░▒▒░               ░▒▒▒▒▒▒▒▒▒▒▒▒░     \n"
                        + "      █▒▒▓▓▓▓▒░░▒▒░      ░░▒▒▓▓▓▓▒▒▒▒▒░░▒░░░░ ░░░ ░ ░         ░▒▒▒▒▒▒▒▒░░░      \n"
                        + "      ▒▓▒▓▓▓▓███▓▒▒     ▓▓   ▒▒▒░▒▒▒▒▒▒░▒▒▒░ ░░░░░░░░░         ▒▒░░             \n"
                        + "       ▒▒▒▒▒▒▒▓▓▓▓▓▒▓█▓▓▒▒▓▒  ░░ ░▒▒░░▒▒░▒▒▒░░░░░░░░░░                          \n"
                        + "                ░▒▒▓▓▓▓▓▒███▒▒░     ░░▒▒▒░░▒▒▒░░░░░▒░░░░░                       \n"
                        + "                  ▒▓▒▒▒▓████▓           ▒▒▒░▒▒▒▒▒░▒░░░▒▒▒▒░░░                   \n"
                        + "                   ▒▒  ░▓███▓             ░░░▒▒▒░▒░░░▒▓▓▓▓▒▒░░░░                \n"
                        + "                    ░▓▒    ░                  ░░░▒▒░░▒▓▓▓▓▒▒▒▒▒░░░░             \n"
                        + "                     ░▓▓░                      ░░       ░░▒▒▓▓▓▓▒▒░░░░          \n"
                        + "                       ░▓▓▒                                  ░▒▓▓▓▒▒▒░░░░░      \n"
                        + "                         ░▓▓▒                                    ░▒▒▒▒░░░▒▒▒░   \n"
                        + "                            ▓▓▒                                     ░░░░▓▒▒▒▒▒░ \n"
                        + "                              ▒▓▒░                                     ▒▓░▒▒░▒░ \n"
                        + "                                ░▓▓░                                   ░░░▒░░▒  \n"
                        + "                                  ░▒▒░                                  ░▒░▒▒▒  \n"
                        + "                                     ░▒▒                                ░░▒▒▒░  \n"
                        + "                                       ▓▓                                ░░▒▒   \n"
                        + "                                        ░▒░                              ░▒▒▒   \n"
                        + "                                          ░░                             ▒▒▓    \n"
                        + "                                                                                "
                        + "\nQuem fez isso com todos? -voce pergunta algumas vezes- nomeDoTiu esforça-se para lhe responder mas parece que\n"
                        + "a vitalidade esta indo embora de seu velho corpo, esta batalha ele não vencerá… Com suas ultimas forcas ele responde que\n"
                        + "foram os nomeDoBando, novamente pede para que voce os impeça, mas dessa vez termina a frase dizendo para voce pegar a arma\n"
                        + "que esta dentro de uma porta secreta na porta secreta abaixo do templo, apesar da tortura eu nao lhes contei sobre esta\n"
                        + "por favor a use bem, é a unica arma que pode derrotar quem o grupo nomeDoBando buscam, procure nos outros santuarios de \n"
                        + "nomeDoSantuario por mais informações, por favor os impeça…. com estas ultmas palavras seus olhos perdem a vitalidade\n"
                        + "ficando de um jeito estático desconfortante. Largando seu corpo calmamente voce observa a passagem aberta.");
                break;
            }
            if (resp == 2) {
                System.out.println(""
                        + "                                                                                \n"
                        + "                                                                                \n"
                        + "                    ▒░                                                          \n"
                        + "                    ▒                                                           \n"
                        + "                   ▒                                                            \n"
                        + "                  ▒         ░▒▓▒░                                               \n"
                        + "                 ▒    ░▓▒░▒███████▓▓░    ▒▓░▒▓▒                                 \n"
                        + "                ▒  ▒▓▓███▓▒▓▓▒▒▓▓▓████▓▓▓▓▓▓▓░                                  \n"
                        + "     ░▒▓▒▓▒    ░▒░▒▒▓▓▓▓█▓░▒░      ░░░░▒░░       ░░░                            \n"
                        + "   ▒▓▓▒░▓█▓▒▓▒▓▓▓▒░     ▒░                   ░░░░░▒░░                           \n"
                        + "  ▒▓▒░░░▒▓▒▓▓▓▓▓▒░░▒▒░                    ░░░░░░░░░░░░                          \n"
                        + "  ▒▒▓▒▒▒▒▒▓▓▓▒▒░▓▓▒▒█▓▒           ░░░░░ ░░░░░░░░▒░░░▒░░                         \n"
                        + "  ░▒▒▒▒░▒▒▒▒░░▒░▒████▓▒▒         ░░   ░░░░░░░░░░░░▒▓▒░░░                        \n"
                        + "      ░▒░░▒░░░▓▓▓▓██▓▓▓▓▒▒░ ▒▓▒░░░░░░░░░░░░░░░░░░░▒▓▓█▓░░                       \n"
                        + "     ▒███▒▒░▒▒▒▓██▓▓▓▓▓▓▒▒▒▒░▒▓▓░░░▒▒▓▒▒░░░░░░░    ▒▓▓█▓▒░                      \n"
                        + "     ▓██▓▓░░▒▒▒▓▓▒▓▓▓▓▒▒▒▓▒░▒▒▒▒▒▒▒░▒░▒▒▒░▒▒▒       ░░▒▓▓▒▒░                    \n"
                        + "     ▒▒▓▒▒░░░▒▒▒▒▒▓▒▒▒░▒▓█▒▓▒▒░░░░░░░░░░░░▒▒░▒▓        ░▒▓▒▒░░                  \n"
                        + "    ▒▓███▒░   ░░░░▒▒▒▒▒▒█▓ ░▒▓▓▓▓▓▓▒▒▒░░░░▒░░░▓          ░▒▒▒░░                 \n"
                        + "   ░▓█▓▓▓▓▒░   ▒▒    ░░▓█░ ░░░ ░▒░░▒▒▓▒░░▒░░ ▒▒            ░▒▒░░                \n"
                        + "     ▒▓███▓░   ░▓      ▒▓░▒▒▒▒▒▒▒░░ ░░▒▒▒▒░ ░▓▒              ▒▓▒▒▒▒░░           \n"
                        + "     ▒▓▓▓▒▒░    ▓▒        ▒▓▓▓▓▓▒▒░▒░░░▒░░░▒▒░               ░▒▒▒▒▒▒▒▒▒▒▒▒░     \n"
                        + "      █▒▒▓▓▓▓▒░░▒▒░      ░░▒▒▓▓▓▓▒▒▒▒▒░░▒░░░░ ░░░ ░ ░         ░▒▒▒▒▒▒▒▒░░░      \n"
                        + "      ▒▓▒▓▓▓▓███▓▒▒     ▓▓   ▒▒▒░▒▒▒▒▒▒░▒▒▒░ ░░░░░░░░░         ▒▒░░             \n"
                        + "       ▒▒▒▒▒▒▒▓▓▓▓▓▒▓█▓▓▒▒▓▒  ░░ ░▒▒░░▒▒░▒▒▒░░░░░░░░░░                          \n"
                        + "                ░▒▒▓▓▓▓▓▒███▒▒░     ░░▒▒▒░░▒▒▒░░░░░▒░░░░░                       \n"
                        + "                  ▒▓▒▒▒▓████▓           ▒▒▒░▒▒▒▒▒░▒░░░▒▒▒▒░░░                   \n"
                        + "                   ▒▒  ░▓███▓             ░░░▒▒▒░▒░░░▒▓▓▓▓▒▒░░░░                \n"
                        + "                    ░▓▒    ░                  ░░░▒▒░░▒▓▓▓▓▒▒▒▒▒░░░░             \n"
                        + "                     ░▓▓░                      ░░       ░░▒▒▓▓▓▓▒▒░░░░          \n"
                        + "                       ░▓▓▒                                  ░▒▓▓▓▒▒▒░░░░░      \n"
                        + "                         ░▓▓▒                                    ░▒▒▒▒░░░▒▒▒░   \n"
                        + "                            ▓▓▒                                     ░░░░▓▒▒▒▒▒░ \n"
                        + "                              ▒▓▒░                                     ▒▓░▒▒░▒░ \n"
                        + "                                ░▓▓░                                   ░░░▒░░▒  \n"
                        + "                                  ░▒▒░                                  ░▒░▒▒▒  \n"
                        + "                                     ░▒▒                                ░░▒▒▒░  \n"
                        + "                                       ▓▓                                ░░▒▒   \n"
                        + "                                        ░▒░                              ░▒▒▒   \n"
                        + "                                          ░░                             ▒▒▓    \n"
                        + "                                                                                "
                        + "\nA vitalidade esta indo embora de seu velho corpo, esta batalha ele não vencerá… Com suas ultimas forcas ele responde que\n"
                        + "foram os nomeDoBando, novamente pede para que voce os impeça, mas dessa vez termina a frase dizendo para voce pegar a arma\n"
                        + "que esta dentro de uma porta secreta na porta secreta abaixo do templo, apesar da tortura eu nao lhes contei sobre esta\n"
                        + "por favor a use bem, é a unica arma que pode derrotar quem o grupo nomeDoBando buscam, procure nos outros santuarios de \n"
                        + "nomeDoSantuario por mais informações, por favor os impeça…. com estas ultmas palavras seus olhos perdem a vitalidade\n"
                        + "ficando de um jeito estático desconfortante. Largando seu corpo calmamente voce observa a passagem aberta.");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-QUEM FEZ ISSO? 2-VOCE IRA FICAR BEM?");
            resp = e.nextInt();
        }
        System.out.println("1-IR PELA PASSAGEM");
        resp = e.nextInt();
        while (resp != 1) {
            if (resp == 1) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-IR PELA PASSAGEM");
            resp = e.nextInt();
        }
        System.out.println(""
                + "▒▒▒▓▓▒▒▓▒▓▓▓▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▓▒▒▒▒▓▓▓▓▓▓▓▓▒░ ░▓▓▓▓▓██▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓ ░░▒▓▒▒▓▓▓█▒░▒▒▒▓▓▒▓▒▒▓▓▒▒▒▒▒▒░░▒▒▒▒▓▒▒▒▒▒▒░░ ▒▒▓▒▒▒▒▒░░   ░▒▒▓░▒▓▒▒▒▒▓░  ░ ░      ░▓▓▒▒▒░▒▒▒░░░▒▓▓▓█\n"
                + "▓▓░▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▒▒▒▒░▒█▓▓▓▓▓▒▓▓▓▓▓▓▓▒ ░▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒   ▒▒▒▓█▓▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▓█▓░ ░▒▒▒▓▓▓▓▓▓▒▒▓▒▓▓░▒▓░▒▒▒▓▓░░▒░░▒▒▒▒▓▒▒▒▓▓▓▓▒▒▓▓▒▒▓▓▓▒▒▒\n"
                + "▒▓  ░▒░▒░░▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▓▒░▒▒░░░▒▒▒░▒░▒▒▒▒▒▒▒▒░  ░▒░░░░░░▒░░▒▒▒▒▓▒▓▓▓▓   ░▓▓▒▒▒▒▒▒▒▒░▒▒   ░░▒▒▒░▒▓▒▓▓▒▒▒▓▒▒▓▓▒▒▒▒░░░░▒▓█    ▒▓▓▓▓▒▓██▓██ ░▒▒▒▒▒▒░▒▓▓▓▒▒▒▒░▒▒▒▒▒▒▒▓▓  ░▒▒▒▒▒▒░ ░\n"
                + " ▒▒  ▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒ ░ ░░▒▒▒░▒▒▒▒▒▒▒▒▒▒▓▒ ░▒▒▒░░░░░░░     ░░▒▓▓▓░  ░▒▒▒▒▒▒▒▒▒░░░▒░░░ ░░░░░ ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒  ▓▒   ░░▒▒░░ ▒▓▒▒▒  ░░▒▒░▒▒▒▒▓▓▓▓▒░░░▒▒▒░░░░▓▒ ░░▒▒▒▒▓▒░▒\n"
                + " ▒▓▓ ░▒▒▒░░▒▒▒▒░▒▒▒░░▒░▒▓▓░  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░ ▒▓▓▒▒▒▒▒▒░▒▒▒░░░░ ░▒▓▓▓▓░ ▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░▒░░▒▒▒▒░░▒░░▒░▒ ▒░▒▒▒░▒▒▒▒░▒█▒ ░▓▒▒▒▒▒░▒▒ ░                   ░▒▒░  ░░▒  ░░▒▒▒▒░▒▒▒\n"
                + " ░▒▓▓  ░░  ░    ░░░░▒▒░░     ▒▒▒▒░▒░░░▒▒▒░▒▒▒░   ▒▓▓▓▓▒▒▒▒▒▒▓▒░░░░░░░▒▓▓▓░ ▒▓▒▒▒▒▒▒▒▒▒░▒░░░░▒░░░▒▒▒░░▒▒░▒░▒▒ ░░▒▒░▒▓▓▓▓▓▓█▒ ▓▓▓▓▓▓▓▒█▓  ░▓▒▓▓▓▓▓▓▓█░      ░░░░▒▓▓░    ░░░▒▒░░▒▒▒\n"
                + "░░░░░░▒▒░░░░ ░ ░░▒▒▒▒▓▓▓  ░▒▒▒░▒░▒▒▒░░░  ░▒▒▒▒▒░  ░░▒░ ░░░░       ░░  ░░░   ░▒▓▓▒▒▒▒▒▒░▒▒ ░▒▒▒▒▒▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▒░▒▓▓▒▓▒▒▓░  ░▒▒▒▒▒▒█▓ ░▓▓▓▓▒▓▓▓▓▓▓▓▒  ░░▒▒▓▓▓▓█▒    ░░░░░▒▒░▒▒▒\n"
                + "▒▒▓░  ░   ░▒▒▓▒░▒▒▒░▒▒▓▒▒░  ░▒▓▓▓▒░░░░░░░▒░▒▒░▒▒▒▒░░▒▒░       ░▒▒▒▒▒▒░░░░░░▒▒░  ░░▒▒▒░▒▒▒░░ ░░▒░   ░▒▒ ░  ░  ░░░░░▒░░         ▒▒▒▒▒▒  ░▓▓▓▓▒▒▓▓▓▒░▒▒▓▓ ░░▒▓▓██▓         ░  ░▒▒▒▒\n"
                + "▓███▓▓░░▒▒▒▒▒▒▒▒░▒▒▒▒▒░▒▒▓▓░    ░ ░░░▒░▒▒▒▒▒░▒▒▒▒░ ░░▒▒▒      ░▒▒▒▒▒▒▒░▒▒░▒░▓▒ ░▒▒▒▒▒▒▒▒▒▒▒▒░▒▒░░░  ░░   ▒▓▓▒▒▒▒▒▒▓▓▒▒▓▓▒▓▒▒▒▓▒▒▒▒▒█  ▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒█▒ ░▒▒▓▒░ ░▒▒▒▒▒▒       ░░░\n"
                + "▓████▒░▒▒▒▒▒▒▒▒▒▒▒▒░▒░░░▒▒▓▓░   ░░░▒░▒▒▒▒▒▒░░▒▒▒▒▒▒░░░░▓░   ░░░░░▒▓▒▒▒▒▒▒░▒▒▒ ░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒░░ ▒▒▒▓▓▓▓▓▓▓▓▒▒▓▒░▒▓▒░▒▒▓▓▓▓▓▓▒░▒░░░▒▒▓▒▒▒▒▒▒▒▒▓▓    ▒▒▒▒▒▓▓▒▓▓▓█▓▓▓░     \n"
                + "▓▓██▒░▒▒  ░▒▒▒░▒▒▒░░░░░▒▒▒▓▒ ▒░ ░▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒░░▒▒  ░▒▒░░ ░▒░░  ░░░    ░░░░░         ▒▒░░░▒▒▒▒▒ ░▒▒▒▒░▓▒▒▒▒▒▓▓▒▒░░▓▒▒▒▒▓▓▓▓▒▒▓░ ░░▒░░░▒▒░░▒░░  ░▒░▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒  ░\n"
                + "▓███░░▒░   ▒▒▒▒▒▒░▒░▒░▒▒▒▒▓░ ▓░ ▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░  ░░▒▒       ░▒▒▒░▒▒▓▓▓▓▓█▓░▒▓▒▓▓▓▒░▒▒▒░░░▒▒░ ░░░▒░  ▒▒▒▒░▒▒░▒▒▓▓▓▒▓▒▒░▒▒▒▒▒▒▒▒▒▒▓░    ░▒▒▒▒▒░ ░▒▓▒▒▒▓██▓▓▓▓▓▓▓▓▒▓▓▒▒▓▒▒██ ░▒\n"
                + "░▓▒░        ▒▓▒░▒▒▒▒▒▒▒▒░▒▒  ▓ ░▒▒░░   ░░░░░░▒░ ░░░▒▒▒▒▒▒▒▓▒▒▒▓▒▒███▓▓▓▓▓▓▓▓▒▒▓▒▓▒▒▓█▓ ░▒▒▓▒ ░░▒▒▒▒▒▒▒░  ▓▓▓▒▓▒▒▒▓▒▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▓▒ ▒▒░░▒▒▒▒▓▓░ ▒▓▓▓▓█▓▓▓▒▓▓▓▓▓▒▒▓▓▒▓▒▒▒▓▓ ░░\n"
                + "▒▒▒▒▒▒▒▒░░░░░░▒▒▒░░▒▒▒▒▒░▒░ ░░░▒▒▒▒░▒  ░▒░▒▒▒▓▓▓▓▓▓▓▓▓▓▒░░▒▒▓▒█░░▓▓▓▓▓▓▓▓▓█▒░▓▓▓▒░▒▒▓▓  ░▓▓▓▓▓▓█▓██▓▓███▓ ▒▒▓▓▓▒▓▓▓▓▓▓▓▒▓▓▓▒▓▓▓▒▓▓▒▒▓░ ▒▒▒░░▒▒▒▓▓  ▒▒▓█▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▓▓▓ ░▒\n"
                + "▓▓▒▒▒▒▓▓▒▒▓█▒░▒▓▓▓▒▓▓▒▒▓▓▓▓▓▓▓▒▒▒▒▒▓█▓  ░▒▒▒░░░▒▒▓▓▓▓▓▓▓▒░░▒▒▓█░▒▓▒▓▓▓▓▓▒▓█▓░▓▓▒▓▓▒▒▒█▒▒▒▓▓▓▓▓▓▓▒▓▒▓▒▒▓██  ░░▒▒▓▓▓▓▓▓▓▓█▓▓▒▓▓▓▒▓██▒▓░     ░░▒▒▒▒   ▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▓▓▓▒▓█▒ ░▒\n"
                + "▒▒░▒▒▒▒▒▒▓▓▒▒▓▒▒▒▒▒▒▒▒▒▒▓▒▓▒▒▒▒▒▒▒▒▒▓█ ░▒▒▒░░░░▓▓▓▓▒▒▒▓▒▓▒▒▒▓▓▓ ▓▓▒▒▓▓▓▒▓▓▓▓▓▒▓▓▓▓▓▒▓▓▓▒░▒▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓ ░░  ░▒▒▒▒▒▒▒▒▒░   ░░  ░░ ░░░░░░ ░░▒░▒▒   ░▒░▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▒▒▒▒▓▒▓    \n"
                + "▒▓▒▒▒▒▒▓▒▓▒▓▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒░░▒▒▒░▒░░▒█ ▒▒▒▒▒▒░░▒▓█▓▓▒▓▓▓▓▓▓▓▓█▓ ░▒▒░▒▒▒▒▓▓▓▓██▓▓▓▓█▓▓█ ░░▒▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓  ░ ░░░░▒   ░  ░        ░▓▒▓▓███▓▓▓██▓█▓  ░▒▒▒▓▒▒▒▓▓▓▓▓▒▓▓▓▓▓▓▒▒▒▓▒ ░▒░\n"
                + "▒▓▓▒▓▓▓▓▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒░▒▒░░░▒▒░▒░░░▒▓  ░  ░▒░▒░░░   ░▒▒░▒▓▓▓▓▒░▒░▒░░▒░░▒▒░░▒▓▓▓▒▒▓▓▓▓  ▒▒▓▓▓▒▓▓▓▓▓▒░▒▒▓▒ ▒▒▒ ▒▒░▒▒▒▒▒▓▓▓▓█▓    ░▓█▓▒▒▓█▓▓▓▓▓▓▓▓█░  ▒▒▓▓▓▒▒▒▓█▓▓▓▓▓▓▓▓▒░▒▒▓  ▒▓█\n"
                + "░▓▒▒▒▒░░░▒▒▒▒▒▒▒▒▒              ░▒▒▒▓ ░▒▒▒░  ░▒▓  ░▓▓▒▓▓▓▒     ░  ░▒▒▒▒▒▒▒▒     ░░░▒░    ▒▓▓▒▒▓█▓▓▓▓▒▒▓▓ ▒░▒░ ▒▒░░▒▒▒░▒░░▒▓█░  ░▒▒▓▓░▓▓▓▒▓▓▓▓▓▓██▒   ▒▒▒▒▒▒▒▒▓█▓▓▒▒░▒▒▒▓▒▒  ░▒▒▓\n"
                + "  ░░░░▒▒░    ░▒▒▒ ░   ░░░░░       ░▒▒░▒░▒▓▓▒░▓▓█░ ▒▒▓▓▓▓█▓  ▒▒▒▒▒▒▒░ ░▒▒▒▒▓▓▓▒▒▒▓▒▓▓▓▓▒   ▒▓▒▒▒██▓▓▓▒▒▒░░ ░ ▒▒▒░▓▒░▒▒░░▒░░▒▒▓░ ░▒▒▒░░▒▓▓▓▓▓▒▒▒███▓  ░       ░░░  ░▒▒▒░░░    ░▒▒▒\n"
                + "▓▓▓▓▓▓███▓▒▒▒░   ░▒▒▒▓░▒░  ░░░░░░░░░▒▓▒░▒▒  ▒▒▒▓▒▓▓▒▓▓▒▓█▓ ▓▓▓▓▓▓▓▓▓▒▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▓▓▓▓▒       ░░░▒▒░░░░░   ░▒▒▒▒▒▒▒▒░▒▒▒░░▒░  ░▒░░░▒▓▓▓▓▓▒▒▒██▓ ░▓▓█▓░░▒░    ░▒▒▓▓▓▓▓▒▒      ░\n"
                + "▓▓▓▓▓▓▓▓█████░░░░░░▒▓▓▒▓▒ ░░░░░░░▒▒░▒▒▒▒▓▒  ░░░░▒▓▒▓▓▓▒▓▓ ░▓▓▒▓▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓█░  ░▒▓▒▓▒▒▒▒▒▒▒▓▒▓▒░  ░▒▒▒▒▒▒▒▒▒  ░▓▓▓▒░     ░▒▓▓▓▓▓▓██░▒▓▓▓▓▓▓▓▓█▓  ░▓▒░ ░▓▓▓▓▓▓▓▓▓▒▒▒\n"
                + "▓▒▓▒▒▓▓▒▒▓▓▓▓░░░ ░░▒▒▓▓▒ ░░░ ░░░▒▒▒▒░▒▒▓█▓       ░░░▒▒▒▒  ▒▓▒▓▓▓▓▓▒▓▓ ░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒░░░░▒▓▓▓▓▓▓▒░▒░░▒▓▓▓▓▓▓▒░ ░▒▒░    ░▒▒▓▓▓▓▒▒▒▒░   ░▒█▓░  ▒█▓▓▓▓▓▓▒▓▓▓  ░▒▒░░░░▓▓▓▓▓▓▓▓▓▓▓\n"
                + "▓▓▓▒▒▒▓▒▒▓▓░▒▒░   ▒▒▒░       ░░ ░░▒▒▒▒▒░▒▒▒▒▒░▒▒▓▓█▓▒▓▓▒░ ░░░░▒▒▓▒▒▒   ░▒▒▒▒▓▒▓▓▓▓▓▓▒░  ░░▒░░▒▓▓░▓▓▒▓▒▒ ░▒▓▒▒▒▒▓▓░      ░░▒▒▒▒▒▒▒▒▒▒▓▓▓▒      ▒▒▓▓▒▓▓▓▓▓▒▓▓▓▒ ░▒▒▒░░▒▒▒▓▓▓▓▓▓▓▒▒\n"
                + "▒▒▒▓▓▓▓▓██▓░░    ░░    ░░░▒░   ░  ░ ░▓░  ▒▓▒▒▒▒▓▓▓▓▓▒▓▓▓▓█▒▒    ░░▒     ░▒▒░░▒▒▒▓▓▒░░░ ░░░░░░▒▓▓▒▒▒░▓▓▒░░░▒▒▒▒▓▓█▓   ░▒▒░▒▒▓▓▒▒▒▒▒▒▒▒▒▓▒    ░▒▒▒▓▓▒▒▒▒▒▓▒▓▓▓█▒ ░▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒\n"
                + "░░░░░░▒░░░      ░▒▒▓▓▒░▒▒▒▓▓▓▒ ░▒▒  ░▓▓▓  ░▒▒▒▒▓▓▒▓▓▓▓▓▓▓▒▒▓▓▓▓▒    ░▓▓▒▒▒▒▒▒░▒ ░▒░▒▒░░░▒▒▒▒▒▓▓▓▒░░░▒▒▒░  ░   ▒░░   ▒▒▓▒▒▒▒▒▓▒▒▒▒▒▒░░▒▓▓  ░▒▒▒▒▒▓▓▒▒▒░▒▓▓▒▒▒█▓  ░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓\n"
                + "   ▒▒▒▓▓▒      ░▒▒▒▓▒▒▒▒▒▓▓▓▓██▓███▓░░▒▒ ░ ░▒▒▒▒▒▓█▓▓▓▓▓▓▓▓▒▒▓▓█▒ ░░░▓▓▓▓▓▓▓▓▓▓▓  ░▒░░   ░░░░░░░        ░░░▒▒░▒▓▒▒▒  ░▒▓▓▒░▒▒▒▒▓▒▒▒▒▒▒▓░░▒▒▒▒▒▒▒▓▒▒▓▒▒░▒▒▒▒░░        ░░▒▓▒▓▓▓▓▓▓\n"
                + "▒▒▒▒▒▓▒▓██   ░▒░▒▒▒▒▒░▒▒▓▓▒▓▓▓▓▓█▓███▓▓▒░░░ ░▒▒▒░▒▓▓▓███▓▓█▓▓▓█░ ░░░░██▒▓▓▒▓▓▓▓█░ ░░▓▓░░▒▒▓▓ ░█▓▓▓▓█▓ ░▓▓▓▓▓▒░▒▒▒▒▓▓▒  ░▒▒▒▒▒▒▒▒▓▓▓░░  ▒▓▒▒▒▓▒▒▓▒░▒▒░ ░░▒▓▒▒░▒    ░     ░ ░░  ░░\n"
                + "▒▓▓▒▒▒▒▒█▓  ▒▒▒▒▒░▒▓▓▒░▒▒▓▓▓▓▓▓▓▓▓▓██▓███▓░  ░▒▒▒▒▒▒▒▓▒▒░▒░░░▒    ░▒▒▓▒▒▒▓▓▓▓▓▓░ ▒▓████▓▓▓▓▓░▒▓▓▓▓▓██░ ▒▒▓▒▒▒▒▓▒▒▒▒▒▓▓▒   ░░░░░░░▒░   ░▒░        ░▒▒▒▓▒▓▓▓▓█▓█▓    ░    ▒▒▓▓▒░░ \n"
                + "▒▓▓▒▒▒▒▒█▒  ▒▒▒▒░▒▓▓▒░▒▒▓▒▓▓▓▓▓▓▓▓▓▓█▓▓█████▓   ░░░░░░░░▒▒▒▒░       ░▒▒░░▒▒▓▓▓  ░▒▓▓▓▓▓▓▓▒▓▓▓▓▒▒▒▓▓▓▓░  ▒▒▒▒▒▒▒▒▒▒▒▒▒░░ ░░░░░░▒▒▒  ░░░░░░░▒░    ▒▓▓▓▓▓▓▒░▒▓▓▒▒▓▓▓░▒░ ░░  ▒░  ░░░\n"
                + "▒▓▓▒▒▒▒▒█▓ ░▒▒▒▒░▒▒▓▒▒▒▒▒▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▒░▓▓░ ▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓░    ░▒▒▒▒░  ▒▓▓▓▓▒▒▒▒▓▓▓█▓▓▓▓▓▓█▒   ░░░░░░▒▒▒▒▒▓▓▓▓▓▓▒▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ░▒░▒▓▓▓▓▓▓▓▓▓▒▒░▓█▒▒▒░▒▓███   ░ ░\n"
                + "▒▒▓▒▒░▒▓█▓ ░▒▒▒░▒▒▓▓▓▓▒▒▒▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓██░▓▓█▓▓▓▓▓█▓▓▓▓▓▓▓████  ▒   ░▒▒▒▒▒▒▓▒░░░▒▒▒▒▒▓▓█▓▓▓▓█▓ ░░░▒░░░░▒▒░░▓▒▒▓▓▓▒░▒▒▒▒▒▒▒▓▓▓▒▓▓▒▒▓▓█▓  ▒░▒▒░▓▓▓█▓▒▓▒▓▓██ ▒▒▓▒▓██▒  ░░▒▒\n"
                + "░░░░░░  ░  ░▒▒▒▒▒▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓█▓█▒▓░▒▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓███ ▒▒  ░░ ░▒▒▒▒▒▒░░░░▒░░░▒▒▒▒▒▒▓░  ░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▓▓▓▒▒▓▓▓▓▓▓█░ ▒▒░░ ▓█▓▓▓▒▓▓▓▓█▒░░▒▓▒██▓  ░▒▒▒░\n"
                + "▒▓▒▓▓▓▓▒    ▒▒▒▒▓▓▓▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓ ░░▒▓▓▓▓▓▒▒▒▓▒▒▓▓▓▓▓███░  ░▒▒▒░░▒▒▒▒░░▒▒▒▒▒▓▒▒░▒░▒▒▒▓▓  ░░░░░░░░░░▒▒▒▒▒▒▒▓▒▒▓▒▒▒▒▓▓▒▒▓▒▓▓▓▓▓▓▓█▒░▒░░░░▒██▓▓▒▒▒▓█░░▓▒ ▒███▒ ░▒▒▒▒░\n"
                + "▒▓░▒▒▒▓█▓░ ░▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓ ▒▒▒▒░░▒▓▒░░▒▒▓▒▓▒▒▓██▓  ░░░▒▒░▒▒▒▒░▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▓▒   ░░░░░▒▒▒▒▒▒░░░░░░░░░░ ░▒▒▒▒▒▓▓▓▓▒▓▓▓█▒░░░░░░░▓▓▓▓▓▓▓█░ ▒█▓▓▓███░░░▒▒▒░▒\n"
                + "▓▒▒░▒░▒▒▓▓░░    ░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ░▒░░░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒  ░ ░░░░░░░░░▒▒▒░░░░░░░░░░░░▒▒▒▒▒▓▓▓▓▓▒  ▒▒░▒░░ ▓▓▒██▓▓░   ░▒▓██▓  ░▒▒▒░▒▒\n"
                + "▓▒▒░▒▒░▒▓▓▒              ░░▒░▒▒▒▒▒▒░░░░░ ░      ▒▒▒▒▒▒░░▒▒░░░▒▒▒▒▒▒░ ░░▒▒▒▒░░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓  ░           ░░▒▒▒░░░▒░▒░▒░▒░░░░░░░░     ░░▒░░░░▓▓▒▒░         ░▒  ░░▒░▒▒░▒\n"
                + "▒▓▒▒▓▒▒▓█░                          ░▒▒▒▓▒▒▒▒░▒░ ░░ ░░░  ░░ ░ ░░      ░▒░▒▒▒▒▒░░▒░░░░░▒▒░░▒▒▒▒▒▒▒▒▓▓  ▒▒▒▒▒▒▒▒▒░▒▓▒           ░░░░░░     ░░        ░░▒▓▒ ▒▒▒▒▓▓▒▒▒▒▒░  ░░░░░░░░▒\n"
                + "▒▓▒░▒▒▒▓░        ░ ░░░ ░    ░░░░   ▓▓▒ ▓▓▒▒█▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▒▒░░░        ░░▒▒▒▒▒▒▒░▒░░▒▒░▒░▒▒▒▒▒▒▒░▒▒▒▒▒▒▒░░░▒▒▒▒▓▓░             ░░▒▒▓▓▓▒▓▓█▒▒▒▒▒▒▓▓██▓  ░▒▒▒▓▓▓▓▓▒▒▓░ ░░░░░░░░▒\n"
                + "▒▒▓▒▒▒▒ ░▓▓▓▓█▓▓▓▒▒░▒░▒░▒▒░    ░░ ░▓▓░▓▒▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▓▓▒░   ░░░▒▒▒▒▒░▒▒▒▒▒░░░░░    ░░ ░░░░▒▒▒▓▓▓█▓███████████ ░░▒░▒▓▓▓▒▒▒▒▓▒▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▒  ▒▒  ░░░░░░░░░▒"
                + "\ndescendo a pequena escada voce avista o pequeno altar ao fundo, onde provavelmente estava o fragmento do orbe.\n"
                + "Observando a pequena sala, com suas paredes de pedra com varias inscricoes em alguma linguagem\n"
                + "desconhecida a voce, como o tio Jorge lhe disse voce procura pela pedra que abre a tal porta secreta\n"
                + "1-EMPURRAR A PEDRA AO NORTE  2-EMPURRAR A PEDRA AO SUL  3-EMPURRAR A PEDRA AO OESTE  4-EMPURRAR A PEDRA AO LESTE");
        resp = e.nextInt();
        while (resp != 3) {
            Som.emppedra();
            if (resp == 3) {
                System.out.println("Voce percebe que esta pedra pode ser empurrada, a pressionando algumas outras pedras abrem\n"
                        + "mostrando uma pequena adaga com varias inscricoes runicas e um cabo transparente de vidro, ali dentro\n"
                        + "parecia haver alguma substancia liquida que parecia mexer-se sozinha.");
                break;
            }
            System.out.println("Não é essa pedra, tente novamente\n"
                    + "1-EMPURRAR A PEDRA AO NORTE  2-EMPURRAR A PEDRA AO SUL  3-EMPURRAR A PEDRA AO OESTE  4-EMPURRAR A PEDRA AO LESTE");
            resp = e.nextInt();
        }
        fase3();
        return 0;
    }

    public void fase3() throws Exception {
        Scanner e = new Scanner(System.in);
        System.out.println("2-SACAR SUA ADAGA");
        int resp = e.nextInt();
        if (resp == 2) {
            System.out.println(""
                    + "███████████████████████████████████████████████████████████████▓█████\n"
                    + "██████████████████████████████████████████████████████████████▓▒▒▓███\n"
                    + "████████████████████████████████████████████████████████████▓░▓▓  ▒██\n"
                    + "███████████████████████████████████████████████████████████▓░▓▒  ▒███\n"
                    + "█████████████████████████████████████████████████████████▓▓▓▓░  █████\n"
                    + "███████████████████████████████████████████████████████▓▒▓▓▒░ ▓██████\n"
                    + "████████████████████████████████████████████████████▓▒▒▒▒▒░  ▓███████\n"
                    + "██████████████████████████████████████████████████▒▒▒▓▓█▒░ ░▓████████\n"
                    + "████████████████████████████████████████████████▓▒▒▓▓██▒░ ░▓█████████\n"
                    + "███████████████████████████████████████████████▒▒▓▓██▓▒░ ░▓██████████\n"
                    + "██████████████████████████████████████████████▒▒▓███▓▒ ░░▓███████████\n"
                    + "█████████████████████████████████████████████▓▒▓███▒░░░░▓████████████\n"
                    + "████████████████████████████████████▓███████▒░███▓░    ▓█████████████\n"
                    + "█████████████████████████████████▓▓▓▓▓█████▒░▒██▒    ▒███████████████\n"
                    + "████████████████████████████████▓▓████▓▒▒▒░ ▒▓▓░   ▓█████████████████\n"
                    + "██████████████████████████████████████▒▒▓▒▒▒▒░▒░░░███████████████████\n"
                    + "█████████████████████████████████████▓▒▓▒▒▒▒▒▒░░  ░▓▓██▓▒▒▓██████████\n"
                    + "████████████████████████████████████▓▒▒▒░▒▒░▒▓▓░░▒  ░▒▒▒▓████████████\n"
                    + "████████████████████████████████████▓▓▒▒▒▓▒▒▓▓▓████▓▓████████████████\n"
                    + "████████████████████████████████████▒▓▓▒▓▒░▒▒▓███████████████████████\n"
                    + "██████████████████████████████████▓▓▓▒▓▓▓▓░▓▒▓███████████████████████\n"
                    + "█████████████████████████████████▒▓▓▒▒▓▓▒ ▒▒▒▓███████████████████████\n"
                    + "████████████████████████████████▒▓▓▒▓▓▓▒ ▓▓▓█████████████████████████\n"
                    + "███████████████████████████████▓▒█▒▒▒▓▒ ▓████████████████████████████\n"
                    + "██████████████████████████████▓▓█▓▒▒▓▓ ░█████████████████████████████\n"
                    + "█████████████████████████████▓▓█▓▓▓▓█▓ ▓█████████████████████████████\n"
                    + "████████████████████████████▓▓█▓▓▓▓▓  ▓██████████████████████████████\n"
                    + "███████████████████████████▓▓▓▓▓▓▓  ▒████████████████████████████████\n"
                    + "█████████████████████████▓▓▓▒▓▓▓  ▒██████████████████████████████████\n"
                    + "███████████████████████▓▓▓▓▒▓▓▒ ▒████████████████████████████████████\n"
                    + "██████████████████████▓▓▓▓▓▓▒▒▒██████████████████████████████████████\n"
                    + "████████████████████▓▓▓▓▓▓▒░▓████████████████████████████████████████\n"
                    + "██████████████████▓▓▓▓▓▓▒▒▓██████████████████████████████████████████\n"
                    + "█████████████████▓▓▓▓▓▒▓█████████████████████████████████████████████\n"
                    + "██████████████▓▓▓▒▒▒▓▓███████████████████████████████████████████████\n"
                    + "█████████████▓▒▒▒▒▓██████████████████████████████████████████████████\n"
                    + "███████████▓▓▓▒▓█████████████████████████████████████████████████████\n"
                    + "█████████▓▓▓▓▓███████████████████████████████████████████████████████\n"
                    + "██████▓▓▓▓███████████████████████████████████████████████████████████\n"
                    + "█████████████████████████████████████████████████████████████████████"
                    + "\nCom a adaga em mãos voce com toda a sua raiva e desejo de vinganca decide partir em busca de respostas\n"
                    + "e sangue por parte dos agressores. Achava que o passado de lutas e tragédias tinha ficado para tras\n"
                    + "mas novamente ele bate a minha porta, pensa voce. Está na hora de voltar a ser quem eu era.\n"
                    + "Com esta frase dita em sussurros para si mesmo,  voce pensa em seus antigos armamentos, escondidos\n"
                    + "em um bau no porão da sua casa, voltando por todo o caminho de destruição já visto. ");
        }
        System.out.println("1-SAIR DO ALTAR SECRETO");
        resp = e.nextInt();
        switch (resp) {
            case 1: {
                System.out.println("Novamente dentro do templo voce observa os corpos, nada mais importa, somente a vinganca, uma ultima olhada\n"
                        + "em seu mais fiel amigo nomeDoTiu, voce lembra de suas palavras e agora passando por toda a carnificina\n"
                        + "encontra-se no meio do templo, encarando a saida e as chamas do lado posterior.");
            }
        }
        System.out.println("1-SAIR DO TEMPLO  2-SAIR DA VILA");
        resp = e.nextInt();
        if (resp == 1) {
            System.out.println("Apenas passando por toda a destruição voce segue seu caminho. nada mais importa, apenas a vinganca.");
        }
        if (resp == 2) {
            System.out.println("Caminhando com os passos pesados de furia voce dirige-se para sua velha casa, a pequena trilha que\n"
                    + "voce sempre passou para visitar seus amigos agora so lhe tras as visões de seus corpos estirados ao chão\n"
                    + "sem vida. Ao longe voce avista sua casa, mais lembrancas surgem, tudo ali de algma forma teve algum\n"
                    + "envolvimento com essas pessoas que lhe acolheram tão bem, e agora já não existem mais. ");

        }
        System.out.println(""
                + ""
                + "                                                                              \n"
                + "                              ░                                               \n"
                + "                            ░ ░▒                                              \n"
                + "                            ░░ ▒░                                             \n"
                + "                             ▒ ░                                              \n"
                + "                             ▓ ▒▒                                             \n"
                + "                            ▒█▓▓█▓                                            \n"
                + "                           ░▒░░░▓█                  ░                         \n"
                + "                            ▒▒▒▒█▓                  ░░                        \n"
                + "                            ▒▒▒▒█▓                   ░░                       \n"
                + "                            ▒▒░░█▓                    ░                       \n"
                + "                      ░▒▓▓▓▓▓▓▓▒█▓                    ▒                       \n"
                + "                    ▒▓████████████▓░                 ▒█▓░                     \n"
                + "                  ░███▓▓▓▓███████████▓▒░░            ▒▒▓▓                     \n"
                + "                 ▓█▓▓▓████▓█▓███▓███████████▓░       ▒▒▓▒                     \n"
                + "               ░█▓    ▒▓███▓▓▓█▓▓▓█▓███████████      ▒▒▓▒                     \n"
                + "              ░█▒       ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████▓ ░▒▓█▓███▓                   \n"
                + "             ░█▒ ▒▓▓▓▒▒░ ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓█▓████▓                 \n"
                + "            ░█░ ░▒▓█▓▓█▒  ▒█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████░               \n"
                + "           ░█▒ ░░ ▒████▒   ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓              \n"
                + "           █▒  ░░░▒▓▓██▒ ░  ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓            \n"
                + "          ▓▓ ░░▒░░▒▓▓▓▓░░░░  ▒▓▓▓▓▓▓▓▓▓▓█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████           \n"
                + "         ▓▓  ░▒▒▒░░▒░░░░░▒░░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓██          \n"
                + "        ▓█  ▒▒▒▒░░░░░░░░▒▒▒▒░  ▓▓▓▓▓▓▓▓▓▓▓▓▓█▓███▓▓▓▓▓▓▓▓▓▓▓▓▓█▓   ██         \n"
                + "       ▒█░ ░▒▒▒▒░ ░▒░░░  ▒▒▒▒░ ░▓▓▓▓▓▓▓▓▓▓▓███████▓▓▓▓▓▓▓▓▓▓▓██░ ░  ██        \n"
                + "       ▓▒ ░░▒░░░▒▒▒▒▒▒▒▒▓░░░░░░ ░▓▓▓▓▓▓▓█████▓░░▒▓███▓▓▓▓▓████▓▒▒▒▒  █▓       \n"
                + "       ░ ░░▒▒▒░░█▓▓██████▒ ▒▒░░░▒░▒ ▒███░░░ ░▒▒   ▒▓░████▓▒▒▓▓▒███▒▒░▒█       \n"
                + "         ▒▓░░▒▒░▓▓▓▓▓▓▓▓█▒░▒░░▒░▓░  ░██▓  ░ ░██░   ░ ████   ░▓▒▓█▓▓▓▓         \n"
                + "         ▒▓▒░░▒░▓▒▓▓▓▓███▒░░▒▓▒▒▓░  ░▓▓▓░░░░░██▒░  ░░██▓▓░░░▒▓▓▓▓▓▓▓▒         \n"
                + "         ▒▒▒▒░░░█▓▒▓▓████▒ ▒▒▒▒░▓░  ░▓▓▓░░▒▒░▓█░░░░░▒██▓▓░▒░▒▓▓▒▓▓▒▓▓         \n"
                + "         ░▒▒▒▒░▒▒▓▒▓▓▓▓▓▒░░▒░▒▒▒▓▓▓█▓▓▒▒░░▒▒░░░░░░░░░░░▒▓▒▒░░▓▒▓▓▓▓▓█▒        \n"
                + "         ░▓▒▓▓▒▓▓▒▓█▓▒▓▓▓▒░ ▒▒▒▓▒▓▓▓▓██▓▒ ▒▒▒░░░▒  ░░░▒▓▓▓▓███▓▓███████░      \n"
                + "       ░▒▓▓▒▓▓▒▒▒░▒▒░░░▒▒▓▓▒▒▓▒▒▒▒░░▒▒▓▒░░▒▒░░░░░░▒█▓▒▒▒▒▒▒▓▒▓█▓▒▓▓▓████▓░    \n"
                + "      ▓▓▓▒░▒▒░░▒▒░░░░ ░▒░▒▓▒▒▒▒▓▒▒ ░░▒▓▓▓▒▒▒░░░░░▓▓▓▒▒▓▒▒▒░▒▒▒▒░░ ▒░▒▓██▓     \n"
                + "     ░▒▒░░▒▓▓▒▒▒▒▒░ ░░░▒▒░ ░▒▓▒░░░ ░▒▒▒▒░▒▓▓▒▒▒▒▒▓▒      ░░      ░            \n"
                + "            ░                 ░                                               "
                + "\nCaminhando com os passos pesados de furia voce dirige-se para sua velha casa, a pequena trilha que\n"
                + "voce sempre passou para visitar seus amigos agora so lhe tras as visões de seus corpos estirados ao chão\n"
                + "sem vida. Ao longe voce avista sua casa, mais lembrancas surgem, tudo ali de algma forma teve algum\n"
                + "envolvimento com essas pessoas que lhe acolheram tão bem, e agora já não existem mais. ");
        System.out.println("1-ENTRAR NA CASA");
        resp = e.nextInt();
        if (resp == 1) {
            Som.porta();
            System.out.println("Adentrando a residencia voce dirige-se para o alcapao sob a mesa da sala.\n"
                    + "Voce move a mesa, e vizualiza um alcapao trancado por um velho cadeado.");
        }
        System.out.println("2-DESTRANCAR");
        resp = e.nextInt();
        if (resp == 2) {
            Som.cadeado();
            System.out.println(""
                    + "                                                          \n"
                    + "                  ░▓▓▓▓▓▓▓▓▓▓▒ ░▒▒▒▒▒░░░░░░░              \n"
                    + "                  ░█▓▓▓▓▓▓▓▓█▒ ▓▓▓▓▓▓▓▓█▓██▒░▓▓██▓▓▓▓▓▓▓▓░\n"
                    + "                  ░▓▓▓▓▓▓▒▓▒▓▒▒▓▓▒▒▓▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓ \n"
                    + "                  ░▓▒▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▒▒▒▓▒▓▓▒▒▓▒▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ░▓▓▓▓▓▓▒▓▒▓▒▒▓▓▒▒▓▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▒▓▓▓▓▒ \n"
                    + "                  ░▓▒▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▒▒▓▓▒▓▓▒▒▓▒▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▓▒▓▓▓▒▒▓▓▓▒▒▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▒▓▓▓▓▒ \n"
                    + "                  ▒▓▒▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▒▒▒▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▒▓▒▓▓▒▓▒▒▓▒▓▒▒▓▒▓▒▓▒▓▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▒▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▓▒▓▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▓▓▓▒▓▒▒▓▒▓▒▓▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▒▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▓▒▒▓▒▓▓▒▓▓▒▓▒▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▓▓▓▒▓▒▒▓▒▓▒▓▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▒▓▒▓▓▒▓▒▒▓▒▓▒▓▓▒▓▓▒▓▒▒▓▓▒▓▒▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▒▓▓▒▓▒▒▓▒▓▒▓▓▒▓▓▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓ \n"
                    + "                  ▒▓▒▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▓▒▓▓▒▓▒▒▓▓▒▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▒▓▓▒▓▓▒▓▒▒▓▒▓▒▓▓▒▓▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▒▓▒▓▓▓▓▒▒▓▒▓▒▓▓▒▓▒▒▓▒▒▓▓▒▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▓▓▓▒▓▒▒▓▒▒▓▓▓▒▓▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▒▓▓▓▓▒▒▓▓▓▒▓▓▓▓▓▒▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                  ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓ \n"
                    + "                           ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒ \n"
                    + "                ░░▓▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░             ░   \n"
                    + "               ▒▒ ░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓   \n"
                    + "              ▒▒  ░░░░░ ░                         ░░░░    \n"
                    + "             ▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒░░░░░░░░░░░░░░░░░     \n"
                    + "            ▒▒  ▒▒▒░▒░▒░▒░░░▒░░░░░░░░░░░░░░░░░░░ ░▒▒░     \n"
                    + "           ▒▒  ▒▒▒░▒░▒░▒░░░▒▒▒░░░░░░░░      ░░ ░▒░ ░      \n"
                    + "          ▒▒ ░▒▒▒░▒▒▒░▒░▒░▒   ░░░░▒░  ▒▓▓▓▒    ▒▓█▒       \n"
                    + "         ▒░ ░▒▒▒▒▒░▒░▒░▒░░ ░▒░      ░▓███████▓▒░░░        \n"
                    + "        ▓░ ░▒▒▒▒▒▒▒░▒▒▒░  ▓█████▓▓▒░░    ░▒▒▓▓███         \n"
                    + "      ░▓  ░▒▒     ░░░▒░ ▒███▓█▓███████▓▓▒░     ▒░         \n"
                    + "     ░▓  ░▒░ ▒▓▒▒       ▓▓▓▓▓▓█▓█▓▓▓▓████████▓▓           \n"
                    + "    ░▓  ▒▒  ▓████████▓▓▒░      ░▒▒▓▓▓█▓█▓█▓███▓           \n"
                    + "   ▒▓  ▒▒  █████████████████▓▓▒▒░      ░▒▒▓▓█▓            \n"
                    + "  ░▒  ▒▒ ▒██████████████████████████▓▓▒▒░   ░             \n"
                    + "         ▒▒▒▒▒▓▓▓▓██████████████████████████              \n"
                    + "                      ░░▒▒▒▓▓▓▓████████████▒              \n"
                    + "                                      ░░▒▒░               "
                    + "\nUsando a chave pendurada em seu pescoço, voce abre o cadeado do alcapao");
        }

        System.out.println("3-ABRIR");
        resp = e.nextInt();
        if (resp == 3) {
            System.out.println("Dentro ha um velho baú, dentro dele ha algo que voce jurou nunca mais usar\n"
                    + "mas desta vez era diferente, as mesmas pessoas que o fizeram realizar este juramento\n"
                    + "já não estao neste mundo, voce não sente qualquer remorso em quebrar esta promessa\n"
                    + "e leva suas maos nele.");

        }
        System.out.println("4-ABRIR BAU");
        resp = e.nextInt();
        if (resp == 4) {
            Som.itemLendario();
            System.out.println("Dentro estão fotos de seu passado que você não gostaria de ter revisto, e alguns itens lendarios.");
        }
        System.out.println("");
        System.out.println("0-EQUIPAR ARMADURA");
        resp = e.nextInt();
        if (resp == 0) {
            System.out.println(""
                    + "██████████████████████████████████████████████████████████████████\n"
                    + "██████████████████████████████████████████████████████████████████\n"
                    + "████████████████████████████████████████████▓▓▒▓██████████████████\n"
                    + "█████████████▓▒▒▒▒▓▓▓▒░░░░▒▓████████████▓▓▒░     ░▒▒▒▓▓███████████\n"
                    + "█████████▓▓▓▒▓▓▓▓█▒         ▒██████████▓▓░▒▒▒▓▒▒▓▒░░░   ░▓████████\n"
                    + "███████▓▓██▒████▓    ░▒▒░ ░░ ▒███████▒▒▓░▓█▓█▒▓███▓▓▓▓▒▒░   ▓█████\n"
                    + "██████▓▓██░▓██▓▓  ░▓█▒      ░ ░▓███▓▒▒▓▒▓███▓▒███████▓▓▓▓▒   ▒████\n"
                    + "█████▓▒▓█▓▓█▓▒▓░  ▓▓▒░     ░▒░ ▒▓▓▒░░▒█░▓▓▓▓ ▒▓▓▓▓▓▓▒▒▓▓▓▒▒░  ▓███\n"
                    + "████▓░░░░▒▒░░░█  ▒▒▒░▓░   ▒░  ▓▓░▒▒▒▒▒█░░▒▒░ ▒░░░░░░░▓▒▒▒▒▒▒░  ░▒█\n"
                    + "███▓░▒▒░ ░   ▒█  ▓▓▒░█░  ░░ ░▓▒ ░▓▓▒▒░█▒  ░░▒▒▓▓▓▓▓▓▓▓▒░   ░░░░ ▒█\n"
                    + "████▒▒▒▒▒▒▒▒▒█▒░▓▓▓▒░▓▓▓▓▓▒▓▓▒▒▓▒▒▓▒  ▒██████▓▓▓▒░      ░▓▓███████\n"
                    + "███████████▓▓▓░▓█▓▒▓▒▓▓▒▓▓▓▓▓▓█▓▓▓▓░   ░▒▒░        ▒▓█████████████\n"
                    + "██████████████▒▓██████▓▒██████▓▓▒▓▒░   ▓░        ░ ▓██████████████\n"
                    + "█████████████▓ ▒██████▓▒███████▓▒░  ░▒▓▓▓░     ░▒░ ▒██████████████\n"
                    + "██████████████▒▓▒▓▓▓▓▓▒▓█▓▓█▓▒▓▒▒▒▓▓▓▓▒▒▒▓▓▒░▒▒▒▒ ▒███████████████\n"
                    + "██████████████░▒▓▒░░░░ ▒▓▓▓▓▒░░▒██▓░▒▓▓▓░ ░▒▒▒░  ▒████████████████\n"
                    + "██████████████▓ ▒▒ ░▒▒▒▓▓▓▒▒▒░▒▓▒▒████▓▓░▒░░ ░░░ ▓████████████████\n"
                    + "███████████████▒  ▓▓▓▓▓▒▒▒▓▓▓▒▓▒░▒▓▓▒▒▒░▒▓▒▒▒▒▒  ▓████████████████\n"
                    + "████████████████▓▒▓▒▓▓▓▓▒▒  ▒█▓▓▒░  ░▒▒▒▒░░░  ▒███████████████████\n"
                    + "████████████████▓▒ ▒▒▒▓▒▒▒    ▒▓▓▓▒▒▒▒▒▒▒▒░   ▒███████████████████\n"
                    + "█████████████████▓▓▒▓▓▓▒▒▓▒▒░    ░░▒░░░░░ ▒▓▓█████████████████████\n"
                    + "███████████████████▒▓▓▓▒▒▒▒░▒░░░▒▓▒▒▒▒░░▒ ▓███████████████████████\n"
                    + "██████████████████▓░░▒▒░ ░  ▒░░▒▒▓▒░▒▓ ░▒  ███████████████████████\n"
                    + "██████████████████ ░█▓▓▓▓▓▓▒▒ ░░░░▒ ▒▒  ░░  ▓█████████████████████\n"
                    + "████████████████▒▒░░▓▒▓▒▒▒▒▒▒▒░ ▓▓▓▓░▓▒░▓░░  █████████████████████\n"
                    + "███████████████▓ ▒▓▓░░▒▒▒░░  ▓▒▒█░▒░ ▒░▒▓▒░░  ▓███████████████████\n"
                    + "███████████████░ ░▓▒▓▒░░░    ▓▒▒▒░▒▒ ▒▒░▒▒░░░  ▓██████████████████\n"
                    + "█████████████▓░ ░▓▒▒█▓▓▓▒▒▒░░▓▓░▓ ░▒░░▒░░▒▒░░░  ▓█████████████████\n"
                    + "█████████████▓░▓▓▓▒▓▓░▓▓▒▒▒░░▓▓ ▓▒▓▒░░░░ ▒▒▒░░   ▓████████████████\n"
                    + "█████████████▓▓▓▓▒▒▓█▓▓▒▒▒▒▒░▒▓ ▓▒▓▒░    ░▓▒▒░▒░  ████████████████\n"
                    + "████████████▓▓▓▓▒▒▒██▓▓▒▒░░▒░▒█ ▓▒▒▒░░    ▒▒▒▒░░░  ███████████████\n"
                    + "████████████▒▒▓▓░▒▓█▓▓▓▒▒░░░ ░█░▒▒▒▒░░▒░░  ▓▒▒ ░░░ ▒██████████████\n"
                    + "███████████▓▒▒▒▓ ▓▓█░▒▓▓▒▒░   █▒▒▓░▒▒░░░░░ ▒▒▒▒░ ░  ██████████████\n"
                    + "███████████▒░▒▓  ▓▓██▓▓▓▒░    ▓▓░▓▒▒▒░░░░░ ░▒░▒▒░   ▓█████████████\n"
                    + "██████████▓░▒▓░▓▓▒▓███▓▓▒░░   ▒█ ░▓▓▒░░░░ ░▒██▓▒▒▒  ██████████████\n"
                    + "██████████▒▒▒▒██▓ ▒▓█▓▓▓▒░  ░▒██░   ▒▒▒  ░▒▓█████▒ ▒██████████████\n"
                    + "██████████▒▒▓█████▒░▓▓▓▒░▒▒▓▓▓░    ▓█▓▒▒░▒▓███████████████████████\n"
                    + "███████████████████▓░▒▒▒▓▓▓▒▓░  ░▓██████▓█████████████████████████\n"
                    + "█████████████████████▓░▒▒▒▓███████████████████████████████████████\n"
                    + "██████████████████████████████████████████████████████████████████"
                    + "\nSem orgulho algum por tudo o que estes apetrechos viram juntamente com seus olhos voce os equipa.\n"
                    + "já sob o velho manto e armadura, com seu antigo arma no suporte em suas costas\n"
                    + "o unico desejo ecoa por todo seu corpo…  VINGANÇA!");
        }
        System.out.println("");
        Som.finalMario();
        System.out.println("PARABENS! voce acaba de concluir a primeira fase do jogo!.\n"
                + "1-INICIAR ATO 2  2-IR PARA O MENU INICIAL   3-VERIFICAR STATUS");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                Ato2 c = new Ato2(this.jogador);
                c.Enredo_2();
                break;
            }
            if (resp == 2) {
                System.out.println("MOSTRAR STATUS");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-INICIAR ATO 2   2-IR PARA O MENU INICIAL   3-VERIFICAR STATUS");
            resp = e.nextInt();
        }

    }

    public void inicializarJogador() {
        Especialidade arqueiro = new Arqueiro();
        jogadorTeste = new Humano("Vagner", arqueiro);
        configuraDispensa(jogadorTeste.getClasseJogador());
    }

    public void configuraDispensa(Especialidade classe) {
        dispensa = new Inventario(30);
        dispensa.adicionarItem(Itens.getCAMISA());
        dispensa.adicionarItem(Itens.getJABUTICABA());

        switch (classe.getDescricao()) {
            case "Guerreiro":
                dispensa.adicionarItem(Itens.ESPADA);
                break;
            case "Mago":
                dispensa.adicionarItem(Itens.CAJADO);
                break;
            case "Arqueiro":
                dispensa.adicionarItem(Itens.ARCO);
                break;
            default:
                break;
        }
        setDispensa(dispensa);
    }

    public Inventario javaliLeste(Especialidade classe) {
        Inventario recompensa = new Inventario(2);
        if (classe.getDescricao().equals("Guerreiro")) {
            ItemAtaque espadaJusticeira = (ItemAtaque) Itens.ESPADAJUSTICEIRA;
            espadaJusticeira.getInformacoes();
            System.out.println("Parabéns, você encontrou uma " + espadaJusticeira.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(Itens.ESPADAJUSTICEIRA);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
            return recompensa;
        } else if (classe.getDescricao().equals("Mago")) {
            ItemAtaque cajadoEsmeralda = (ItemAtaque) Itens.CAJADOESMERALDA;
            cajadoEsmeralda.getInformacoes();
            System.out.println("Parabéns, você encontrou um Cajado Esmeralda " + cajadoEsmeralda.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(Itens.CAJADOESMERALDA);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
            return recompensa;
        } else if (classe.getDescricao().equals("Arqueiro")) {
            ItemAtaque arcoAntigo = (ItemAtaque) Itens.ARCOANTIGO;
            arcoAntigo.getInformacoes();
            System.out.println("Parabéns, você encontrou um Arco Antigo " + arcoAntigo.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(Itens.ARCOANTIGO);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
            return recompensa;
        } else {
            return recompensa;
        }
    }

    public Inventario cervoNorte(Especialidade classe) {
        Inventario recompensa = new Inventario(2);
        if (classe.getDescricao().equals("Guerreiro")) {
            ItemAtaque espadaJusticeira = (ItemAtaque) Itens.ESPADAJUSTICEIRA;
            espadaJusticeira.getInformacoes();
            System.out.println("Parabéns, você encontrou uma " + espadaJusticeira.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(Itens.ESPADAJUSTICEIRA);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
            return recompensa;
        } else if (classe.getDescricao().equals("Mago")) {
            ItemAtaque cajadoEsmeralda = (ItemAtaque) Itens.CAJADOESMERALDA;
            cajadoEsmeralda.getInformacoes();
            System.out.println("Parabéns, você encontrou um Cajado Esmeralda " + cajadoEsmeralda.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(Itens.CAJADOESMERALDA);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
            return recompensa;
        } else if (classe.getDescricao().equals("Arqueiro")) {
            ItemAtaque arcoAntigo = (ItemAtaque) Itens.ARCOANTIGO;
            arcoAntigo.getInformacoes();
            System.out.println("Parabéns, você encontrou um Arco Antigo " + arcoAntigo.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(Itens.ARCOANTIGO);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
            return recompensa;
        } else {
            return recompensa;
        }
    }

    public Inventario globinFase2(Especialidade classe) {
        Inventario recompensa = new Inventario(3);

        if (classe.getDescricao().equals("Guerreiro")) {
            ItemAtaque espadaMagica = (ItemAtaque) Itens.ESPADAMAGICA;
            espadaMagica.getInformacoes();
            System.out.println("Parabéns, você encontrou uma " + espadaMagica.getInformacoes() + ", um Espinafre " + (Itens.ESPINAFRE) + " e uma Armadura Azul " + (Itens.ARMADURAAZUL));
            recompensa.adicionarItem(Itens.ESPADAMAGICA);
            recompensa.adicionarItem(Itens.ESPINAFRE);
            recompensa.adicionarItem(Itens.ARMADURAAZUL);
            return recompensa;
        } else if (classe.getDescricao().equals("Mago")) {
            ItemAtaque cajadoDePaus = (ItemAtaque) Itens.CAJADODEPAUS;
            cajadoDePaus.getInformacoes();
            System.out.println("Parabéns, você encontrou um " + cajadoDePaus.getInformacoes() + ", um Espinafre " + (Itens.ESPINAFRE) + " e uma Armadura Azul " + (Itens.ARMADURAAZUL));
            recompensa.adicionarItem(Itens.CAJADODEPAUS);
            recompensa.adicionarItem(Itens.ESPINAFRE);
            recompensa.adicionarItem(Itens.ARMADURAAZUL);
            return recompensa;
        } else if (classe.getDescricao().equals("Arqueiro")) {
            ItemAtaque arcoArbalest = (ItemAtaque) Itens.ARCOARBALEST;
            arcoArbalest.getInformacoes();
            System.out.println("Parabéns, você encontrou um " + arcoArbalest.getInformacoes() + ", um Espinafre " + (Itens.ESPINAFRE) + " e uma Armadura Azul " + (Itens.ARMADURAAZUL));
            recompensa.adicionarItem(Itens.ARCOARBALEST);
            recompensa.adicionarItem(Itens.ESPINAFRE);
            recompensa.adicionarItem(Itens.ARMADURAAZUL);
            return recompensa;
        } else {
            return recompensa;
        }
    }

    public Inventario getDispensa() {
        return dispensa;
    }

    public void setDispensa(Inventario dispensa) {
        this.dispensa = dispensa;
    }

    private void abrirInventario(Inventario inventario, String descricao) {
        descricao.toUpperCase();
        System.out.println("------------------");
        System.out.println("---" + descricao + "---");
        System.out.println("------------------");

        for (int i = 0; i < inventario.verTodosItens().size(); i++) {
            System.out.println("[" + i + "] - " + inventario.verItem(i).getDescricao());
        }
        System.out.println("------------------");
        System.out.println("Selecione uma ação: ");
        System.out.println("0 - Fechar");
        System.out.println("1 - Guardar na mochila");
        System.out.println("2 - Comer alimento");
        System.out.println("3 - Mover para a mão");
        Scanner selecionar = new Scanner(System.in);
        int acao = selecionar.nextInt();
        if (acao == 1) {
            coletaDeItens(inventario);
        } else if (acao == 2) {
            System.out.println("Digite o número do alimento que deseja comer: ");
            Scanner alimento = new Scanner(System.in);
            int numAlimento = alimento.nextInt();
            Item comida = inventario.pegarItem(numAlimento);
            try {
                jogadorTeste.comer((Comida) comida);
                System.out.println("Yummmm...");
                System.out.println("Sua vida atual é: " + jogadorTeste.getbVidaAtual() + "/" + jogadorTeste.getbVida());
                abrirInventario(inventario, descricao);
            } catch (Exception e) {
                System.out.println("Não foi possível comer o item.");
                inventario.adicionarItem(comida);
                abrirInventario(inventario, descricao);
            }
        } else if (acao == 3) {
            System.out.println("Digite o número do item que deseja mover para a mão: ");
            Scanner itemDeAtaque = new Scanner(System.in);
            int posicao = itemDeAtaque.nextInt();
            System.out.println("Você tem certeza que deseja descartar o item atual para pegar o item " + inventario.verItem(posicao).getDescricao() + "(1 - Sim / 2 - Não)");
            Scanner confirma = new Scanner(System.in);
            int resposta = confirma.nextInt();
            if (resposta == 1) {
                try {
                    Item itemAtaque = inventario.pegarItem(posicao);
                    jogadorTeste.setItemDaMao((ItemDeCombate) itemAtaque);
                } catch (Exception e) {
                    System.out.println("Erro ao pegar item. Verifique se é um item de ataque.");
                }

            }
        }

    }

    private void abrirMochila(Inventario inventario, String descricao) {
        System.out.println("------------------");
        System.out.println("---" + descricao.toUpperCase() + "---");
        System.out.println("------------------");

        for (int i = 0; i < inventario.verTodosItens().size(); i++) {
            System.out.println("[" + i + "] - " + inventario.verItem(i).getDescricao());
        }
        System.out.println("------------------");
        System.out.println("Selecione uma ação: ");
        System.out.println("0 - Fechar");
        System.out.println("1 - Comer item");
        Scanner selecao = new Scanner(System.in);
        int acao1 = selecao.nextInt();
        if (acao1 == 1) {
            System.out.println("Digite o número do alimento que deseja comer: ");
            Scanner alimento = new Scanner(System.in);
            int numAlimento = alimento.nextInt();
            Item comida = inventario.pegarItem(numAlimento);
            try {
                jogadorTeste.comer((Comida) comida);
                System.out.println("Yummmm...");
                System.out.println("Sua vida atual é: " + jogadorTeste.getbVidaAtual() + "/" + jogadorTeste.getbVida());
                abrirMochila(inventario, descricao);
            } catch (Exception e) {
                System.out.println("Não foi possível comer o item.");
                inventario.adicionarItem(comida);
                abrirMochila(inventario, descricao);
            }

        }
    }

    private void coletaDeItens(Inventario dispensa) {
        int acao = 1;
        while (acao != 0) {
            for (int i = 0; i < dispensa.verTodosItens().size(); i++) {
                System.out.println("[" + i + "] - " + dispensa.verItem(i).getDescricao());
            }
            System.out.println(" -- Digite o número do item que você deseja pegar:");
            Scanner selecionar = new Scanner(System.in);
            int pegar = selecionar.nextInt();
            try {
                Item itemPego = dispensa.pegarItem(pegar);
                jogadorTeste.adicionarItem(itemPego);
                System.out.println("Item adicioando à mochila!");
            } catch (Exception e) {
                System.out.println("Esse item não pode ser pego!");
                System.out.println("Motivo: " + e.getMessage());
            }
            System.out.println("Deseja pegar outro item (1) ou fechar a mochila (0)?");
            acao = selecionar.nextInt();
        }
    }

}
