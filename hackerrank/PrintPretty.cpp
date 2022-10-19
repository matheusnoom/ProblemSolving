#include <iostream>
#include <iomanip> 
using namespace std;

int main() {
	int T; cin >> T;
	cout << setiosflags(ios::uppercase);
	cout << setw(0xf) << internal;
	while(T--) {
		double A; cin >> A;
		double B; cin >> B;
		double C; cin >> C;
        
        cout << setw(0) << "0x" << hex << nouppercase << (long long)A << endl;

        cout << right << setw(15) << setfill('_') << fixed << showpos <<setprecision(2);
        cout << B << endl;

        cout << scientific <<  noshowpos << uppercase << setprecision(9); // formatting
        cout << C << endl;

	}
	return 0;

}
