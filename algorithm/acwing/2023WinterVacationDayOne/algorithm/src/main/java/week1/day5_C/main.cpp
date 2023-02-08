#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

typedef long long LL;

const int N = 1000010;

LL b[N], c[N], rk[N];
LL n, x;
LL cxk, ji;

int main()
{
    cin >> n;
    for (int i = 1; i <= n; i ++ )   cin >> c[i], b[c[i]] ++;

    sort(c + 1, c + n + 1);
    int len = unique(c + 1, c + n + 1) - c - 1;

    for (int i = 1; i <= len; i ++ ) rk[c[i]] = rk[c[i - 1]] + b[c[i - 1]];

    for (int i = 1; i <= len; i ++ )
    {
        if ((LL)(c[i] * (n - rk[c[i]])) > cxk)
            cxk = (LL)(c[i] * (n - rk[c[i]])), ji = c[i];
    }

    cout << cxk << ' ' << ji << endl;
    return 0;
}

