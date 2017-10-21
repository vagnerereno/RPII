/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.contratos;

import ItemJogo.Inventario;
import inimigos.Inimigo;
import rpii.Especialidade;

/**
 *
 * @author vagne
 */
public interface InterfaceAto1 {

        public long Enredo_1();

        public long fase_1();

        public long irLeste();

        public long irNorte();
        
        public long fase2();
        
        public void fase3();
        
        public void inicializarJogador();
        
        public void configuraDispensa(Especialidade classe);
        
        public Inventario getDispensa();
        
        public void abrirInventario(Inventario inventario, String descricao);
        
        public void abrirMochila(Inventario inventario, String descricao);
        
        public void coletaDeItens(Inventario dispensa);
        
        public Inventario getRecompensa(Inimigo inimigo, Especialidade classeJogador);
                
                
    }
