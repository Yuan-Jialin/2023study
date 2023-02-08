a, b = map(int, input().split())
ans = 1
while b:
    if b & 1: ans = ans * a
    if ans > 10 ** 9:
        ans = -1
        break
    b >>= 1
    a = a * a
print(ans)