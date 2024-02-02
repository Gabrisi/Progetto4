package gestionefile;

/**
 *
 * @author Silla Gabriele
 * @version 12/01/23
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GestioneFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //dichiarazione vaariabili
        String password = null;
        String nome = null;
        
        
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        nome = lettore.Inserisci();
        password = lettore.Inserisci();
        lettore.start();
        //2)ELABORAZIONE
        System.out.println("scegliere un username ed una password");
       
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv");
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
        scrittore.scriviDati(nome, password);
        
    }
}
