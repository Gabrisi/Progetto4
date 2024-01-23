package gestionefile;

/**
 *
 * @author MC
 * @version 12/01/23
 */
import java.io.*;
public class GestioneFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        Lettore Leggicose = new Lettore("user.json",nome, password); 
        lettore.start();
        //2)ELABORAZIONE
        System.out.println("scegliere un username ed una password");
       
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv");
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
    }
    
}
