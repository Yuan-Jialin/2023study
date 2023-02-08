#include<stdlib.h>
#include<stdio.h>
#define N 100010

int a[N];
int e[N], ne[N], h[N], idx;

int n;

int geth(int k){

    int res = a[k];

    int maxh = 0;
    for(int i = h[k]; i != 0; i = ne[i]){
        int ch = geth(e[i]);
        if(ch > maxh) maxh = ch;
    }
    return res + maxh;
}

int main(){
    scanf("%d", &n);

    idx = 1;

    int t;
    for(int i = 2; i <= n; i++){
        scanf("%d", &t);
        a[t]++;

        e[idx] = i;
        ne[idx] = h[t];
        h[t] = idx++;
    }

    printf("%d", geth(1));

    return 0;
}

