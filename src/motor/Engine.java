package motor;
/**
 *
 * @author Rafael
 */
public class Engine {
    Atos[] mundo;
    public Engine() {
    }
    //liga o motor
    public Atos[] iniciando() throws Exception {
        Atos n[] = new Atos[100];
        Atos a = new Atos(0, null,0,0,0,0,0);
        Atos x[] = a.carregar(n);
        this.mundo = x;
        return x;
    }
   //compara e retorna o proximo ato
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