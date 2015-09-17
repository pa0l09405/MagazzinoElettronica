package business.prodotti;

/**
 * @author paolo maione
 */
public class Condensatore extends AComponenteElettronico {

    public double getCapacita() {
		return capacita;
	}

	public void setCapacita(double capacita) {
		this.capacita = capacita;
	}

	/**
     * 
     */
    public Condensatore() {
    }

    /**
     * 
     */
    private double capacita;

    /**costruttore
     * @param codice 
     * @param produttore 
     * @param prezzo 
     * @param intervalloTensione 
     * @param incertezza 
     * @param capacita
     */
    public Condensatore(String codice, String produttore, double prezzo, String intervalloTensione, double incertezza, double capacita) {
        this.capacita=capacita;
        super.setIncertezzaMisura(incertezza);
        super.setIntervalloTensione(intervalloTensione);
        this.codice=codice;
        this.prezzo=prezzo;
        this.nomeProduttore=produttore;
    }

}