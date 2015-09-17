package business.prodotti;

import java.util.*;



/**
 * 
 */
public interface IGestoreProdotti {

    /**
     * @return
     */
    public ArrayList<AProdotto> visualizzaCatalogo();

    /**
     * @param p
     */
    public void aggiungiProdotto(AProdotto p);

    /**
     * @param p
     */
    public void rimuoviProdotto(AProdotto p);

    /**
     * @param p
     */
    public void aggiornaProdotto(AProdotto p);

    /**restituisce null nel caso il Circuito desiderato non è presente nell'archivio
     * @param codice 
     * @return
     */
    public HashMap<String,Integer> ricercaCircuitoStampato(String codice);
    
    public void inserisciAssemblaggio(Assemblaggio ass);
    
    public void cancellaAssemblaggio(Assemblaggio ass);
    
    public void aggiornaAssemblaggio(Assemblaggio ass);

}