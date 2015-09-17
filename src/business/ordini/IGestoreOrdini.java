package business.ordini;

import java.util.Set;

/**
 * 
 */
public interface IGestoreOrdini {

    /**
     * @param ordine
     */
    public void aggiungiOrdine(Ordine ordine);

    /**
     * @param id 
     * @return
     */
    public Set<Ordine> visionaOrdini(int id);

}