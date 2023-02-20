#include <bits/stdc++.h>
#define fi first
#define se second
using namespace std;
using ll = long long;
using PII = pair<int, int>;
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/20 12:12
 */
const int N = 1e5 + 10;

int n, k;
int h[N], w[N];

bool check(int mid){
    int res = 0;
    for(int i = 1; i <= n; i ++){
        res += (h[i] / mid) * (w[i] / mid);
    }
    return res >= k;
}

int main(){
    cin >> n >> k;
    for(int i = 1; i <= n; i ++){
        cin >> h[i] >> w[i];
    }

    int l = 1, r = 1e5;
    while(l < r){
        int mid = l + r + 1 >> 1;
        if(check(mid)) l = mid;
        else r = mid - 1;
    }

    cout << l << "\n";

    return 0;
}

