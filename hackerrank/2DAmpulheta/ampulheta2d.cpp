#include <bits/stdc++.h>
using namespace std;



int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);

	int arr[6][6];
	int maior, aux = 0;

	for(int i = 0; i <6; ++i){
		for(int j=0; j< 6; ++j){	
			cin >> arr[i][j];
		}
	}

	for(int i = 0; i < 4; i++){
		for(int j = 0;j < 4; j++){
			aux = 0;

			aux += arr[i][j];
			aux += arr[i][j + 1];
			aux += arr[i][j + 2];
			aux += arr[i + 1][j + 1];
			aux += arr[i + 2][j];
			aux += arr[i + 2][j + 1];
			aux += arr[i + 2][j+ 2];

			if(aux > maior){
				maior = aux;
			}
		}
	}
	cout << maior << endl;
}
