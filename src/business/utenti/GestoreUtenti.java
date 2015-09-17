package business.utenti;

/**
 * @author paolo maione
 */
public class GestoreUtenti implements IGestoreUtenti {

   
    private static GestoreUtenti istance;

    protected  GestoreUtenti() {}

    /**
     * @return
     */
    public static GestoreUtenti getIstance() {
        if(istance==null)
        	istance=new GestoreUtenti();
        return istance;
        
    }

	@Override
	public void RegistrazioneSistema(String nome, String cognome, String cf,
			String email, String indirizzo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autenticazione(String user, String pssw) {
		// TODO Auto-generated method stub
		
	}

}