/*
	reciproci
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