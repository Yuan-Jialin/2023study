
#author:袁佳林
n, m, q = map(int, input().split())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

def erfen(x):
    l, r = 0, m-1

    while l < r:
        mid = int((l+r)/2)

        if x <= b[mid]:
            r = mid
        else:
            l = mid + 1

    if b[l] != x:
        return -1
    else:
        return r

for i in range(n):
    if q - a[i] > 0:
        x = q - a[i]
        ans = erfen(x)
        if ans == -1:
            continue
        else:
            print(i, end = ' ')
            print(ans)

