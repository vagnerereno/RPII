/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpii;

import itens.armas.Cajado;

/**
 *
 * @author leonardo
 */
public class Mago extends Especialidade {

    public Mago() {
        super (5, 20, 5 , 1, 10, 4, new Cajado ("Cepo de Madeira", 6, 1, 1), "Mago");
    }
    
}
