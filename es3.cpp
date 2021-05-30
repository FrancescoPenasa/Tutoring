/*
	Scrivere una funzione che, preso come parametro una stringa, rimuove i caratteri uguali vicini (lasciandone sempre uno).

	input s -> abbacdaeeef
	output  -> abacdaef

	Considerate il caso particolare in cui un carattere si ripeta per piu' di
	due volte.
*/

#include <iostream>
#include <string>
using namespace std;


string dd(string str){
	char tmp = str[0];
	
	for (int i = 1; i < str.size(); i++){
		if(str[i] == tmp){
			str[i] = '*';
		} else {
			tmp = str[i];
		}
	}
	return str;
}

int main(){

	string nome = "ABBBBBBBAAADASDAB";
	cout << nome << endl;

	nome = dd(nome);
	cout << nome << endl;

	for (int i = 0; i < nome.size(); i++){
		if (nome[i] != '*'){
			cout << nome[i];
		}
	}
	cout << endl;

	return 0;
}