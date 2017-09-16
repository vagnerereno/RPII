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
    
    int defesa;
    int nivelMinimo;
    
    public ItemDeCombate(String descricao, int defesa, int nivelMinimo) {
        super(descricao);
        this.defesa = defesa;
        this.nivelMinimo = nivelMinimo;
    }
    
}
