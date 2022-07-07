#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve(){
	
	int n, resto, maior, contador = 0;
	cin>>n;

	while(n != 0){

		resto = n%2;
		n = n/2;
		
		if(resto == 1){
			contador++;
			if(maior < contador){
				maior = contador;
			}
		}
		else{
			contador = 0;
		}
	}
	
	cout << maior << endl;
}


int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);

	solve();
}

