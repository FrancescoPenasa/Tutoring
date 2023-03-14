/*
	Scrivere una funzione ricorsiva inverseSum(int n) che clacoli e 
	restituisca la somma dei reciproci da 1 a n.

	es. n = 4
	out (1/4 + 1/3 + 1/2 + 1) = ...
*/

#include <iostream>
using namespace std;

double inverseSum(int n){
	if (n == 1){
		return 1;
	} else {
		return inverseSum(n-1) + (double)1/n;
	}	

}

int main(){

	int n = 4;
	double val = 0;
	val = inverseSum(n);

	cout << "valore " << val << endl;
	return 0;
}