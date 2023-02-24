#include <iostream>
#include <cstring>

using namespace std;
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 19:47
 */

const int N = 100010;

int n, m;
int a[N], b[N];

int main()
{
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i ++ ) scanf("%d", &a[i]);
    for (int i = 0; i < m; i ++ ) scanf("%d", &b[i]);

    int i = 0, j = 0;
    while (i < n && j < m)
    {
        if (a[i] == b[j]) i ++ ;
        j ++ ;
    }

    if (i == n) puts("Yes");
    else puts("No");

    return 0;
}

