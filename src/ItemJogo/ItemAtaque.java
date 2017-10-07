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
public class ItemAtaque extends ItemDeCombate {

    private int ataque;
    private int velocidade;
        
    public ItemAtaque(String descricao, int defesa, int nivelMinimo, int ataque, int velocidade) {
        super(descricao, defesa, nivelMinimo);
        this.ataque = ataque;
        this.velocidade = velocidade;
    }
    
    public String getInformacoes(){
        return getDescricao() + " (Ataque: " + getAtaque() + ", Defesa: " + getDefesa() + " )";
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
