N = 300010

n, m, k = map(int, input().split())

s = [0] * N
for i in range(n):
    a, b = map(int, input().split())
    l, r = max(0, a - b - k + 1), max(0, a - k        )
    # print(l, r)
    s[l] += 1
    s[r + 1] -= 1

for i in range(1, N):
    s[i] = s[i] + s[i - 1]

for i in range(m):
    pos = int(input())
    print(s[pos])

