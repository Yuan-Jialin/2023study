#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

const int N = 200010;

int n;
int b[N];

int main()
{
    int T;
    scanf("%d", &T);
    while (T -- )
    {
        scanf("%d", &n);
        memset(b, 0, (n + 1) * 4);
        for (int i = 1; i <= n; i ++ )
        {
            int x;
            scanf("%d", &x);
            x = min(x, i);
            int l = i - x + 1, r = i;
            b[l] ++, b[r + 1] -- ;
        }
        for (int i = 1; i <= n; i ++ ) b[i] += b[i - 1];
        for (int i = 1; i <= n; i ++ ) printf("%d ", !!b[i]);
        puts("");
    }

    return 0;
}

