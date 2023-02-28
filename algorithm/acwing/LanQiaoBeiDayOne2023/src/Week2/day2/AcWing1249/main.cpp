#include <iostream>
#include <cstring>
#include <algorithm>
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:19
 */
using namespace std;

const int N = 20010;

int n, m;
int p[N];

int find(int x)
{
    if (p[x] != x) p[x] = find(p[x]);
    return p[x];
}

int main()
{
    scanf("%d%d", &n, &m);
    for (int i = 1; i <= n; i ++ ) p[i] = i;
    while (m -- )
    {
        int a, b;
        scanf("%d%d", &a, &b);
        p[find(a)] = find(b);
    }

    scanf("%d", &m);
    while (m -- )
    {
        int a, b;
        scanf("%d%d", &a, &b);
        if (find(a) == find(b)) puts("Yes");
        else puts("No");
    }

    return 0;
}

