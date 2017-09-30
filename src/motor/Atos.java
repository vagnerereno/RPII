package motor;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Atos {

    int codigo;
    String desc;
    ArrayList<Integer>proxcod = new ArrayList<Integer>();

    public Atos(int a, String b, int c, int d, int e, int f, int g) {
        this.codigo = a;
        this.desc = b;
        proxcod.add(c);
        proxcod.add(d);
        proxcod.add(e);
        proxcod.add(f);
        proxcod.add(g);
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
