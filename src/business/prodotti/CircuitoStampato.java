package business.prodotti;

import java.util.*;

/**
 * @author paolo maione
 */
public class CircuitoStampato extends AProdotto {

    
    public CircuitoStampato(){}
    

    /**
     * @return
     */
    public Set<Assemblaggio> getComponenti() {
        
        return null;
    }

    /**
     * @param cod 
     * @param prod 
     * @param prezzo
     */
    public CircuitoStampato(String cod, String prod, double prezzo) {
        super.setCodice(cod);
        super.setNomeProduttore(prod);
        super.setPrezzo(prezzo);
    }

    

}