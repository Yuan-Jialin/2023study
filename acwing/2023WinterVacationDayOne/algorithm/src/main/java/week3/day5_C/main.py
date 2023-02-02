n, x = map(int, input().split())
a = []
for i in range(n):
    a.append(int(input()))

M = 30 * 10000
f = [False] * (M + 1)
f[0] = True
for i in range(n):
    g = [False] * (M + 1)
    for j in range(M + 1):
        g[j] |= f[j]
        if j + a[i] <= M:
            g[j + a[i]] |= f[j]
    f = g
for i in range(x, M + 1):
    if f[i]:
        print(i)
        break

