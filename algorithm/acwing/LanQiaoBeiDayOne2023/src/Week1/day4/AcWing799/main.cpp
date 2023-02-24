#include <iostream>

using namespace std;
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 14:57
 */

const int N = 100010;

int n;
int q[N], s[N];

int main()
{
    scanf("%d", &n);
    for (int i = 0; i < n; i ++ ) scanf("%d", &q[i]);

    int res = 0;
    for (int i = 0, j = 0; i < n; i ++ )
    {
        s[q[i]] ++ ;
        while (j < i && s[q[i]] > 1) s[q[j ++ ]] -- ;
        res = max(res, i - j + 1);
    }

    cout << res << endl;

    return 0;
}

