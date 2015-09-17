package business.ordini;

import java.util.*;

/**
 * @author paolo maione
 */
public class GestoreOrdini implements IGestoreOrdini {

   
    private static GestoreOrdini istance;

    protected  GestoreOrdini() {}

    /**
     * @return
     */
    public static GestoreOrdini getIstance() {
        if(istance==null)
        	istance=new GestoreOrdini();
        return istance;
        
    }

	@Override
	public void aggiungiOrdine(Ordine ordine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Ordine> visionaOrdini(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}