/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Arco;

/**
 *
 * @author leonardo
 */
public class Arqueiro extends Especialidade {

    public Arqueiro() {
        super(5, 5, 3, 3, 5, 30, new Arco("Arco de Madeira", 0, 7, 2), "Arqueiro");
    }
}
