/**
 * @Author 袁佳林
 * @Description 心情一般般
 * @Date 2023/2/17 10:18
 */
#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;
const int N = 100010;
int n, a[N], b[N];
int main() {
    cin >> n;
    for (int i = 1; i <= n; i ++) {cin >> a[i]; b[i] = a[i] - a[i - 1];}
    long long p, q;
    p = q = 0;
    for (int i = 2; i <= n; i ++)
        if (b[i] > 0) p += b[i];
        else q -= b[i];
    cout << max(p, q) << endl << abs(p - q) + 1 << endl;
    return 0;
}

