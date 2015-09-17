package business.utenti;

/**
 * 
 */
public interface IGestoreUtenti {

    /**
     * @param nome 
     * @param cognome 
     * @param cf 
     * @param email 
     * @param indirizzo
     */
    public void RegistrazioneSistema(String nome, String cognome, String cf, String email, String indirizzo);

    /**
     * @param user 
     * @param pssw
     */
    public void autenticazione(String user, String pssw);

}