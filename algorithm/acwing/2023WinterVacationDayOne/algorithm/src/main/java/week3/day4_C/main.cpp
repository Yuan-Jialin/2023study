#include<bits/stdc++.h>
using namespace std;
int n,m,a[30],b[30],c[30];
int main(){
    c[0]=1;
    cin>>n>>m;
    for(int i=1;i<=n;i++)cin>>a[i];
    for(int i=1;i<=n;i++)c[i]=c[i-1]*a[i];
    for(int i=1;i<=n;i++)b[i]=(m%c[i]-m%c[i-1])/c[i-1];
    for(int i=1;i<=n;i++)cout<<b[i]<<" ";
    return 0;   
}

