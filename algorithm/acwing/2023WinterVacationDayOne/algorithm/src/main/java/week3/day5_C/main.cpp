#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

const int N = 33, M = 300010;

int n, x;
int w[N], f[M];

int main()
{
    scanf("%d%d", &n, &x);

    int sum = 0;
    for (int i = 0; i < n; i ++ )
    {
        scanf("%d", &w[i]);
        sum += w[i];
    }

    int m = sum - x;
    for (int i = 0; i < n; i ++ )
        for (int j = m; j >= w[i]; j -- )
            f[j] = max(f[j], f[j - w[i]] + w[i]);

    printf("%d\n", sum - f[m]);

    return 0;
}

