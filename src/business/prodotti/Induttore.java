package business.prodotti;

/**
 * @author paolo maione
 */
public class Induttore extends AComponenteElettronico {

    public double getInduttanza() {
		return induttanza;
	}

	public void setInduttanza(double induttanza) {
		this.induttanza = induttanza;
	}

	public double getResistenza() {
		return resistenza;
	}

	public void setResistenza(double resistenza) {
		this.resistenza = resistenza;
	}

	/**
     * 
     */
    public Induttore() {
    }

    /**
     * 
     */
    private double induttanza;

    /**
     * 
     */
    private double resistenza;

    /**
     * @param codice 
     * @param produttore 
     * @param prezzo 
     * @param intervalloTensione 
     * @param incertezza 
     * @param induttanza 
     * @param resistenza
     */
    public Induttore(String codice, String produttore, double prezzo, String intervalloTensione, double incertezza, double induttanza, double resistenza) {
    	this.induttanza=induttanza;
        super.setIncertezzaMisura(incertezza);
        super.setIntervalloTensione(intervalloTensione);
        this.codice=codice;
        this.prezzo=prezzo;
        this.nomeProduttore=produttore;
        this.resistenza=resistenza;
    }

}