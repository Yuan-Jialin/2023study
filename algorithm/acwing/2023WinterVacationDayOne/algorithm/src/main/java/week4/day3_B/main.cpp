#include <cstdio>
#define N 100005
#define max(a,b) ((a)>(b)?(a):(b))
using namespace std;

int n, x, tot, head[N], nxt[N], ver[N];

void insert (int x, int y)
{
    ver[++ tot] = y, nxt[tot] = head[x], head[x] = tot;
    return ;
}

int dfs (int x)
{
    int mx = 0, cnt = 0, now;
    for (int i = head[x], y; i; i = nxt[i])
    {
        now = dfs (y = ver[i]), mx = max (mx, now), cnt ++;
    }
    return mx + cnt;
}

int main ()
{
    scanf ("%d", &n);
    for (int i = 2; i <= n; i ++)
    {
        scanf ("%d", &x), insert (x, i);
    }
    printf ("%d", dfs (1));
    return 0;
}

