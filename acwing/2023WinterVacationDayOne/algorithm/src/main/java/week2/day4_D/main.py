n = int(input())
a = list(map(int, input().split()))

m = int(input())
d = [0]*(n+1)
for i in range(m):
    l, r = map(int, input().split())
    l -= 1
    d[l] += 1
    d[r] -= 1

for i in range(n):
    d[i+1] += d[i]

sum1 = 0
for i in range(n):
    sum1 += d[i]*a[i]

sum2 = 0
d.sort(reverse=True)
a.sort(reverse=True)
for i in range(n):
    sum2 += d[i]*a[i]

ans = sum2-sum1
print(ans)

