package ItemJogo;

/**
 *
 * @author vagne
 */
public class Arco extends ItemDeCombate {

    int ataque;
    int velocidade;

    public Arco(String descricao, int defesa, int nivelMinimo, int ataque, int velocidade) {
        super(descricao, defesa, nivelMinimo);
        this.ataque = ataque;
        this.velocidade = velocidade;

    }

}
