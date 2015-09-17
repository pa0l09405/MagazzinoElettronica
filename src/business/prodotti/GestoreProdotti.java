package business.prodotti;

import java.sql.SQLException;
import java.util.*;

import DAO.AssemblaggioDAO;

/**
 * @author paolo maione
 */
public class GestoreProdotti implements IGestoreProdotti {

   
	//implementazione Singleton 
	
    private static GestoreProdotti istance;

    protected  GestoreProdotti() {}

    /** restituisce l'istanza del singleton GestoreProdotti
     * @return
     */
    public static GestoreProdotti getIstance() {
        if(istance==null)
        	istance= new GestoreProdotti();
        return istance;
    }

	
    //Realizzazione interfaccia
    
    private ArrayList<AProdotto> listaProdotti;
    @Override
	public ArrayList<AProdotto> visualizzaCatalogo() {
		return listaProdotti;
	}

	@Override
	public void aggiungiProdotto(AProdotto p) {
		
	   }

	@Override
	public void rimuoviProdotto(AProdotto p) {
		}

	@Override
	public void aggiornaProdotto(AProdotto p) {
		}

	
	
	 
	@Override
	public HashMap<String, Integer> ricercaCircuitoStampato(String codice) {
		
		ArrayList<Assemblaggio> listaAssemblaggi= new ArrayList<Assemblaggio>();
		
		try {
			
			listaAssemblaggi=AssemblaggioDAO.leggi(codice);
				
		} catch (SQLException e) {
			System.out.println("Errore nella transazione, riprova...");
		}
		
		if(listaAssemblaggi.isEmpty())
			return null;
		
		HashMap<String, Integer> listaRisultati=new HashMap<String,Integer>();
		Iterator it = listaRisultati.entrySet().iterator();
		
		for(int i=0;i<listaAssemblaggi.size();i++){
			
			String  key=   listaAssemblaggi.get(i).getCodiceComponente();
			Integer value= listaAssemblaggi.get(i).getNumeroUnita();
			
		    listaRisultati.put(key, value);
		}
		 
		
          //deallocazione oggetti usati per la ricerca		
		  listaAssemblaggi.clear();  
		
		return listaRisultati;
		
		
	}

	@Override
	public void inserisciAssemblaggio(Assemblaggio ass) {
		try {
			AssemblaggioDAO.create(ass);
		} catch (SQLException e) {
			System.out.println("Errore nell'inserimento, riprova...");
			}
		
	}

	@Override
	public void cancellaAssemblaggio(Assemblaggio ass) {
		try {
			AssemblaggioDAO.delete(ass);
		} catch (SQLException e) {
			System.out.println("Errore nella cancellazione, riprova...");
		}
		
	}

	@Override
	public void aggiornaAssemblaggio(Assemblaggio ass) {
		try {
			AssemblaggioDAO.update(ass);
		} catch (SQLException e) {
			System.out.println("Errore nella transazione, riprova...");
		}
		
	}

}