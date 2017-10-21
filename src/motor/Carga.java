package motor;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Carga {

    public Atos[] carga(Atos[] c) throws Exception {
        /* ArrayList<Integer> opcoesA = new ArrayList();
         */
        ArrayList<Integer> atoa = new ArrayList<>();
        atoa.add(1);
        atoa.add(2);
        Atos a = new Atos(0, "Pois bem, então parte em sua longa jornada.\n"
                + "Nos arredores da vila Kenko, você descança, sem abrir os olhos voce pensa: acordo ou durmo mais um pouco?\n"
                + "SEGUIR DORMINDO ou ACORDAR?", null, atoa);
        c[0] = a;

        ArrayList<Integer> atob = new ArrayList<>();
        atob.add(2);
        Atos b = new Atos(1, "As galinhas cacarejam enlouquecidamente anunciando o novo dia, por vezes você sente vontade de dar cabo delas \n"
                + "devido a irritação sonora recorrente. Agora desperta por completo.\n"
                + "LEVANTAR", "galinha.wav", atob);
        c[1] = b;

        ArrayList<Integer> atod = new ArrayList<>();
        atod.add(3);
        atod.add(4);
        Atos d = new Atos(2, "Abrindo os olhos, ainda meio confuso, percebe que esqueceu de apagar a vela, e agora o cheiro de cera invade o recinto.\n"
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
                + "\n"
                + "APAGAR VELA ou IR AO BANHEIRO", null, atod);
        c[2] = d;
        ArrayList<Integer> atoe = new ArrayList<>();
        atoe.add(4);
        Atos e = new Atos(3, "\n"
                + "░▒░░░░░░░░░░░░░▒░░░░░░░▒░░░░░░░░░░░░░░\n"
                + "░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░▒\n"
                + "░▒░░░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░░░▒░░░░░░░░\n"
                + "░▒░░▒░▒░▒░▒░▒░▒░▒▒▒▒▒░▒░▒▒▒░▒░▒░░░░░░░\n"
                + "░▒░▒▒▒░▒░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▒░▒░░░▒\n"
                + "░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▒░▒░░░░▒\n"
                + "░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░░░▒\n"
                + "░▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░░▒\n"
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
                + "██████████████████████████████████████\n"
                + "A vela foi apagada!\n"
                + " IR AO BANHEIRO", null, atoe);
        c[3] = e;
        ArrayList<Integer> atof = new ArrayList<>();
        atof.add(5);
        atof.add(6);
        Atos f = new Atos(4, " vai até o lavabo atirar agua em sua face para dissipar a preguiça ainda remanescente, a agua está\n"
                + "um arrepio percorre todo o seu corpo, você encara-se no velho espelho e contempla sua triste feição\n"
                + "trazendo flashes das lembranças de seu passado de mercenário, tempos de matança em prol do atual reino.\n"
                + "Voltando a si, ainda contemplando sua face no reflexo:\n"
                // + " get descricao da raca q escolheu  (vou colocar em algum lugar)\n"
                + "Após voltar para o quarto e vestir-se você percebe que a fome lhe aflige. \n"
                + "IR PARA A DESPENSA ou CAÇAR ALGO PARA COMER?", null, atof);
        c[4] = f;
        //IMPLEMENTACAO DA DESPENSA, PEGAR ITENS ANTES
        ArrayList<Integer> atog = new ArrayList<>();
        atog.add(6);
        Atos g = new Atos(5, "Percebendo a pouca quantia de alimento em sua dispensa decide ir caçar na floresta \n"
                + "SAIR DE CASA E IR À FLORESTA CAÇAR", "comendo.wav", atog);
        c[5] = g;
        ArrayList<Integer> atoh = new ArrayList<>();
        atoh.add(7);
        atoh.add(8);
        Atos h = new Atos(6, "\n"
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
                + "            ░                 ░                                               \n"
                + "Pegando sua arma de caça que estava ao lado da porta de saída, depois de alguns passos vislumbra seu pequeno casebre de madeira cedido pelo ancião da vila Tothurin, após voce salva-lo em certa ocasião.\n"
                + "Este imóvel é sua morada a alguns anos, sempre solitariamente acolhendo seus pensamentos e seu corpo.\n"
                + "Com um breve suspiro vira-se para a densa floresta de Lavitan: \n"
                + "SENTAR UM POUCO E OBSERVAR ou ENTRAR NA FLORESTA?", "porta.wav", atoh);
        c[6] = h;
        ArrayList<Integer> atoi = new ArrayList<>();
        atoi.add(8);
        Atos i = new Atos(7, " \n"
                + "█████████████████████████████████▓██████████████████████████████████████████████\n"
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
                + "██░░▒▒░▒░▒▒▒▒▒▒▒▒▒▒░ ░▒░░░▒▒░░▒░▒░▒▓▒░▒▒▒░░▒▒▒░ ▒▒▓▒▒▒▒░▒▒▒▒▒▒▓▒ ▒▒▓▒░░░▒▒░▒▒ ▒█\n"
                + " Após seu breve descanso, abservando as grandes arvores, você se sente inteiramente pronto para adentrar suas instâncias.\n"
                + "ENTRAR NA FLORESTA", "entradaFloresta.wav", atoi);
        c[7] = i;

        ArrayList<Integer> atoj = new ArrayList<>();
        atoj.add(9);
        atoj.add(13);
        atoj.add(20);
        Atos j = new Atos(8, "Você caminha calmamente por uma pequena trilha, ela mal pode ser vista pois a vegetação muito densa\n"
                + "mas sua notável experiência ela se torna apenas uma trilha normal, seguindo mais adiante voce depara-se com\n"
                + "uma bifurcação em frente a uma grande árvore.\n"
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
                + "              ▒█▓▓▒     ▒▓▒                    \n"
                + " A trilha ao norte leva para o que parece ser uma elevação no terreno da área, e a leste, a segunda trilha leva para um terreno mais baixo e úmido.\n"
                + "IR PARA O LESTE, IR PARA O NORTE ou RETORNAR PARA SUA CASA?", null, atoj);   //opcao retornar encontra goblin  //CONFERIR DEPOIS SE PODE IR PARA OS MESMOS CAMINHOS JA USADOS NO RETORNAR PARA A PARTE FINAL DA FASE
        c[8] = j;

        ArrayList<Integer> atok = new ArrayList<>();
        atok.add(10);
        atok.add(11);
        Atos k = new Atos(9, "Seguindo adiante neste caminho a vegetação possui uma menor estatura, mas mesmoassim nao perdendo em densidade\n"
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
                + "                                             ░░░                                           \n"
                + "Ao longe ouve o som da vegetação sendo pisada ou mexida observando calmamente voce avista um imponente javali\n"
                + "os pelos escuros dão um tom sombrio a fera, contrastando com suas presas brancas como o leite, suas patas e focinho estão cobertas de lama.\n"
                + "com seu equipamento em maos, e seu instinto de caça agucado,  prepara-se para o ataque no desavisado animal.\n"
                + "aproximando-se sorrateiramente por trás da criatura, segurando firmemente sua arma e tentando fazer o minimo de barulho possivel.\n"
                + "ATACAR SILECIOSAMENTE ou ATACAR FEROSMENTE?", "javali.wav", atok);
        c[9] = k;

        ArrayList<Integer> atol = new ArrayList<>();
        atol.add(11);
        Atos l = new Atos(10, "A criatura percebe seu movimento e foge em desparada por entre a vegetação, com muita dificuldade voce consegue\n"
                + "alcança-la, pois devido a lama o animal fica parcialmente mais lento que você.\n"
                + "INVESTIR CONTRA O ANIMAL", null, atol);
        c[10] = l;

        ArrayList<Integer> atom = new ArrayList<>();
        atom.add(12);
        Atos m = new Atos(11, "com um rápido e súbito movimento você lanca-se sobre a fera que num grunhido de dor e aflição cai por terra\n"
                + "após ser atingida no peito, possivelmente o golpe acertou diretamente seu coração, não deixando forças para uma reação\n"
                + "ao lado, voce solta sua bolsa e empunha sua pequena adaga para dilacerar a fera e coletar sua carne e seu couro\n"
                + "ESFOLAR ANIMAL E COLETAR O LOOT ", null, atom);
//implementacao metodo de pegar itens
        c[11] = m;

        ArrayList<Integer> aton = new ArrayList<>();
        aton.add(8);
        Atos n = new Atos(12, "Você começa a descarnar o animal, coletando o conteudo da caçada.\n" //IMPLEMENTACAO LOOT DO CERVO
                + "Apos a tarefa voce percebe que grande parte do dia já se passou e é sabio retornar antes que a noite caia sobre Lavitan, apesar desta parte ser apenas sua borda ainda assim, varios perigos podem surgir.\n"
                + "RETORNAR", "esfolar.wav", aton);     //RETORNA PARA ENCRUZILHADA                                  
        c[12] = n;

        ArrayList<Integer> atoo = new ArrayList<>();
        atoo.add(14);
        atoo.add(15);
        Atos o = new Atos(13, "\n" //norte
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
                + " ▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▒▒▓▒▒▓▓▓▓▓▓▓▓▓▓▓█▒ \n"
                + "Seguindo você encontra muitas rochas entre as grandes arvores e arbustos de variados tamanhos, avancar por aqui se torna por vezes bastante dificultoso\n"
                + "tendo que frequentemente escalar ou desviar das grandes rochas. Mais alguns minutos de caminhada voce se depara com uma pequena falésia\n"
                + "pelo seu tamanho reduzido ainda é possivel escalá-la, mas ainda assim esta acao pode vir a ser perigosa caso algo de errado.\n"
                + "O pensamento de contorná-la ou encontrar um ponto melhor para escalada passa por sua mente.\n"
                + "ESCALAR ou CONTORNAR?", null, atoo);
        c[13] = o;

        ArrayList<Integer> atop = new ArrayList<>();
        atop.add(13);
        atop.add(16);
        atop.add(20);
        Atos p = new Atos(14, "Utilizando de suas grandes capacidades físicas escalar tal elevação se torna brinquedo de criança mas ainda assim o instinto\n"
                + "diz a voce para seguir com cuidado, nunca se sabe quando uma pedra solta ou lisa ou sem aderencia suficiente vai ser a proxima a ser\n"
                + "escolida como alavanca. Ao terminar de subir voce avista a sua frente mais claridade que o normal para o meio de uma floresta.\n"
                + "RETORNAR ou AVANÇAR?", null, atop);
        c[14] = p;

        ArrayList<Integer> atoq = new ArrayList<>();
        atoq.add(17);
        Atos q = new Atos(16, " \n"
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
                + " ░▓  ▒░ ░▒▒  ░░   ░                        ▒▒░  ░   \n"
                + "No centro da clareira, agora avistada totalmente, esta um majestoso cervo, com seus grandes chifres e seu andar despreocupado.\n"
                + "voce ja consegue sentir o sabor de sua suculenta carne em sua boca. E com este pensamento prepara-se para o ataque.\n"
                + " ATACAR", "cervo.wav", atoq);
        c[16] = q;

        ArrayList<Integer> ator = new ArrayList<>();
        ator.add(18);
        Atos r = new Atos(17, "O cervo mesmo ferido ainda tenta correr para o abrigo da floresta, mas antes de atingir seu objetivo tomba, levantando leivas de grama com sua pesada galhada.n\""
                + "ESFOLAR O ANIMAL E COLETAR A CARNE", null, ator);
        c[17] = r;

        ArrayList<Integer> atos = new ArrayList<>();
        atos.add(8);
        Atos s = new Atos(18, "Você começa a descarnar o animal, coletando o conteudo da caçada.\n" //IMPLEMENTACAO LOOT DO CERVO
                + "Apos a tarefa voce percebe que grande parte do dia já se passou e é sabio retornar antes que a noite caia sobre Lavitan, apesar desta parte ser apenas sua borda ainda assim, varios perigos podem surgir.\n"
                + "RETORNAR", "esfolar.wav", atos);     //RETORNA PARA ENCRUZILHADA
        c[18] = s;

        ArrayList<Integer> atot = new ArrayList<>();
        atot.add(19);
        atot.add(8);
        Atos t = new Atos(15, "Voce segue esgueirando-se da vegetação e rochas, contornando a pequena falésia. Ela parece nunca terminar\n"
                + "mas voce segue destemidamente seu caminho em busca de algo para caçar.\n"
                + "Após um bom tempo de caminhada você ja se sente cansado, pois o esforço de andar nesta parte da floresta nomeDaFloresta é grande.\n"
                + "Passa pela sua mente o pensamento de voltar para casa e ir na vila nomeDaVila comprar alimentos\n"
                + "embora não seja a opção mais barata neste momento parece bastante convidativa.\n"
                + "SEGUIR EM FRENTE ou RETORNAR?", null, atot);
        c[15] = t;

        ArrayList<Integer> atou = new ArrayList<>();
        atou.add(8);
        Atos u = new Atos(19, "\n"
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
                + "▒▒░▒▓▒▒▒░░▒░░░░░▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒░ ▒▒ ░▒▒▒▒▒░░░░ ░░░  ░▒▒▒▒▓▓▒▓▓▒▒▒▓▒▒▒▒▒▒▒▒░░░░░░ ▒▒▒░▒▒░▒▒▒▒▒▒▒▓▒▒▒▒░    ░░░░░ ░ ░░░░▒▒▒ \n"
                + "Você segue bravamente seu caminho, sempre atento para os sons da floresta, nunca se sabe quando uma presa pode surgir.\n"
                + "Mas apesar dos seus esforços você se encontra em um “beco” sem saída formado pelas rochas\n"
                + "nesta parte da falésia não é possivel escalar devido a inclinacao vertical da formação.\n"
                + "Farto da situação e sem encontrar nenhum alvo para sua caçada voce concebe que é melhor voltar e ir à vila comprar algo\n"
                + "RETORNAR", null, atou);
        c[19] = u;

        ArrayList<Integer> atov = new ArrayList<>();
        atov.add(21);
        Atos v = new Atos(20, "Seguindo seu caminho de retorno para sua casa voce tem o pressentimento de estar sendo observado, nao interrompe sua caminhada mas sua atenção eleva-se\n"
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
                + "1-ATACAR O GLOBIN", "globin.wav", atov);  //fugir talvez seja colocado
        c[20] = v;

//implementação metodo batalha 
        ArrayList<Integer> atox = new ArrayList<>();
        atox.add(22);
        Atos x = new Atos(21, "Com a criatura estirada ao chao na sua frente voce ainda com o sangue quente da pequena luta, espera que mais deles aparecam para lhe enfrentarem\n"
                + "pois estas criaturas sempre atacam em bando. Apesar do pequeno momento de espera mais inimigos não aparecem.\n"
                + "Voce acha estranho, mas agradece mentalmente que isso não aconteceu, apenas um inimigo, apesar do susto, não era grande oponente para você\n"
                + " mas uma grande quantidade com certeza seria perigoso. Sem mais nada a fazer resta apenas retornar para a sua morada ao sul."
                + "IR AO SUL", "brigademaos.wav", atox);
        c[21] = x;

        ArrayList<Integer> atoz = new ArrayList<>();
        atoz.add(23);
        Atos z = new Atos(22, "\n"
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
                + "░░░                         ░     ░░            ░                     ░ ░     ░ ░   ░░░░░                        ░░ ░▒░░░ \n"
                + "Você segue caminhando para fora da floresta, ainda com sua arma em mãos para evitar mais algum possível confronto. \n"
                + "Nesta parte da mata já é possivel avistar o sol comm clareza pois a vegetação nao e mais tao densa\n"
                + "Você observa que ja passou do meio dia e a fome é grande, fazendo apressar seu passo. Ao sair da mata\n"
                + "voce avista fumaça no ceu, nao é algo totalmente estranho, mas a quantidade meio que lhe deixa preocupado.\n"
                + "Entao voce sente vontade de saber do que se trata, procurando um ponto de observacao melhor.\n"
                + "OBSERVAR MELHOR", "fogo.wav", atoz);
        c[22] = z;

        ArrayList<Integer> atow = new ArrayList<>();
        atow.add(24);
        Atos w = new Atos(23, ""
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
                + "Subindo em uma arvore já nas proximidades de sua casa você avista a vila toda envolta em chamas e fumaca.\n"
                + "Uma sensação de desespero enche seu corpo, a sensação de perder entes queridos novamente o deixa perplexo\n"
                + "o unico pensamneto agora é correr para a vila.\n"
                + "CORRER PARA A VILA!", null, atow);
        c[23] = w;

        ArrayList<Integer> atoy = new ArrayList<>();
        atoy.add(25);
        atoy.add(26);
        Atos y = new Atos(24, "Você se põe em corrida, ignorando o cansaco e fome das suas acoes anteriores.\n"
                + "Apesar de voce ser um estrangeiro aquelas pessoas o receberam de bracos abertos, ha alguns anos voce convive com eles\n"
                + "seja em confraternizações, trabalhos ou caçadas, eles não eram sua familia de sangue mas não importava, voce gosta deles\n"
                + "e vice versa. A vontade de chegar logo lhe forcava a correr ainda mais rápido,"
                + "mas o caminho para a vila parecia aumentar em vez do oposto, as passadas não condiziam com a sua vontade de chegar.\n"
                + "USAR TODA A SUA ENERGIA PARA CORRE MAIS  ou CORRER NORMALMENTE", null, atoy);
        c[24] = y;

        ArrayList<Integer> atoaa = new ArrayList<>();
        atoaa.add(26);
        Atos aa = new Atos(25, "\n"
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
                + "                        ▓▒░           \n"
                + "NOSSA!! Voce é o Usain Bolt dos RPGs!\n"
                + "CONTINUAR", "corre.wav", atoaa);
        c[25] = aa;

        ArrayList<Integer> atoab = new ArrayList<>();
        atoab.add(27);
        atoab.add(28);
        Atos ab = new Atos(26, "\n"
                + "Você finalmente para de correr na entrada da vila, Seus olhos nao conseguem acreditar no que veem\n"
                + "e o cansaco da corrida parece não vir como normalmente aconteceria após uma corrida. Quase todas as construcoes viraram uma pilha de cinzas e as que ainda resistiam\n"
                + "ardiam em chamas, varios corpos sem vida estavam espalhados pelo local e alguns queimavam junto das casas.\n"
                + "Uma indescritivel sensação domina seu corpo mas voce nao fala nada, apenas\n"
                + "suas pernas ainda respondem, e elas querem ir em direção ao centro de Kenko.\n"
                + "PARAR E DESCANSAR ou IR AO CENTRO DA VILA?", null, atoab);
        c[26] = ab;

        ArrayList<Integer> atoac = new ArrayList<>();
        atoac.add(28);
        Atos ac = new Atos(27, "Voce, desolado desaba no solo de joelhos, ficando ali algum tempo em um estado catatônico\n"
                + "passado alguns minutos, você resolve ir ao centro de Kenko.\n"
                + "IR AO CENTRO DA VILA.", null, atoac);
        c[27] = ac;

        ArrayList<Integer> atoad = new ArrayList<>();
        atoad.add(29);
        Atos ad = new Atos(28, "\n"
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
                + "                                                 ░░▒▒▒▒░                                        \n"
                + "A paisagem de destruição se extendia a esta parte da vila também, apenas o antigo templo em seu centro ainda resistia\n"
                + "nao por falta da insistência de seja lá quem que atacou este pacato lugar, suas grossas paredes feitas de solidas\n"
                + "rochas a muito tempo, desde que se tem registro esta edificação já existia em Kenko\n"
                + "certamente fazia parte de algo antigo.\n"
                + "Apenas sua porta estava totalmente destruida, certamente os moradores tentaram abrigar-se do ataque neste solido abrigo.\n"
                + "Voce sente que deve entrar.\n"
                + "ENTRAR NO TEMPLO", "templo.wav", atoad);
        c[28] = ad;

        ArrayList<Integer> atoae = new ArrayList<>();
        atoae.add(30);
        Atos ae = new Atos(29, "A imagem ali dentro com certeza não sairá da sua mente tão cedo, varios corpos mutilados e sinais de luta pelo ambiente.\n"
                + "Em meio ao silencio enlouquecedor você ouve alguns gemidos. Mais que depressa tenta localizar a origem deste agoniante som\n"
                + "uma breve sentelha de esperanca ascende em seu interior, pode ainda alguém estar vivo.\n"
                + "BUSCAR ORIGEM DO SOM", null, atoae);
        c[29] = ae;

        ArrayList<Integer> atoaf = new ArrayList<>();
        atoaf.add(31);
        Atos af = new Atos(30, "\n"
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
                + "        ░▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒░░░░░▒░░░░░░░░                                      \n"
                + "Contornando o altar central esta Tothurin no chão, encharcado de sangue de um ferimento em seu peito e notaveis sinais\n"
                + "de tortura pelo corpo. Ele rastejava para fora de uma abertura no chao do templo que você sequer sabia da existencia\n"
                + "Seu amigo de longa data, foi o motivo de voce vir morar em Kenko, salvando-o da perdição que se encontrava e dando\n"
                + "de certa forma um novo motivo para continuar vivendo depois dos acontecimentos de seu passado. Ele balbucia algumas palavras\n"
                + "mas voce não entende, deve se aproximar para compreender melhor.\n"
                + "3-APROXIMAR-SE", "ferido.wav", atoaf);
        c[30] = af;

        ArrayList<Integer> atoag = new ArrayList<>();
        atoag.add(32);
        Atos ag = new Atos(31, "Em seus bracos Tothurin reconhecendo sua feição começa a falar: - Eles levaram o fragmento do orbe de Nys que estavamos protegendo\n"
                + "por favor impeça que eles consigam utiliza-lo, por favor, eramos seus guardioes e agora o tomaram de nós\n"
                + "por favor o recupere e os impeça de ressuscitar Darknuss. \n"
                + "Você não entende muito bem a situação, mas não o questiona o sobre.\n"
                + "Agora o unico clamor em seu pensamento é saber quem fez tal barbárie com todos.\n"
                + "QUEM FEZ ISSO TOTHURIN?", null, atoag);
        c[31] = ag;

        ArrayList<Integer> atoah = new ArrayList<>();
        atoah.add(33);
        Atos ah = new Atos(32, ""
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
                + "                                                                                \n"
                + "A vitalidade esta indo embora de seu velho corpo, esta batalha ele não vencerá… Com suas ultimas forcas ele responde que\n"
                + "foram o bando Wulfforce, novamente pede para que voce os impeça, mas dessa vez termina a frase dizendo para voce pegar uma adaga\n"
                + "que esta em um compartimento escondido dentro da porta secreta abaixo do templo, apesar da tortura eu nao lhes contei sobre esta\n"
                + "por favor a use bem, é a unica arma que pode derrotar quem os Wulfforce buscam, procure nos outros santuarios de \n"
                + "Xihuno por mais informações, por favor os impeça…. Com estas ultmas palavras seus olhos perdem a vitalidade\n"
                + "ficando de um jeito estático desconfortante. Largando seu corpo calmamente voce observa a passagem aberta.\n"
                + "ENTRAR NA PASSAGEM", null, atoah);

        ArrayList<Integer> atoai = new ArrayList<>();
        atoai.add(34);
        Atos ai = new Atos(33, "\n"
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
                + "▒▒▓▒▒▒▒ ░▓▓▓▓█▓▓▓▒▒░▒░▒░▒▒░    ░░ ░▓▓░▓▒▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▓▓▒░   ░░░▒▒▒▒▒░▒▒▒▒▒░░░░░    ░░ ░░░░▒▒▒▓▓▓█▓███████████ ░░▒░▒▓▓▓▒▒▒▒▓▒▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▒  ▒▒  ░░░░░░░░░▒\n"
                + "Descendo a pequena escada voce avista o pequeno altar ao fundo, onde provavelmente estava o fragmento do orbe que Tothurin falou.\n"
                + "Observando a pequena sala, com suas paredes de pedra com varias inscricoes em alguma linguagem\n"
                + "desconhecida a voce, como Tothurin lhe disse você procura pela pedra que abre o tal compartimento secreto\n"
                + "PRESSIONAR PEDRA CORRETA", "emppedra.wav", atoai);   //TINHA O PUZZLE DAS PEDRAS, VER COMO COLOCAR 
        c[33] = ai;

        ArrayList<Integer> atoaj = new ArrayList<>();
        atoaj.add(35);
        Atos aj = new Atos(34, "Voce percebe que esta pedra pode ser empurrada, a pressionando algumas outras pedras abrem\n"
                + "mostrando uma pequena adaga com varias inscricoes runicas e um cabo transparente de vidro, ali dentro\n"
                + "parecia haver alguma substancia liquida estranha que parecia mexer-se sozinha.\n"
                + "PEGAR ADAGA", null, atoaj);
        c[34] = aj;

        ArrayList<Integer> atoal = new ArrayList<>();
        atoal.add(36);
        Atos al = new Atos(35, "\n"
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
                + "█████████████████████████████████████████████████████████████████████\n"
                + "Com a adaga em mãos voce com toda a sua raiva e desejo de vinganca decide partir em busca de respostas\n"
                + "e sangue por parte dos agressores. Achava que o passado de lutas e tragédias tinha ficado para tras\n"
                + "mas novamente ele bate a minha porta, pensa voce. Está na hora de voltar a ser quem eu era.\n"
                + "Com esta frase dita em sussurros para si mesmo,  voce pensa em seus antigos armamentos, escondidos\n"
                + "em um bau no porão da sua casa. \n"
                + "RETORNAR PARA SUA CASA", "itemLendario.wav", atoal);
        c[35] = al;

        ArrayList<Integer> atoam = new ArrayList<>();
        atoam.add(37);
        Atos am = new Atos(36, "Novamente dentro do templo voce observa os corpos, nada mais importa, somente a vinganca, uma ultima olhada\n"
                + "em seu mais fiel amigo Tothurin, voce lembra de suas palavras e agora passando por toda a carnificina\n"
                + "encontra-se no meio do templo, encarando a saida e as chamas do lado posterior.\n"
                + "Apenas passando por toda a destruição voce segue seu caminho. nada mais importa, apenas a vinganca.\n"
                + "Caminhando com os passos pesados de furia voce dirige-se para sua velha casa, a pequena trilha que\n"
                + "voce sempre passou para visitar seus amigos agora so lhe tras as visões de seus corpos estirados ao chão\n"
                + "sem vida. Ao longe voce avista sua casa, mais lembrancas surgem, tudo ali de algma forma teve algum\n"
                + "envolvimento com essas pessoas que lhe acolheram tão bem, e agora já não existem mais.\n"
                + "ENTRAR EM CASA", null, atoam);
        c[36] = am;

        ArrayList<Integer> atoan = new ArrayList<>();
        atoan.add(38);
        Atos an = new Atos(37, "Adentrando a residência você dirige-se para o alcapão sob a mesa da sala.\n"
                + "Você move a mesa, e vizualiza um alcapao trancado por um velho cadeado.\n"
                + "A chave deste você carrega consigo o tempo todo como um colar, como um lembrete das atrocidades e erros cometidos no seu triste passado.\n"
                + "ABRIR ALÇAPÃO", "porta.wav", atoan);
        c[37] = an;

        ArrayList<Integer> atoao = new ArrayList<>();
        atoao.add(39);
        Atos ao = new Atos(38, ""
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
                + "                                      ░░▒▒░               \n"
                + "Usando a chave pendurada em seu pescoço, voce abre o cadeado do alcapao.\n"
                + "Dentro ha um velho baú, e nele ha algo que voce jurou nunca mais usar\n"
                + "mas desta vez era diferente, as mesmas pessoas que o fizeram realizar este juramento agora merecem vingança.\n"
                + "Você não sente qualquer remorso em quebrar esta promessa\n"
                + "e leva suas maos nele.\n"
                + "ABRIR BAÚ ", null, atoao);
        c[38] = ao;

        ArrayList<Integer> atoap = new ArrayList<>();
        atoap.add(40);
        Atos ap = new Atos(39, "Dentro estão seus velhos equipamentos de guerra, coisas do seu passado que você não gostaria de ter revisto."
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
                + "██████████████████████████████████████████████████████████████████\n"
                + "Sem orgulho algum por tudo o que estes apetrechos viram juntamente com seus olhos você os equipa.\n"
                + "já sob o velho manto e armadura, com sua antiga arma no suporte em suas costas\n"
                + "o unico desejo ecoa por todo seu corpo…  VINGANÇA!\n"
                + "SEGUIR PARA A FASE 2", "itemLendario.wav", atoap);
        c[39] = ap;

        ArrayList<Integer> atoaq = new ArrayList<>();
        atoaq.add(41);
        Atos aq = new Atos(40, "PARABENS! voce acaba de concluir a primeira fase do jogo!.\n"
                + "INICIAR ATO 2, IR PARA O MENU INICIAL ou VERIFICAR STATUS?", "finalMario.wav", atoaq);
        c[40] = aq;
        //IMPLEMENTACAO DO STATUS E + coisas

        ArrayList<Integer> atoar = new ArrayList<>();
        atoar.add(42);
        atoar.add(43);
        Atos ar = new Atos(41, "Fechando seu velho casebre você da uma ultima olhada para a vila de kenka, a fumaça apesar de \n"
                + "ter diminuído ainda não se extinguiu.\n"
                + "Você pensa em dar um enterro digno para seus amigos, grande parte de seus corpos foi consumida pelo fogo\n"
                + "mas os que restaram ainda estão a céu aberto.\n"
                + "Ao mesmo tempo que se preocupa com entrar na floresta de Lavitan com o corpo cansado, pode não ser uma boa ideia.\n"
                + "POUPAR-SE DO ENTERRO ou ENTERRAR AMIGOS? ", null, atoar);
        c[41] = ar;

        ArrayList<Integer> atoas = new ArrayList<>();
        atoas.add(44);
        atoas.add(50);
        Atos as = new Atos(42, "Você segue a passos lentos atravessando pela última vez à vila,\n"
                + "um grande vazio preenche seu coração, tal sensação já foi sentida em seu passado, mas os calmos anos em Kenko \n"
                + "de certa forma tinham o preenchido. Nada mais importa, o fervor de seu sangue em busca de vingança fala mais alto.\n"
                + "A grande floresta de Lavitan, uma das maiores no reino de Eresda, muitos criaturas habitam ali, desde animais, seres mitológicos"
                + "criaturas desconhecidas e é claro, alguns bandidos.\n "
                + "Sabendo deste último, seguir pela estrada principal pode não ser uma boa idéia, saqueadores podem aparecer e frustrar qualquer avanço.\n"
                + "Mas seguir pela floresta pode gerar encontros inesperados com algumas criaturas.\n"
                + "SEGUIR PELA ESTRADA ou SEGUIR PELO MEIO DA FLORESTA?", null, atoas);
        c[42] = as;

        ArrayList<Integer> atoat = new ArrayList<>();
        atoat.add(42);
        //enterrar
        Atos at = new Atos(43, "Você pega uma pá e segue para a vila de Kenko novamente, após recolher os corpos com uma pequena carroça puxada por você mesmo\n"
                + "inicia o feitio das covas, entrando noite adentro executando tal tarefa, no fim, coloca os corpos em seus respectivos locais e realiza uma\n"
                + "pequena oração para cada e se despede pela última vez. \n"
                + "                                    ░░░░▒░░▒▓▓▓▓▒▒                \n"
                + "                                 ▓███████▓▓██▓▓▓                 \n"
                + "                                 ████▓▒▒▓▓▓▓▓▒                  \n"
                + "                                  ░█▓▓▓▒▒▒▓▓▓▓▒                  \n"
                + "                                 ████▓░▒▒▒▒▒▒                   \n"
                + "                                  ███▓▒░▒▓▒▓▓▒░    ░░▒▒      \n"
                + "                                ▒███▒▒▓▓█▓▓████▒░░█████░ \n"
                + "                        ▒█▓█▓▒ ▒███▒░▓▓▒▓▒░▒▒███▒▒▓▒▒▒▓░ \n"
                + "                        ▒██▓▓▒▓█▒ ▒░▒▓▒▒█▓▒▒░ ▓██░▒▒▓▒▓▒     \n"
                + "                         █▓▓▒░▒▓▒▒▓▒▒▓▒▒░▒▓▒▒▒ ▓█▓▓█▓▓▓▓     \n"
                + "                         ▓▓▓▒▓▒▒▓▓▒▒▒▓▓▒▒▒▓▒░▒▒ █▓▓█▓▓▓▒     \n"
                + "                         ▓▓▓▒▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒░▓▓▒▒▒▓▓▒    \n"
                + "                         ▒▓▓▓▓░░░░░▒▓▓░ ░░▒░░░▒▓▓▒▒▓▓▓▓▓░   \n"
                + "                         ░▓▓▓▓ ░▒▓▒▒▒▒░░░░▒░▒▒▒▓▒▒ ░▒▒▒▒     \n"
                + "                          ▓▓▓█▒  ▓█▓▓▒░  ░▒░▒▓░░▒                   \n"
                + "                          ░▒░▒░    ▒▓▓▓▒ ░░░░░░░                     \n"
                + "                                       ▓▓▓█▓ ▒▒░ ░▓                         \n"
                + "                                       ▒▓▓▓█▒▒▒ ░▓█                         \n"
                + "                                        ░█▒▓▓ ░░░▒▓▓░                       \n"
                + "                                        █▓▓▓░ ░░░░▒░                        \n"
                + "                                       ▓▓▓▓▒░▒▓░▒▒▒                       \n"
                + "                                       ▓▓██▒ ▒░░▒▒▒                        \n"
                + "                                        ▒▓▓▓▓ ░░ ▒▒▒                              \n"
                + "                                       ▒█▓▓▓░░░▒▒▒▒                              \n"
                + "                                       ░█▓▓▓░ ░▒▒▒▒░                             \n"
                + "                                        █▓▓█▒░░▒▒▓▓▒                             \n"
                + "                                       █████▓░░░▒▒▒░                            \n"
                + "                                      ░███▓░▒▓▒▒░▒▓██▓                           \n"
                + "                                    ████▓░░▒▒▒▒▒▒▒▒▓▓▓                         \n"
                + "                           ░▒▒▒▒▓▓███████████▒░░▓▒▒▒▒▒▒▒▒▒▓▓█▒                    \n"
                + "            ░▒▒▓▓█████████████████████████████▒▒▒▓▓▓▓█▓▓▓▒▒▒▒░          \n"
                + "     ▒████████████▓███▓░       ░       ░░░     ░  ░░     ░▒▒░░░        ░░    \n"
                + "Apesar de não ter notado no momento, suas mãos estão quase em carne viva, e seu corpo está fadigado. \n" //EXIBIR A SAUDE AQUI SERIA UMA BOA
                + "Você pensa em usarseu bálsamo de cura, um dos itens que pegou ao sair de casa, mas ao mesmo tempo lembra que pode precisar dele para mais tarde\n"
                + "na floresta e só tem uma unidade deste.\n"
                + "ABRIR INVENTÁRIO(não implementado ainda, nao clique) ou IGNORAR E SEGUIR PARA A ENTRADA DA FLORESTA?", null, atoat
        );
        //TODA VEZ Q ABRIR O INVENTARIO E USAR ALGUM ITEM VAI EXIBIR A MENSAGEM DE UM VEOTOR PADRAO DE USO DE ITEM AINDA A SER FEITO  //43 potion cura
        //pensando bem e melhor colocar direto no metodo :) // "Tragando o líquido espesso você sente seu cansaço desaparecer completamente, os ferimentos regeneram-se.\n"
        c[43] = at;

        ArrayList<Integer> atoau = new ArrayList<>();
        atoau.add(45);
        Atos au = new Atos(44, "\n"
                + "Você segue seu ritmo pela pequena estrada, aos poucos mais algumas trilhas se juntam a ela e de certa forma ela aumente um pouco"
                + "significando que pessoas passam por ali mais frequentemente. \n"
                + "Mais adiante você percebe que alguns galhos movem-se na floresta, acompanhando sua caminhada, ainda não dá para saber o que é mas certamente\n"
                + "coisa boa não deve ser, pensa consigo mesmo.\n"
                + "3 bandidos(humanos?) surgem ao seu redor, com olhares penetrantes e certamente decididos do que estão fazendo.\n"
                + "Você observa mais atentamente que eles estão muito magros e com roupas já bastante gastas, estas também claramente não foram feitas para a batalha\n"
                + "já que desprovem de qualquer proteção mais robusta.\n"
                //IMAGEM BANDIDOS  
                +"     ░▒                                   \n" +
"                    ▒▒▓▓█▓                                  \n" +
"                  ▓▓▓▓▓▓▓██░                                \n" +
"                  ▓▓▓▓▓▓▓▓▓█▒                               \n" +
"                 ░▓█▓▓▓▓▓▓▓▓█░                              \n" +
"                 ░████████▓▓██▒                             \n" +
"                 ▒██▓▒▓▒▒██▓████▓░                          \n" +
"                 ▓██▓▒▒▒▓█████▓▓▓█▓                         \n" +
"               ▒▓▓███▓▓▓████▓▓▒▒▓▓▓▓░                       \n" +
"              ▒▓▓▓▓▓▓██████▓▓▓▓█▓▓▓██▓▒                     \n" +
"              ▒█▓▓▓▓▓▓▓▓██▓▓▓██▓▓▓▓▓▓███                    \n" +
"               ▓██▓▓▓█▓███▓▓▓▓▓▓▒▓▓▓▓▓▓█▓                   \n" +
"               ▒▓▓█▓█████▓█▓▓▓▓▓▓▓▓▓▓▒▓▓█▓░                 \n" +
"              ▒▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▒▓▒▓▓▓█▓                \n" +
"              ▓▓▓▓▓▓▓▓▓██▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░              \n" +
"             ▒▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒             \n" +
"             ▓▓▓▓▓▓▓███████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒            \n" +
"            ▒██▓▓███████████▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓██▓█▓           \n" +
"            ▓▓▓▒▒▓█████████████▓▓▓▓▓▓▓▓██▓▒▒▓▓██▓           \n" +
"           ▓▓▒▒▒▓███▓▓██████▓█████▓▓████▓▒▒▒▒▓██▒           \n" +
"          ▓███▓███▓▓▓██████████▓██████▓█▓▒▒▒▓███▓░          \n" +
"        ░██▓████▓▓▓▓███████▓▓███████████▓▒░▒▓████▓▓▒        \n" +
"       ▓█████▓▓▓▓▓██████████████████████▒░▒▓▓████▒          \n" +
"      ▒▓▓▓██▓▓▓█████████████████████▓██▓▒▒▓▓█▓▓██▓          \n" +
"      ▒░▒▓▓██████▓███████████████▓▓████▓▓▓▓██▓▓▓██          \n" +
"      ▓▓▓▓▓█████▓███████████▓▓██▓▓▓▓▓▓▒▓▓▓▓▓▓█▓█▓█▓░        \n" +
"    ▓███▓██████▓▓██████▓███▓▓█▓▓▓▓▓▒▒▒▓▓█▓▒▓█▓█▓▓▓██▓       \n" +
" ░▓██░ ▓████▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓████░     \n" +
"░██░   ▒██▓▓▓▓▓████▓▓▓█▓▓▓▓▓▓▓▓▓███▓▒▓▓▓▓▓▓█▓▓▓▓█▓██▓▓█▒    \n" +
"        █▓▓▓▓▓████▓▓▓█▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓█▓▓▓███▓▓▓█▓   \n" +
"        ▒█▓▓▓███▓▓▓▓▓██▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓███ ░██████▓█▓  \n" +
"         ▓█▓███▓▒▒▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████     ░▓████▓ \n" +
"         ░███▓▒▒▒▒▒▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓            ▒▓█░\n" +
"          ▓█▓▒▒▒▒▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█░               \n" +
"          ▒█▓▒▒▒▓▓████▒ ▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓              \n" +
"         ░█▓▒▒▒▒▓███▒    ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒            \n" +
"          ███▓▓▓████      ██▓▓▓▓▓▓▓▓▓▓▓▓▓████▓██▓           \n" +
"          ▒█████████▓      ▓█▓▓▓▓▓███▓▓█▓▒▒▓▓█▓▓██▒         \n" +
"           ▓███████░        ██▓▓██▓▓▓▓▓█▓    ░██▓▓█▓        \n" +
"            ▓█▓███          ░██▒▒█▓▓▓▓▓▓▓█▒   ▒███▓██▒      \n" +
"             ████░           ██ ░██████▓███▒   ▒████▓░      \n" +
"             ▒██▓            ▓▓  █████▓█▓██     ▓███▒       \n" +
"              ███             ▒   ▒████████      ▓██░       \n" +
"              ▓██░                  ▒▓█████▓      ▓█░       \n" +
"             ▒████                    ░█████░       ░       \n" +
"           ▒███████                     ▓███▓               \n" +
"        ▒▓███████▓▒                      ▓███               \n" +
"        ▓█████▓                           ███░              \n" +
"                                            ████              \n" +
"                                             ████▒             \n" +
"                                           ░██▓██             \n" +
"                                          ▒███████            \n" +
"                                          ░▓▓▓▓▓▒░            "
                + "METODO BATALHA N FUNFA, POR ENQUANTO APENAS CLIQUE NA OPCAO PARA SEGUIR", null, atoau);
        c[44] = au;

        ArrayList<Integer> atoav = new ArrayList<>();
        atoav.add(46);
        atoav.add(55);
        Atos av = new Atos(45, "Apos a luta segue seu ruma pela estrada de terra batida, mais adiante você avista a estrutura de uma ponte\n"
                + " chegando mais perto percebe que ela foi derrubada, suas vigas de sustentação foram derrubadas, acarretando em sua queda.\n"
                + "Olhando para baixo só se avista o pequeno Canyon e as águas turbulentas do rio passando. Apesar de nao ser muito grande\n"
                + "qualquer tentativa de passagem parece impossível devido o declive muito íngreme e a feroz correnteza em seu fundo.\n"
                //IMAGEM ponte quebrada
                + "DESCER RIO ou SUBIR RIO? ", null, atoav);
        c[45] = av;

        ArrayList<Integer> atoax = new ArrayList<>();
        atoax.add(47);
        atoax.add(54);
        Atos ax = new Atos(46, "Você segue as corredeiras do caudaloso rio, quebrando galhos e contornando quando necessário, passa alguns pequenos riachos e rios de\n"
                + "pequeno porte, estes últimos geralmente acabando em cachoeiras e cascatas ao juntar-se com o rio Levitan a floresta de levitan é um desafio para\n"
                + "qualquer um que se aventure fora de suas trilhas.\n"
                + "Mais adiante embora com o rio mais calmo e com o fim do pequeno canyon. O que parece dificultar agora é sua largura, com algumas junções de outros\n"
                + "rios e riachos ele tomou proporções preocupantes, e conhecendo bem a floresta de Levitan certamente haveriam perigos naquelas águas. atravessar a nado\n"
                + "seria certamente um desafio.\n"+
"▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓▓▓▓▓▓▓▓▒                         ░▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓▒▒▒▒▒▒▒▒▒\n" +
"▓▓▒▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒░           ░           ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▒▓▓▓▒▓▒▓▒▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▒▒▒░      ░░░ ░░░░░░░░░     ▒█▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓████▓▒▒         ░ ░░░░░░░░░░░░░     ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▒▓▓██▓▒             ░ ░       ░       ░▒▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▒      ░░░░░░░ ░░░ ░ ░░░░░░░░░    ▒▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓     ░░░░░░░ ░░░░░░░░░░░░░░░  ░▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓██  ░░░░░░░░░░░░░░░░░░░░░░░░░░ ████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓█   ░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓██▒    ░░░░░░░░░░░░░░░░░░░░░░░░    ▒▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓███▒░     ░░░░░░░░░░░░░░░░░░░░░░░   ░▒▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒      ░░░░░░░░░░░░░░░░░░░░░░  ░▒▓▓███████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████▓▒░  ░░░░░░░░░░░░░░░░░░░░░░░  ░░▒▒▓██████▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓░  ░░░░░░░░░░░░░░░░░░░░░░░░░ ░ ▒▒▒▒▒▒▓▓█████▓▓▓██▓█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓  ░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░      ▒▒▓▓████▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░ ░░░▒▒░▒▒▒▒▒▒▒░▒░░░░░░░░░░░░░░░░░░░    ░░▒▒▒▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓██ ░░░▒░▒▒▒░▒░▒░▒░▒░▒░░░░░░░░░░░▒░▒░▒░░░░░░     ░▒▓████▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓█▓█░░░░░░░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░░░░░░▒░▒░▒░▒░░░░░░░   ░▒▓████▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"██▓▓▓▓█▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒ ░░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░░░░  ░░▓████▓▓▓▓█▓▓▓▓▓\n" +
"▓█▓▓█▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓█▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒░░  ░▒▓███▓█▓▓▓▓▓▓\n" +
"▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓█▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░  ░▒███▓▓▓▓▓▓\n" +
"██▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░ ░▓█▓▓██▓▓\n" +
"Seria mais sábio construir uma pequena jangada ou algo do gênero, mas para isso é necessário coletar alguns materiais.\n"
                + "JUNTAR MATERIAIS PARA A JANGADA ou ATRAVESSAR NADANDO?", null, atoax);
        c[46] = ax;

        ArrayList<Integer> atoaz = new ArrayList<>();
        atoaz.add(48);
        atoaz.add(54);
        Atos az = new Atos(47, "Você começa a andar pelos arredores da margem, em busca de cipós, pequenos troncos e troncos maiores para a base, estes mais espessos\n"
                + "obrigando a dar cabo de algumas árvores. Você avança alguns metros longe da costa do rio e começa a talhar os materiais, mas de repente uma das\n"
                + "árvores atingidas por seus golpes surpreendentemente parece ganhar vida própria e se afasta de voce.\n"
                + "É um Ent, uma espécie de “árvore humanóide” surge para você, com pelo menos quatro metros de altura, muito robusta, com uma cabeça alta e quase sem pescoço\n"
                +"                            ▒█░         ░▒▒        ░                                 \n" +
"                            ▒█         ▒▓    ░   ▒     ░ ░   ░▒▒░                    \n" +
"                  ░░░░     ░▒█▓ ░   ░  █░░ ▒▓░   ▒▓   ▓░   ░▓▓░ ▓█▒░                 \n" +
"                ░▒▓  ░    ▓▓ ▒█▓ ░  ░ ▓▒░▒▒▓      ▒▒░ ▒  ▒▒▒░    ▒ ░                 \n" +
"                ▓░█ ▒░     █▒ ██░   ░█░ ▓▓▒   ▒  ▒  ▓▒ █▒                            \n" +
"               ░█▓░░ ▒     ▒██▓█    █▒ ░█░    ▓▒▒   ██▒▒      ░░   ░                 \n" +
"           ▒▒▒ ▓█  ▒ ▒░░▒▓▒▒▓▒▒█    ██       ▒▓░▒▓▓▓▓▒░ ▒░    █▒░░░                  \n" +
"            ▒▒ █▓ ▓▓ ▓▓▓▓▓▓▓▓▓▓▓▒▓▒░ █▓ ▒▒  ▓▓▓▓▓ ▒▒▒ ░▓▓▓▓▓▓░░    ░                 \n" +
"            ▓  █▓█▒ ▓▓▓▓▓████▓▓▓██▓██▓█▓█▒ ▓█ ███▓▓▓▒ ▒▒▒░░▒▒▒░▓▒░ ░░                \n" +
"            █░ ▓▓█  █▓▓▒▒▓██▒▒▓█▓▓▒▓█▓▓▓▓▓▓▓▒▒▒▓▓██████▒░▒▓▒░▒ ▓░      ▒░            \n" +
"       ░▒   ▓█▒▓▒█▒▒█▓█▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▓▒▓▒▒▓▓▓▒▒▓▒▓▒▓▓▓██▒░▒▓▓▓▓▒▓▒░░░░             \n" +
"      ░▓▓▓   ▓█▓▒▓█▓▓▓▓▓▓▓▓▓▓▓███▓▓█▓▓▒▒▓▓▒▒▓█▓▒░▓██▒▒▒██░░▓▒  ▒▓▓  ░                \n" +
"         ▓    ▒█▓▓▒▒▒▒▓▓▓█▓▓██▓▓▓▓▓███▓▓██▓▓▓███▒░▓█▓▓░▒▒▒▒▒██▓▓▓▓▓░▒▓░              \n" +
"         █     ▓▓▒▒▒▓██▓▓▓▓▓▓▓▓▓▓▒▒███▓▒░▓███▓▓█▓▒ ▒▓█▒▒▓▒░▒▓▒░ ▒▓░░▒░               \n" +
"         ▓█▓░ ▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓█▓▒▓▓▓██████▓▒▒█▓▓██▓     ░░░                  \n" +
"         ▒▒████▓▓▒▒░ ▒▓▓▓▓██▓▓██▓▓▓▒▒▓▓██▓▓▒▓█▓▒▓███▓▓███░▒██▒                       \n" +
"         ░ ░ ▒▓▓▓▓▓▒▒▒▓▓▓▓███▓▒▓████▓▓▓▓▓██▓▓▓▓▓▓████▓▓▓█▓  █░    ░▒░░               \n" +
"              ▓▓▒▒▒▓▓▓▒▓▒▒▓██▓░▒█████▓▓▓█▓▓▓▓▓██▓▓▓████▓▒██░ ▓ ░▓▓▒                  \n" +
"             ▒█▓▓▓▓▓██▓▓▒▒▓█▓▒▒▓███▓▓██▓█▓▓▒▓▓▓▓▓▒▒▓▓███▓▒▓▓▓▒▓▒░                    \n" +
"             ▒▓███████▓█▓▒▓█▓▒▒████▓▒▓█▓█▓▓█▓▓▓▓▓▓ ░░█████▓▒▓█   ▒▓▒░                \n" +
"              ▓▓██████▓█▓▓▓███▓▓█▓▓▓█▓▓▓█▓███▒▓▓▓▓▒  █▒▓░▓██▓▓█▓▒▓▓▓▓▒░░             \n" +
"               ▓▓█▒▓█░▒█▓▓▓▓██▓▓▓▓▒▓▓▓▓██▒▓▓▓▒▓▓▒▓▒  ▓ ▒  ░██▓▓█▓▓▓▒▒▓▓▓░            \n" +
"               ░▓█░   ░▓▓▓███▒▒████▓▓▓██▓▒▓███▓▓▓▓█  ▒░ ░   ▓██▓▓▓▓▓▓▓▓░             \n" +
"                 █      ▓▓▓██▒ ▓▓███▓███▓▓▓██▓▒▒███░    ░    ▓█▓▒▓▓▓▓▓░              \n" +
"                 ▒      ▓▓▒▓██ ▒▒█▓████▓▒▓▓▓▓░▒▓███     ░     █▒▓▓█▒▒▓▒              \n" +
"                 ░      ▓░ ▒▓█ ░░▓ ▓█▓▓▓▓▓▓█▓▓▓▓▓██           ▓▒▓▓█▓▓▓█░░░           \n" +
"                        ▒░  ▒█▒  ░ ░▓████▓▓▓▓▓▒▓▓██           ▒▓▓▓▓▓▓██   ░░         \n" +
"                             ██       ██▓▓▒▒▓▓▓█▓██           ▒▒▓▓▒████▓░  ░░        \n" +
"                             ▓█       ██▓█▓▓▓▓██▓▓█           ░▒▓█▒███░░▒░░          \n" +
"                             ▒█▓     ░███▓▒▒▓█▓▓█▒█░          ▒▒▒█▒███▒ ░  ░         \n" +
"                              ▓█  ▓▒▓██▓██▓▒▓▓█▓█▓▓▓         ░  ░▒░███▓ ░░           \n" +
"                              ▒▒█▓███▒▒▓██▓▓▓▓▓▓▒▓▓▓         ▒  ░▓░▓██▓  ▓▒░         \n" +
"                           ▒▒▓▓▓█▓▓▓▓▓████▓▓▓▓▓▓▒▒▒▓▒       ▒▒   ▓▒▓██▒  ▒▓▒         \n" +
"                           ▓█▓▓▒▒▓▓█████▓█▓░▒█▓▓▒▓█▓█░      ░░   ▓▒▓▓█▒    ░         \n" +
"                           ▒█▓██▓▒▓▓███▓▓██▓ ▓██▓▓▓▓            ▓▓░▓▓██              \n" +
"                           ▓████▓▓▒▓██▓▓█████▒▓█▓█▓█▒            ▓▒▓▓██              \n" +
"                         ▒▓████▒▓▓▓▓██▓▒▓▓▓███▒▓██▓▓█▒▒        ░█▒░▓▓▓█              \n" +
"                        ░████▓▓▓▒▓██▓▒▒░░▓▓▒▓█▓▓█▓▓▓▒▓         ▓▒  ▒▒██░             \n" +
"                        ████▓▓▓██▓█▓  ▒  ░░  ▓█▓▓▓▓▓▓▒             ▒▒▓█▓             \n" +
"                       ████▓▒▒▓█▓█▓   ░      ▓██▓▓████▓            ░▒▓▓█░            \n" +
"                      ▒████▒▓▓█▓██    ░      █▓▒██▓▓▓██░▓░         ░▓▓██░            \n" +
"                      ▓███▒▒▓█▓███▒         ▓▓▓░▓███▒░▓▒           ░▓▓██             \n" +
"                     ▒███▒▓▓█▓██▓▓█         ██▓▓▓▓██▓▒░▓▒          ▒ ▒█▓             \n" +
"                     ██▓▒▓▓█▓██▓▓▓▓█▒▒░      ▓██▒▒▓█▓▓█▒█░       ░▓▓▒█▓▒             \n" +
"                    ▒██▓███▓██▒▒▓▓▓███▓      ▓██▓░▓██▓▓█▒    ▓█████▓██▓░             \n" +
"                    ░██▓▓▓███░ ▒▓█▓░▓█       ████▒▒███▓▒    ▓█░  ▒████▓              \n" +
"                    ▓▓▓▓▓▓██▓   ▓██  ▓▓      ░█▓▓▒░████     ▒      ▓██               \n" +
"                   ▓█▓▓▓██▓     ▒▓██  ▒▒ ░░░  ██▓▓░▓██▒           ▓▓██               \n" +
"                ▒▒▓▓▓▓▓▓██▓       ░▓█▓▒░░░ ░ ▒████▓▒█▒  ░        ▓█▓██░              \n" +
"               ▓▓█▓▓▓█▓▓██▒         ░████▒   ▓████▓▓█░   ░░     ▓██▓█░ ▒░            \n" +
"              ▓██▓▒▒▓████              ▓█▓▒   ▓▓█▓▓▓▒█    ░▓▓▒███▓▓▓█  ░▓▒           \n" +
"            ░███▓▓▓▓▓▓▓█▒                ░░   ▒▓██▓▓▒▒      ░▓██▓▓▓█▒    ░           \n" +
"           ░███▓▓███▓██░                       ████▓▓     ▒▓██▓▓████                 \n" +
"           ██▓▓▓▓█████░                        ▓████▓▒  ▒▓█▓▒▒░▓█▓░▓▓                \n" +
"          ▒██▓▓▓█████                         ▓██████▓▒▒▒▒▒░   █    ▓                \n" +
"          ░██▓█▓████▒                        ░████▓▓█▓█ ░░   ░▒     ▒░ ░             \n" +
"          ▒███▓▓████▓                        ░████▓▓▓░▓▒░  ▓░       ▒▓░              \n" +
"          ░█████████▓                         ████▓▓▓▒▒█  ▒▒        ░▒▓░             \n" +
"          ▓██▓██████▓                        ▒███████▓▓▓ ░  ░         ░░             \n" +
"         ▒██▓▓██████▒                       █████████▓█▒                             \n" +
"         ██████▓▓███                       ██▓██████▓▓▓▓                             \n" +
"        ▓██████▓▓███                      █████████▓▓▓▓▓                      ░      \n" +
"        ▓██████▓▓███  ▒░                ▓██████████▒▓█▓▓▒                 ▒░▒▒▓▓░    \n" +
"       ▒██▓▓▓███▓▓██▒ ▒▓░          ▒▒▓████████████████████████▓▒         ▒█▒▓▓▒▒     \n" +
"      ▓██▓▓▓█████████▒░     ░░░░▒▓███████████████░ ▓█▓  ▒▓▓▓▒▒▒▒▒         ▒░         \n" +
"   ░▒▓▓▓█████░ ░▓█████▓▒▒▒      ░▒▒░    ░▒▓█▓███▓   ▒▒▒                 ░▒ ░░▒▒▒▒░   \n" +
"     ▓████░ ▓▒      ▒▓▓▓▓░░░                   ▓███▒    ░               ░▒░░░░░▒▒ "
                + "sua “pele” parece uma casca de árvore e coberta de musgo. Olhos profundos, lentos e solenes, mas muito penetrantes.\n"
                + "METODO LUTA CONTA O ENT  ou FUGIR PARA A AGUA(VAI NADANDO DAI)", null, atoaz);
        c[47] = az;

        ArrayList<Integer> atoay = new ArrayList<>();
        atoay.add(49);
        Atos ay = new Atos(48, "Após a luta você termina de catar os materiais e construir a jangada.(colocar talvez alguma coisa para catar os itens e ir pro invent\n"
                + "ATRAVESSAR  O RIO COM A JANGADA", "brigademaos.wav", atoay);
        c[48] = ay;

        ArrayList<Integer> atoaw = new ArrayList<>();
        atoaw.add(62);
        Atos aw = new Atos(49, "A jangada improvisada boia com dificuldades, mas cumpre seu papel, suportando todo seu peso sobre sua estrutura, por vezes, dependendo do balanço devido\n"
                + "as remadas a água gelada bate em seus pés.\n"
                + "Chegando na outra margem salta da sua jangada, que já estava mostrando sinais de naufrágio, certamente seu destino dentro de alguns minutos seria o fundo do rio \n"
                //FOTO JANGADA
                +"▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░░░                               ▓▒▓▒▒\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░            ░░       ░▒▒▓ ▒\n" +
"▒▓▓▓▓█▓▓▓▓▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░ ░▒▒▒░    ░░ ▒█▓▓█\n" +
"▒▓▓▓▓██▓▓▓▓████▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓███████▓▓▓▓▓▒▒▓▒ ▒█▓▓▓\n" +
"▓██▓▒▓█▓▓▓▓█████▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓█████▓▓▒▓▒▓▓▓\n" +
"███▓▓▓███████▓██▓▓█▓▓▓▓█▓▓▓▓▓▓▓▓█▓▓▓▓▓█▓█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓████▓▓▒▓▓▒\n" +
"████████████████▓█▓█▓███▓██▓▓▓▓▓▓▓████▓▓▓██▓▒▒▓█▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓████▓▓███▓██▓▓▓▓▓██\n" +
"█████████████████████▓██████████████████████▓▓▓▓██████████▓▒███▓▓▓█▓▓▓▓▓▓▓▓▓█▓▓██████▓███████▓▓▓▓▓█▓\n" +
"████████████████████████████████████████████▓▓█▓▓▓█████████▒█████████▓▓█████▓▓▓███▓▓▓▓▓▓▓███▓██▓▓▓█▓\n" +
"█████████████████████████████████████████████▓███▓▓███████▓▓███████████████████████████████▓███▓███▓\n" +
"░░░░░░▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▒▓▒▒▒▓▓▓▓▓▓▓▓█▓█▓██▓▓▓▓▓▓▒▓▓▓▓▓█▓▒▓███████████████████████████████████████\n" +
"░░░░░░░░░░░░░░░ ░░░░░░░░░░░ ░ ░   ░░░░░░░░░███▓▓▓▓█▓▓▓▓▓▓▓▓▓▒░░░▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓██████████\n" +
"░░░▒░▒░░░░░░░░░░░░░░░▒░░░░░░░░░▒░▒░▒▒▒▒░░▒░▒██████████████████▓▒ ░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▓▓▓▓██████████████▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▒▓▓▓▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓█████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒░▒▒▒░░░▒░▒▒░░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒██████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒██████████████▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▓▒▓███████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓▓▓▓▒▓▓▓▓▒▓█████████▓█▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▓▒▒▒▓▓▓▒▓\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▒▓▓▓▒▒▒▓▒▓▒▓██████████▓▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████████▓▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██▓▓▓▓░▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓█▓████▓▓▓▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓█▓▓██▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓██▒ ▓██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓███▒░▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▒░▒██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓███▓ ░███▒░▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░▒▓█▓▒░▒▒▒▒▒▒▒▒▒▒░▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▒░░▓███▓▒▒███░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▓█▓▒░▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▓▓▓▓▓██████▓████▓▓██▓░░▒▒▒▒▒░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒██▓▒▒▒▒▒▓▒▓▓▓▓▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒░░▒▓▓▓█▓█████████▓▓█▓▓▓▓▒▓██▒░▒██▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▒▒▒▒▓▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒░░░▒░░░▒▒▒▒▓▒▓▓█████████▓█▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓██▓▓▓██▓▓▓▓▓▓▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓█▒▒▒░ ░░▒░▒\n" +
"▒▒▒░░░░░▒▒▒▓▓▓▓▓▓████████▓▓██▓▒▓▓▓▓▓▓▓▓▓▒▒▓▒▒▓▓▓▒▒▓▓███▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░ ░▒▒▒▒▒▒▒\n" +
"▒▒████▓██████████▓▓██▓▓▓▓▓▓▓▓▓▓▓▒▒▒░░▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▒▓▓█▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒ ░░░▓▓▓▓██▓▒▒▒\n" +
"▒▒▓▓████▓▓██▓▓▓▓▓▓▓▒▒▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▓▓▓▓▓▓▓▓▓▒▒▓▒░▒▓▓▓▒▒▓▒▓▓▓▓▓▓█▓▓▓▓▓▓▒░▒░ ▒▓▓██████▓▒▒▒▒▒▒\n" +
"▒▒▒▓████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▒▒▒▓▒▒▓▓▓███████▓▓▓▓▓▒▒▓▒▒▓▓▒▒░░░▒▓▓▓▓▓▓▓█▓▓▒░░▒  ▒▒▒▓██████▓▓▒▒▒▒▒▒▓▓█▓\n" +
"▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓██▓▓▓▓▒▒▒▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▒▒▒░░░▒░ ▒█▓▒▓██▓▓▓▓▒▒▒▒▒▓▓█▓█▓▓▒▒▒\n" +
"▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▒▒▓▓▓▓██▓▓▓▓▓████▓▒▒▒░ ░▒▒▓███▓▓███▓▒▒▒▒▒▓▓▓█▓▓█▓▓▒▒▒▒▒▒\n" +
"▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▒░▒▒ ░▒▓▓██████▓█▓▒▒▒▓▓▓▓▓▓▓▓▓██▓▓▒▒▒▒▒▒▒▒▒\n" +
"▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▒▒▒▓▒▒▓▒▒▒ ░▒▓█▓██████▓▓██▓▓▓▓▒▒▓▓▓▓███▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▓▓▓▓▓▒▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░ ░▒█▓██████▓▓▓▓▒▓▒▓▓▓▓█████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▓▒▓▓▓▒▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▓▒▒▒░░▒▓█▓█████▓▒▒▓▓██▓▓▓███▓██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓██▓░▓█▒▓████▓▓▓▓▓▓▓▒▒░▓▓████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓█████▓▓▓▓▓██▓▓▒▒▓▓▓▓███▓▒▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████▓▓▓▒▓▒▓█████▓▓▓▓▒▒▓▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▒▓▓▓▓▓▓▓▓█████▓▓██▓▓▒▓██▓▓▓▓█▓▒▓▓▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▓▓▓▓▓▒▒▒▒▒▒▒▓▒▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓█▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▓▒▓▓▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▓▓▓▓▒▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▒▒▒▒▓▓▓▓▓▓▒░▒▒▒▒▓████████▓▓▓▓▓▓▒▓▓▓▓▓▒▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▓▓▓▓▒▒▒▒▓▒▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓▒▒▓▒░░░░▒████████████▓▓▓▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▓▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓██████████████▓▓▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▓▓▓▒▓▓▓▒▓▒▒\n" +
"▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒░▒▓██▓▓██▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒"
                + "Agora so resta subir o pequeno barranco e seguir seu rumo\n"
                + "SEGUIR ADIANTE", null, atoaw);
        c[49] = aw;

        ArrayList<Integer> atoba = new ArrayList<>();
        atoba.add(51);
        atoba.add(52);
        Atos ba = new Atos(50, "Você adentra pela floresta de lavitan, no início ela até parecia uma floresta normal mas a média que se embrenha em seu interior a vegetação fica cada vez mais soberana. \n"
                + "Durante algumas horas você avança sem muitas dificuldades, de vez em quando cruzando com algum animal pequeno, como lebres e pássaros das mais variadas espécies.\n"
                + "\n"
                + "Sem perceber você se encontra cercado por uma matilha de lobos cinzas, eles simplesmente surgiram silenciosamente ao seu redor, aos rosnados, seus olhos famintos destoavam da sua pelagem, e bem na sua frente\n"
                + "o maior entre eles possuía os olhos vermelhos, certamente esse era o alfa do grupo.\n"
                //FOTO LOBOS
                +"░ ░░░ ░░░   ░░       ░░ ░▒▒▓▓▓▓▒▒▒▓▒▒▒▒▒▒▒░ ░░▒▒▒▒▒░░░  ░░░░░░░░░░░░░     ░░░░░ \n" +
"░       ░░  ██▓▓▒░   ░▒▒▒▒░▒▒▒░░  ░░░░░░░░░    ░ ░▒▒▒░                          \n" +
"░ ░     ▒▒░ ████████▓▓▓▓▓▓▒░▒░░░░░░░░░░ ░▒░░▒▒▒▒▒▒░░░▒▓▒▒░  ░░░     ░▓███▒  ░░░ \n" +
"      ░▒▒▒▒░▒▓▒▓▓███████▓▒▒░░░░▒▒▒░▒░░▒░ ░  ░▒▒░▒▒▒▒░░▒▒▓▒▒▒▓▓▒▒▒▒▒▓█████  ░░░░ \n" +
"░   ░▒▓▒▒░▒▒▓▓░▒▒▒▒▓▓████▓▒▒▒░▒▒▓░▒░▒░░░░▒░ ░▒▒ ░░▒░▒▒▒░░▒▒▒░░▒▓████▓▓▓▓  ░░░░░ \n" +
"    ▒▓█▓▒▒▒▒▓▓▒ ▒▓▓▒▒▒▓▓▓▓▓██▒▒▒▒▒░░▒▒░▒░▒░▒▒▒░▒▒░▒▒▒▒▒▒▒▒░░ ▒▒██▓▒▒▒▒▓░   ░ ░░ \n" +
"  ░▒▓█▓▒▒▒▓▓█▓▓░ ░▒▓░  ░▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒  ░▒▒▒▒░░▒▓▒▒▒▒░▒▒▒░░▓▓▓▒▒▒▓▒▒░   ░ ░░░ \n" +
"  ▒███▓▒▒▓▓▒▒▓▓█░ ░▒   ░▒▓▒▓▓▒▒▒▒░▒▒░▒▒▒ ░  ░▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒█▓▒ ░▒▒░░   ░░░ ░░ \n" +
"▒▒▓██▓▓▒▒▒░░▒▓▓█▓▒▒▒▓▒▒▒▓▓▒▒▓▒▒▒░░▒▓▒▒░░░  ░▒▓▒▒▓▓▒▒▒▒▓▒▓▓▓▓▓██░░░▒▒░   ░ ░░░░░ \n" +
"▓██▓▓▒░▒▒░░▒▒▓▓▓▓▒░▓█▓▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▓▒░░░▒▒▒▓▒▒▓███▓▓▒▒▒   ░ ░ ░ ░░ \n" +
"▓▒▒▒▒▒▒░▒▒▒▒▓▓▓▓▓▒▒██▒▓▓▓▓▒▒▒░▒▒▒▒▒░▒▒▒▒▒▒░░▒▒▓▒▒▒░▒▒▒▒▒▒▒▒▒▓▓▓██▒░   ░ ░ ░ ░ ░ \n" +
"▓▒▒▓▓▒░░░▒▓▓▓▒▒▒▒▒▓█▓▓▓▒▓▒▓▓▓▓▓▒▒▒░░▒▒▒▒▒▒▒▓▒▓▓▒▒▒▒▒▒▓▓▒▒▓▓▒▒▓▒███░  ░ ░ ░ ░ ░░ \n" +
"█▓█▓▓▒░░░▒▒▓▒▒▓▒▒▒█▓▓▓▓▓▓▒▓▓▓▓▓▓█▓▓░▒▒▓▒▓▒▒▒▒▒▒░░▒▒▒▓▒▓▓▒▒▒▒▓▓▓▓██░   ░ ░ ░   ░ \n" +
"▓▓▓▓▓▒▒░░▒▒▓▒▓▒▒▓▓███▓▓▓▓▓▓▓▓▓█▓▒░▒▓▓▒▒▒▓▓▒▓▓▒▓▓▒▒▒▓▓▓▓█▓▒▒▓▓▓▓▓▓█░  ░ ░ ░ ░░░░ \n" +
"▒▒▓▓▓▒▒▒░▒▒▒▒▒▒▓▓████▓▓▓█▓▓▓▒▒▒▓█▒▒░ ░░░▓▓▓▓▓▓▓▒░░▒▒▒▒▓▓█▓▓▓▓▓▓▒▓█░   ░░░░░░░░░ \n" +
"▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓██▓▓██▓██▓▓▒░  █▓█▓░░  ▓▓▓▓░▓▓▒░░▓▓▒▓▓▓▒▓▓▓▓▓▓▓▓█▒  ░░░░░░░░░░░\n" +
"▓▓▒▒▓▓█▓▓▒▒▒▒▒▓▓▓▓▓▓▓█▓▓▓▓▒▒▒░░  ▓▓██▒░▒▓▓▓▓▓▓▓▒▒▓█▓▓█▒░▓█▓▓▓▓█████░ ░░░▒░░░░░░ \n" +
"▓▓▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓█▓▒░   ▒▒▒▒░   ▒█▓▒▒▓▓▒▒▓▓▓▓▓██▓▓░ ░▓▓▓█████████░░▒▒▒▒░░░░░░\n" +
"▓▒▒▒▓▓░▒▓▒▒▒▓█▓▒▒▓▓██░     ▒▒▒▓▒▒░░░▒▓▓▒▓▓▓▒▒▓▓▓▓▓▒   ░▒▒▓▓▒▓███▓██▓▓▒▒▒▒▒▒░░░▒░\n" +
"▓▒▒▒▓▒▒▒▒▓▓▓▓▓▒▒▒▓▓█▓▒    ▒▓▓█▓▓▓▓▒▒▒▒▓▓▒░▓█▒▓▓▒▒▓▓▒▒▒▒▓▒▓░ ░▒▒▓█▓▓▒▒▒▒▒▒▒▒▒▒▒▒░\n" +
"█▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓██▓░    ▒▓▓▒░░    ░░▓▓▓░▒▓▒▓▓▒▒▒▒▓▓▓█▓▓▓░ ░░▓▓█▓▒▓▓▒▒▒▒▒▒▒▓▒▒▒\n" +
"▓█▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓█▓░    ░         ░▒▓▒▒▒▓▒▒▒▓░    ▓▓▓▓▓░  ░▓▓▓▓▒▓▓▓▓▓▒▓▓▓▓▓▓▓\n" +
"█▓▓▓▒▒▒▒▓▓▓▒▓▓▓▓▓▒▒▒▓▓▓▒░░░   ░░░░░ ░ ░▒▒▒▓▓▒▒▓░       ▒▒░   ░▒▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒▒▓▒▓▓▒▓▓█▓▓▓▓████▓▒▒▒▓▒░░░▒░░ ░░░ ░░░ ░▒░▒▒▒▒░    ▒▒░░▒░  ░▒▓▓▒░░▒█▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"░▒▓▒▒░▒▓▓▓▓▓▓▓▓████▓▓▒▒▒░  ░░░░ ░  ░░  ▒▓▓▓▒▒▒░    ░░░▒░░▒▒▓▓██▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"░▒▒▒▒░▒▓▓█▓▓▓▓▓▓████▓▓░▒░  ░ ░░▓▓░ ░ ░█████████░   ▒▒▒▒▒░░▒▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒░▒▒▒▒▓▓▓██▓▓▒░░▒▓████▓▒░    ░░▓█▓   ▒█████▓███▓  ▒▓▒░░░░░░▒█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"░░░▒░▒▒▒▓████▓▓▓▒▓▓████▓░ ░░░░░▓██▒ ░▒█████████▒ ░█▓▒░  ░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒ ░░░ ░▒▓███▓▓▓▒▒▒▓▓▓▓██▓▒░░░   ▓███▓▓▓███████▓░▓█▓▒░░░ ░▒█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"░░░░░░░░░░███▓▓▒░░▒▒▓▓▓██▓▒  ░░ ▒██▓ ▒▓▓▓▓▓▓▓▒▓██▓░░░░▒▒▒▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒░░░░░░░ ░▓█████▒░░▒▓▓▓▓▓██▓▒▒░  ▓█▓░ ▓▒▒▒▒▒▒ ▓█▓░░░░▒▒▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"░░░░░░░░░░ ░▓███▓▒░▒░░▒▓▓▓███▓▒░ ░███▓░▒▓▓▒▒▒▓█▒░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒░░░░░░░▒    ▒▓▓█▓▒░░▒▒▒▓▓██████▓▓▓▓▓██▓▓▓▓▓██▓▒▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒░░▒░░░░░░░░ ░▒███▓▓▒▒▒▓▒▒▓▓▒▓█████▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
"▒ ░░░ ░  ░░    ░▒▓▓▓▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓█▓▒▒▒▒▒▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓"
                + "ENFRENTAR LOBOS ou TENTAR FUGIR?", null, atoba);
        c[50] = ba;

        ArrayList<Integer> atobb = new ArrayList<>();
        atobb.add(53);
        //METODO ENFRENTAR LOBOS
        Atos bb = new Atos(51, "Após derrotar o lider, os mais fracos se assustam e fogem!\n"
                + "Agora só resta seguir seu caminho.", "brigademaos.wav", atobb);
        c[51] = bb;

        ArrayList<Integer> atobc = new ArrayList<>();
        atobc.add(51);
        Atos bc = new Atos(52, "Você tenta correr por entre as arvores mas falha miseravelmente, dando de cara com um dos lobos rosnando de uma \n"
                + "forma ameaçadora, ele pula sobre você para evitar a fuga e abate-lo, mesmo assim você esquiva-se do maior dano, conseguindo apenas \n"
                + "aranhões da queda no chão. Segurando firme sua arma você sabe que a única opção é a batalha \n"
                + "ENFRENTAR LOBOS", null, atobc);
        c[52] = bc;

        ArrayList<Integer> atobd = new ArrayList<>();
        atobd.add(47);
        atobd.add(54);
        Atos bd = new Atos(53, "A passos largos onde o terreno permitia você continua em sua jornada pela floresta. Algumas horas depois chega na borda de um grande rio, possivelmente o rio Lavitan, que corta a floresta com mesmo nome\n"
                + "e conhecendo bem esta parte do reino de Eresda certamente haveriam perigos naquelas águas. atravessar a nado poderia ser uma experiência bem ruim.\n"
                + "Seria mais sábio construir uma pequena jangada ou algo do gênero.\n"
                + "CONSTRUIR JANGADA ou ATRAVESSAR NADANDO?", null, atobd);
        c[53] = bd;

        ArrayList<Integer> atobe = new ArrayList<>();
        atobe.add(62);
//N ESQUECA DE ESCREVER       //pensando nas ligacoes da historia melhor deixar sem nada aqui  
        Atos be = new Atos(54, "atravessando nadando vai aparecer algum inimigo a definir ainda, talvez um hipocampo (sim na agua doce hu3) + descricao +luta\n"
                + "terminar de atravessar o rio e seguir caminho", null, atobe);
        c[54] = be;

        ArrayList<Integer> atobf = new ArrayList<>();
        atobf.add(56);
        atobf.add(57);
        Atos bf = new Atos(55, "Seguindo pela floresta, atravessando variados tipos de terrenos você chega em uma área parcialmente “limpa” em relação ao resto da floresta, mas não de forma natural,\n"
                + "a vegetação foi quebrada e há sinais claros que algo habita naquelas árvores, você ouve um som agudo vindo do meio das árvores, de repente algo dá um rasante sobre você\n"
                + "que se atira ao chão para evitar o choque.\n"
                + "Erguendo a cabeça você observa a criatura, uma harpia, esta criatura tem asas e pernas como aves de rapina com rosto e busto de mulher, com um tamanho proporcional a pouco\n"
                //foto harpia
                +"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░▒▓▒▓▓▓▓▒░ ░▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▓▓▓▓▓▓███▓▒░  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▓▓▓█▓▓█▓████▓▓▒░  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▓▓██▓▓█▓▓▓▓█▓▓▓▒░   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▓█▓▓▓▓████▓▓▓▓▓▓▓▒░  ░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▓██▓▓▓████▓▓██▓▓▓█▓▒░ ░▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒ ▒▓██▓▓█████▓▓▓▓▓▓▓█▓▓▓░  ░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▓█▓█▓▓██▓▓█▓▓█▓▓▓▓█▓▓░   ░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░ ░     ░▒▒▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓███▓▓▓█▓▓██▓█▓█▓█▓█▓▓░  ░░░░░░░░░░░░▒░▒▒▒▒▒▒▒▒▒▒▒░░░░▒▓▓▒▒    ▒▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓▓▓▓███▓▓▓▓▓█████▓▒   ░ ░ ░ ░ ░ ░░░░░░░░▒░▒░░░▒▒▓▓▓▓██▓▓░   ▒▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▓█▓███▓▓▓█▓█▓▓▓██▓█▓███▓█▓▓░               ░ ░░░   ░▒▓▓▓▓▓▓▓▓▓▓▓▓░  ░▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓███▓███▓█▓▓▓███▓█▓█▓▓███▓▒░                    ░▒▓█▓▓▓▓▓▓▓█▓█▓█▒  ░▒\n" +
"▒▒▒▒▒▒▒▒▒▒▒░▓██▓███▓██▓▓▓▓▓██▓▓▓█▓▓▓▓███▓▓▓▒░                 ▒████▓▓▓▓▓▓███▓▓▓▓▒  ▒▒\n" +
"▒▒▒▒▒▒▒▒▒░▒▓█▓▓▓██████▓█████▓▓█▓▓▓▓▓█▓▓▓▓█▓▓▒▒░░         ░░░  ░▒▒▒▓██▓▓█▓█▓▓▓▓▓▓▒  ▒░\n" +
"▒▒▒▒▒▒▒▒░▒██▓▓▓█████████████▓▓▓▒▓▓▓▓▓███▓▓██▓▓▓▓▒▒░   ░▓▓▓▒▒░      ▒████▓▓▓▓▓▓█▓▒  ░░\n" +
"▒▒▒▒▒▒▒░░▓████████▓█████▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓██████▓▓▓▒▒░░░▓▓▒▒▒▒░░ ░▒   ▓█▓▓▓█▓▓▓▓▓█▒  ░░\n" +
"▒▒▒▒▒▒░ ▒██████▓▓▓███▓▓▓█▓▓▓▓▓▓▓▓▓█▓▓███▓████▓██▓▓▓▓▓▓▓▒▒░▒▒▓▒▒░░░░  ██▓▓▓██▓███▒  ░▒\n" +
"▒░▒▒▒░ ▒██▓███▓▓▓█▓▓▓▓▓█▓▓▓▓▓▓▓█▓▓▓███▓▓███▓▓█████▓▓▓██▓▓░▒█▓▒▒▒▒░▒  ▓▓█████▓█▓▓░  ░░\n" +
"▓▒░░░ ▒██▓███▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓█▓▓███▓▓██▓▓▓▓███████▓▓▓███▒▓██▓▓▓▓▓▒░▒▒▓████▓▓██▓▒ ░░░\n" +
"▓▒▒░░░▓█▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓███▓██▓▓▓▓█▓████▓▓█▓▓▓▓▓█▓░█▓▓▓▓▒▓▓▒▓▓███▓▓▓▓▓█▓▓░  ░░\n" +
"█▓░░░▓█▓▓▓█▓▓▓█▓▓▓█▓▓▓▓██▓███▓█▓▓███▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▒▓█▓▒▓▓▓▓▒▒ ▒▓██▓▓█▓▓▓▓▓░ ░▒▒\n" +
"▓▓▓ ▒█▓▓███▓▓█▓▓▓▓▓▓▓▓██▓▓█▓▓██▓███▓▓▓▒███▓███▓▓██▓▓▒▓▒▓░▒██▓▓▒▓▓▓▒ ░███▓▓▓█▓█▓▓  ▒▒▒\n" +
"▓▓▓▒▓█▓▓██▓▓█▓▓▓▓▓▓▓██▓▓▓█▓▒▓▓▓██▓▓▓▓▒▓▓▓██▓███▓██▓▓▓▒▒▒░░██▓▓▓▓▓▓▒ ▒███▓▓▓█▓█▓▒ ▒▓▒▒\n" +
"▓▓▓▓▓█▓██▓▓▓█▓▓▓▓▓▓▓██▓▓▓▓▒▓▓▓█▓▓▒▓▓▓▓▒▒██▓▓▓▓▓█▓▓▓█▓▒▒▒░▒███▓▓▓▓▓░ ▓███▓███▓█▓░ ▓▓▓▓\n" +
"▓▓▓▓█▓██▓▓▓█▓▓▓▓█▓▓▓█▓▓▓█▒▓▓▓▓▒▒▒▓▓▓▓▒▓██▓▓▓█▓█▓▓▓▓▓██▒▓░▓███▓▓▓▓▒█▒▓▓▓███████▓░ ▓▓▓▓\n" +
"▓▒▓▓▓▓█▓▓▓██▓▓▓█▓▓▓█▓▓▓█▓▒▓▒▒▒▓▓▓▓▒▒▒▓██▓████▓▓▓▓█▓▓▓█▓▓▓██▓▓▓▓▓▒▓██▓▓▓████████░ ▓▓▒▒\n" +
"▒▒▓█▓▓█▓▓▓█▓▓▓█▓▓▓█▓▓▓█▓▒▓▓▒▓▓▓▒▒▒▒▒▒██▓▓████▓▓▓█▓▓▓▓▓▓████▓▒ ▓█████▓▓▓▓▓▓████▓░ ▓▓▒▒\n" +
"▓▒▓█▓█▓▓▓█▓▓▓▓▓▓▓█▓▓▒▓█▓▒▓▒█▓▒▒▒▒▒▒▓████▓█▓█▓█▓▓▓█▓▓▓▓▓█▓████▓ ▒██▓█▓▓▓█▓▓██▓█▓░░▓▒▒▒\n" +
"▓▒▓▓██▓▓▓▓▓▓▓█▓▓▓█▓▒▓█▓▒▓▒▒▓▒▓▓▓▓▒▓███▓▓███▓██████▓▓██▓▒▒▓▓████▒░▓██▓▓▓▓█▓█▓▓▓▓░▒▓▓▓▓\n" +
"▓▒▓██▓▓▓█▓▓▓██▓▓█▓▓▒▓▓▒▒▓▓▒░▒▓▓▓▒▓████▓▓▒▓▓██████▓███▓▓▓▒░░░▒▓▓█▒░▓█▓▓▓▓█▓▓▓██▓░░▓▓▓▓\n" +
"▒▒▓██▓▓▓█▓▓▓█▓▓▓█▓▓▒▓▒▒▓▓▓█▓▒▒▓▒▓▓██▓▓▓▒▒▒▒▓▓█▓▓█████▓▓▓▓▒▒▒▒▒▓▓█▓░▓█▓▓▓▓▓▓▓██▓ ▒▓▓▓▓\n" +
"▒▒▓█▓▓▓█▓▓▓█▓▓▓█▓▒▒▓▒▓▓█▓▒███▒▒▓████▓▓▒▒▒▒▒▓██▓▒▒▓▓█▓▓████▓▓▓▓▒▓██▓▒▓█▓▓▓▓▓███▓░▒▓▓▓▓\n" +
"▒▓██▓▓▓█▓▓▓█▓▓██▓▒▒▒▒▒▓█▓▒▒░▓▓▓██▓█▓▓▒▒▒▒▒▓▓██▒▒▒▒░▒▓▓▓▓███▓▓▓▒░▒██▒░▓▓█▓▓▓███▓▒▒▒▒▒▒\n" +
"▒▓██▓▓▓▓▓▓██▓▒█▓▒▒▒▒▒▓▓█░▓▓█▓▓██▓▓██▓▓▓▓▓▓▓█▓▒▒▒▒░▓████▓▓▓▓▓▓▓▓▓▓█▓▓▒░██▓▓▓███▓░   ░░\n" +
"▒▒██▓▓█▓▓▓█▓▓▓█▓▒▒▒▒▓▓▓█░▓▓██░▒▓▓▓███████▓██▒░▒▒▒░▓██▓████████████▒▓█▒▒▓█▓▓███▓░░░░░░\n" +
"▒▒██▓▓█▓▓▓█▓▓▓█▓▒▓▓▓▒▓████▓▒▓▓▓▓▓███▓████▓█▓▒▒▒▓▒▒▒▓████▓▓▒▒██▓▓██▒▓▒▓▓▓█▓▓███▓▒▒▒▒▒▒\n" +
"▓▓█▓▓▓█▓▓▓█▓▓▓█▓▓▒▓▓▓▒▓▓██▒░▓█▓▒▓██▓▓██▓▓▓█▓▒▒▓▒▒▒▒▓█▓▒▒░░▒░█▓░▓███▓█▓▒▓█▓▓▓██▓░▒▒▒▒█\n" +
"█▓▓▓▓▓█▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓██▒▓▓█▓▓▓█▓▒▒▓█▒▒▓▒▒▒▒ ▒█▒   ░  ░▒ ▒██▓▓██▓ ▒█▓▓██▓░░▒░▓█\n" +
"█▓▓▓█▓█▓█▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░▓██▓▒▓██▓░▓█▒ ░▒▓▒░      ▓█▒░ ░ ░ ░   ▓█▓▓█▓██░░▓▓█▓▓░░░░▓█\n" +
"█▓▓▓▓▓▓▓▓▓▓█▓▓▓█▓▓▓▓▒▒▒▒▒▒▓██▒░▓█▓▓▓▓█▒▒▓▒░░ ░▒███▓▓▓▒▒░    ░░  ▓█▓▓▓█▓█▓▓▓▓█▓▒░░░░██\n" +
"█▓▓▓▓▓▓▓█▓▓▓█▓▓▓▓▒▓▓▓▒▒▒▒▒██▓░▒▓███▓▓█▒▒██▓░▓████████▒▒▓░ ▒▒    ▒██▓▓█▓▓██▓▓█▓▓░▒░▒██\n" +
"█▓▓▓▓▓▓▓█▓▓▓██▓▓▓▓▓▓▓▓▓▒▒▒▒▒░░▒███▒▓██▒▓███▓░▓██▓▓▓▓██▒▓█▒██▒▒░░░▓█▒▓█▓▓▓█▓▓██▒░▒▒▓██\n" +
"█▓▓▓▓▓▓▓█▓▓▓█▓▓▓▓▓▓███▓▓▓▒▒▒▒▒▒▓██▓▓██▓░████▒▓██▓▓████▓░██▒▓█▓▓▓▒▓█▒▓██▓▓█▓▓▓█▒▒▒▒███\n" +
"▓▓▓▓▓▓▓▓██▓▓███▓▓▓▓███▓▓▓▓▒▒▒▒▒███████▓▒▓████▓████▓▒▓██▓▒██▓▒███▓▒█▓▒█▓▓▓█▓▓▓█▓▒▒▓██▓\n" +
"▓▓▓▓▓▓▓▓█▓▓▓██▓▓▓▓▓▓█▓▓▓▓▓▓▓▒▒▓████████████▓▒░░░▒▒▓▒▓▓██░███▒▓██▓▓█▓▒▓█▓▓▓█▓▓█▓▒▓█▓▓▓\n" +
"▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓██████▓▓██████▓▒░      ▒▓████▓▓████████▒░░▓█▓▒██▒▓█▓▓▓▓▓▓▒\n" +
"▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓█▓▓▓▓▓█▓███▓███▓█▓▓▒▓█▓▓▓▓▓▓▓▓▒▒▓▓▓▓████▓▓██▓▓▓▒▒░ ▒█▓▒▓█▓▓█▓▓▓▓▓▒▒\n" +
"▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓▓█████████▓███▓██▓██████████▓█▓▓▓███▓▓▓▒▒▒▒▒▓█▓▓█▒▒▓█▓▓█▓▓▓▓▓▓▒"
                + "mais da metade de um homem. retornando do rasante ela pousa em um galho próximo e grita novamente, ameaçando sua presença."
                + "1-ENFRENTAR HARPIA   3-CORRER", null, atobf);
        c[55] = bf;

        ArrayList<Integer> atobg = new ArrayList<>();
        atobg.add(56);
        Atos bg = new Atos(57, "Você tenta correr para evitar conflitos desnecessários, porem harpias podem voar e logo o alcança, forcando-lhe a enfrenta-la!\n"
                + "LUTAR", null, atobg);
        c[57] = bg;

        ArrayList<Integer> atobh = new ArrayList<>();
        atobh.add(58);
        atobh.add(59);
        //metodo luta
        Atos bh = new Atos(56, "Após o duro confronto você pensa em cuidar dos ferimentos. Apesar de querer seguir em frente logo,\n"
                + "você sabe que harpias sempre carregam coisas para seus ninhos, passa pela sua cabeça procurar, possivelmente deve estar nas proximidades.\n"
                + "SEGUIR SUA JORNADA ou PROCURAR PELO NINHO ou inventario(n funfa, n clique)? ", "brigademaos.wav", atobh);
        c[56] = bh;

        ArrayList<Integer> atobi = new ArrayList<>();
        atobi.add(60);
        Atos bi = new Atos(59, "Você anda pela redondeza olhando para cima em busca do tal ninho, e no topo de uma imponente árvore retorcida está ele. Apesar de ser relativamente alto os grossos galhos tortos facilitam a subida.\n"
                + "Dentro dele estão ovos e uns brike x ainda a ser decidido \n"
                //foto ninho talvez
                + "CONTINUAR", null, atobi); //colocar mais coisa nesse buscar, largue de ser preguiçoso ewerton do futuro
        c[59] = bi;

        ArrayList<Integer> atobj = new ArrayList<>();
        atobj.add(61);
        Atos bj = new Atos(60, "Você segue bravamente mata adentro subindo pela costa do rio. Sempre atento para possíveis perigos advindos\n"
                + "da desconhecida floresta.\n"
                + "Mais adiante há um trecho em que é possível a passagem, pois não há barrancas muito grandes no rio e a correnteza\n"
                + " parece permitir passagem.\n"
                + "NADAR ATE O OUTRO LADO", null, atobj);
        c[60] = bj;

        ArrayList<Integer> atobk = new ArrayList<>();
        atobk.add(64);
        Atos bk = new Atos(61, "Após a travessia você segue pela densa floresta, começando a perceber um aumento na elevação do terreno,\n"
                + "em um estalo latente da sua memória uma lembrança de um relato de Tothurin, este a muito tempo lhe havia dito que havia\n"
                + "um templo semelhante no meio da floresta de levitan, mas estava abandonada devido o difícil acesso e o constante ataque\n"
                + "de criaturas do local. O relato era que o tal templo ficava próximo a margem do grande rio que corta Levitan\n"
                + "onde a floresta fica mais densa e o terreno eleva-se, lá ficava o templo, mais que depressa você procura pelo templo.\n"
                + " PROCURAR PELO TEMPLO ", "entradaFLoresta.wav", atobk); // AQUI VAI JUNTAR AS 2

        //////////////////////////////////////////////////////SEGUE DO ATRAVESSAR O RIO POR BAIXO
        c[61] = bk;

        ArrayList<Integer> atobl = new ArrayList<>();
        atobl.add(63);
        Atos bl = new Atos(62, "Seguindo seu caminho pela densa floresta você tem uma lembrança de um relato de Tothurin, este a muito tempo lhe havia dito que havia um templo semelhante no meio da floresta\n"
                + "de levitan, mas estava abandonada devido o difícil acesso e o constante ataque de criaturas do local.\n"
                + "Por um breve momento você se sente feliz, mas logo em seguida vem a lembrança da morte de Tothurin e todos os outros, contrastando com o primeiro sentimento.\n"
                + "Seguindo a lógica geográfica você segue a costa do rio no sentido ascendente, já que provavelmente o templo ficará na parte da cabeceira do rio, mais alta em relevo.\n"
                + "5-SUBIR O LEITO DO RIO", null, atobl); //VAI DIRETO PRA ESTRADA
        c[62] = bl;

        ArrayList<Integer> atobm = new ArrayList<>();
        atobm.add(64);
        Atos bm = new Atos(63, "Seguindo seu caminho, pela selva de levitan, você chega a estrada principal que corta as localidades entre Kenko e as outras localidades. A cena não é das melhores, a esquerda, sobre o rio Levitan,\n"
                + "a ponte que ali existia está destruída, e pelo chão da estrada há muito sangue e carroças destruídas ou viradas. \n"
                + "Nas proximidades do comboio haviam muitos corpos sem vida espalhados, certamente atacados sem dó ou piedade.\n"
                //foto caravana atacada
                + "Não há muito o que fazer, apenas seguir seu caminho para o terreno mais elevado rio acima.\n"
                + "seguindo pela floresta começa a perceber um aumento na elevação do terreno mais significativa, batendo com o relato de Tothurin lembrado anteriormente.\n"
                + "Agora possivelmente o templo está mais próximo, falta encontrá-lo, você sente que deve apurar o paço e encontrar tal templo antes que a noite caia\n"
                + "PROCURAR PELO TEMPLO", null, atobm);
        c[63] = bm;

        ArrayList<Integer> atobn = new ArrayList<>();
        atobn.add(65);
        Atos bn = new Atos(64, "A tentativa de encontrar o templo falha e noite cai sobre levitan, agora a floresta\n"
                + "que já éra escura pela copa espessa das árvores durante o dia, está totalmente dominada pelo breu, impossivel transitar sem uma fonte de luz.\n"
                + "você pega um galho seco amarra um pedaço de pano encerado com uma vela que tem no inventário \n"
                + "para montar uma espécie de tocha, agora só resta acendê-la.\n"
                + "7-ACENDER TOCHA", null, atobn);
        c[64] = bn;

        ArrayList<Integer> atobo = new ArrayList<>();
        atobo.add(66);
        atobo.add(67);
        Atos bo = new Atos(65, "                          ▓                       \n" +
"                         █▒                       \n" +
"                        ██                        \n" +
"                      ▓▒██                        \n" +
"                      ████                        \n" +
"                    █░██ █▒                       \n" +
"                    ███░ ██   ▒█                  \n" +
"                   ████▒  ███▓██▒                 \n" +
"                  ███ ▓█   ▒█████                 \n" +
"                  ██▓▓ ▒░      ██                 \n" +
"                  ░█▒▒       ░██                  \n" +
"                    ▒        ▒                    \n" +
"                   █▓▓███████▓█                   \n" +
"                   ████████████                   \n" +
"                   ▒██████████▓                   \n" +
"                    ██████████░                   \n" +
"                    ██████████                    \n" +
"                    ▒█████████                    \n" +
"                     ████████▒                    \n" +
"                     ████████                     \n" +
"                     ▒███████                     \n" +
"                      ██████▓                     \n" +
"                      ██████░                     \n" +
"                      ▒█████                      \n" +
"                       █████                      \n" +
"                       ████▒                      \n" +
"                       ▓███                       \n" +
"                        ███                       \n" +
"                        ██▓                       "
                + "a pequena chama ilumina os arredores, e os sons noturnos da floresta o deixam bem mais atento\n"
                + "que anteriormente, a noite os principais predadores saem em busca de alimento, e você certamente não pretende\n"
                //talvez foto tocha
                + "findar seus dias nesta posição.\n"
                + "Parar e se esconder pode ser útil, mas sem ninguém para revezar na vigia pode ser perigoso, mas seguir no escuro\n"
                + "também não é nada convidativo\n"
                + "PARAR E DESCANSAR   ou CONTINUAR MESMO A NOITE", "fogo.wav", atobo);
        c[65] = bo;

        ArrayList<Integer> atobp = new ArrayList<>();
        atobp.add(67);
        atobp.add(67);
        Atos bp = new Atos(66, "Você sobe em uma grande árvore próxima, encontrando uma forquilha formada pelos galhos, ali poderia descansar\n"
                + "seu corpo com a menor probabilidade de sofrer algum ataque durante o período em repouso. Após a escalada e acomodação,\n"
                + "a tocha é apagada e rapidamente você cai no sono, o cansaço era evidente apesar da relutância em aceitá-lo.\n"
                + "…\n" //comando tirar itens
                + "Quando desperta no outro dia você agradece mentalmente por nada ter ocorrido, mas sua mochila parece estar mais leve que quando\n"
                + "iniciou o descanso. Observando um lado dela percebe-se um rasgo em sua lateral, certamente alguma pequena criatura na procura de alimento\n"
                + "a rasgou e furtou alguns dos seus itens.\n"
                + "Descendo de seu posto você recolhe algumas coisas que caíram pelo rasgo, inclusive a adaga de Chunchumaru, que estava acoplada na lateral\n"
                + "da mochila, este importante item poderia ter sido perdido. As únicas coisas que sumiram foram coisas alimentícias (definir o que tinha,\n"
                + "possivelmente carne da caçada do começo), - dos males o menor - pensa você.\n"
                + "agora só resta recolher os itens\n"
                + "1- RECOLHER ITENS (metodo para reccolher)  ou SEGUIR SEU CAMINHO", null, atobp);
        c[66] = bp;

        ArrayList<Integer> atobq = new ArrayList<>();
        atobq.add(68);
        Atos bq = new Atos(67, "Sem muito o que fazer resta seguir em frente na procura do templo. Seguindo, no meio da floresta você se depara com uma\n"
                + "trilha de pedra, quase encoberta pela vegetação rasteira, certamente ela levaria ao templo, seria difícil alguma outra construção\n"
                + "ser feita tão no interior da floresta de Lavitan ter outraa finalidade.\n"
                + "Considerando que se está no interior da floresta o caminho aqui é de facil passagem, apesar da vegetação espalhar alguns galhos pelo caminho\n"
                + "e pequenas ervas nascem nas frestas das pedras, ainda assim um caminho fácil de andar.\n"
                + "Depois de algum tempo o caminho se alarga em um grande platô de pedra esculpida, e na outra extremidade está a entrada do templo, que adentra a\n"
                
                + "elevação rochosa em sua retaguarda.  Finalmente o templo é encontrado, é só entrar.\n"
                + "ENTRAR NO TEMPLO", null, atobq);
        c[67] = bq;

        ArrayList<Integer> atobr = new ArrayList<>();
        atobr.add(69);
        Atos br = new Atos(68, "Você atravessa o plano pavimentado da entrada e quando se aproxima da entrada do templo, mas um som parecido com rochas rolando e se chocando lhe vem aos ouvidos,\n"
                + "mais que depressa você para e observa algo mover-se ao lado da entrada do templo.\n"
                + "E um golem de pedra, possuindo cerca de 4 metros e algumas inscrições rúnicas no rosto. Certamente feito e colocado ali para proteger qualquer entrada não autorizada\n"
                +"                   ▒███▓▒░   ▒░▒█                                          \n" +
"                ░▒ ████████▒   ░██▓                                        \n" +
"                 ░▒██████░   ▓░▒████       ░░░▒░ ▓                         \n" +
"                 ▒ ▒▓███  ▓▒ ▒█████▒ ▒██▒   ▒▓▓  ▓▓░                       \n" +
"               ░░ ▒▒▓██▓  ███▒▓▓▓▒▓███████  ▒█░  ██████▓ ░                 \n" +
"              ▒░    ▓▒█ ▒██▓░  ░░ ██ ████▓█████▒▒░███▓░   ░ ░░░▒           \n" +
"              ░▓██ ░███ ▓█▓▒ ▒░ ▒ ▒█▒██████▓ ████░██    ░██▒ ▒ ▓▒ ▒░       \n" +
"              ░ █████▓ ▓██░▒░▓▓░ ▓▓▓█▓██▒ █████████  ░░█ ▓▒▓ ▒▒▒▒ █░       \n" +
"               ▒▓▒███  ███ ▒░  ░▒▒    ▓██   ███████   ░█   ░▒ ▒▒▓▓█        \n" +
"              ▒  ▒███  ▒█▓ ███▒▒▓▒▓███████▒███████▓ ░▓  ██▓▒ ▒█████        \n" +
"              ▒  ▒████░▓▒█░▓▓██░░███▓▒▓██ ░███   █▓    ░▓ █▒ ▒██░█▒        \n" +
"               ░▓█████▓  ▓█░█ ▒▒▓█▓░▓▓████████░▓ ██  ░▒▒ ░█░▒▓██░█░        \n" +
"           ░   ▓██████░ ▓██▓▒░▓███░ ███████████████▒░███▓██████████        \n" +
"          ▓██░▓████████▓▓▓█▓ ▒▓  ▒█▓█████ ▒███▒▒███████░░██▓█▓▓████▓       \n" +
"         ░▓▓  ▓████████▓  ▓██▓▒▓██████████▓▒   ▒▒▒██     ▓     █████▓      \n" +
"        ░ ▒█  ▓ ███████▒   ▒▓▒████████▒▒▓█░ ▒▓▓  ▓██     ▒▓  ░ █▓ ▓▒█▓     \n" +
"        ░     █░███████   ▒▓█▓▒██████▒   █████▓███████▓▒       ░▓▓█ ░█▓    \n" +
"          █▓░█▓███████▒     ░▒░▒▓▒████▓▓▓▓█████████▒ ███▒   ▒█████████▓    \n" +
"         ▒████▓█████▓     ░▓▓░░▒█▓███▓██████████████  ████████████████     \n" +
"       ▒██▒ ░██████▓    ░▓  ▒███████▒▓▓█▓███████████   ░▓█▒▒  ▒  ▒████░    \n" +
"      ░░▓░░███▒███▓     ▒░   ▒  ▒███▓███████████████▓  ▓██▒▒ ░░  ██████▒   \n" +
"     ▒░  ░███████      ░░    ░  ██████████████████████ ██   ▓ ░   ▓████▒   \n" +
"    ▒░   ▓▒ ▒████      ▒     ░▓ █████████████████████████▒▓█░ ░█ ░████▒    \n" +
"   ▒▒▒     ░▓█████▓   ░▒ ░     ▓█████████████████████████▒▓░  ▒▓ █████     \n" +
"     ▓    ▒█▓█████▒   ▒░ ░     █████ ░▓▓█▓░████████████▓▒█  ▒    ███▓      \n" +
"    ██████▓  ████▒    ░        █████       ▒███████▓▓▒ ▓██████▒ ░██▓       \n" +
"      ▒████▓████▒     ▒▒  ▒  ▓██████        ██████▒    ▓█ ▓▓███████        \n" +
"        ███▒███░       ████████████░        ▒████  ░░▓▓░█▓░ ▓█████         \n" +
"            ░░         ░█░ ████████         ▓███   ▓▓▒ ▒█ ▒▒▒███           \n" +
"                        ▒▓▒███████▓█       ████░▒█░▒  ▓█▒   ░███           \n" +
"                        ▒███████████      ▓████ ██░░ ░█▓ ░█▒█▒██           \n" +
"                        ▒██▓▓██████ █      ░ ██▒▓█ ▓ ░█  ▒██▒ █            \n" +
"                         ▓ ▓████████▒      ▒░████▒ ▒██▓  ▓█░ █▓            \n" +
"                        ████████▓███      ░   ████▓▓█▒ ▒▒▓▓▓█▓             \n" +
"                     ▒░ ██▒▓▒░██▓██░ ▓▒▒▒▒▒░█▒▓██▓▒▒██████▒▒░ ░▒▒▒▒░       \n" +
"                 ▒████  ▒▒▒░ ▓▓█████▒█████████  ▓█ ░███████████████████████\n" +
"           ░░▒▓█████░ ▓█▒ █    ███████████████▓▓▒░ ▓ ▓█▒ ██████████████████\n" +
"       ▒██████████  ▓██▓ ▓█ ▓███████████████████▓ ▓█▓██▒▓██████████████████\n" +
"     ░████████████▒▒██▓█▓██▓███████████████████████████████████████████████\n" +
"      ▒▓▓▓▓▓▓▓▓▓█████▓░▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▒▒▒▒▓▓▓▓▒▓▒░░░░▒▓▒▒▒▒▒▒░░░▓▓░"
                + "no templo antes de seu abandono.\n"
                + "LUTAR CONTRA O GOLEM", "templo.wav", atobr);
        //implementacao luta (so q vai perder inevitavelmente
        c[68] = br;

        ArrayList<Integer> atobs = new ArrayList<>();
        atobs.add(70);
        Atos bs = new Atos(69, "o golem desfere um golpe com uma das mãos, você desvia dele com dificuldades devido a surpresa, a tocha que lhe servia com iluminação cai entre as folhas\n"
                + "secas presentes no chão, o fogo rapidamente se espalha para uma das extremidades da área, iluminando melhor todo o local\n"
                + "\nOs ataques não surtem dano.\n"
                + "Após sua arma ter sido arremessada para longe com um golpe do golem desferido, o que também o derrubou, você recorre a adaga de Chunchumaru,\n"
                + "sua única arma restante, com ela em mãos encara o imponente gigante.\n"
                + "De repente ele cessa seus ataques, e as inscrições rúnicas em seu rosto começam brilhar em um tom azulado e ele retorna para o lado da entrada, sentando e ficando imóvel novamente.\n"
                + "Certamente a adaga deve ter algum poder mágico que permite a entrada no local - pensa voce.\n"
                + "Agora só resta entrar\n"
                + "ENTRAR NO TEMPLO", "brigademaos.wav", atobs);
        c[69] = bs;

        ArrayList<Integer> atobt = new ArrayList<>();
        atobt.add(71);
        Atos bt = new Atos(70, "acendendo sua tocha você adentra o templo, depois de descer algumas escadarias você chega ao altar principal, este ultimo igual ao que existe na vila de Kenko.\n"
                + "já sabendo das passagens secretas você adentra aos cômodos escondidos.\n"
                + "dessa vez no local igual ao que existia a adaga de Chunchumaru estava apenas um pergaminho, que continha os dizeres: (print dentro de um pergaminho desenhado com caracteres)\n"
                + "Se estiver lendo isto possivelmente alguém está tentando ressuscitar Darknuss, uma personificação do mal a muito tempo banida deste mundo. Os impeça!\n"
                + "Cada templo possui um fragmento de Nys, usados para selar este grande mal no passado, infelizmente os fragmentos reunidos também tem o poder de libertar Darknuss, formando o Orbe de Nys.\n"
                + "Este último, juntamente com a adaga são as ferramentas para o aprisionamento.\n"
                + "O orbe deste templo foi levado para a vila de Kenko a muitos anos.\n"
                + "\n"
                + "Por favor coloque a adaga de Chunchunmaru no altar neste cômodo, nela estão contidas diversas magias antigas de selamento, que serão incorporadas no líquido dentro do cabo da adaga, faça\n"
                + "esse processo em todos os outros templos para recarregar os poderes de selamento da adaga.\n"
                + "Reúna todos as magias e o orbe e evite que este mal assole o mundo novamente.\n"
                + "\n"
                + "Dos protetores de Xiuhno.\n"
                + "\n"
                + "\n"
                + "Terminando de ler muita coisa se esclarece para você, agora falta fazer o procedimento com a adaga.\n"
                + "COLOCAR ADAGA SOBRE O ALTAR DE PEDRA", "fogo.wav", atobt);
        c[70] = bt;

        ArrayList<Integer> atobu = new ArrayList<>();
        atobu.add(72);
        Atos bu = new Atos(71, "Largando a adaga sobre o altar, ela misteriosamente começa a flutuar e uma espécie de vórtice surge no local, girando calmamente e sendo absorvidos pela adaga, o cabo desta brilha\n"
                + "intensamente. Após esta cena ela repousa novamente sobre o altar, como se nada tivesse acontecido."
                + "Agora um objetivo maior e mais nobre o aguarda.\n"
                + "\n"
                + "\n"
                + "Saindo do templo agora com destino a próxima cidade/vila Paeres era de noite quando chegou, Você está novamente no átrio externo do templo de Xiuhno da floresta de Lavitan, certamente o\n"
                + "caminho de pedra de onde você veio levará para a estrada principal que corta a floresta de Lavitan, é a melhor escolha a tomar neste momento.\n"
                + "A sua direita está o golem protetor, agora inofensivo,  como qualquer outra rocha, contrastando com seu real poder destrutivo, sem a adaga a única opção seria fugir, agora era possível\n"
                + "observar que existiam apenas alguns arranhões em sua superfície, e não foram feitos por você."
                + "SEGUIR ESTRADA", "itemLendario.wav", atobu);
        c[71] = bu;

        ArrayList<Integer> atobv = new ArrayList<>();
        atobv.add(73);
        atobv.add(74);
        Atos bv = new Atos(72, "seguindo pelo caminho, depois de muito andar, as pedras simplesmente foram arrancadas e a pequena trilha desfeita, restando apenas algumas remanescentes, pelo jeito do relevo\n"
                + "lavado nesta parte o motivo era visivelmente a força d'água, com declive do terreno ela arrastou a maioria das pedras em dias de chuva durante os anos.  \n"
                + "Ignorando este fato você segue em linha reta em direção ao sul sem mais problemas, até chegar na estrada principal.\n"
                + "Já avistando entre a vegetação a estrada você ouve muitas vozes, e passos de muitas pessoas marchando. a essa altura é melhor ser cauteloso antes de aparecer.\n"
                + "Saindo do meio do mato os soldados lhe encaram por alguns momentos mas não chegam a tomar qualquer atitude, você procura alguém para perguntar.\n"
                + "PERGUNTAR AO COMERCIANTE   ou PERGUNTAR AO SOLDADO", null, atobv);
        c[72] = bv;

        ArrayList<Integer> atobx = new ArrayList<>();
        atobx.add(74);
        Atos bx = new Atos(73, "O comerciante exaltado apenas lhe fala da ponte e de uma de suas caravanas que foi atacada nas proximidades da travessia do rio Lavitan e como isso lhe causou prejuízo.\n"
                + "Isso nao lhe esclarece muito mas o comerciante não parece interessado em falar de outra coisa. resta perguntar aos soldados.\n"
                + "PERGUNTAR PARA OS SOLDADOS", null, atobx);
        c[73] = bx;

        ArrayList<Integer> atobz = new ArrayList<>();
        atobz.add(0);
        atobz.add(0);
        Atos bz = new Atos(74, "\n"
                + "Você indaga um soldado sobre o porquê daquilo tudo, ele lhe conta que estavam averiguando os fatos da ponte caída e de comerciantes atacados na região, e também atrás de um\n"
                + "grupo de mercenários chamado Wulfforce, que vinha causando estragos por alguns lugares do reino.\n"
                + "Você decide não lhes contar sobre sua missão, pois sabe que os governantes e comandantes de Eresda nem sempre são bem intencionados e nunca se sabe quem pode estar envolvido.\n"
                + "Mas agora ao menos já sabe o nome de quem fez isso com Kenko.\n"
                + "\n"
                + "Você acompanha a caravana até a saída da floresta de Lavitan, aproveitando de sua escolta passiva contra quaisquer perigos advindo dos arredores.\n"
                + "PARABENS VOCE ACABA DE CONCLUIR O ATO2!  O que deseja fazer agora?\n"
                + "INICIAR PROXIMA FASE ou VER STATUS", null, atobz);
        c[74] = bz;
        return c;
    }
}
