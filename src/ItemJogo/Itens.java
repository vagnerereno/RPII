
package ItemJogo;

/**
 *
 * @author vagne
 */
public class Itens {
    
    // Itens de ataque
    public static Item ESPADA = new ItemMao ("Espadinha", 5, 1, 5, 3);
    public static Item ARCO = new ItemMao ("Arquinho", 5, 1, 5, 3);
    public static Item CAJADO = new ItemMao ("Cajadinho", 5, 1, 5, 3);
    
    // Armaduras
    public static Item CAMISA = new Armadura("Camiseta", 8, 1); // INICIO
    public static Item CAMISALONGA = new Armadura("Camiseta Longa",10, 1); // RECOMPENSA DO CERVO / JAVALI
    public static Item ARMADURAAZUL = new Armadura("Armadura Azul", 12, 1);
    public static Item ARMADURADOURADA = new Armadura("Armadura Dourada", 15, 2); // RECOMPENSA DO GOBLIN / FASE 2
    public static Item ARMADURADEPAUS = new Armadura("Armadura de Paus", 17, 2);
    public static Item ARMADURADEFERRO = new Armadura("Armadura de Ferro", 18, 3);
    public static Item ARMADURADEMETAL = new Armadura("Armadura de Metal", 20, 3);
    
    // Regeneração
    public static Item JABUTICABA = new Comida("Jabuticaba", 3);
    public static Item CENOURA = new Comida("Cenoura", 6);
    public static Item COXINHA = new Comida("Coxinha", 10);
    public static Item ESPINAFRE = new Comida("Espinafre", 15);
    public static Item CARNE = new Comida("Carne", 25);
    public static Item POCAO = new Comida("Poção dos Deuses", 75);

    
    
    
}
