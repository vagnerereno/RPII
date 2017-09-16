package ItemJogo;

/**
 *
 * @author vagne
 */
public abstract class Item {

    String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
 
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}