#include <stdio.h>
#include <string.h>
#define N 100000 + 1
int flag[N];
int main(){
    int n, k, x, y, cnt = 0;
    scanf("%d%d", &n, &k);
    memset(flag, 0, sizeof(flag));
    flag[0] = 1;
    for (int i = 1; i <= k; i++) {
        scanf("%d%d", &x, &y);
        if (flag[y] == 0) cnt++;
        flag[x] = 1;
    }
    printf("%d\n", cnt);
    return 0;
}

