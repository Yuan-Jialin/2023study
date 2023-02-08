import math

n = int(input())
w = list(map(int, input().split()))

s = sum(w) / n
ss = 0
for i in range(n):
    ss += (s - w[i]) ** 2
ss /= n

sss = ss ** (1 / 2)

for i in range(n):
    print((w[i] - s) / sss)