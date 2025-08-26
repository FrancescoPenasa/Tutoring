/// Main class: questa viene chiamata quando si esegue il programma, si parte sempre dal main.
/// Quando il programma parte viene implicitamente chiamato in questo modo
/// Main main = new Main();
/// per cui viene chiamato il costruttore della classe Main, perchè abbiamo istanziato la classe Main nella variabile main
public class Main {

    // costruttore del main, viene chiamato automaticamente quando si esegue il programma
    public static void main(String[] args) {

        // istanziamo la variabile c1 con un nuovo oggetto ContoCorrente, verrà usato il costruttore con come input una stringa
        ContoCorrente c1 = new ContoCorrente("intestatarione ");
    }
}