#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;
const int N = 100010;
int t, n, a[N];
int d[N], cnt;
void get_divisors(int x){
    for (int i = 1; i <= x / i; i ++)
        if (x % i == 0){
            d[cnt ++] = i;
            if (i != x / i) d[cnt ++] = x / i;
        }
}
int main(){
    scanf("%d", &t);
    while (t --){
        scanf("%d", &n);
        int sum = 0;
        for (int i = 0; i < n; i ++) scanf("%d", &a[i]), sum += a[i];
        if (sum == 0){
            puts("0");
            continue;
        }
        get_divisors(sum);
        int ans = n - 1;
        for (int i = 0; i < cnt; i ++){
            sum = 0;
            int res = 0, ok = 1;
            for (int j = 0; j < n; j ++){
                sum += a[j];
                if (sum > d[i]){
                    ok = 0;
                    break;
                }
                else if (sum == d[i]) sum = 0;
                else res ++;
            }
            if (ok && (sum == 0 || sum == d[i]))
                ans = min(ans, res);
        }
        printf("%d\n", ans);
    }
    return 0;
}

