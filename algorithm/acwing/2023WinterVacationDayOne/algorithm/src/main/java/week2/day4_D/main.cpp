#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

const int N = 100010;
ll sum[N];
int n, m;
int a[N], t[N];
ll res;
ll ress;

bool cmp(int a, int b)
{
    return (a>b);
}

int main()
{
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        scanf("%d", &a[i]);
        sum[i] = sum[i-1] + a[i];
    }

    cin>>m;

    for(int i=1; i<=m; i++)
    {
        int l, r;
        scanf("%d %d", &l, &r);
        res += (sum[r] - sum[l-1]);
        t[l] ++, t[r+1] --;
    }
    for(int i=1; i<=n; i++)
    {
        t[i] += t[i-1];
    }
    sort(a+1, a+n+2, cmp);
    sort(t+1, t+n+2, cmp);
    for(int i=1; t[i]; i++)
    {
        ress += (ll)t[i] * a[i];
    }
    cout<<ress - res<<endl;

    return 0;
}

