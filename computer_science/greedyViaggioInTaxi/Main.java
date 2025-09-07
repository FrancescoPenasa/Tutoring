import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/// https://training.olinfo.it/task/ois_taxi

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
//        InputStream fin = System.in;
//        OutputStream fout = System.out;

        InputStream fin = new FileInputStream("src/data/input.txt");
//        InputStream fin = new FileInputStream("C:\\Users\\f.penasa\\IdeaProjects\\test\\src\\data\\input.txt");
        OutputStream fout = new FileOutputStream("output.txt");

        Scanner scanner = new Scanner(fin);
        PrintStream prnt = new PrintStream(fout);

        /// ===== metodo 1 ==== ///
        System.out.println("metodo 1");
        /// prende la linea come stringa, fa split della stringa, quindi divide i valore separati da uno spazio

        // first line, take size of array
        int N = Integer.parseInt(scanner.nextLine());

        // other lines
        int[] c = new int[N]; // create an array of dimension N
        while(scanner.hasNextLine()) {
            // scanner.nextLine() => 10 15 12 11
            String[] numbers = scanner.nextLine().split(" ");
            // numbers => ["10", "15", "12", "11"]

            for (int i = 0; i<numbers.length; i++) {
                int value = Integer.valueOf(numbers[i]);
                System.out.println(value);
                c[i] =  value;
            }
           // c => [10, 15, 12, 11]
        }

        /// ==== metodo 2 ==== //
        System.out.println("metodo 2");
        fin = new FileInputStream("src/data/input.txt");
        scanner = new Scanner(fin); // reset dello scanner per farlo ripartire dalla linea 0
        int N_ = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> c_ = new ArrayList<>();
        while(scanner.hasNextInt()){ // iterate on integers, legge un integer alla volta
            int value = scanner.nextInt();
            System.out.println(value);
            c_.add(value);
        }

        // adesso ho che N contiene il numero di città da attraversare
        // e c contiene i valori dei taxi

        /// ==== qui l'algoritmo vero e proprio ///
        int costo_totale = 0;

        /// metodo 1 ///
        for (int i = 0; i<N; i++) {
            int tmp = c[i];
            System.out.println("guardo: c[" + i + "] = " + c[i]  );
            for (int j = i; j>=0; j--){
                tmp = Math.min(tmp, c[j]-(j-i) );
                System.out.println("minimo tra: c[" + i + "] = " + c[i] + " e c[" + j + "] = " +c[j] + " - " + (j-i) );
            }
            System.out.println("preso " + tmp);
            costo_totale = costo_totale + tmp;
        }

        System.out.println("result " + costo_totale);

        /// metodo 2: che è più chiaro ///
        costo_totale = 0;
        for (int i = 0; i<N; i++) {
            int tmp = c[i];
            System.out.println("guardo: c[" + i + "] = " + c[i]  );
            for (int j = 0; j<i ; j++){
                tmp = Math.min(tmp, c[j]+i );
                System.out.println("minimo tra: c[" + i + "] = " + c[i] + " e c[" + j + "] = " +c[j] + " + " + i );
            }
            System.out.println("preso " + tmp);
            costo_totale = costo_totale + tmp;
        }

        // output
        System.out.println("result " + costo_totale);
        prnt.println(costo_totale);
        fout.flush();

    }
}