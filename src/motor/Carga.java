package motor;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Carga {
      public Atos[] carga(Atos[] c){
        Atos a = new Atos(0 , "Pois bem, então parte em sua longa jornada.\n"
                + "Nos arredores da vila Kenko, você descança, sem abrir os olhos voce pensa: acordo ou durmo mais um pouco?\n"
                + "1-Seguir dormindo   2- Acordar", 1,2,0,0,0);
        c[0] = a;
        Atos b = new Atos(1 , "As galinhas cacarejam enlouquecidamente anunciando o novo dia, por vezes você sente vontade de dar cabo delas \n"
                + "devido a irritação sonora recorrente. Agora desperta por completo.\n"
                + "1 - Levantar" , 2,0,0,0,0);
        c[1] = b;
        Atos d = new Atos(2, "Abrindo os olhos, ainda meio confuso, percebe que esqueceu de apagar a vela, e agora o cheiro de cera invade o recinto.\\n\"\n" +
"                + \"░▒░░░░░░░░░░░░░▒░░░░░░░▒░░░░░░░░░░░░░░\\n\"\n" +
"                + \"░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░▒\\n\"\n" +
"                + \"░▒░░░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░░░▒░░░░░░░░\\n\"\n" +
"                + \"░▒░░▒░▒░▒░▒░▒░▒░▒▒▒▒▒░▒░▒▒▒░▒░▒░░░░░░░\\n\"\n" +
"                + \"░▒░▒▒▒░▒░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▒░▒░░░▒\\n\"\n" +
"                + \"░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▒░▒░░░░▒\\n\"\n" +
"                + \"░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░░░▒\\n\"\n" +
"                + \"░▒▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░░▒\\n\"\n" +
"                + \"░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒\\n\"\n" +
"                + \"░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▒▒▒▒▒▒▒▒▒░▒▒▒░▒▒\\n\"\n" +
"                + \"░▒░▒░▒▒▒▒▒▒▒▒▒▒▒▒▓███▓▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒\\n\"\n" +
"                + \"░▒░░▒░▒▒▒▒▒▒▒▒▒▒▒▒▓██▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒\\n\"\n" +
"                + \"░▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒\\n\"\n" +
"                + \"░▒▒░▒░▒▒▒▒▒▒▒▒▒▒░▓████░▒▒▒▒▒▒▒▒▒▒░▒░▒▒\\n\"\n" +
"                + \"░▒░▒░▒▒▒▒▒▒▒▒▒▒▒░█████░▒▒▒▒▒▒▒░▒░▒▒▒░▒\\n\"\n" +
"                + \"░▒▒░░░▒░▒▒▒▒▒▒▒▒░████▓░▒▒▒▒▒▒▒▒▒▒░▒░░▒\\n\"\n" +
"                + \"░▒░░░▒░▒▒▒▒▒▒▒▒▒░████▓░▒▒▒▒▒▒▒▒▒▒▒░▒░▒\\n\"\n" +
"                + \"░▒░░▒░▒▒▒░▒░▒▒▒░░██▓▓▓░░▒▒▒▒▒▒▒▒▒░▒░▒▒\\n\"\n" +
"                + \"░▒░▒░▒░▒▒▒▒▒▒▒▒░░██▓▓▓░▒▒▒▒▒▒▒▒▒▒▒░░░▒\\n\"\n" +
"                + \"░▒░░▒░▒░▒░▒░▒▒▒░░██▓▓▒░▒▒▒▒▒▒▒▒░▒░▒░░▒\\n\"\n" +
"                + \"░▒░░░▒░▒▒▒░▒▒▒▒▒░██▓▓▒░▒▒▒▒▒▒▒▒▒░▒░▒░▒\\n\"\n" +
"                + \"░▒░░░░▒░▒░▒▒▒▒▒░░▓█▓▓▒░▒▒▒▒▒▒░▒▒▒▒▒░▒▒\\n\"\n" +
"                + \"░▒░▒░▒▒▒░▒▒▒▒▒▒▒░██▓▓▒░▒▒▒▒▒▒▒▒▒░▒░▒░▒\\n\"\n" +
"                + \"░▒▒░▒░▒░▒▒▒▒▒▒▒░░▓█▓▓▒░▒▒▒▒▒▒▒▒▒▒░▒░▒▒\\n\"\n" +
"                + \"░▒░▒░░░░░░░▒░░▒░░██▓▒▒░▒▒▒▒▒▒▒▒▒▒▒░▒░▒\\n\"\n" +
"                + \"░▒░░░░▒▒▒▒▒▒▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒░░░▒░▒▒\\n\"\n" +
"                + \" ░░░░▒▒▒▒░░▒▒▒▒▒░░░░░░░░░░░░     ░░░░░\\n\"\n" +
"                + \"░░░░░░▒▒▒░                   ░▒▒▒▒░░░░\\n\"\n" +
"                + \"▓█████▓▓▒▒▒                 ▒▒▒▒▓▓████\\n\"\n" +
"                + \"██████████████████████████████████████\"\n" +
"                + \n"
                 + "1-APAGAR VELA   2-IR AO BANHEIRO ", 3,4,0,0,0 );
        c[2]=d;
        Atos e =new Atos(3, "\n"
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
                        + "\n A vela foi apagada!\n"
                        + " 1-Ir ao banheiro" ,4,0,0,0,0);
        c[3]=e;
        Atos f= new Atos(4, " vai até o lavabo atirar agua em sua face para dissipar a preguiça ainda remanescente, a agua está\n"
                + "um arrepio percorre todo o seu corpo, você encara-se no velho espelho e contempla sua triste feição\n"
                + "trazendo flashes das lembranças de seu passado de mercenário, tempos de matança em prol do atual reino.\n"
                + "Voltando a si, ainda contemplando sua face no reflexo:\n"
                + " get descricao da raca q escolheu  (vou colocar em algum lugar)\n"
                + "Após voltar para o quarto e vestir-se você percebe que a fome lhe aflige. \n"
                + "1-Ir para a despensa   2-Caçar algo para comer", 4,5,0,0,0);
        c[4]=f;
       // Atos g=new Atos(5, "      blabla     "  ,0,0,0,0,0);
        
        
        
        return c;        
    }   
}
