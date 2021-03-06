/*
	Scrivere una funzione isInRandom(...) che ritorna quante volte un 
	certo numero x e' presente all'interno di un vettore A (dichiarato come
	variabile locale nel main); aggiungere i parametri opportuni e testare la
	funzione nel main.
	Il numero x dev'essere un numero dichiarato nel main e inizializzato
	con un valore random compreso tra 1 e y richiesto all'utente.
*/

#include <iostream>
#include <cstdlib>

using namespace std;

int isInRandom(int vettore [], int DIM, int x){
	// init counter
	int count = 0;
	
	// scroll the vector
	for (int i = 0; i<DIM; i++){

		// check if is equal to x 
		if (vettore[i] == x){
			count++;
		}
	}

	// return the counter
	return count;
}


int main(){
	// define and init vector and the dimension
	const int DIM = 10;
	int A [DIM];

	// take the vector a as input
	for (int i = 0; i<DIM; i++){
		cout << "inserisci numero " << i <<   ": " ;
		cin >> A[i];
		cout << endl;
	}

	// random number
	int x = rand();
	cout << "x = " << x << endl;

	// limit random number
	int y;
	cout << "inserisci il valore y = ";
	cin >> y;

	x = x % y;
	x++;
	cout << "x = " << x << endl;

	// call isInRando and show result
	int result = isInRandom(A, DIM, x);
	cout << "result = " << result << endl;

	return 0;
}