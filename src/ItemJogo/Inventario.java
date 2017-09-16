package ItemJogo;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Item> itens;
    int capacidade;

    public Inventario(int capacidade) {
        this.capacidade = capacidade;
        this.itens = new ArrayList<>();
    }

    public Item pegarItem(int posicao) {
        Item itemPego = itens.get(posicao);
        itens.remove(posicao);
        return itemPego;
    }

    public Item verItem(int posicao) {
        return itens.get(posicao);
    }

    public boolean adicionarItem(Item novoItem) {
        if (getCapacidadeDisponivel() > 0) {
            itens.add(novoItem);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Item> pegarTodosItens() {
        ArrayList<Item> todosItens = itens;
        itens.removeAll(itens);
        return itens;
    }

    public void removerItem(int posicao) {
        itens.remove(posicao);
    }

    public ArrayList<Item> verTodosItens() {
        return itens;
    }

    public int getCapacidadeDisponivel() {
        return capacidade - itens.size();
    }
}
