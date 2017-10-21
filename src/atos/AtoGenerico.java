/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos;

import ItemJogo.Comida;
import ItemJogo.Inventario;
import ItemJogo.Item;
import ItemJogo.ItemAtaque;
import ItemJogo.ItemDeCombate;
import ItemJogo.Itens;
import inimigos.Inimigo;
import java.util.Scanner;
import rpii.Especialidade;
import rpii.Raca;

/**
 *
 * @author vagne
 */
public abstract class AtoGenerico {

    Raca jogador;
    // private Raca jogadorTeste;
    

    public AtoGenerico(Raca jogador) {
        this.jogador = jogador;
    }
    
     public void abrirInventario(Inventario inventario, String descricao) {
        descricao.toUpperCase();
        System.out.println("------------------");
        System.out.println("---" + descricao + "---");
        System.out.println("------------------");

        for (int i = 0; i < inventario.verTodosItens().size(); i++) {
            System.out.println("[" + i + "] - " + inventario.verItem(i).getDescricao());
        }
        System.out.println("------------------");
        System.out.println("Selecione uma ação: ");
        System.out.println("0 - Fechar");
        System.out.println("1 - Guardar na mochila");
        System.out.println("2 - Comer alimento");
        System.out.println("3 - Mover para a mão");
        Scanner selecionar = new Scanner(System.in);
        int acao = selecionar.nextInt();
        if (acao == 1) {
            coletaDeItens(inventario);
        } else if (acao == 2) {
            System.out.println("Digite o número do alimento que deseja comer: ");
            Scanner alimento = new Scanner(System.in);
            int numAlimento = alimento.nextInt();
            Item comida = inventario.pegarItem(numAlimento);
            try {
                jogador.comer((Comida) comida);
                System.out.println("Yummmm...");
                System.out.println("Sua vida atual é: " + jogador.getbVidaAtual() + "/" + jogador.getbVida());
                abrirInventario(inventario, descricao);
            } catch (Exception e) {
                System.out.println("Não foi possível comer o item.");
                inventario.adicionarItem(comida);
                abrirInventario(inventario, descricao);
            }
        } else if (acao == 3) {
            System.out.println("Digite o número do item que deseja mover para a mão: ");
            Scanner itemDeAtaque = new Scanner(System.in);
            int posicao = itemDeAtaque.nextInt();
            System.out.println("Você tem certeza que deseja descartar o item atual para pegar o item " + inventario.verItem(posicao).getDescricao() + "(1 - Sim / 2 - Não)");
            Scanner confirma = new Scanner(System.in);
            int resposta = confirma.nextInt();
            if (resposta == 1) {
                try {
                    Item itemAtaque = inventario.pegarItem(posicao);
                    jogador.setItemDaMao((ItemDeCombate) itemAtaque);
                } catch (Exception e) {
                    System.out.println("Erro ao pegar item. Verifique se é um item de ataque.");
                }

            }
        }

    }

    public void abrirMochila(Inventario inventario, String descricao) {
        System.out.println("------------------");
        System.out.println("---" + descricao.toUpperCase() + "---");
        System.out.println("------------------");

        for (int i = 0; i < inventario.verTodosItens().size(); i++) {
            System.out.println("[" + i + "] - " + inventario.verItem(i).getDescricao());
        }
        System.out.println("------------------");
        System.out.println("Selecione uma ação: ");
        System.out.println("0 - Fechar");
        System.out.println("1 - Comer item");
        Scanner selecao = new Scanner(System.in);
        int acao1 = selecao.nextInt();
        if (acao1 == 1) {
            System.out.println("Digite o número do alimento que deseja comer: ");
            Scanner alimento = new Scanner(System.in);
            int numAlimento = alimento.nextInt();
            Item comida = inventario.pegarItem(numAlimento);
            try {
                jogador.comer((Comida) comida);
                System.out.println("Yummmm...");
                System.out.println("Sua vida atual é: " + jogador.getbVidaAtual() + "/" + jogador.getbVida());
                abrirMochila(inventario, descricao);
            } catch (Exception e) {
                System.out.println("Não foi possível comer o item.");
                inventario.adicionarItem(comida);
                abrirMochila(inventario, descricao);
            }

        }
    }

    public void coletaDeItens(Inventario dispensa) {
        int acao = 1;
        while (acao != 0) {
            for (int i = 0; i < dispensa.verTodosItens().size(); i++) {
                System.out.println("[" + i + "] - " + dispensa.verItem(i).getDescricao());
            }
            System.out.println(" -- Digite o número do item que você deseja pegar:");
            Scanner selecionar = new Scanner(System.in);
            int pegar = selecionar.nextInt();
            try {
                Item itemPego = dispensa.pegarItem(pegar);
                jogador.adicionarItem(itemPego);
                System.out.println("Item adicioando à mochila!");
            } catch (Exception e) {
                System.out.println("Esse item não pode ser pego!");
                System.out.println("Motivo: " + e.getMessage());
            }
            System.out.println("Deseja pegar outro item (1) ou fechar a mochila (0)?");
            acao = selecionar.nextInt();
        }
    }

    public Inventario getRecompensa(Inimigo inimigo, Especialidade classeJogador) {
        ItemAtaque item;
        Inventario recompensa = new Inventario(3);
        if (inimigo.getNome().equals("Goblin")) {
            switch (classeJogador.getDescricao()) {
                case "Guerreiro":
                    item = (ItemAtaque) Itens.ESPADAMAGICA;
                    break;
                case "Mago":
                    item = (ItemAtaque) Itens.CAJADODEPAUS;
                    break;
                case "Arqueiro":
                    item = (ItemAtaque) Itens.ARCOARBALEST;
                    break;
                default:
                    return recompensa;
            }
            item.getInformacoes();
            System.out.println("Parabéns, você encontrou uma " + item.getInformacoes() + ", um espinafre " + (Itens.ESPINAFRE) + " e uma Armadura Azul" + (Itens.ARMADURAAZUL));
            recompensa.adicionarItem(item);
            recompensa.adicionarItem(Itens.ESPINAFRE);
            recompensa.adicionarItem(Itens.ARMADURAAZUL);
            return recompensa;
        }
        // FIM 1º LOOT
        if (inimigo.getNome().equals("Javali")) {
            switch (classeJogador.getDescricao()) {
                case "Guerreiro":
                    item = (ItemAtaque) Itens.ESPADAJUSTICEIRA;
                    break;
                case "Mago":
                    item = (ItemAtaque) Itens.CAJADOESMERALDA;
                    break;
                case "Arqueiro":
                    item = (ItemAtaque) Itens.ARCOANTIGO;
                    break;
                default:
                    return recompensa;
            }
            item.getInformacoes();
            System.out.println("Parabéns, você encontrou uma " + item.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(item);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
        }
        // FIM 2º LOOT
        if (inimigo.getNome().equals("Cervo")) {
            switch (classeJogador.getDescricao()) {
                case "Guerreiro":
                    item = (ItemAtaque) Itens.ESPADAJUSTICEIRA;
                    break;
                case "Mago":
                    item = (ItemAtaque) Itens.CAJADOESMERALDA;
                    break;
                case "Arqueiro":
                    item = (ItemAtaque) Itens.ARCOANTIGO;
                    break;
                default:
                    return recompensa;
            }
            item.getInformacoes();
            System.out.println("Parabéns, você encontrou uma " + item.getInformacoes() + ", uma coxinha " + (Itens.COXINHA) + " e uma Camisa Longa" + (Itens.CAMISALONGA));
            recompensa.adicionarItem(item);
            recompensa.adicionarItem(Itens.COXINHA);
            recompensa.adicionarItem(Itens.CAMISALONGA);
        }
        // FIM 3º LOOT
        return recompensa;
    }

    public Raca getJogador() {
        return jogador;
    }

    public void setJogador(Raca jogador) {
        this.jogador = jogador;
    }
}
