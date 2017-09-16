/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens.armas;

/**
 *
 * @author unipampa
 */
public class Armas {

    protected int dano;
    protected int defesa;
    protected int magia;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public String ExibirStatus(){
         String status = "Dano: " + this.getDano() + "\n"
        + "Magia: " + this.getDano() + "\n"
        + "Defesa: " + this.getDano() + "\n";
        return status;
    }
}
