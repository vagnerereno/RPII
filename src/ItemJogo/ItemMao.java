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
public class ItemMao extends ItemDeCombate {

    private int ataque;
    private int velocidade;
    
    public ItemMao(String descricao, int defesa, int nivelMinimo, int ataque, int velocidade) {
        super(descricao, defesa, nivelMinimo);
        this.ataque = ataque;
        this.velocidade = velocidade;
    }    
}
