#include<stdio.h>
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/20 12:12
 */
int n,k;
int l[100010],w[100010];

int check(int mid)
{
    long long res=0;
    for(int i=0;i<n;i++)
    {
        res+=(long long)(l[i]/mid)*(w[i]/mid);
        if(res>=k) return 1;
    }
    return 0;
}
int main()
{
    scanf("%d%d",&n,&k);
    for(int i=0;i<n;i++) scanf("%d%d",&l[i],&w[i]);
    int l=0,r=100010;
    while(l<r)
    {
        int mid=(l+r+1)/2;
        if(check(mid)) l=mid;
        else r=mid-1;
    }
    printf("%d",l);
    return 0;
}

