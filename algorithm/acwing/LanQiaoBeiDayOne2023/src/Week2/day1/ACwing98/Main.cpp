#include <iostream>
#include <cstdio>
#include <cstring>
#include <cmath>

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:15
 */
using namespace std;
#define ll long long
#define PLL pair<ll,ll>
PLL calc(ll n,ll m)
{
    if (n==0)
        return make_pair(0,0);
    ll len=1LL<<(n-1),cnt=1LL<<(2*n-2);
    PLL pos=calc(n-1,m%cnt);
    ll x=pos.first,y=pos.second;
    ll z=m/cnt;
    if (z==0)
        return make_pair(y,x);
    if (z==1)
        return make_pair(x,y+len);
    if (z==2)
        return make_pair(x+len,y+len);
    return make_pair(2*len-1-y,len-1-x);
}
int main()
{
    //ios::sync_with_stdio(false);
    int t;
    scanf("%d",&t);
    while(t--)
    {
        ll n,a,b;
        scanf("%lld%lld%lld",&n,&a,&b);
        PLL x=calc(n,a-1);
        PLL y=calc(n,b-1);
        ll dx=x.first-y.first,dy=x.second-y.second;
        double ans=(sqrt(double(dx*dx+dy*dy))*10);
        printf("%0.lf\n",ans);
    }
    return 0;
}

