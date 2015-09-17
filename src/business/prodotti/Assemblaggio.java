package business.prodotti;

/**
 * @author paolo maione
 */
public class Assemblaggio {

    /**
     * costruttore vuoto
     */
    public Assemblaggio() {
    }


    /**costruttore
     * @param codCircuito 
     * @param codComponente 
     * @param n
     */
    public  Assemblaggio(String codCircuito, String codComponente, int n) {
       circuito.setCodice(codCircuito);
       if(codComponente.contains("COND")){
    	   componente=new Condensatore();
           componente.setCodice(codComponente);
           }
       else if(codComponente.contains("IND")){
    	   componente=new Induttore();
    	   componente.setCodice(codComponente);
       }
        else {
    	   componente=new Resistore();
    	   componente.setCodice(codComponente);
       }
       this.numUnitaImpiegate=n;
       
        
    }
    
    
    private int numUnitaImpiegate=0;
    
    //private String codiceComponente;
    //private String codiceCircuito;

    private AComponenteElettronico componente;
    private CircuitoStampato circuito=new CircuitoStampato();

    /**
     * @return
     */
    public int getNumeroUnita() {
        return this.numUnitaImpiegate;
        
    }

    

    /**
     * @return
     */
    public String getCodiceComponente() {
        
        return componente.getCodice();
    }

    /**
     * @return
     */
    public String getCodiceCircuito() {
       
        return circuito.getCodice();
    }

}