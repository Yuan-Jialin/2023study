#include<stdio.h>
typedef long long LL;

LL a, b;

int main(){
    scanf("%lld%lld", &a, &b);

    // if(a == 1){
    //     printf("1");
    //     return 0;
    // }

    LL t = a;
    LL res = 1;

    while(b){
        if(t > 1e9) {
            printf("-1");
            return 0;
        }

        if(b & 1) {
            // printf("%lld, %lld \n", t, res);
            res = res * t;
        }

        if(res > 1e9){
            printf("-1");
            return 0;
        }

        b >>= 1;

        t = t * t;
    }

    printf("%d", res);
    return 0;
}

