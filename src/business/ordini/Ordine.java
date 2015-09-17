package business.ordini;

import java.util.*;

import business.utenti.Utente;

/**
 * @author paolo maione
 */
public class Ordine {

    public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	/**
     * 
     */
    public Ordine() {
    }

    /**
     * 
     */
    private Date dataEmissione;   


    /**
     * 
     */
    protected ArrayList<DettaglioOrdine> dettaglioOrdine;
    
    public ArrayList<DettaglioOrdine> getDettagliAssociatiAOrdine(){
    	return dettaglioOrdine;
    }

    /**
     * 
     */
    protected Utente acquirente;

    /**
     * @param data 
     * @param listaCodProdotti 
     * @param prezzo 
     * @param qtaRichiestePerProdotto
     */
    public  Ordine(Date data, String[] listaCodProdotti, int prezzo, int[] qtaRichiestePerProdotto) {
        this.dataEmissione=data;
        dettaglioOrdine= new ArrayList<DettaglioOrdine>();
        for(int i=0; i<listaCodProdotti.length;i++){
        	dettaglioOrdine
        	         .add(  new DettaglioOrdine(prezzo, listaCodProdotti[i], qtaRichiestePerProdotto[i]));
        }
    }

    /**
     * @param codProdotto 
     * @param qtaRichieste
     */
    public void aggiornaOrdine(String codProdotto, int qtaRichieste) {
        
    }

    /**
     * @return
     */
    public Utente getAcquirente() {
        
        return acquirente;
    }

}