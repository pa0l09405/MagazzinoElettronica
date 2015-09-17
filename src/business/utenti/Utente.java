package business.utenti;

/**
 * @author paolo maione
 */
public class Utente {

    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}


	public void setIndirizzoSpedizione(String indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	/**
     * 
     */
    public Utente() {
    }

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private String cognome;

    /**
     * 
     */
    private String codiceFiscale;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String indirizzoSpedizione;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;


    /**
     * @param nome 
     * @param cognome 
     * @param codiceFiscale 
     * @param email 
     * @param indirizzoSpedizione 
     * @param user 
     * @param psw
     */
    public  Utente(String nome, String cognome, String codiceFiscale, String email, String indirizzoSpedizione, String user, String psw) {
        this.codiceFiscale=codiceFiscale;
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.indirizzoSpedizione=indirizzoSpedizione;
        this.username=user;
        this.password=psw;
    }

}