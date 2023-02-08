#include <bits/stdc++.h>
using namespace std;

int main() {
    char c; int n;
    cin >> c >> n;
    int a = 1189, b = 841;
    while (n --) {
        a /= 2;
        if (a < b) swap(a, b);
    }

    cout << a << endl << b;
    return 0;
}