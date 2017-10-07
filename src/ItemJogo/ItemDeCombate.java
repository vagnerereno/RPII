/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItemJogo;

/**
 *
 * @author vagne
 */
public abstract class ItemDeCombate extends Item {
    
    private int defesa;
    private int nivelMinimo;
    
    public ItemDeCombate(String descricao, int defesa, int nivelMinimo) {
        super(descricao);
        this.defesa = defesa;
        this.nivelMinimo = nivelMinimo;
    }
    
        /**
     * @return the defesa
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    /**
     * @return the nivelMinimo
     */
    public int getNivelMinimo() {
        return nivelMinimo;
    }

    /**
     * @param nivelMinimo the nivelMinimo to set
     */
    public void setNivelMinimo(int nivelMinimo) {
        this.nivelMinimo = nivelMinimo;
    }
    
}
