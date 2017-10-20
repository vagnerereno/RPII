package motor;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Atos {

    int codigo;
    String desc;
    String som;
    ArrayList<Integer>proxcod;

    public Atos(int a, String b, String s, ArrayList codigos) {
        this.codigo = a;
        this.desc = b;
        this.som = s;
        this.proxcod=codigos;
    }

    public Atos[] carregar(Atos[] vazio) throws Exception {
        Carga c = new Carga();
        Atos[] carregado = c.carga(vazio);
        return carregado;
    }

    public String toString() {
        return desc;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public int getProxcodigo(int x){
        return this.proxcod.get(x);
    }

    public int compareTo(Atos ato) {
        if (this.codigo==ato.getCodigo()) {
            return -1;
        } else if (this.codigo!=ato.getCodigo()) {
            return +1;
        } else {
            return 0;
        }
    }
}
