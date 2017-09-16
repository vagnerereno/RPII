/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Espada;

/**
 *
 * @author leonardo
 */
public class Guerreiro extends Especialidade {

    public Guerreiro() {
        super(3, 7, 10, 3, 5, 50, new Espada("Espada de madeira", 0, 6, 5), "Guerreiro");
    }
    
}
