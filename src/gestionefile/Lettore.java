package gestionefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gabriele Silla
 * @ 12/01/23
 */

public class Lettore extends Thread{
    String nomeFile;
    String nome;
    String password;
    
    public Lettore(String nomeFile){
        this.nomeFile = nomeFile;
    }
    /**
     * Legge il file senza tener conto del tipo di file
     * e lo mostra in output
     */
    public void leggi(){
        FileReader fr;
        int i; 
        try { 
            //1) apro il file
            fr = new FileReader(nomeFile);
            //2) leggo carattere per carattere e lo stampo 
            while ((i=fr.read()) != -1)
                System.out.print((char) i);
            System.out.print("\n\r");
            //3) chiudo il file
            fr.close();
        } catch (IOException ex) {
            System.err.println("Errore in lettura!");
        }
    }
    
    
    public String Inserisci(){
        String parola = null;
        InputStreamReader isr = new InputStreamReader(System.in);
        // Creare un oggetto BufferedReader per leggere linee di testo dall'InputStreamReader
        BufferedReader br = new BufferedReader(isr);
        try {
            // Chiedere all'utente di inserire una variabile
            System.out.print("Inserisci una variabile: ");
            // Leggere l'input da tastiera e assegnarlo a una variabile
            parola = br.readLine();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                // Chiudere BufferedReader e InputStreamReader
                br.close();
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return parola;
    }
    

    public void run(){
        leggi();
    }
}
