package UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

import business.prodotti.GestoreProdotti;
import business.prodotti.IGestoreProdotti;

/**
 * @author paolo maione
 */
public class UIUtenteRegistrato {
	
	private static IGestoreProdotti gestoreprodotti;

    public static void ricercaCircuitoByCodice(){
    	
    	System.out.println("Benvenuto utente registrato. Digita il codice alfanumerico del circuito da ricercare : ");
    	InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		String codice="";
		
		try {
			codice = bufferTastiera.readLine();
		} catch (IOException e) {
			System.out.println("Errore nella lettura, riprovare : ");
			e.printStackTrace();
		}
        
		if(codice.isEmpty())
			System.out.println("Input non rilevato. Riprovare ...");
		else{
	    if(codice.contains(";") || codice.contains("-") || codice.contains(",") || codice.contains(".") || codice.contains(":"))
			System.out.println("Formato codice non valido. Attento a non immettere caratteri speciali o non ammessi");
		else{
		
		
		
		gestoreprodotti=GestoreProdotti.getIstance();
		
		HashMap<String, Integer>listaRisultati=new HashMap<String, Integer>();
		listaRisultati=gestoreprodotti.ricercaCircuitoStampato(codice);
		
		if(listaRisultati==null)
			System.out.println("\n ----Nessun Risultato nel catalogo.");
		else{
			System.out.println("---Risultati ricerca : \n\n Circuito Stampato codice '"+codice+"'.\n  Dettagli assemblaggio : \n");
			for(Entry<String, Integer> entry : listaRisultati.entrySet()) {
			    System.out.println("Codice componente : "+entry.getKey()+" ---- unità impiegate :"+entry.getValue());
				System.out.println("");
			}
			
		
		
		
		//chiusura risorse 
		
		listaRisultati.clear();
		}
		
		}
		
		}
		
		try {
			bufferTastiera.close();
			tastiera.close();
		} catch (IOException e) {
			
			System.out.println("\n\n !! Errore nella chiusura delle risorse.");
		}
		
		
		
		
		
		
    }
    
    public static void visualizzaCatalogo(){}
    
    public static void inserisciOrdine(){}
  

}