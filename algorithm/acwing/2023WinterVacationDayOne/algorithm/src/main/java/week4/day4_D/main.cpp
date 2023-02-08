#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

typedef long long LL;

int main()
{
    int a, b;
    scanf("%d%d", &a, &b);

    LL res = 1;
    while (a > 1 && b -- )
    {
        res *= a;
        if (res > 1e9)
        {
            res = -1;
            break;
        }
    }

    printf("%lld\n", res);
    return 0;
}

