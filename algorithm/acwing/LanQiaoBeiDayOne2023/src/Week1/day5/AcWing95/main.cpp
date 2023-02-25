#include <iostream>
#include <cstring>

using namespace std;
/**
 * @Author 袁佳林
 * @Description
 * @Date 2020/9/9 22:14
 */
const int INF = 100000;

char g[10][10];
int dx[5] = {0, -1, 0, 1, 0}, dy[5] = {0, 0, 1, 0, -1};

void turn(int x, int y)
{
    for (int i = 0; i < 5; i ++ )
    {
        int a = x + dx[i], b = y + dy[i];
        if (a >= 0 && a < 5 && b >= 0 && b < 5)
        {
            g[a][b] = '0' + !(g[a][b] - '0');
        }
    }
}

int work()
{
    int ans = INF;
    for (int k = 0; k < 1 << 5; k ++ )
    {
        int res = 0;
        char backup[10][10];
        memcpy(backup, g, sizeof g);

        for (int j = 0; j < 5; j ++ )
        {
            if (k >> j & 1)
            {
                res ++ ;
                turn(0, j);
            }
        }

        for (int i = 0; i < 4; i ++ )
            for (int j = 0; j < 5; j ++ )
                if (g[i][j] == '0')
                {
                    res ++ ;
                    turn(i + 1, j);
                }

        bool is_successful = true;
        for (int j = 0; j < 5; j ++ )
            if (g[4][j] == '0')
            {
                is_successful = false;
                break;
            }

        if (is_successful) ans = min(ans, res);

        memcpy(g, backup, sizeof g);
    }

    if (ans > 6) return -1;
    return ans;
}

int main()
{
    int T;
    cin >> T;
    while (T -- )
    {
        for (int i = 0; i < 5; i ++ ) cin >> g[i];
        cout << work() << endl;
    }
    return 0;
}

