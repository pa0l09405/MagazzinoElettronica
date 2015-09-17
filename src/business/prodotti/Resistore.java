package business.prodotti;

/**
 * @author paolo maione
 */
public class Resistore extends AComponenteElettronico {

    public double getResistenza() {
		return resistenza;
	}

	public void setResistenza(double resistenza) {
		this.resistenza = resistenza;
	}

	/**
     * 
     */
    public Resistore() {
    }

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
     * @param resistenza
     */
    public Resistore(String codice, String produttore, double prezzo, String intervalloTensione, double incertezza, double resistenza) {
    	this.resistenza=resistenza;
        super.setIncertezzaMisura(incertezza);
        super.setIntervalloTensione(intervalloTensione);
        this.codice=codice;
        this.prezzo=prezzo;
        this.nomeProduttore=produttore;
    }

}