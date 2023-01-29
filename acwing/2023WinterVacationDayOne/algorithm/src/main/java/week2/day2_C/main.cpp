#include<iostream>

using namespace std;

int main()
{
    int n;
    long long sum=0,a[200010],s[200010];
    scanf("%d",&n);
   for(int i=1;i<=n;i++)
   {
       long long x;scanf("%lld",&x);
       a[i]=x;
   }


     for(int i=1;i<=n;i++)
   {
       s[i]=s[i-1]+a[i];
   }

     for(int i=1;i<=n;i++)
   {
      sum+=a[i]*(s[n]-s[i]);
   }
    printf("%lld\n",sum);


    return 0;
}

