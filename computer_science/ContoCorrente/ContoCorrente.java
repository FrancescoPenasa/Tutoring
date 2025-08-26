
// enum è una comoda rappresentazione per i numeri, dentro il computer RISPARMIO corrisponde a 0, UNIVERSITARIO a 1 e DEPOSITO a 2
// viene utilizzato in questo modo per comunicare al programmatore che lo usa che ci sono solo queste opzioni disponibili e per
// renderlo più facile da capire, pensa che macello se i tipi di conto fossero, 0, 1, 2, dovresti ricordarti a memoria a cosa corrispondono
enum TipoConto {
    RISPARMIO,
    UNIVERSITARIO,
    DEPOSITO
}



/// classe ContoCorrente
public class ContoCorrente {
    /// qui ci sono le proprietà della classe, di solito si mettono qui in cima, perchè è comodo vederle come prima cosa
    /// così sai che un contocorrente ha un intestatario, un saldo e un type
    private String intestatario;
    private double saldo;
    private TipoConto type;

/// costruttore, questo viene chiamato quando si istanzia la classe, in questo caso va istanziata con una stringa come argomento
/// quindi così ContoCorrente c1 = new Contocorrente("Bill Gates");
    ContoCorrente(String intestatario) {
        // crea un contocorrente con l'intestatario specificato, e mette di base il saldo a 0 e il type a RISPARMIO
        this.intestatario = intestatario;
        this.saldo = 0.0;
        this.type = TipoConto.RISPARMIO;
    }


    /// dopo il costruttore di solito si mettono i metodi della classe
    /// è utile specificare sempre la visibilità della funzione (public, private)
    /// (un metodo è una funzione di una classe)

    /// deposita i soldi sul conto
    public void deposito(double money){
        // questo è come dire
        // this.saldo = this.saldo + money;
        // quindi aggiungere al saldo attuale i soldi messi in input

        /*  esempio
        this.saldo = 100
        money = 10;
        this.saldo += money;

        this.saldo == 110
         */

        this.saldo += money;
    }

    // stessa cosa del deposito
    public void prelievo(double money) {
        if (money > this.saldo) {
            System.err.println("non hai abbastanza soldi barbone");
        } else {
            this.saldo -= money;
        }
        /// cosa succede se non metto else? ma metto solamente this.saldo -= money; fuori dal if??
    }

    // questo è un pochino complicato, ma con un po' di pratica si capisce
    // n.b. this.saldo = this.saldo * 1.05 è uguale a dire this.saldo = this.saldo + this.saldo * 0.05
    // è la magia della matematica
    public void aggiungi_interesse() {
        double interesse;
        if (this.saldo > 100 && this.saldo  < 1000) {
            interesse = 1.02;
        } else if (this.saldo > 1000 ) {
            interesse = 1.04;
        } else {
            interesse = 1.00;
        }

//        this.saldo = this.saldo * interesse;
        this.saldo *= interesse;
    }
}
