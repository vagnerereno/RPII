package motor;

import atos.Ato0;
import audio.Som;
import atos.Ato1;
import java.util.Scanner;

public class RPII {

    public static void main(String args[]) throws Exception {
        Som.fase1();
        Scanner e = new Scanner(System.in);
        int resp = 0;
        System.out.println("Bem vindo ao MUD, Oque deseja fazer? ");
        while (resp != 1 || resp != 2 || resp != 3) {
            System.out.println("1- Iniciar novo jogo  2- Sobre o jogo  3- Obter ajuda");
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
        boolean valido = false;
        do {
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
            // resp = e.nextInt();
            //Seleciona a opção
            valido = false;
            do {
                resp = e.nextInt();
                for (int cod = 0; cod <= 4; cod++) {
                    if (resp == parcial.proxcod.get(cod)) {
                        int proximo = parcial.getProxcodigo(cod);
                        parcial = j.compara(geral[proximo]);
                        System.out.println(parcial.desc);
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
