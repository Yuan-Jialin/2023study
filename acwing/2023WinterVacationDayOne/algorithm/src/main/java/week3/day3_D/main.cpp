#include<bits/stdc++.h>
using namespace std;
const int N = 1010;
int a[N];
double d[N];
double f[N];
int n;
double getF(int x, double ave, double d){
    return (double)(x - ave)/sqrt(d);
}
int main(){
    cin >> n;
    double sum = 0;
    for(int i = 0; i < n; i++){
        cin >> a[i];
        sum += a[i];
    }
    double ave = sum/n;
    double d = 0;
    for(int i = 0; i < n; i++)    d += (a[i] - ave)*(a[i] - ave);
    d /= n;
    for(int i = 0; i < n; i++)    cout << getF(a[i], ave, d) << endl;
    return 0;
}
