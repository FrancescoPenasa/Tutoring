/*
	isInRandom();
*/

#include <iostream>
#include <cstdlib>

using namespace std;


int main(){

	// random number
	int x = rand();
	cout << "x = " << x << endl;

	// limit random number
	int y;
	cout << "inserisci il valore y = ";
	cin >> y;

	x = x % y;
	x = x + 1;
	cout << "x = " << x << endl;

	return 0;
}