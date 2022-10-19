#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    vector<int>vetor;
    int n, b, c,d;
    
    cin>> n;
    for (int i =0; i < n; i++) {
        int temp;
        cin >> temp;
        vetor.push_back(temp);
    }
    
    cin >> b;
    vetor.erase(vetor.begin()+(b-1));
    
    cin >> c >> d;
    vetor.erase(vetor.begin()+(c-1),vetor.begin()+(d-1));
    
    cout << vetor.size() << endl;;
    for(int i = 0; i < vetor.size(); i++){
        cout << vetor[i] << " ";
    }
    
    return 0;
}
