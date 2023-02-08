#include <iostream>
#include <cstring>
#include <algorithm>
#include <cmath>

using namespace std;

typedef long long LL;

int main()
{
    int k;
    scanf("%d", &k);

    while (k -- )
    {
        LL n, d, e;
        scanf("%lld%lld%lld", &n, &d, &e);
        LL m = n - e * d + 2;
        LL dt = m * m - 4 * n;
        LL r = sqrt(dt);

        if (dt < 0 || r * r != dt) puts("NO");
        else printf("%lld %lld\n", (m - r) / 2, (m + r) / 2);
    }

    return 0;
}
