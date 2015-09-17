package business.prodotti;

/**
 * @author paolo maione
 */
public abstract class AComponenteElettronico extends AProdotto {

    
    public AComponenteElettronico() {}

    /**
     * 
     */
    protected String intervalloTensione;

    /**
     * 
     */
    protected double incertezzaMisura;

	public String getIntervalloTensione() {
		return intervalloTensione;
	}

	public void setIntervalloTensione(String intervalloTensione) {
		this.intervalloTensione = intervalloTensione;
	}

	public double getIncertezzaMisura() {
		return incertezzaMisura;
	}

	public void setIncertezzaMisura(double incertezzaMisura) {
		this.incertezzaMisura = incertezzaMisura;
	}

   

}