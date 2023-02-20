# author: 袁佳林
n = int(input())
c = [-1 for i in range(n + 10)]
d = [-1 for i in range(n + 10)]
m = int(n ** (1 / 2)) + 1
for i in range(m):
    for j in range(i, m):
        a = i ** 2 + j ** 2
        if a <= n and c[a] == -1:
            c[a] = i
            d[a] = j
for i in range(m):
    for j in range(i, m):
        b = n - i ** 2 - j ** 2
        if b >= 0 and ~c[b]:
            print(i, j, c[b], d[b])
            exit()

