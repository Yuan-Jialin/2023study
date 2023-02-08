#include <bits/stdc++.h>
using namespace std;
const int N = 100010;
int dp[N], n, m, x;

int main() {
    cin >> n >> m >> x;
    unordered_map<int, int> last;
    for(int i=1; i<=n; i++) {
        int a; cin >> a;
        dp[i] = max(dp[i-1], last[x ^ a]);
        //这句应该放到后面， 否则当x=0时会不正确(当x等于0时dp[i] = i, 但是要选两个不同位置的数)
        //更正于2023/01/01
        last[a] = i;
    }

    while (m -- ) {
        int l, r; cin >> l >> r;
        cout << (dp[r] >= l ? "yes" : "no") << endl;
    }

    return 0;
}

