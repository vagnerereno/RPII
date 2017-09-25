package motor;

import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Engine {
    Atos[] mundo;
    public Engine() {
    }
    public Atos[] iniciando() {
        Atos n[] = new Atos[90];
        Atos a = new Atos(0, null,0,0,0,0,0);
        Atos x[] = a.carregar(n);
        this.mundo = x;
        return x;
    }  
   public Atos compara(Atos ato){
        Atos x[] = this.mundo;
        for(int i=0; i<x.length; i++){
            if(x[i].compareTo(ato)==-1){
                return x[i];
            }
        }
        return null;
    }
}