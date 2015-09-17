package business.ordini;

import business.prodotti.AProdotto;

/**
 * @author paolo maione
 */
public class DettaglioOrdine {

    /**
     * 
     */
    public DettaglioOrdine() {
    }

    /**
     * 
     */
    private int qtaProdottoRichiesta;

    /**
     * 
     */
    private int prezzoUnitario;

    public int getQtaProdottoRichiesta() {
		return qtaProdottoRichiesta;
	}

	public void setQtaProdottoRichiesta(int qtaProdottoRichiesta) {
		this.qtaProdottoRichiesta = qtaProdottoRichiesta;
	}

	public int getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(int prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	/**
     * 
     */
    private AProdotto prodottoOrdinato;

    /** restituisce il codice alfanumerico del prodotto associato all'ordine
     * @return
     */
    public String getProdottoOrdinato() {
      
        return prodottoOrdinato.getCodice();
    }

    /**
     * @param prezzo 
     * @param codprodotto 
     * @param qta
     */
    public  DettaglioOrdine(int prezzo, String codprodotto, int qta) {
        this.prezzoUnitario=prezzo;
        this.qtaProdottoRichiesta=qta;
        this.prodottoOrdinato.setCodice(codprodotto);
    }

}