
package ItemJogo;

/**
 *
 * @author vagne
 */
public class Itens {
    // Itens de ataque
    public static Item FACA = new Espada("Faca", 5, 1, 5, 1); // INICIO
    public static Item FACADECOMBATE = new Espada("Faca de Combate", 6, 1, 8, 1); // RECOMPENSA DO CERVO / JAVALI
    public static Item ESPADALONGA = new Espada("Espada", 8, 1, 10, 1); // RECOMPENSA DO GOBLIN / FASE 2
    public static Item ESPADACURTA = new Espada("Espada Curta", 9, 2, 12, 1);
    public static Item ESPADADEGELO = new Espada("Espada de Gelo", 11, 2, 15, 1);
    public static Item ESPADADAJUSTICA = new Espada("Espada da Justiça", 8, 3, 18, 1);
    public static Item ESPADAMAGICA = new Espada("Espada Mágica", 10, 3, 22, 1);
    public static Item ESPADAESMERALDA = new Espada("Espada Esmeralda", 10, 3, 28, 1);
    
    public static Item CAJADO = new Cajado("Cajado de Veneno", 0, 1, 8, 1); // INICIO
    public static Item CAJADOLONGO = new Cajado("Cajado Longo", 0, 1, 12, 1); // RECOMPENSA DO CERVO / JAVALI
    public static Item CAJADODEFOGO = new Cajado("Cajado de Fogo", 0, 2, 14, 1); // RECOMPENSA DO GOBLIN / FASE 2
    public static Item CAJADOMAGICO = new Cajado("Cajado Mágico", 0, 2, 16, 1);
    public static Item CAJADOESMERALDA = new Cajado("Cajado Esmeralda", 0, 3, 20, 1);
    public static Item CAJADODOSDEUSES = new Cajado("Cajado dos Deuses", 0, 3, 30, 1);
   
    public static Item ARCO = new Arco("Arco Tradicional", 5, 1, 7, 1); // INICIO
    public static Item ARCOMODERNO = new Arco("Arco Moderno", 5, 1, 10, 1); // RECOMPENSA DO CERVO / JAVALI
    public static Item ARCOANTIGO = new Arco("Arco Antigo", 5, 2, 12, 1); // RECOMPENSA DO GOBLIN / FASE 2
    public static Item ARCORENOMEADO = new Arco("Arco Renomeado", 5, 2, 16, 1);
    public static Item ARCOESFERA = new Arco("Arco Esfera", 5, 2, 17, 1);
    public static Item ARCOARBALEST = new Arco("Arco Arbalest", 5, 3, 21, 1);
    public static Item ARCOSHINY = new Arco("Arco Shiny", 5, 3, 31, 1);
    
    public static Item CAMISA = new Armadura("Camiseta", 8, 1); // INICIO
    public static Item CAMISALONGA = new Armadura("Camiseta Longa",10, 1); // RECOMPENSA DO CERVO / JAVALI
    public static Item ARMADURAAZUL = new Armadura("Armadura Azul", 12, 1);
    public static Item ARMADURADOURADA = new Armadura("Armadura Dourada", 15, 2); // RECOMPENSA DO GOBLIN / FASE 2
    public static Item ARMADURADEPAUS = new Armadura("Armadura de Paus", 17, 2);
    public static Item ARMADURADEFERRO = new Armadura("Armadura de Ferro", 18, 3);
    public static Item ARMADURADEMETAL = new Armadura("Armadura de Metal", 20, 3);
    
    public static Item JABUTICABA = new Comida("Jabuticaba", 3);
    public static Item CENOURA = new Comida("Cenoura", 6);
    public static Item COXINHA = new Comida("Coxinha", 10);
    public static Item ESPINAFRE = new Comida("Espinafre", 15);
    public static Item CARNE = new Comida("Carne", 25);
    public static Item POCAO = new Comida("Poção dos Deuses", 75);

    
    
    
}
