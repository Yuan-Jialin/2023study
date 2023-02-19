# author:  袁佳林
import bisect
n,q = map(int,input().split())

a = list(map(int,input().split()))

for _ in range(q):
    k = int(input())
    idx1 = bisect.bisect_left(a,k)
    idx2 = bisect.bisect_right(a,k)
    if idx1 == idx2:
        print(-1,-1)
    else:
        print(idx1,idx2 - 1)