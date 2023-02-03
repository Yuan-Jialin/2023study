#include <iostream>
#include <cstring>
#include <algorithm>

#define x first
#define y second

using namespace std;

typedef pair<int, int> PII;

const int N = 1010, M = 55, INF = 1e8;

int n, m, k;
PII tree[N];
int b[M][M];

int main()
{
    scanf("%d%d%d", &n, &m, &k);
    for (int i = 0; i < n; i ++ )
        scanf("%d%d", &tree[i].x, &tree[i].y);

    int tc = 0;
    for (int i = k; i >= 0; i -- )
        for (int j = 0; j <= k; j ++ )
        {
            scanf("%d", &b[i][j]);
            tc += b[i][j];
        }

    int res = 0;
    for (int i = 0; i < n; i ++ )
    {
        int sx = tree[i].x, sy = tree[i].y;
        if (sx + k > m || sy + k > m) continue;
        int cnt = 0;
        for (int j = 0; j < n; j ++ )
        {
            int x = tree[j].x, y = tree[j].y;
            if (x >= sx && x - sx <= k && y >= sy && y - sy <= k)
            {
                if (!b[x - sx][y - sy]) cnt = -INF;
                else cnt ++ ;
            }
        }
        if (cnt == tc) res ++ ;
    }

    printf("%d\n", res);
    return 0;
}
