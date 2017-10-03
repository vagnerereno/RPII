package ItemJogo;

/**
 *
 * @author vagne
 */
public class Itens {

    // Itens de ataque
    private static Item ESPADA = new ItemMao("Espada", 5, 1, 5, 3); // ESPADA RECEBIDA QUANDO ABRE A DISPENSA NO INÍCIO DO JOGO
    private static Item ESPADAJUSTICEIRA = new ItemMao("Espada Justiceira", 5, 1, 5, 3); // RECOMPENSA DOS BOSS 1
    private static Item ESPADAMAGICA = new ItemMao("Espada Magica", 5, 1, 5, 3); // RECOMPENSA DO GLOBIN FASE 2
    private static Item ESPADADRAGAO = new ItemMao("Espada Dragão", 5, 1, 5, 3);
    
    private static Item ARCO = new ItemMao("Arco", 5, 1, 5, 3); // ARCO RECEBIDO QUANDO ABRE A DISPENSA NO INÍCIO DO JOGO
    private static Item ARCOANTIGO = new ItemMao("Arco Antigo", 5, 1, 5, 3); // RECOMPENSA DOS BOSS 1
    private static Item ARCOARBALEST = new ItemMao("Arco Arbalest", 5, 1, 5, 3); // RECOMPENSA DO GLOBIN FASE 2
    private static Item ARCOBOBLEE = new ItemMao("Arco Bob Lee", 5, 1, 5, 3);
    
    private static Item CAJADO = new ItemMao("Cajado", 5, 1, 5, 3); // CAJADO RECEBIDO QUANDO ABRE A DISPENSA NO INÍCIO DO JOGO
    private static Item CAJADOESMERALDA = new ItemMao("Cajado Esmeralda", 5, 1, 5, 3); // RECOMPENSA DOS BOSS 1
    private static Item CAJADODEPAUS = new ItemMao("Cajado de Paus", 5, 1, 5, 3); // RECOMPENSA DO GOBLIN / FASE 2
    private static Item CAJADODOSANOES = new ItemMao("Cajado Dos Anoes", 5, 1, 5, 3);

    // Armaduras
    private static Item CAMISA = new Armadura("Camiseta", 8, 1); // ARMADURA RECEBIDA QUANDO ABRE A DISPENSA NO INÍCIO DO JOGO
    private static Item CAMISALONGA = new Armadura("Camiseta Longa", 10, 1); // RECOMPENSA DOS BOSS 1
    private static Item ARMADURAAZUL = new Armadura("Armadura Azul", 12, 1); //  RECOMPENSA DO GOBLIN / FASE 2
    private static Item ARMADURADOURADA = new Armadura("Armadura Dourada", 15, 2); //
    private static Item ARMADURADEPAUS = new Armadura("Armadura de Paus", 17, 2);
    private static Item ARMADURADEFERRO = new Armadura("Armadura de Ferro", 18, 3);
    private static Item ARMADURADEMETAL = new Armadura("Armadura de Metal", 20, 3);

    // Regeneração
    private static Item JABUTICABA = new Comida("Jabuticaba", 3);
    private static Item CENOURA = new Comida("Cenoura", 6);
    private static Item COXINHA = new Comida("Coxinha", 10);
    private static Item ESPINAFRE = new Comida("Espinafre", 15);
    private static Item CARNE = new Comida("Carne", 25);
    private static Item POCAO = new Comida("Poção dos Deuses", 75);

    
    
    /**
     * @return the ESPADA
     */
    public static Item getESPADA() {
        return ESPADA;
    }

    /**
     * @param aESPADA the ESPADA to set
     */
    public static void setESPADA(Item aESPADA) {
        ESPADA = aESPADA;
    }

    /**
     * @return the ESPADAJUSTICEIRA
     */
    public static Item getESPADAJUSTICEIRA() {
        return ESPADAJUSTICEIRA;
    }

    /**
     * @param aESPADAJUSTICEIRA the ESPADAJUSTICEIRA to set
     */
    public static void setESPADAJUSTICEIRA(Item aESPADAJUSTICEIRA) {
        ESPADAJUSTICEIRA = aESPADAJUSTICEIRA;
    }

    /**
     * @return the ESPADAMAGICA
     */
    public static Item getESPADAMAGICA() {
        return ESPADAMAGICA;
    }

    /**
     * @param aESPADAMAGICA the ESPADAMAGICA to set
     */
    public static void setESPADAMAGICA(Item aESPADAMAGICA) {
        ESPADAMAGICA = aESPADAMAGICA;
    }

    /**
     * @return the ESPADADRAGAO
     */
    public static Item getESPADADRAGAO() {
        return ESPADADRAGAO;
    }

    /**
     * @param aESPADADRAGAO the ESPADADRAGAO to set
     */
    public static void setESPADADRAGAO(Item aESPADADRAGAO) {
        ESPADADRAGAO = aESPADADRAGAO;
    }

    /**
     * @return the ARCO
     */
    public static Item getARCO() {
        return ARCO;
    }

    /**
     * @param aARCO the ARCO to set
     */
    public static void setARCO(Item aARCO) {
        ARCO = aARCO;
    }

    /**
     * @return the ARCOANTIGO
     */
    public static Item getARCOANTIGO() {
        return ARCOANTIGO;
    }

    /**
     * @param aARCOANTIGO the ARCOANTIGO to set
     */
    public static void setARCOANTIGO(Item aARCOANTIGO) {
        ARCOANTIGO = aARCOANTIGO;
    }

    /**
     * @return the ARCOARBALEST
     */
    public static Item getARCOARBALEST() {
        return ARCOARBALEST;
    }

    /**
     * @param aARCOARBALEST the ARCOARBALEST to set
     */
    public static void setARCOARBALEST(Item aARCOARBALEST) {
        ARCOARBALEST = aARCOARBALEST;
    }

    /**
     * @return the ARCOBOBLEE
     */
    public static Item getARCOBOBLEE() {
        return ARCOBOBLEE;
    }

    /**
     * @param aARCOBOBLEE the ARCOBOBLEE to set
     */
    public static void setARCOBOBLEE(Item aARCOBOBLEE) {
        ARCOBOBLEE = aARCOBOBLEE;
    }

    /**
     * @return the CAJADO
     */
    public static Item getCAJADO() {
        return CAJADO;
    }

    /**
     * @param aCAJADO the CAJADO to set
     */
    public static void setCAJADO(Item aCAJADO) {
        CAJADO = aCAJADO;
    }

    /**
     * @return the CAJADOESMERALDA
     */
    public static Item getCAJADOESMERALDA() {
        return CAJADOESMERALDA;
    }

    /**
     * @param aCAJADOESMERALDA the CAJADOESMERALDA to set
     */
    public static void setCAJADOESMERALDA(Item aCAJADOESMERALDA) {
        CAJADOESMERALDA = aCAJADOESMERALDA;
    }

    /**
     * @return the CAJADODEPAUS
     */
    public static Item getCAJADODEPAUS() {
        return CAJADODEPAUS;
    }

    /**
     * @param aCAJADODEPAUS the CAJADODEPAUS to set
     */
    public static void setCAJADODEPAUS(Item aCAJADODEPAUS) {
        CAJADODEPAUS = aCAJADODEPAUS;
    }

    /**
     * @return the CAJADODOSANOES
     */
    public static Item getCAJADODOSANOES() {
        return CAJADODOSANOES;
    }

    /**
     * @param aCAJADODOSANOES the CAJADODOSANOES to set
     */
    public static void setCAJADODOSANOES(Item aCAJADODOSANOES) {
        CAJADODOSANOES = aCAJADODOSANOES;
    }

    /**
     * @return the CAMISA
     */
    public static Item getCAMISA() {
        return CAMISA;
    }

    /**
     * @param aCAMISA the CAMISA to set
     */
    public static void setCAMISA(Item aCAMISA) {
        CAMISA = aCAMISA;
    }

    /**
     * @return the CAMISALONGA
     */
    public static Item getCAMISALONGA() {
        return CAMISALONGA;
    }

    /**
     * @param aCAMISALONGA the CAMISALONGA to set
     */
    public static void setCAMISALONGA(Item aCAMISALONGA) {
        CAMISALONGA = aCAMISALONGA;
    }

    /**
     * @return the ARMADURAAZUL
     */
    public static Item getARMADURAAZUL() {
        return ARMADURAAZUL;
    }

    /**
     * @param aARMADURAAZUL the ARMADURAAZUL to set
     */
    public static void setARMADURAAZUL(Item aARMADURAAZUL) {
        ARMADURAAZUL = aARMADURAAZUL;
    }

    /**
     * @return the ARMADURADOURADA
     */
    public static Item getARMADURADOURADA() {
        return ARMADURADOURADA;
    }

    /**
     * @param aARMADURADOURADA the ARMADURADOURADA to set
     */
    public static void setARMADURADOURADA(Item aARMADURADOURADA) {
        ARMADURADOURADA = aARMADURADOURADA;
    }

    /**
     * @return the ARMADURADEPAUS
     */
    public static Item getARMADURADEPAUS() {
        return ARMADURADEPAUS;
    }

    /**
     * @param aARMADURADEPAUS the ARMADURADEPAUS to set
     */
    public static void setARMADURADEPAUS(Item aARMADURADEPAUS) {
        ARMADURADEPAUS = aARMADURADEPAUS;
    }

    /**
     * @return the ARMADURADEFERRO
     */
    public static Item getARMADURADEFERRO() {
        return ARMADURADEFERRO;
    }

    /**
     * @param aARMADURADEFERRO the ARMADURADEFERRO to set
     */
    public static void setARMADURADEFERRO(Item aARMADURADEFERRO) {
        ARMADURADEFERRO = aARMADURADEFERRO;
    }

    /**
     * @return the ARMADURADEMETAL
     */
    public static Item getARMADURADEMETAL() {
        return ARMADURADEMETAL;
    }

    /**
     * @param aARMADURADEMETAL the ARMADURADEMETAL to set
     */
    public static void setARMADURADEMETAL(Item aARMADURADEMETAL) {
        ARMADURADEMETAL = aARMADURADEMETAL;
    }

    /**
     * @return the JABUTICABA
     */
    public static Item getJABUTICABA() {
        return JABUTICABA;
    }

    /**
     * @param aJABUTICABA the JABUTICABA to set
     */
    public static void setJABUTICABA(Item aJABUTICABA) {
        JABUTICABA = aJABUTICABA;
    }

    /**
     * @return the CENOURA
     */
    public static Item getCENOURA() {
        return CENOURA;
    }

    /**
     * @param aCENOURA the CENOURA to set
     */
    public static void setCENOURA(Item aCENOURA) {
        CENOURA = aCENOURA;
    }

    /**
     * @return the COXINHA
     */
    public static Item getCOXINHA() {
        return COXINHA;
    }

    /**
     * @param aCOXINHA the COXINHA to set
     */
    public static void setCOXINHA(Item aCOXINHA) {
        COXINHA = aCOXINHA;
    }

    /**
     * @return the ESPINAFRE
     */
    public static Item getESPINAFRE() {
        return ESPINAFRE;
    }

    /**
     * @param aESPINAFRE the ESPINAFRE to set
     */
    public static void setESPINAFRE(Item aESPINAFRE) {
        ESPINAFRE = aESPINAFRE;
    }

    /**
     * @return the CARNE
     */
    public static Item getCARNE() {
        return CARNE;
    }

    /**
     * @param aCARNE the CARNE to set
     */
    public static void setCARNE(Item aCARNE) {
        CARNE = aCARNE;
    }

    /**
     * @return the POCAO
     */
    public static Item getPOCAO() {
        return POCAO;
    }

    /**
     * @param aPOCAO the POCAO to set
     */
    public static void setPOCAO(Item aPOCAO) {
        POCAO = aPOCAO;
    }
}
