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
public class Comida extends Item {

    private int regeneracao;

    public Comida(String descricao, int regeneracao) {
        super(descricao);
        this.regeneracao = regeneracao;
    }

    public int getRegeneracao() {
        return regeneracao;
    }

    public void setRegeneracao(int regeneracao) {
        this.regeneracao = regeneracao;
    }
}
