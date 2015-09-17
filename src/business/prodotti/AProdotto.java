package business.prodotti;

/**
 * @author paolo maione
 */
public abstract class AProdotto {

    public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNomeProduttore() {
		return nomeProduttore;
	}

	public void setNomeProduttore(String nomeProduttore) {
		this.nomeProduttore = nomeProduttore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	/**
     * 
     */
    public AProdotto() {
    }

    /**
     * 
     */
    protected String codice;

    /**
     * 
     */
    protected String nomeProduttore;

    /**
     * 
     */
    protected double prezzo;


}