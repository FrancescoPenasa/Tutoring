/*
	file di esempio del funzionamento della funzione random
*/

#include <iostream>	// per il print
#include <cstdlib>	// per rand();

using namespace std;


int main(){

	// random number
	int x = rand();					// define and init a random number
	cout << "x = " << x << endl;	

	// limit random number
	int y;				
	cout << "inserisci il valore y = ";
	cin >> y;

	x = x % y;						// put upper limit to the random number
	x = x + 1;						// add a minimum value
	cout << "x = " << x << endl;

	return 0;
}