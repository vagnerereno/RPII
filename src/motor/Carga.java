package motor;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Carga {
      public Atos[] carga(Atos[] c){
        Atos n = new Atos(0 , "Pois bem, então parte em sua longa jornada.\n"
                + "Nos arredores da vila Kenko, você descança, sem abrir os olhos voce pensa: acordo ou durmo mais um pouco?\n"
                + "1-SEGUIR DORMINDO   2-ACORDAR",1,2,0,3,0);
        c[0] = n;
        Atos m = new Atos(1 , "teste de dois", 2,3,0,0,0);
        c[1] = m;
        
        
        
        return c;        
    }   
}
